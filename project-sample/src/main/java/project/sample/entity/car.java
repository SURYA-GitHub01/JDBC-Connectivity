package project.sample.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)        //Identity...
    private Integer carNo;
    private String company;
    private String model;
    private Integer seatCount;
    private String fuelType;
    private String colour;
    private String gearType;
    private String ac;
    private String airbag;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="join")
//    private String ownername;

}
