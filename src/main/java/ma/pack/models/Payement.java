package ma.pack.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class Payement {
	
	@Id
	@GeneratedValue
	@Column
	private int num_carte;
	
	@Column
	private double montant;
	
	@Column
	private Date date_paiement;
	
	@Column
	private String code_carte;
	
	@Column
	private double solde_carte;
	
	@Column
	private String type_carte;
	
	
	public int getNum_carte() {
		return num_carte;
	}


	public void setNum_carte(int num_carte) {
		this.num_carte = num_carte;
	}


	public double getMontant() {
		return montant;
	}


	public void setMontant(double montant) {
		this.montant = montant;
	}


	public Date getDate_paiement() {
		return date_paiement;
	}


	public void setDate_paiement(Date date_paiement) {
		this.date_paiement = date_paiement;
	}


	public String getCode_carte() {
		return code_carte;
	}


	public void setCode_carte(String code_carte) {
		this.code_carte = code_carte;
	}


	public double getSolde_carte() {
		return solde_carte;
	}


	public void setSolde_carte(double solde_carte) {
		this.solde_carte = solde_carte;
	}


	public String getType_carte() {
		return type_carte;
	}


	public void setType_carte(String type_carte) {
		this.type_carte = type_carte;
	}


	public List<Commande> getCommandes() {
		return commandes;
	}


	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}


	public Payement() {
		super();
	}


	public Payement(int num_carte, double montant, Date date_paiement,
			String code_carte, double solde_carte, String type_carte,
			List<Commande> commandes) {
		super();
		this.num_carte = num_carte;
		this.montant = montant;
		this.date_paiement = date_paiement;
		this.code_carte = code_carte;
		this.solde_carte = solde_carte;
		this.type_carte = type_carte;
		this.commandes = commandes;
	}


	@OneToMany(mappedBy = "payement")
	private List<Commande> commandes;

}
