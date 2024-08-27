package com.ProjetoTest.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName(" Teste 5 + 5  =10")
	void testsoma() {
		//Arrange
		Calculadora calc = new Calculadora();
		
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 10D;
		
		double resultado = calc.soma(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "5 + 5 não gerou o valor 10");
	}
	@Test
	@DisplayName(" Teste 6 - 3  =3")
	void testsub() {
		//Arrange
		Calculadora calc = new Calculadora();
		
		double valor1 = 6D;
		double valor2 = 3D;
		double esperado = 3D;
		
		double resultado = calc.sub(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "6 - 3 não gerou o valor 3");
	}
	@Test
	@DisplayName(" Teste 5 * 5  =25")
	void testmulti() {
		//Arrange
		Calculadora calc = new Calculadora();
		
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 25D;
		
		double resultado = calc.multi(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "5 * 5 não gerou o valor 25");
	}
	@Test
	@DisplayName(" Teste 10 / 2  =5")
	void testdiv() {
		//Arrange
		Calculadora calc = new Calculadora();
		
		double valor1 = 10D;
		double valor2 = 2D;
		double esperado = 5D;
		
		double resultado = calc.div(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "5 / 2 não gerou o valor 5");
	}

}
