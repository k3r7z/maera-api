package dev.kertz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Province {

    @Id
    private int id;

    @Column(nullable = false, unique = true)
    private String name;

    public Province(String name){
        this.name = name;
    }
}
