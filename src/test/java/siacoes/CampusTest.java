package siacoes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.utfpr.dv.siacoes.model.Campus;

class CampusTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		Campus campus = new Campus();
		campus.setSite("www.testandocampus.com");
		
		String resultadoEsperado = "www.testandocampus.com";
		String resultadoObtido = campus.getSite();
		
		assertEquals(resultadoEsperado, resultadoObtido);
	}

}
