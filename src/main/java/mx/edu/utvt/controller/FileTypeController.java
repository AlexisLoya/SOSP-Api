package mx.edu.utvt.controller;

import mx.edu.utvt.entity.Area;
import mx.edu.utvt.entity.FileType;
import mx.edu.utvt.service.AreaService;
import mx.edu.utvt.service.FileTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/filetype")
public class FileTypeController {
    @Autowired
    private FileTypeService service;

    @GetMapping("")
    public List<FileType> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public FileType getOne(@PathVariable("id")Long id){
        return service.getOne(id);
    }
}
