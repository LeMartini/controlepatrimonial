package br.univille.projetofabsoftm2023.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofabsoftm2023.entity.Movimentacao;

import br.univille.projetofabsoftm2023.service.MovimentacaoService;

@Controller
/* @RequestMapping("/Bem") */
@RequestMapping("/movimentacao") /* alterado */
public class MovimentacaoController {

    @Autowired
    private MovimentacaoService MovimentacaoService;

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
        var listamovimentacao = MovimentacaoService.getALL();
        System.out.println(listamovimentacao); // Isso deve imprimir sua lista de bens no console.
        return new ModelAndView("movimentacao/index", "listamovimentacao", listamovimentacao);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var movimentacao = new Movimentacao();
        return new ModelAndView("movimentacao/form",
                "movimentacao", movimentacao);
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
    public ModelAndView save(Movimentacao Movimentacao) {
        MovimentacaoService.save(Movimentacao);
        return new ModelAndView("redirect:/movimentacao");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Movimentacao movimentacao) {

        return new ModelAndView("movimentacao/form",
                "movimentacao", movimentacao);
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
        MovimentacaoService.delete(id);
        return new ModelAndView("redirect:/movimentacao");
    }

}
