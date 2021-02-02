package mx.edu.utvt.service;

import mx.edu.utvt.entity.Category;
import mx.edu.utvt.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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

    public boolean remove(Long id) {
        Category  category= getOne(id);
        if (category != null){
            categoryRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
