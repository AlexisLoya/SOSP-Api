package mx.edu.utvt.controller;

import mx.edu.utvt.entity.Area;
import mx.edu.utvt.entity.FileType;
import mx.edu.utvt.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/area")
public class AreaController {

    @Autowired
    private AreaService service;

    @GetMapping("")
    public ResponseEntity<List<Area>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Area> getOne(@PathVariable("id")Long id){
        return new ResponseEntity<>(service.getOne(id), HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<Area> save(@RequestBody Area area) {
        return new ResponseEntity<>(service.saveOrUpdate(area), HttpStatus.CREATED);
    }

}
