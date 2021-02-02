package mx.edu.utvt.controller;

import mx.edu.utvt.entity.Area;
import mx.edu.utvt.entity.Category;
import mx.edu.utvt.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService service;

    @GetMapping("")
    public ResponseEntity<List<Category>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getOne(@PathVariable("id")Long id){
        return new ResponseEntity<>(service.getOne(id), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Category> save(@RequestBody Category category) {
        return new ResponseEntity<>(service.saveOrUpdate(category), HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Area> update(@RequestBody Category category){
        return new ResponseEntity(service.saveOrUpdate(category), HttpStatus.CREATED);

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id){
        if(service.remove(id)) return new ResponseEntity(HttpStatus.OK);
        else return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}
