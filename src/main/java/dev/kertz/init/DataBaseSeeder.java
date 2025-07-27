package dev.kertz.init;

import dev.kertz.model.AviationWeatherReport;
import dev.kertz.repository.AviationWeatherReportRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class DataBaseSeeder implements CommandLineRunner {
    private final AviationWeatherReportRepository aviationWeatherReportRepository;

    DataBaseSeeder(AviationWeatherReportRepository aviationWeatherReportRepository) {
        this.aviationWeatherReportRepository = aviationWeatherReportRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if(aviationWeatherReportRepository.count() == 0)
            seedAviationWeatherReports();
        else
            System.out.println("DataBase Seeder: AviationWeatherReports already seeded");
    }

    private void seedAviationWeatherReports() {
        aviationWeatherReportRepository.saveAll(
                List.of(
                    new AviationWeatherReport("METAR", "https://ssl.smn.gob.ar/mensajes/index.php?observacion=metar&operacion=consultar"),
                    new AviationWeatherReport("SPECI", "https://ssl.smn.gob.ar/mensajes/index.php?observacion=speci&operacion=consultar"),
                    new AviationWeatherReport("TAF", "https://ssl.smn.gob.ar/mensajes/index.php?observacion=taf&operacion=consultar"),
                    new AviationWeatherReport("PRONAREA", "https://ssl.smn.gob.ar/mensajes/index.php?observacion=pronarea&operacion=consultar"),
                    new AviationWeatherReport("SIGMET", "https://ssl.smn.gob.ar/mensajes/index.php?observacion=sigmet&operacion=consultar")
                )
        );
    }
}
