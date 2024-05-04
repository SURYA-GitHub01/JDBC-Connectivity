package project.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.sample.entity.car;
import project.sample.repo.CarReposistory;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service

public class CarService {

    @Autowired
    CarReposistory carReposistory;

    public void addCar(car cars){
       carReposistory.save(cars);
    }
    public List<car> getCars(Set<String> company){
        if(company==null) {
            return (List<car>) carReposistory.findAll();
        } else{
            return carReposistory.findAllByCompanyIn(company);
        }
    }
    public Optional<car> getCarByNo(int carNo){
        return carReposistory.findById(carNo);
    }
    public void deleteByCarNo(int carNo){
        carReposistory.deleteById(carNo);
    }

}

