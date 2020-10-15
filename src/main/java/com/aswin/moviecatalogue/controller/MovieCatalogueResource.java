package com.aswin.moviecatalogue.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aswin.moviecatalogue.entity.CatalogueModel;

@RestController
@RequestMapping("/catalogue")
public class MovieCatalogueResource {
	
	@RequestMapping("/{userid}")
	public List<CatalogueModel> getCatalogue(@PathVariable("userid") String userId){
		return Collections.singletonList(new CatalogueModel("Iron Man", "Iron man description", 4));
	}
}
