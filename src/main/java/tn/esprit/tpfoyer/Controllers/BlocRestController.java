package tn.esprit.tpfoyer.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entity.Bloc;
import tn.esprit.tpfoyer.Entity.Chambre;
import tn.esprit.tpfoyer.Services.IBlocService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocRestController {
    IBlocService iBlocService;



    @GetMapping("/retrieve-all-bloc")
    public List<Bloc> retrieveAllBloc() {
        List<Bloc> blocList = iBlocService.getBlocs();
        return blocList;
    }

    @GetMapping("/retrieve-bloc-/{idb}")
    public Optional<Bloc> retrieveBlocById(@PathVariable("idb") long id){
        return iBlocService.getBlocById(id);
    }

    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return  iBlocService.addBloc(bloc);
    }

    @PatchMapping("/update-bloc")
    public  Bloc updateBloc(@RequestBody Bloc bloc){
        return  iBlocService.updateBloc(bloc);
    }



    @DeleteMapping("DeleteBloc/{idb}")
    void deleteBloc( @PathVariable("idb") long idBloc){
        iBlocService.deleteBloc(idBloc);

    }

}


