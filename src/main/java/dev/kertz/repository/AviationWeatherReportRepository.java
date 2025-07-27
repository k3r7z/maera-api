package dev.kertz.repository;

import dev.kertz.model.AviationWeatherReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AviationWeatherReportRepository extends JpaRepository<AviationWeatherReport, Integer> { }
