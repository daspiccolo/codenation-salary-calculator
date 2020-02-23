package br.com.codenation.calculadora;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CalculadoraSalarioTest {

    @Test
    public void salarioLiquidoIsNotNull() {
        assertNotNull(new CalculadoraSalario().calcularSalarioLiquido(1000.0));
    }

    @Test
    public void salarioLiquidoIsZero() {
        assert(new CalculadoraSalario().calcularSalarioLiquido(1000.0) == 0.0);
    }
    @Test
    public void salarioLiquido() {
        assert(new CalculadoraSalario().calcularSalarioLiquido(10000.0) == 7565);
    }
    @Test(expected = IllegalArgumentException.class)
    public void salarioLiquidoIsNegative() {
       new CalculadoraSalario().calcularSalarioLiquido(-100);
    }

}