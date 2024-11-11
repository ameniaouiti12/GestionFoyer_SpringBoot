package tn.esprit.tpfoyer.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entity.Reservation;
import tn.esprit.tpfoyer.Services.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {

    private final IReservationService reservationService;

    // 1. Obtenir toutes les réservations
    @GetMapping("/retrieve-all")
    public List<Reservation> retrieveAllReservations() {
        return reservationService.getReservations();
    }

    // 2. Ajouter une nouvelle réservation
    @PostMapping("/add")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    // 3. Mettre à jour une réservation existante
    @PatchMapping("/update")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    // 4. Supprimer une réservation par ID
    @DeleteMapping("/delete/{id}")
    public void deleteReservation(@PathVariable("id") String id) {
        reservationService.deleteReservation(id);
    }
}


