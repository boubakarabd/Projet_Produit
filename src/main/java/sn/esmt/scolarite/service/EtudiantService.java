package sn.esmt.scolarite.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sn.esmt.scolarite.entity.EtudiantEntity;
import sn.esmt.scolarite.repository.EtudiantRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class EtudiantService implements IEtudiantService {
   private EtudiantRepository etudiantRepository;

   @Override
   public EtudiantEntity save(EtudiantEntity etudiantEntity) {
      return etudiantRepository.save(etudiantEntity);
   }

   @Override
   public EtudiantEntity update(String matricule, EtudiantEntity etudiantEntity) {
      Optional<EtudiantEntity> etudiantEntity1 = this.get(matricule);
      if (etudiantEntity1.isPresent()) {
         etudiantEntity1.get().setNom(etudiantEntity.getNom());
         // TO DO pour tous les autres champs
         return etudiantRepository.save(etudiantEntity1.get());
      }
      return etudiantEntity;
   }

   @Override
   public Optional<EtudiantEntity> get(String mat) {
      return etudiantRepository.findByMatricule(mat);
   }

   @Override
   public Optional<List<EtudiantEntity>> getAll() {
      return Optional.of(etudiantRepository.findAll());
   }

   @Override
   public void delete(String matricule) {
      //TO DO : Vérifier si l'étudiant existe avant de le supprimer
      etudiantRepository.delete(this.get(matricule).get());
   }
}
