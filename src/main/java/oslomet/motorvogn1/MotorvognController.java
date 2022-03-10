package oslomet.motorvogn1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

@RestController
public class MotorvognController {
    public final List<Motorvogn> motorvognRegister = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagre(Motorvogn cars){
        System.out.println("cars legges inn i arrayet motorvognRegister");
        motorvognRegister.add(cars);
        if(motorvognRegister != null) {
            System.out.println("Godkjent");
        }
    }

    @GetMapping("/hentAlle")
    public List<Motorvogn> getAll() {
        System.out.println("Henter array");
        return motorvognRegister;
    }

    @GetMapping("/slettAlle")
    public void deleteAll   () {
        motorvognRegister.clear();
    }
}