package com.aziz.projets.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Projet {	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idProjet;
	private String nomProjet;
	private String Manager;
	public void setManager(String manager) {
        this.Manager = manager;
    }


    public String getManager() {
		return Manager;
	}


	private Double Cout;
	private Date StartDate;
	
	@ManyToOne
	private Domaine domaine;

	public Projet() {
		super();
	}
	
	
	public Projet(String nomProjet,String Manager, Double Cout, Date StartDate) {
		super();
		this.nomProjet = nomProjet;
		this.Manager=Manager;
		this.Cout = Cout;
		this.StartDate = StartDate;
	}


	public Long getIdProjet() {
		return idProjet;
	}
	public void setIdProjet(Long idProjet) {
		this.idProjet = idProjet;
	}
	public String getNomProjet() {
		return nomProjet;
	}
	public void setNomProjet(String nomProjet) {
		this.nomProjet = nomProjet;
	}
	public Double getCout() {
		return Cout;
	}
	public void setCout(Double Cout) {
		this.Cout = Cout;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date StartDate) {
		this.StartDate = StartDate;
	}



	@Override
	public String toString() {
		return "Projet [idProjet=" + idProjet + ", nomProjet=" + nomProjet + ", manager=" + Manager + "Cout" + Cout
				+ ", StartDate=" + StartDate + "]";
	}


	public Domaine getDomaine() {
		return domaine;
	}


	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}
	
	

}
