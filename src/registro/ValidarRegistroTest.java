package registro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidarRegistroTest {

	@Test
	void CP1() {
		assertTrue(ValidarRegistro.ValidarDatos("18", "12543698A", "Española"));
	}
	@Test
	void CP2() {
		assertTrue(ValidarRegistro.ValidarDatos("65", "12543698A", "Española"));
	}
	@Test
	void CP3() {
		assertFalse(ValidarRegistro.ValidarDatos("17", "12543698A", "Española"));
	}
	@Test
	void CP4() {
		assertFalse(ValidarRegistro.ValidarDatos("16", "12543698A", "Española"));
	}
	@Test
	void CP5() {
		//assertFalse(ValidarRegistro.ValidarDatos("AA", "12543698A", "Española"));
		assertThrows(NumberFormatException.class, ()->ValidarRegistro.ValidarDatos("AA", "12543698A", "Española"));
	}
	@Test
	void CP6() {
		assertFalse(ValidarRegistro.ValidarDatos("18", "12345F", "Española"));
	}
	@Test
	void CP7() {
		assertFalse(ValidarRegistro.ValidarDatos("18", "123456789F", "Española"));
	}
	@Test
	void CP8() {
		assertFalse(ValidarRegistro.ValidarDatos("18", "asd1234F", "Española"));
	}
	@Test
	void CP9() {
		assertFalse(ValidarRegistro.ValidarDatos("18", "123456789", "Española"));
	}
	@Test
	void CP10() {
		assertFalse(ValidarRegistro.ValidarDatos("65", "12345F", "Española"));
	}
	@Test
	void CP11() {
		assertFalse(ValidarRegistro.ValidarDatos("65", "123456789F", "Española"));
	}
	@Test
	void CP12() {
		assertFalse(ValidarRegistro.ValidarDatos("65", "asd1234F", "Española"));
	}
	@Test
	void CP13() {
		assertFalse(ValidarRegistro.ValidarDatos("65", "123456789", "Española"));
	}
	@Test
	void CP14() {
		assertFalse(ValidarRegistro.ValidarDatos("18", "12543698A", "No Española"));
	}
	@Test
	void CP15() {
		assertFalse(ValidarRegistro.ValidarDatos("65", "12543698A", "No Española"));
	}

}
