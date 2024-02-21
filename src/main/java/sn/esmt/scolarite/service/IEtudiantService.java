package sn.esmt.scolarite.service;

import sn.esmt.scolarite.entity.EtudiantEntity;

import java.util.List;
import java.util.Optional;

public interface IEtudiantService {
   public EtudiantEntity save(EtudiantEntity etudiantEntity);
   public EtudiantEntity update(String matricule, EtudiantEntity etudiantEntity);
   public Optional<EtudiantEntity> get(String mat);
   public Optional<List<EtudiantEntity>> getAll();
   public void delete(String matricule);
}
