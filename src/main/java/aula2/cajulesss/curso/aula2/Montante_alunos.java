/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2.cajulesss.curso.aula2;

/**
 *
 * @author xuxu
 */
import java.util.Scanner;

public class Montante_alunos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Perguntar  ao usuário suas notas e armazenar em cada item de um array
        Scanner resposta_usuario = new Scanner(System.in);
        
        double notas [] = new double[3];
        System.out.println("Digite a primeira nota:");
        notas[0] = resposta_usuario.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        notas[1] = resposta_usuario.nextDouble();
        
        System.out.println("Digite a terceira nota:");
        notas[2] = resposta_usuario.nextDouble();
        
    }
    
}
