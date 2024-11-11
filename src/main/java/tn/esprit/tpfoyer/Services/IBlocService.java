package tn.esprit.tpfoyer.Services;

import tn.esprit.tpfoyer.Entity.Bloc;
import java.util.List;
import java.util.Optional;

public interface IBlocService {
    List<Bloc> getBlocs();
    Optional<Bloc> getBlocById(Long id);
    Bloc addBloc(Bloc bloc);
    Bloc updateBloc(Bloc bloc);
    void deleteBloc(Long id);


}
