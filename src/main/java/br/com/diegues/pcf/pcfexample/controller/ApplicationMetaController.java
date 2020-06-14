package br.com.diegues.pcf.pcfexample.controller;

import br.com.diegues.pcf.pcfexample.entity.ApplicationMeta;
import br.com.diegues.pcf.pcfexample.repository.ApplicationMetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicationMetaController {

    @Autowired
    private ApplicationMetaRepository repository;

    @GetMapping(path = "/apps")
    public ResponseEntity<List<ApplicationMeta>> applications() {
        List<ApplicationMeta> metas = repository.findAll();
        return ResponseEntity.ok().body(metas);
    }

    @GetMapping(path = "/apps/{name}")
    public ResponseEntity<ApplicationMeta> applicationData(@PathVariable String name) {
        List<ApplicationMeta> metas = repository.findByName(name);
        return ResponseEntity.ok().body(metas.get(0));
    }

}
