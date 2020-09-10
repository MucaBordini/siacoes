package siacoes;

import static org.junit.jupiter.api.Assertions.*;

import br.edu.utfpr.dv.siacoes.model.Department;

import org.junit.jupiter.api.Test;

class DepartmentTest {
	
	
	@Test
	void test() {
		Department dep = new Department();
		dep.setFullName("Testando Set e Get FullName");
		
		String resultadoEsperado = "Testando Set e Get FullName";
		String resultadoObtido = dep.getFullName();
		
		assertEquals(resultadoEsperado, resultadoObtido);
	}

}
