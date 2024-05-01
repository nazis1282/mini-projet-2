package com.aziz.projets.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aziz.projets.entities.Projet;
import com.aziz.projets.service.ProjetService;

@Controller
public class ProjetController {
	
	
	@Autowired
	ProjetService projetService;
	
	@RequestMapping("/showCreate")
	public String showCreate()
	{
	return "createProjet";
	}
	
	@RequestMapping("/saveProjet")
	public String saveProjet(@ModelAttribute("projet") Projet projet,
							  @RequestParam("date") String date,
	                          ModelMap modelMap) throws 	ParseException
	{
	//conversion de la date
	SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	Date satrtDate = dateformat.parse(String.valueOf(date));
	projet.setStartDate(satrtDate);
	
	Projet saveProjet = projetService.saveProjet(projet);
	String msg ="projet enregistré avec Id "+saveProjet.getIdProjet();
	modelMap.addAttribute("msg", msg);
	return "createProjet";
	}
	
	@RequestMapping("/ListeProjets")
	public String listeProjets(ModelMap modelMap)
	{
		List<Projet> projs = projetService.getAllProjets();
		modelMap.addAttribute("projets", projs);
		return "listeProjets";
	}
	
	@RequestMapping("/supprimerProjet")
	public String supprimerProjet(@RequestParam("id") Long id,
	ModelMap modelMap)
	{
		projetService.deleteProjetById(id);
		List<Projet> projs = projetService.getAllProjets();
		modelMap.addAttribute("projets", projs);
	return "listeProjets";
	}
	
	@RequestMapping("/modifierProjet")
	public String editerProjet(@RequestParam("id") Long id,ModelMap modelMap)
	{
	Projet p= projetService.getProjet(id);
	modelMap.addAttribute("projet", p);
	return "editerProjet";
	}
	
	@RequestMapping("/updateProjet")
	public String updateProjet(@ModelAttribute("projet") Projet projet,
	@RequestParam("date") String date,
	ModelMap modelMap) throws ParseException
	{
	//conversion de la date
	SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	Date starDate = dateformat.parse(String.valueOf(date));
	projet.setStartDate(starDate);
	projetService.updateProjet(projet);
	List<Projet> projs = projetService.getAllProjets();
	modelMap.addAttribute("projets", projs);
	return "listeProjets";
	}
	


}
