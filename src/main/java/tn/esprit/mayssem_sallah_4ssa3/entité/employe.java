package tn.esprit.mayssem_sallah_4ssa3.entité;
import jakarta.persistence.*;
import tn.esprit.mayssem_sallah_4ssa3.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
public class employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Enumerated(EnumType.STRING)
    private Role role;

    private Long idEmploye;
    private String nom;
    private String prenom;

}

