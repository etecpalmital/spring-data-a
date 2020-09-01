package homecare.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;

import homecare.repositories.ServicoRepository;
import homecare.models.Servico;

@Controller
@RequestMapping("/servico")
public class ServicoController {
    @Autowired
    private ServicoRepository servicosRepo;

    @RequestMapping("list")
    public String list(Model model) {
        model.addAttribute("servicos", servicosRepo.findAll());
        return "list"; 
    }

    @RequestMapping("insert")
    public String formInsert() {
        return "insert";
    }

    @RequestMapping(value="insert", method= RequestMethod.POST)
    public String saveInsert(
        @RequestParam("nome") String nome,
        @RequestParam("descricao") String descricao) {

        Servico servico = new Servico();
        servico.setNome(nome);
        servico.setDescricao(descricao);

        servicosRepo.save(servico);

        return "redirect:/servico/list";
    }
}