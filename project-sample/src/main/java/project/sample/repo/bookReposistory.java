package project.sample.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.sample.entity.book;

@Repository

public interface bookReposistory extends CrudRepository< book, Integer> {



}
