package sn.esmt.scolarite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sn.esmt.scolarite.entity.EtudiantEntity;

import java.util.Optional;

@Repository
public interface EtudiantRepository extends JpaRepository<EtudiantEntity,String> {

   @Query("SELECT etu FROM EtudiantEntity etu WHERE etu.matricule=?1 AND etu.telephone=?2")
   public Optional<EtudiantEntity> findByMatriculeAndTelephone(String matricule, int telephone);

   @Query("SELECT etu FROM EtudiantEntity etu WHERE etu.matricule=:m AND etu.telephone=:t")
   public Optional<EtudiantEntity> findByMatriculeAndTelephoneV2(@Param("m") String matricule,
                                                                  @Param("t") int telephone);

   public Optional<EtudiantEntity> findByMatricule(String matricule);

}
