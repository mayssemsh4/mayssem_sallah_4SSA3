package tn.esprit.mayssem_sallah_4ssa3.entité;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

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

    @OneToMany (mappedBy = "a")
    private Set<employe> emp;

    @OneToMany (mappedBy = "a")
    private Set<vehicule> v;
}
