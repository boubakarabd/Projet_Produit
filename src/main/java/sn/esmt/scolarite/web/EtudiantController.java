package sn.esmt.scolarite.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.esmt.scolarite.entity.EtudiantEntity;
import sn.esmt.scolarite.service.EtudiantService;

import java.util.List;

@RestController
@RequestMapping("etudiants")
@AllArgsConstructor
public class EtudiantController {
   private EtudiantService etudiantService;

   @PostMapping
   public EtudiantEntity save(EtudiantEntity etudiantEntity) {
      return etudiantService.save(etudiantEntity);
   }

   @GetMapping
   public List<EtudiantEntity> all() {
      return etudiantService.getAll().get();
   }
}
