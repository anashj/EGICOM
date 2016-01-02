package ma.pack.models;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class Commande {
	
	@Id
	@GeneratedValue
	@Column
	private int ref_commande;
	
	@Column
	private Date date_commande;
	
	@Column
	private String etat_commande;
	
	
	@ManyToMany(mappedBy = "commandes")
	private Set<Produit> produits = new HashSet<Produit>();
	
	@ManyToOne
	private Client client;
	
	@ManyToOne
	private Payement payement;

	public Commande(int ref_commande, Date date_commande, String etat_commande,
			List<Produit> produits, Client client, Payement payement) {
		super();
		this.ref_commande = ref_commande;
		this.date_commande = date_commande;
		this.etat_commande = etat_commande;
		this.client = client;
		this.payement = payement;
	}

	public Commande() {
		super();
	}

	public int getRef_commande() {
		return ref_commande;
	}

	public void setRef_commande(int ref_commande) {
		this.ref_commande = ref_commande;
	}

	public Date getDate_commande() {
		return date_commande;
	}

	public void setDate_commande(Date date_commande) {
		this.date_commande = date_commande;
	}

	public String getEtat_commande() {
		return etat_commande;
	}

	public void setEtat_commande(String etat_commande) {
		this.etat_commande = etat_commande;
	}



	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Payement getPayement() {
		return payement;
	}

	public void setPayement(Payement payement) {
		this.payement = payement;
	}

}
