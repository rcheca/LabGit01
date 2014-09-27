package refactoring.lab.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import refactoring.lab.logica.Fecha;

public class TestFecha {
	Fecha fechaCorrecta;
	Fecha mesMal1;
	Fecha mesMal2;
	Fecha diaMal1;
	Fecha diaMal2;
	Fecha diaMalNoviembre;
	Fecha diaBienDiciembre;
	Fecha diaMalFebrero;
	Fecha diaBienFebreroBisiesto1;
	Fecha diaBienFebreroBisiesto2;
	Fecha diaMalFebreroBisiesto1;
	Fecha diaMalFebreroBisiesto2;
	@Before
	public void setUp() throws Exception {
		//escenario que abarca la mayor cantidad de casos de fechas 
		//válidas e inválidas
		fechaCorrecta = new Fecha(20,6,2008);
		mesMal1  = new Fecha(21,0,3000);
		mesMal2  = new Fecha(21,13,3000);
		diaMal1 = new Fecha(0,11,2000);
		diaMal2 = new Fecha (32,11,2000);
		diaMalNoviembre = new Fecha(31,11,2000);
		diaBienDiciembre = new Fecha(31,12,2000);
		diaMalFebrero =new Fecha(30,2,2008);
		diaBienFebreroBisiesto1 = new Fecha(29,2,2008);
		diaBienFebreroBisiesto2 = new Fecha(29,2,2000);
		diaMalFebreroBisiesto1 = new Fecha(29,2,2007);
		diaMalFebreroBisiesto2 = new Fecha(29,2,1900);
	}
	@Test
	public void test() {
	//SUT: supuesto seria un metodo llamado valida(), se supone
	// que da true cuando la fecha es válida y false cuando
	// no lo es
		assertTrue("La fecha debería ser correcta", fechaCorrecta.valida());
//		assertFalse("El mes debería ser incorrecto", mesMal1.valida());
		//completar
	}

	
	
	
	
	
	
	
	
	
	
	
}
