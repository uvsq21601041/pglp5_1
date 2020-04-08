package pglp5_1.pglp5_1;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Personnel implements Serializable{

	private  String nom;
    private  String prenom;
    private  String fonction;
    private  LocalDate  Datenaissance;
    private  ArrayList<Integer> telephone;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	
	
	
	public LocalDate getDatenaissance() {
		return Datenaissance;
		
	}
	
	public void setDatenaissance(LocalDate  Datenaissance)
	{
		this.Datenaissance=Datenaissance;
	}
	
	public ArrayList<Integer> getTelephone() {
		return telephone;
		
	}
	
	public void setTelephone(ArrayList<Integer>  telephone)
	{
		this.telephone=telephone;
	}
	
	
	
	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
								   .append("name", name)
								   .append("age", age)
								   .toString();
	}
}

