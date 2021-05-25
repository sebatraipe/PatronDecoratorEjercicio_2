package ar.unrn.decorator.modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Report {

	private String reporte;

	public Report(String reporte) {
		this.reporte = reporte;
	}

	public void export(File file) {
		if (file == null) {
			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
		}
		if (file.exists()) {
			throw new IllegalArgumentException("El archivo ya existe...");
		}
		// Exportar el reporte a un archivo.
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(reporte);
			bw.close();
		} catch (IOException e) {
			throw new RuntimeException("Error escribiendo el reporte...", e);
		}
	}
}