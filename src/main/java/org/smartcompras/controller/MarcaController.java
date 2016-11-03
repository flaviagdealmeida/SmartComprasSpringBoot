package org.smartcompras.controller;

import org.smartcompras.dao.MarcaRepositoryImpl;
import org.smartcompras.models.Marca;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MarcaController {

	private MarcaRepositoryImpl marcaDao;

	@RequestMapping(value = "/marca", method = RequestMethod.GET)
	public String getMarcaList(ModelMap model) {
		model.addAttribute("MarcaList", marcaDao.getAllObjects());
		return "marca";
	}

	@RequestMapping(value = "/marca/save", method = RequestMethod.POST)
	public View createMarca(@ModelAttribute Marca marca, ModelMap model) {
		marcaDao.saveObject(marca);
		return new RedirectView("/SmartCompras/marca");
	}

	@RequestMapping(value = "/person/delete", method = RequestMethod.GET)
	public View deleteMarca(@ModelAttribute Marca marca, ModelMap model) {
		return new RedirectView("/SmartCompras/marca");
	}

}
