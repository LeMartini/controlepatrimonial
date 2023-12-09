package br.univille.projetofabsoftm2023.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofabsoftm2023.entity.Movel;
import br.univille.projetofabsoftm2023.service.CentroCustoService;
import br.univille.projetofabsoftm2023.service.ItemService;
import br.univille.projetofabsoftm2023.service.MarcaService;
import br.univille.projetofabsoftm2023.service.MovelService;

@Controller
/* @RequestMapping("/Bem") */
@RequestMapping("/movel") /* alterado */
public class MovelController {

    @Autowired
    private MovelService MovelService;

    @Autowired
    private CentroCustoService centroCustoService;

    @Autowired
    private MarcaService marcaService;

    @Autowired
    private ItemService itemService;

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
        var listamovel = MovelService.getALL();
        System.out.println(listamovel); // Isso deve imprimir sua lista de bens no console.
        return new ModelAndView("movel/index", "listamovel", listamovel);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        HashMap<String, Object> dados = new HashMap<>();
        var movel = new Movel();
        var listaCentroCusto = centroCustoService.getALL();
        var listaMarca = marcaService.getALL();
        var listaItem = itemService.getALL();

        dados.put("movel", movel);
        dados.put("listaCentroCusto", listaCentroCusto);
        dados.put("listaMarca", listaMarca);
        dados.put("listaItem", listaItem);
        return new ModelAndView("movel/form",
                dados);
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
    public ModelAndView save(Movel movel) {
        MovelService.save(movel);
        return new ModelAndView("redirect:/movel");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Movel movel) {

        HashMap<String, Object> dados = new HashMap<>();
        var listaCentroCusto = centroCustoService.getALL();
        var listaMarca = marcaService.getALL();
        var listaItem = itemService.getALL();

        dados.put("movel", movel);
        dados.put("listaCentroCusto", listaCentroCusto);
        dados.put("listaMarca", listaMarca);
        dados.put("listaItem", listaItem);
        return new ModelAndView("movel/form",
                dados);
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
        MovelService.delete(id);
        return new ModelAndView("redirect:/movel");
    }

}
