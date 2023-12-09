package br.univille.projetofabsoftm2023.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofabsoftm2023.entity.InfoFiscal;

import br.univille.projetofabsoftm2023.service.InfoFiscalService;

@Controller
/* @RequestMapping("/Bem") */
@RequestMapping("/infoFiscal") /* alterado */
public class InfoFiscalController {

    @Autowired
    private InfoFiscalService InfoFiscalService;

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
        var listainfoFiscal = InfoFiscalService.getALL();
        System.out.println(listainfoFiscal); // Isso deve imprimir sua lista de bens no console.
        return new ModelAndView("infoFiscal/index", "listainfoFiscal", listainfoFiscal);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var infoFiscal = new InfoFiscal();
        return new ModelAndView("infoFiscal/form",
                "infoFiscal", infoFiscal);
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
    public ModelAndView save(InfoFiscal infoFiscal) {
        InfoFiscalService.save(infoFiscal);
        return new ModelAndView("redirect:/infoFiscal");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") InfoFiscal infoFiscal) {

        return new ModelAndView("infoFiscal/form",
                "infoFiscal", infoFiscal);
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
        InfoFiscalService.delete(id);
        return new ModelAndView("redirect:/infoFiscal");
    }

}
