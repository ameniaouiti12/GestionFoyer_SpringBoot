package tn.esprit.tpfoyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.Entity.Etudiant;
@Repository

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
