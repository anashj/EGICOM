package ma.pack.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class Produit {
	
	@Id
	@GeneratedValue
	@Column
	private int id_produit;
	
	@Column
	private String designation;
	
	@Column
	private String description;
	
	@Column
	private double prix;
	
	@Column
	private String image;
	
	@Column
	private int quantite_stock;
		
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="Produit_Panier", 
    joinColumns={@JoinColumn(name="id_produit")}, 
    inverseJoinColumns={@JoinColumn(name="id_panier")})
	private Set<Panier> paniers = new HashSet<Panier>();
	
	
	@ManyToOne
	private Categorie categorie;
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="Produit_Commande", 
    joinColumns={@JoinColumn(name="id_produit")}, 
    inverseJoinColumns={@JoinColumn(name="ref_commande")})	
	private Set<Commande> commandes = new HashSet<Commande>();
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getQuantite_stock() {
		return quantite_stock;
	}

	public void setQuantite_stock(int quantite_stock) {
		this.quantite_stock = quantite_stock;
	}


	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}



	public int getId_produit() {
		return id_produit;
	}

	public Produit() {
		super();
	}

	public Produit(String designation, String description, double prix,
			String image, int quantite_stock, List<Panier> paniers,
			Categorie categorie, List<Commande> commandes) {
		super();
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.image = image;
		this.quantite_stock = quantite_stock;
		this.categorie = categorie;
	}

	

}
