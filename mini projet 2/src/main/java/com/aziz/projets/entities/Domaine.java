package com.aziz.projets.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Domaine {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idDom;
	
	private String nomDom;
	
	
	@OneToMany (mappedBy = "domaine")
	@JsonIgnore
	private List<Projet> Projets;
	
	
}
