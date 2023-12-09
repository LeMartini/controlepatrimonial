package br.univille.projetofabsoftm2023.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofabsoftm2023.entity.Imovel;
import br.univille.projetofabsoftm2023.service.CentroCustoService;
import br.univille.projetofabsoftm2023.service.ImovelService;
import br.univille.projetofabsoftm2023.service.ItemService;
import br.univille.projetofabsoftm2023.service.MarcaService;

@Controller
/* @RequestMapping("/Bem") */
@RequestMapping("/imovel") /* alterado */
public class ImovelController {

    @Autowired
    private ImovelService ImovelService;

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
        var listaimovel = ImovelService.getALL();
        System.out.println(listaimovel); // Isso deve imprimir sua lista de bens no console.
        return new ModelAndView("imovel/index", "listaimovel", listaimovel);
    }

    /*
     * @GetMapping("/novo")
     * public ModelAndView novo() {
     * HashMap<String, Object> dados = new HashMap<>();
     * var bem = new Bem();
     * var listaCentroCusto = centroCustoService.getALL();
     * var listaMarca = marcaService.getALL();
     * var listaItem = itemService.getALL();
     * 
     * dados.put("bem", bem);
     * dados.put("listaCentroCusto", listaCentroCusto);
     * dados.put("listaMarca", listaMarca);
     * dados.put("listaItem", listaItem);
     * return new ModelAndView("bem/form", dados);
     * }
     */

    @GetMapping("/novo")
    public ModelAndView novo() {
        HashMap<String, Object> dados = new HashMap<>();
        var imovel = new Imovel();
        var listaCentroCusto = centroCustoService.getALL();
        var listaMarca = marcaService.getALL();
        var listaItem = itemService.getALL();

        dados.put("imovel", imovel);
        dados.put("listaCentroCusto", listaCentroCusto);
        dados.put("listaMarca", listaMarca);
        dados.put("listaItem", listaItem);
        return new ModelAndView("imovel/form",
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
    public ModelAndView save(Imovel imovel) {
        ImovelService.save(imovel);
        return new ModelAndView("redirect:/imovel");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Imovel imovel) {

        HashMap<String, Object> dados = new HashMap<>();
        var listaCentroCusto = centroCustoService.getALL();
        var listaMarca = marcaService.getALL();
        var listaItem = itemService.getALL();

        dados.put("imovel", imovel);
        dados.put("listaCentroCusto", listaCentroCusto);
        dados.put("listaMarca", listaMarca);
        dados.put("listaItem", listaItem);
        return new ModelAndView("imovel/form",
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
    public ModelAndView remover(@PathVariable("id") int id) {
        ImovelService.delete(id);
        return new ModelAndView("redirect:/imovel");
    }

}
