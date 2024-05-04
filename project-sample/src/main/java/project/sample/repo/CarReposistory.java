package project.sample.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.sample.entity.car;

import java.util.List;
import java.util.Set;

@Repository

public interface CarReposistory extends CrudRepository<car, Integer> {


    List<car> findAllByCompanyIn(Set<String> company);


}
