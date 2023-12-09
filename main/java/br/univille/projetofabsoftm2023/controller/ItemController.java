package br.univille.projetofabsoftm2023.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofabsoftm2023.entity.Item;

import br.univille.projetofabsoftm2023.service.ItemService;

@Controller
/* @RequestMapping("/Bem") */
@RequestMapping("/item") /* alterado */
public class ItemController {

    @Autowired
    private ItemService ItemService;

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
        var listaItem = ItemService.getALL();
        System.out.println(listaItem); // Isso deve imprimir sua lista de bens no console.
        return new ModelAndView("item/index", "listaItem", listaItem);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var item = new Item();
        return new ModelAndView("item/form",
                "item", item);
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
    public ModelAndView save(Item item) {
        ItemService.save(item);
        return new ModelAndView("redirect:/item");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Item item) {

        return new ModelAndView("item/form",
                "item", item);
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
        ItemService.delete(id);
        return new ModelAndView("redirect:/item");
    }

}
