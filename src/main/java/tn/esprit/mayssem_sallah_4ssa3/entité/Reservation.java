package tn.esprit.mayssem_sallah_4ssa3.entité;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.esprit.mayssem_sallah_4ssa3.enums.StatutR;

import java.time.LocalDate;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private StatutR statut;

    @ManyToOne
    private vehicule v;

    @ManyToOne
    private Client client;
}
