package sn.esmt.scolarite.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.scolarite.entity.ProduitEntity;
import sn.esmt.scolarite.service.ProduitService;

import java.util.List;

@RestController
@RequestMapping("produits")
@AllArgsConstructor
public class ProduitController {
   private ProduitService produitService;

   @GetMapping
   public List<ProduitEntity> all() {
      return produitService.getAll().get();
   }

   @GetMapping("/one")
   public ProduitEntity one(String reference) {
      return produitService.get(reference).get();
   }

   @PostMapping
   public ProduitEntity save(ProduitEntity produitEntity) {
      return produitService.save(produitEntity);
   }

   @DeleteMapping
   public void delete(String reference) {
      produitService.delete(reference);
   }

   @PutMapping
   public ProduitEntity update(String reference, ProduitEntity produitEntity) {
      return produitService.update(reference, produitEntity);
   }
}
