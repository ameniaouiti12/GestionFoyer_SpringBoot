package tn.esprit.tpfoyer.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entity.Universite;
import tn.esprit.tpfoyer.Services.IUniversiteService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {

    private final IUniversiteService universiteService;

    // 1. Obtenir la liste de toutes les universités
    @GetMapping("/retrieve-all")
    public List<Universite> retrieveAllUniversites() {
        return universiteService.getUniversites();
    }

    // 2. Obtenir une université par ID
    @GetMapping("/retrieve/{id}")
    public Optional<Universite> retrieveUniversiteById(@PathVariable("id") Long id) {
        return universiteService.getUniversiteById(id);
    }

    // 3. Ajouter une nouvelle université
    @PostMapping("/add")
    public Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }

    // 4. Mettre à jour une université existante
    @PatchMapping("/update")
    public Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

    // 5. Supprimer une université par ID
    @DeleteMapping("/delete/{id}")
    public void deleteUniversite(@PathVariable("id") Long id) {
        universiteService.deleteUniversite(id);
    }
}
