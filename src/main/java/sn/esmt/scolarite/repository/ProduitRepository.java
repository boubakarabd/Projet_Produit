package sn.esmt.scolarite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sn.esmt.scolarite.entity.ProduitEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProduitRepository extends JpaRepository<ProduitEntity,String> {

   public Optional<ProduitEntity> findByReference(String reference);

   public Optional<List<ProduitEntity>> findByNom(String nom);

   @Query("select prod from ProduitEntity prod where prod.reference=?1 and prod.nom=?2")
   public Optional<ProduitEntity> findByReferenceAndNom(String reference, String nom);

}
