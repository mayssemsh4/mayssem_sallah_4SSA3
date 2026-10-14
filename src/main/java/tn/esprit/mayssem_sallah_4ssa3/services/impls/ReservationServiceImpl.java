package tn.esprit.mayssem_sallah_4ssa3.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mayssem_sallah_4ssa3.entité.Reservation;
import tn.esprit.mayssem_sallah_4ssa3.repositories.ReservationRepository;
import tn.esprit.mayssem_sallah_4ssa3.services.interfaces.IReservationService;

import java.util.List;

@AllArgsConstructor
@Service
public class ReservationServiceImpl implements IReservationService {

    ReservationRepository reservationRepository;

    @Override
    public Reservation ajouterReservation(Reservation r) { return reservationRepository.save(r); }

    @Override
    public Reservation updateReservation(Reservation r) { return reservationRepository.save(r); }

    @Override
    public void deleteReservation(Long id) { reservationRepository.deleteById(id); }

    @Override
    public Reservation getReservation(Long id) { return reservationRepository.findById(id).get(); }

    @Override
    public List<Reservation> getAllReservations() { return reservationRepository.findAll(); }
}
