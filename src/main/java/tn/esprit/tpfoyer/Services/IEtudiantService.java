package tn.esprit.tpfoyer.Services;

import tn.esprit.tpfoyer.Entity.Etudiant;
import java.util.List;
import java.util.Optional;

public interface IEtudiantService {
    List<Etudiant> getEtudiants();
    Optional<Etudiant> getEtudiantById(Long id);
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    void deleteEtudiant(Long id);
}
