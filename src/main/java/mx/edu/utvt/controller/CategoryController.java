package mx.edu.utvt.controller;

import mx.edu.utvt.entity.Category;
import mx.edu.utvt.entity.FileType;
import mx.edu.utvt.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

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
}
