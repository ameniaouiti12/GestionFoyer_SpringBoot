package tn.esprit.tpfoyer.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entity.Foyer;
import tn.esprit.tpfoyer.Services.IFoyerService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor

@RequestMapping("/foyer")

public class FoyerRestController {

    @Autowired
    private IFoyerService FoyerService;


    @GetMapping("/retrieve-all")
    public List<Foyer> retrieveAllFoyer() {
        return FoyerService.getFoyers();
    }


    @GetMapping("/retrieve/{id}")
    public Optional<Optional<Foyer>> retrieveFoyerById(@PathVariable("id") long id) {
        return Optional.ofNullable(FoyerService.getFoyerById(id));
    }

    @PostMapping("/add")
    public Foyer addFoyer(@RequestBody Foyer foyer) {
        return FoyerService.addFoyer(foyer);
    }

    @PatchMapping("/update")
    public Foyer updateFoyer(@RequestBody Foyer foyer) {
        return FoyerService.updateFoyer(foyer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFoyer (@PathVariable("id") long idFoyer) {
        FoyerService.deleteFoyer(idFoyer);
    }

}
