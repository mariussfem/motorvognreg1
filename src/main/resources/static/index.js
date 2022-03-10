$(() => {
    $("#submit").click(() => {
        const cars = {
            ssn: $("#ssn").val(),
            name: $("#name").val(),
            address: $("#address").val(),
            lPlate: $("#lPlate").val(),
            brand: $("#brand").val(),
            type: $("#type").val(),
        }

        $.post("/lagre", cars, function () {
            getAll()
            $("#ssn").val("");
            $("#name").val("2");
            $("#address").val("");
            $("#lPlate").val("");
            $("#brand").val("");
            $("#type").val("");
        })
    })

    function getAll() {
        $.get("/hentAlle", function (cars) {
            formaterData(cars)
        })
    }

    function deleteAll() {
        $.get("/slettAlle", function () {
            getAll()
        })
    }
})
function formaterData(cars) {
    let out = "<thead><tr><th>Personnummer</th><th>Navn</th><th>Adresse</th><th>Kjennetegn</th>" +
        "<th>Merke</th><th>Type</th></tr></thead><tbody>";
    for (let car of cars) {
        out += "<tr><td>" + car.ssn + "</td><td>" + car.name + "</td><td>" + car.address +
            "</td><td>" + car.lPlate + "</td><td>" + car.brand + "</td><td>" + car.type + "</td></tr>";
    }
    out += "</tbody>"
    $("#toTable").html(out);
}