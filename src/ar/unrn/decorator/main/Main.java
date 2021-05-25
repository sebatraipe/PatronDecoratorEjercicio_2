package ar.unrn.decorator.main;

import java.io.File;

import ar.unrn.decorator.modelo.DefaultReport;
import ar.unrn.decorator.modelo.NoNullReport;
import ar.unrn.decorator.modelo.NoWriteOverReport;
import ar.unrn.decorator.modelo.Report;

public class Main {

	public static void main(String[] args) {

		String ruta = "/home/sebastian/decorator-reportes.txt";
		File file = new File(ruta);
		Report report = new NoNullReport(new NoWriteOverReport(new DefaultReport("Reporte")));
		report.export(file);

	}
}