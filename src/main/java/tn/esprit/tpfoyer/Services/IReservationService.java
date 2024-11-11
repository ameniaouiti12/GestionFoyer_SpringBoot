package tn.esprit.tpfoyer.Services;

import tn.esprit.tpfoyer.Entity.Reservation;

import java.util.List;
import java.util.Optional;

public interface IReservationService {
    List<Reservation> getReservations();
    Optional<Reservation> getReservationById(String id);
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(String id);
}
