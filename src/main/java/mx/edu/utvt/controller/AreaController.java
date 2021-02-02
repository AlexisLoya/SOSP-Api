package mx.edu.utvt.controller;

import mx.edu.utvt.entity.Area;
import mx.edu.utvt.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/area")
public class AreaController {

    @Autowired
    private AreaService service;

    @GetMapping("")
    public List<Area> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Area getOne(@PathVariable("id")Long id){
        return service.getOne(id);
    }

}
