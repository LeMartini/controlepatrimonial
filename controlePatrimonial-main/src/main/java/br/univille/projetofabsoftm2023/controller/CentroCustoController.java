package br.univille.projetofabsoftm2023.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofabsoftm2023.entity.CentroCusto;

import br.univille.projetofabsoftm2023.service.CentroCustoService;

@Controller
/* @RequestMapping("/Bem") */
@RequestMapping("/centroCusto") /* alterado */
@PreAuthorize("hasAuthority('APPROLE_Admin')")
public class CentroCustoController {

    @Autowired
    private CentroCustoService CentroCustoService;

    /*
     * @GetMapping
     * public ModelAndView index() {
     * var listabem = BemService.getALL();
     * return new ModelAndView("bem/index",
     * "listabem", listabem);
     * }
     */
    @GetMapping
    @ResponseBody
    public ModelAndView index() {
        var listaCentroCusto = CentroCustoService.getALL();
        System.out.println(listaCentroCusto); // Isso deve imprimir sua lista de bens no console.
        return new ModelAndView("centroCusto/index", "listaCentroCusto", listaCentroCusto);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var centroCusto = new CentroCusto();
        return new ModelAndView("centroCusto/form",
                "centroCusto", centroCusto);
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
    public ModelAndView save(CentroCusto centroCusto) {
        CentroCustoService.save(centroCusto);
        return new ModelAndView("redirect:/centroCusto");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") CentroCusto centroCusto) {

        return new ModelAndView("centroCusto/form",
                "centroCusto", centroCusto);
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
    public ModelAndView remover(@PathVariable("id") int id) {
        CentroCustoService.delete(id);
        return new ModelAndView("redirect:/centroCusto");
    }

}
