package sn.esmt.scolarite.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="etudiants")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EtudiantEntity {

   @Id
   @Column(name = "matricule", length = 10)
   private String matricule;
   @Column(name = "nom", length = 150, nullable = false)
   private String nom;
   @Column(name = "prenom", length = 200, nullable = false)
   private String prenom;
   private String adresse;
   private int telephone;
   @Column(name = "frais_scolarite")
   private double frais;

}
