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
@Table(name = "produits")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProduitEntity {
   @Id
   @Column(name = "reference", length = 50)
   private String reference;
   @Column(name = "nom", length = 50, nullable = false)
   private String nom;
   private double qteStock;
}
