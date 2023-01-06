package tn.essat.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.essat.dao.IProduit;
import tn.essat.model.Produit;
@CrossOrigin("*")
@RestController
@RequestMapping("/rest")
public class AppRest {
	@Autowired
	IProduit dao;
	
	@GetMapping("/produits")
	public List <Produit> f11(){
	List<Produit> ps=dao.findAll();
		return ps;
	}
	
	@PostMapping("/save")
	public void fff(@RequestBody Produit p) {
		dao.save(p);
		
	}
    @DeleteMapping("/delete/{id}")
    public void fff1(@PathVariable("id")int id) {
    	dao.deleteById(id);
    }

}
