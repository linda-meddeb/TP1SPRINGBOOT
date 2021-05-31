package com.linda.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linda.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> { 

}
