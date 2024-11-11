package tn.esprit.tpfoyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entity.Foyer;
import tn.esprit.tpfoyer.Repositories.FoyerRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService {
    FoyerRepository foyerRepository;
    @Override
    public List<Foyer> getFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Optional<Foyer> getFoyerById(Long id) {
        return foyerRepository.findById(id);
    }

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void deleteFoyer(Long id) {
        foyerRepository.deleteById(id);
    }
}
