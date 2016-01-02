package ma.pack.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table
public class Panier {
	
	@Id
	@GeneratedValue
	@Column
	private int id_panier;
	
	@ManyToMany(mappedBy = "paniers")
	private Set<Produit> produits = new HashSet<Produit>();
	
	@OneToOne
	@JoinColumn(name = "panier")
	private Client client;

}
