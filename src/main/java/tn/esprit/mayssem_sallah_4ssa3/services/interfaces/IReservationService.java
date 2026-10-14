package tn.esprit.mayssem_sallah_4ssa3.services.interfaces;

import tn.esprit.mayssem_sallah_4ssa3.entité.Reservation;
import java.util.List;

public interface IReservationService {
    Reservation ajouterReservation(Reservation r);
    Reservation updateReservation(Reservation r);
    void deleteReservation(Long id);
    Reservation getReservation(Long id);
    List<Reservation> getAllReservations();
}
