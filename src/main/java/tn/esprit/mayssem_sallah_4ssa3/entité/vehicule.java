
package tn.esprit.mayssem_sallah_4ssa3.entité;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.esprit.mayssem_sallah_4ssa3.enums.CategorieV;
import tn.esprit.mayssem_sallah_4ssa3.enums.StatutV;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;
    private String immatriculation;
    private String marque;
    private String modele;
    private CategorieV categorie;
    private BigDecimal tarifJournalier;
    private StatutV statut;

    @ManyToOne
    private agence a;

    @OneToMany (mappedBy = "v")
    private Set<Reservation> reservations ;

    @ManyToMany
    private Set<Equipement> equipements;
}
