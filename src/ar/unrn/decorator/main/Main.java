package ar.unrn.decorator.main;

import java.io.File;

import ar.unrn.decorator.modelo.Report;

public class Main {

	public static void main(String[] args) {

		String ruta = "/home/sebastian/archivo-reportes.txt";
		File file = new File(ruta);
		Report reporte = new Report("Reporte");
		reporte.export(file);
	}
}