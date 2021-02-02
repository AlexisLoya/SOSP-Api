package mx.edu.utvt.controller;

import mx.edu.utvt.entity.Area;
import mx.edu.utvt.entity.FileType;
import mx.edu.utvt.service.AreaService;
import mx.edu.utvt.service.FileTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filetype")
public class FileTypeController {
    @Autowired
    private FileTypeService service;

    @GetMapping("")
    public ResponseEntity<List<FileType>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FileType> getOne(@PathVariable("id")Long id){
        return new ResponseEntity<>(service.getOne(id), HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<FileType> save(@RequestBody FileType fileType) {
        return new ResponseEntity<>(service.saveOrUpdate(fileType), HttpStatus.CREATED);
    }
}
