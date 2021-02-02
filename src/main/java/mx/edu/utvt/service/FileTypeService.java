package mx.edu.utvt.service;

import mx.edu.utvt.entity.Area;
import mx.edu.utvt.entity.FileType;
import mx.edu.utvt.repository.AreaRepository;
import mx.edu.utvt.repository.FileTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FileTypeService {
    @Autowired
    private FileTypeRepository fileTypeRepository;

    public List<FileType> getAll(){
        return fileTypeRepository.findAll();
    }

    public FileType getOne(long id){
        return fileTypeRepository.getOne(id);
    }

    public FileType saveOrUpdate(FileType fileType){
        return fileTypeRepository.save(fileType);
    }

    public void remove(long id){
        fileTypeRepository.deleteById(id);
    }
}
