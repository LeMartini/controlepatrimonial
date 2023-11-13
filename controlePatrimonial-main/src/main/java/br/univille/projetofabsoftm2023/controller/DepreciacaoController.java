package br.univille.projetofabsoftm2023.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofabsoftm2023.entity.Depreciacao;
import br.univille.projetofabsoftm2023.service.ImovelService;
import br.univille.projetofabsoftm2023.service.DepreciacaoService;

@Controller
/* @RequestMapping("/Bem") */
@RequestMapping("/depreciacao") /* alterado */
public class DepreciacaoController {

    @Autowired
    private DepreciacaoService DepreciacaoService;

    @Autowired
    private ImovelService ImovelService;

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
        var listadepreciacao = DepreciacaoService.getALL();
        System.out.println(listadepreciacao); // Isso deve imprimir sua lista de bens no console.
        return new ModelAndView("depreciacao/index", "listadepreciacao", listadepreciacao);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        HashMap<String, Object> dados = new HashMap<>();
        var depreciacao = new Depreciacao();
        var listaImovel = ImovelService.getALL();

        dados.put("depreciacao", depreciacao);
        dados.put("listaImovel", listaImovel);
        return new ModelAndView("depreciacao/form", dados);
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
    public ModelAndView save(Depreciacao depreciacao) {
        DepreciacaoService.save(depreciacao);
        return new ModelAndView("redirect:/depreciacao");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Depreciacao depreciacao) {

        return new ModelAndView("depreciacao/form",
                "depreciacao", depreciacao);
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
        DepreciacaoService.delete(id);
        return new ModelAndView("redirect:/depreciacao");
    }

}
