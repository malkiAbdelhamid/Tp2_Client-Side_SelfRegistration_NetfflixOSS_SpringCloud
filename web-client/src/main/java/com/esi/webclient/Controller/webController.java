package com.esi.webclient.Controller;

import com.esi.webclient.model.Etudiant;
import com.esi.webclient.proxy.ScolariteProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class webController {

    @Autowired
    ScolariteProxy scolariteProxy;

    @GetMapping("/student/{id}")
    public String getEtudiant(Model model,  @PathVariable("id") Long ide)
    {
        Etudiant etudiant= scolariteProxy.getEtudiant(ide);

        model.addAttribute("esiEtudiant", etudiant);

        return "EtudiantView";
    }
}
