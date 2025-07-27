package dev.kertz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AviationWeatherReport {
    @Id
    private int id;

    @Column(length = 50)
    private String name;

    @Column
    private String url;
}
