package dev.kertz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class AviationWeatherReport {
    @Id
    @GeneratedValue
    private int id;

    @Column(length = 50)
    private String name;

    @Column
    private String url;

    public AviationWeatherReport(String name, String url) {
        this.name = name;
        this.url = url;
    }
}
