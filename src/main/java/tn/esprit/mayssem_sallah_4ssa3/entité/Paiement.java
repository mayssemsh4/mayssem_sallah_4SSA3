package tn.esprit.mayssem_sallah_4ssa3.entité;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.esprit.mayssem_sallah_4ssa3.enums.ModePaiement;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaiement;
    private BigDecimal montant;
    private LocalDate datePaiement;
    private ModePaiement modePaiement;

    @ManyToOne
    @JoinColumn(name = "idContrat")
    private Contrat cont;
}

