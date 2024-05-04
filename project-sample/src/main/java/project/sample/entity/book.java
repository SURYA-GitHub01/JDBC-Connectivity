package project.sample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class book {

    @Id
    private Integer id;
    private String name;
    private String descr;
    private Integer year;
    private String bookType;
}









