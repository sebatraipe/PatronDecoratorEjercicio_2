package ar.unrn.decorator.modelo;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class ReportTest {

	@Test
	public void testFileNull() {
		File file = null;
		Report reporte = new Report("Reporte...");
		String expectedMessage = "File es NULL; no puedo exportar...";
		assertTrue(assertThrows(IllegalArgumentException.class, () -> reporte.export(file)).getMessage()
				.contains(expectedMessage));

	}

	@Test
	public void testExisteFile() {
		String ruta = "/home/sebastian/archivo-reportes.txt";
		File file = new File(ruta);
		Report reporte = new Report("Reporte");
		String expectedMessage = "El archivo ya existe...";
		assertTrue(assertThrows(IllegalArgumentException.class, () -> reporte.export(file)).getMessage()
				.contains(expectedMessage));
	}
}