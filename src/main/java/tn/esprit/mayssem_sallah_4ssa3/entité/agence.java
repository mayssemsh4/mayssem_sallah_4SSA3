package tn.esprit.mayssem_sallah_4ssa3.entité;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class agence {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idAgence;
        private String nom;
        private String ville;
        private String adresse;
        private String telephone;
}
