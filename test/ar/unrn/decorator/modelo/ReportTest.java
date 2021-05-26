package ar.unrn.decorator.modelo;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class ReportTest {

	@Test
	public void testFileNull() {
		File file = null;
		Report report = new NoNullReport(new NoWriteOverReport(new DefaultReport("Reporte")));
		String expectedMessage = "File is NULL; can't export.";
		assertTrue(assertThrows(IllegalArgumentException.class, () -> report.export(file)).getMessage()
				.contains(expectedMessage));

	}

	@Test
	public void testExisteFile() {
		String ruta = "/home/sebastian/decorator-reportes.txt";
		File file = new File(ruta);
		Report report = new NoNullReport(new NoWriteOverReport(new DefaultReport("Reporte")));
		String expectedMessage = "File already exist...";
		assertTrue(assertThrows(IllegalArgumentException.class, () -> report.export(file)).getMessage()
				.contains(expectedMessage));
	}

	@Test
	public void testSobreescribirFile() {

	}
}