package mx.edu.utvt.service;

import mx.edu.utvt.entity.Area;
import mx.edu.utvt.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService {
    @Autowired
    private AreaRepository areaRepository;

    public List<Area> getAll(){
        return areaRepository.findAll();
    }

    public Area getOne(long id){
        return areaRepository.getOne(id);
    }

    public Area saveOrUpdate(Area area){
        return areaRepository.save(area);
    }

    public void remove(long id){
        areaRepository.deleteById(id);
    }


}
