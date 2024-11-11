package tn.esprit.tpfoyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entity.Bloc;
import tn.esprit.tpfoyer.Entity.Chambre;
import tn.esprit.tpfoyer.Repositories.BlocRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService{

    BlocRepository blocRepository;

    @Override
    public List<Bloc> getBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Optional<Bloc> getBlocById(Long id) {
        return blocRepository.findById(id);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }


    @Override
    public void deleteBloc(Long id) {
        blocRepository.deleteById(id);
        System.out.println("bloc deleted succeff");
    }
}
