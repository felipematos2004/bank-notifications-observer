//Esse código lê o salário e os benefícios de um usuário, calcula o imposto com base em faixas de alíquota e imprime o resultado formatado com duas casas decimais.

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Lê os valores de Entrada:
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario > 0 && valorSalario <= 1100) {
            // Atribui a alíquota de 5% mediante o salário:
            valorImposto = 0.05f * valorSalario;
        }
        if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            valorImposto = 0.10f * valorSalario;
        }
        if (valorSalario > 2500) {
            valorImposto = 0.15f * valorSalario;
        }

        // TODO Criar as demais condições para as alíquotas de 10.00% e 15.00%.

        // Calcula e imprime a saída (com 2 casas decimais):
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
}
