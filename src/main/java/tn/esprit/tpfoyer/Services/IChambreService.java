package tn.esprit.tpfoyer.Services;

import tn.esprit.tpfoyer.Entity.Chambre;

import java.util.List;
import java.util.Optional;

public interface IChambreService {
    List<Chambre> getChambres();
    Optional<Chambre> getChambreById(Long id);
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(Long id);
}
