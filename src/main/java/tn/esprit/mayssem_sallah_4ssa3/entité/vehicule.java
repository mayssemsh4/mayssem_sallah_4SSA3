
package tn.esprit.mayssem_sallah_4ssa3.entité;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.esprit.mayssem_sallah_4ssa3.enums.CategorieV;
import tn.esprit.mayssem_sallah_4ssa3.enums.StatutV;

import java.math.BigDecimal;

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
}
