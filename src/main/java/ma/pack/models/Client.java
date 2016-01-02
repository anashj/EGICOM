package ma.pack.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table
public class Client {
	
	@Id
	@GeneratedValue
	@Column
	private int id_client;
	
	@Column
	private String nom_client;
	
	@Column
	private String prenom_client;
	
	@Column
	private String mail_client;
	
	@Column
	private String adresse;
	
	@Column
	private String username;
	
	@Column
	private String pasword;
	
	@Column
	private String cin;
	
	@Column
	private String ville;
	
	@Column
	private String telephone;
	
	@Column
	private Date date_creation;
	
	@OneToOne(mappedBy = "client")
	private Panier panier;
	
	@OneToMany(mappedBy = "client")
	private List<Commande> commandes;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String nom_client, String prenom_client, String mail_client, String adresse,
			String username, String pasword, String cin, String ville,
			String telephone, Date date_creation) {
		super();
		this.nom_client = nom_client;
		this.prenom_client = prenom_client;
		this.mail_client = mail_client;
		this.adresse = adresse;
		this.username = username;
		this.pasword = pasword;
		this.cin = cin;
		this.ville = ville;
		this.telephone = telephone;
		this.date_creation = date_creation;
	}
	public int getId_client() {
		return id_client;
	}

	public String getNom() {
		return nom_client;
	}
	public void setNom(String nom) {
		this.nom_client = nom;
	}
	public String getPrenom() {
		return prenom_client;
	}
	public void setPrenom(String prenom) {
		this.prenom_client = prenom;
	}
	public String getMail() {
		return mail_client;
	}
	public void setMail(String mail) {
		this.mail_client = mail;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getLogin() {
		return username;
	}
	public void setLogin(String login) {
		this.username = login;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
