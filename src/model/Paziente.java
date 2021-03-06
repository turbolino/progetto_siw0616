package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paziente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPaziente;
	private String nomePaziente;
	private String cognomePaziente;
	private String usernamePaziente;
	private String passwordPaziente;
	
	
	
	public Paziente(String nome, String cognome, String username, String password) {
		this.nomePaziente = nome;
		this.cognomePaziente = cognome;
		this.usernamePaziente = username;
		this.passwordPaziente = password;
	}
	public Paziente() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nomePaziente;
	}
	public void setNome(String nome) {
		this.nomePaziente = nome;
	}
	public String getCognome() {
		return cognomePaziente;
	}
	public void setCognome(String cognome) {
		this.cognomePaziente = cognome;
	}
	public String getUsername() {
		return usernamePaziente;
	}
	public void setUsername(String username) {
		this.usernamePaziente = username;
	}
	public String getPassword() {
		return passwordPaziente;
	}
	public void setPassword(String password) {
		this.passwordPaziente = password;
	}
}
