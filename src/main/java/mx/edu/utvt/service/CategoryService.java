package mx.edu.utvt.service;

import mx.edu.utvt.entity.Area;
import mx.edu.utvt.entity.Category;
import mx.edu.utvt.repository.AreaRepository;
import mx.edu.utvt.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return categoryRepository.findAll();
    }

    public Category getOne(long id){
        return categoryRepository.getOne(id);
    }

    public Category saveOrUpdate(Category category){
        return categoryRepository.save(category);
    }

    public void remove(long id){
        categoryRepository.deleteById(id);
    }
}
