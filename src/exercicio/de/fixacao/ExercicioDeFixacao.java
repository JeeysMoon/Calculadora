/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.de.fixacao;

/**
 *
 * @author Jennifer
 */
public class ExercicioDeFixacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double resultadoSoma, resultadoMultiplicacao, resultadoSubtracao, numero1 = 50.0, numero2 = 100.0;
        Calculadora calculadora = new Calculadora();
        
        resultadoSoma = calculadora.somar(50.0,100.0);
        resultadoMultiplicacao = calculadora.multiplicar(3.0,5.0);
        resultadoSubtracao = calculadora.subtrair (50.0,100.0);
        
        System.out.println("O resultado da soma é: " + resultadoSoma + "\nO resultado da multiplicação é: " + resultadoMultiplicacao + "\nO resultado da subtração é: " + resultadoSubtracao);
        
        
        
    }
    
}
