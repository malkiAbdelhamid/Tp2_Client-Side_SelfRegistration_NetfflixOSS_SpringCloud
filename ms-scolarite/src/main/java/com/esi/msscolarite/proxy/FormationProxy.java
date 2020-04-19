package com.esi.msscolarite.proxy;

import com.esi.msscolarite.model.Formation;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ms-formation")
@RibbonClient(name = "ms-formation", configuration = MyRibbonAlgo.class)
public interface FormationProxy {

    @GetMapping("/formations/{id}")
    Formation getFormation(@PathVariable("id") Long idf);
}
