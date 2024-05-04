package project.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.sample.entity.car;
import project.sample.repo.CarReposistory;
import project.sample.service.CarService;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    //    private project.sample.service.carService carService;
    private CarService carService;

    @Autowired
    private CarReposistory carRepository;

    /**
     * @param cars
     * @return
     */

    @PostMapping("/addcars")
    public String addCars(@RequestBody car cars) {
        carService.addCar(cars);
        return "added succesfully";
    }

//    @GetMapping("/getcars")
//    public List<car> getCars(){
//        return carService.getCars();
//    }

    // ..........For query param.........
    @GetMapping("/getcars")
    public List<car> getCars(@RequestParam(value = "companys", required = false) Set<String> company) {
        return carService.getCars(company);
    }

    @GetMapping("/getcarbyno/{carNo}")
    public Optional<car> getCarByNo(@PathVariable int carNo) {
        return carService.getCarByNo(carNo);
    }

    @DeleteMapping("/deletecarbyno/{carNo}")
    public String deleteCar(@PathVariable int carNo) {
        carService.deleteByCarNo(carNo);
        return "delete successfully";

    }

    @PutMapping("/updatecar/{carNo}")
    public String updateCar(@PathVariable int carNo, @RequestBody car cars) {
        car newcar = carRepository.findById(carNo).orElseThrow(() -> new ResourceNotFoundException("Car not found for this CarNo :: " + carNo));
        ;
        newcar.setCompany(cars.getCompany());
        newcar.setModel(cars.getModel());
        newcar.setSeatCount(cars.getSeatCount());
        newcar.setFuelType(cars.getFuelType());
        newcar.setColour(cars.getColour());
        newcar.setGearType(cars.getGearType());
        newcar.setAc(cars.getAc());
        newcar.setAirbag(cars.getAirbag());
        carRepository.save(newcar);
        return "updated successfully";

    }


}
