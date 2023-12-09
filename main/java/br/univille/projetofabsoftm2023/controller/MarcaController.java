package br.univille.projetofabsoftm2023.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofabsoftm2023.entity.Marca;

import br.univille.projetofabsoftm2023.service.MarcaService;

@Controller
/* @RequestMapping("/Bem") */
@RequestMapping("/marca") /* alterado */
public class MarcaController {

    @Autowired
    private MarcaService MarcaService;

    /*
     * @GetMapping
     * public ModelAndView index() {
     * var listaBem = BemService.getALL();
     * return new ModelAndView("bem/index",
     * "listaBem", listaBem);
     * }
     */
    @GetMapping
    public ModelAndView index() {
        var listaMarca = MarcaService.getALL();
        System.out.println(listaMarca); // Isso deve imprimir sua lista de bens no console.
        return new ModelAndView("marca/index", "listaMarca", listaMarca);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var marca = new Marca();
        return new ModelAndView("marca/form",
                "marca", marca);
    }

    /*
     * @PostMapping(params = "form")
     * public ModelAndView save(Bem bem) {
     * 
     * BemService.save(bem);
     * return new ModelAndView("redirect:/bem");
     * }
     */
    @PostMapping("/save")
    public ModelAndView save(Marca marca) {
        MarcaService.save(marca);
        return new ModelAndView("redirect:/marca");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Marca marca) {

        return new ModelAndView("marca/form",
                "marca", marca);
    }

    /*
     * @GetMapping("/remover/{id}")
     * public ModelAndView remover(@PathVariable("id") long id) {
     * 
     * BemService.delete(id);
     * return new ModelAndView("redirect:/bem");
     * }
     */
    @GetMapping("/remover/{id}")
    public ModelAndView remover(@PathVariable("id") long id) {
        MarcaService.delete(id);
        return new ModelAndView("redirect:/marca");
    }

}
