package ma.pack.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class Categorie {
	
	@Id
	@GeneratedValue
	@Column
	private int id_categorie;
	
	@Column
	private String nom_categorie;
	
	@OneToMany(mappedBy = "categorie")
	private List<Produit> produits;

	public String getNom_categorie() {
		return nom_categorie;
	}

	public void setNom_categorie(String nom_categorie) {
		this.nom_categorie = nom_categorie;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public Categorie() {
		super();
	}

	public Categorie(String nom_categorie, List<Produit> produits) {
		super();
		this.nom_categorie = nom_categorie;
		this.produits = produits;
	}

}
