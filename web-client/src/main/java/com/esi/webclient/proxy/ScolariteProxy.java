package com.esi.webclient.proxy;

import com.esi.webclient.model.Etudiant;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ms-scolarite")
@RibbonClient(name = "ms-scolarite")
public interface ScolariteProxy {

    @GetMapping("/api/etudiant/{id}")
    Etudiant getEtudiant(@PathVariable("id") Long ide);
}
