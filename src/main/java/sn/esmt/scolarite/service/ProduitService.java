package sn.esmt.scolarite.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sn.esmt.scolarite.entity.ProduitEntity;
import sn.esmt.scolarite.repository.ProduitRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProduitService implements IProduitService{
   private ProduitRepository produitRepository;

   @Override
   public ProduitEntity save(ProduitEntity produitEntity) {
      return produitRepository.save(produitEntity);
   }

   @Override
   public ProduitEntity update(String reference, ProduitEntity produitEntity) {
      Optional<ProduitEntity> produitEntity1 = this.get(reference);
      if (produitEntity1.isPresent()) {
         produitEntity1.get().setNom(produitEntity.getNom());
         produitEntity1.get().setQteStock(produitEntity.getQteStock());
         return produitRepository.save(produitEntity1.get());
      }
      return produitEntity;
   }

   @Override
   public Optional<ProduitEntity> get(String reference) {
      return produitRepository.findByReference(reference);
   }

   @Override
   public Optional<List<ProduitEntity>> getAll() {
      return Optional.of(produitRepository.findAll());
   }

   @Override
   public void delete(String reference) {
      // Verifier si le produit existe avant de le supprimer
      Optional<ProduitEntity> produitEntity = this.get(reference);
      if (produitEntity.isPresent()) {
         produitRepository.delete(this.get(reference).get());
      }
   }
}
