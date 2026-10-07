package tn.esprit.mayssem_sallah_4ssa3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mayssem_sallah_4ssa3.entité.vehicule;

public interface VehiculeRepository extends JpaRepository<vehicule,Long> {
}
