package mx.edu.utvt.service;

import mx.edu.utvt.entity.FileType;
import mx.edu.utvt.repository.FileTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
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


    public boolean remove(Long id) {
        FileType fileType= getOne(id);
        if (fileType != null){
            fileTypeRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
