package tn.esprit.tpfoyer.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entity.Etudiant;
import tn.esprit.tpfoyer.Services.IEtudiantService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor

@RequestMapping("/etudiant")
public class EtudiantRestController {

    @Autowired
    private IEtudiantService etudiantService;

    @GetMapping("/retrieve-all")
    public List<Etudiant> retrieveAllEtudiant() {
        return etudiantService.getEtudiants();
    }

    @GetMapping("/retrieve/{id}")
    public Optional<Optional<Etudiant>> retrieveEtudiantById(@PathVariable("id") long id) {
        return Optional.ofNullable(etudiantService.getEtudiantById(id));
    }

    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }

    @PatchMapping("/update")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(etudiant);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEtudiant(@PathVariable("id") long idEtudiant) {
        etudiantService.deleteEtudiant(idEtudiant);
    }
}
