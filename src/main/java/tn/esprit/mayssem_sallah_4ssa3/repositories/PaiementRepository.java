package tn.esprit.mayssem_sallah_4ssa3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mayssem_sallah_4ssa3.entité.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement,Long> {
}
