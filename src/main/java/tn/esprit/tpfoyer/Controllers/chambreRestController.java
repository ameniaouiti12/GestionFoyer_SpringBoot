package tn.esprit.tpfoyer.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entity.Chambre;
import tn.esprit.tpfoyer.Services.IChambreService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class chambreRestController {

    IChambreService iChambreService;


    @GetMapping("/retrieve-all-chambre")
    public List<Chambre> retrieveAllChambres() {
        List<Chambre> chambreList = iChambreService.getChambres();
        return chambreList;
    }


    @GetMapping("/retrieve-chambre-/{idCh}")
    public Optional<Chambre> retrieveChambreById(@PathVariable("idCh") long id){
        Optional<Chambre> chambre = iChambreService.getChambreById(id);
        return chambre;
    }

    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre chambre) {

        return  iChambreService.addChambre(chambre);


    }

    @PatchMapping("/update-chambre")
    public  Chambre updateChambre(@RequestBody Chambre chambre){
        return  iChambreService.updateChambre(chambre);
    }

    @DeleteMapping("DeleteChambre/{idC}")
    void deleteChambre( @PathVariable("idC") long idChambre){
        iChambreService.deleteChambre(idChambre);

    }


}
