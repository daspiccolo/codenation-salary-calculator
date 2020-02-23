package br.com.codenation.calculadora;


public class CalculadoraSalario {
    double inss;
    double irpf;
    double salarioLiquido;

    public long calcularSalarioLiquido(double salarioBase) {
        salarioLiquido = salarioBase - calcularInss(salarioBase);
        if (salarioBase <= 0) {
            throw new IllegalArgumentException();

        } else if (salarioBase < 1039) {
            return 0;
        } else if (salarioLiquido <= 3000) {
            return Math.round(salarioLiquido);
        } else {
            salarioLiquido = salarioLiquido - calcularIrpf(salarioLiquido);
            return Math.round(salarioLiquido);
        }
    }

    private double calcularInss(double salarioBase) {
        if (salarioBase <= 1500) {
            inss = ((salarioBase * 8) / 100);

        } else if (salarioBase <= 4000) {
            inss = ((salarioBase * 9) / 100);

        } else {
            inss = ((salarioBase * 11) / 100);
        }
        return (inss);
    }

    private double calcularIrpf(double salarioBase) {
        if (salarioBase <= 3000) {
            irpf = 0;
        } else if (salarioBase <= 6000) {
            irpf = ((salarioBase * 7.5) / 100);
        } else {
            irpf = ((salarioBase * 15) / 100);
        }
        return (irpf);
    }

}
