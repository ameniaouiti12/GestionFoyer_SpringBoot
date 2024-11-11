package tn.esprit.tpfoyer.Services;

import tn.esprit.tpfoyer.Entity.Universite;

import java.util.List;
import java.util.Optional;

public interface IUniversiteService {
    List<Universite> getUniversites();
    Optional<Universite> getUniversiteById(Long id);
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    void deleteUniversite(Long id);
}
