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
        
        
        //montange no máximo 100
      
        int i = 100;
        while(i>notas[0]){
            i++;
            System.out.println("Digite o nome do aluno:");
            Aluno referencias = new Aluno("");
            referencias.setNome(resposta_usuario.next());
            referencias.Status_Aluno();
            
            
        System.out.println("Digite a primeira nota:");
        notas[0] = resposta_usuario.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        notas[1] = resposta_usuario.nextDouble();
        
        System.out.println("Digite a terceira nota:");
        notas[2] = resposta_usuario.nextDouble();
        
        if(notas[0]>100){
            System.out.println("Montante maior ue 100! Encerra o programa!");
            resposta_usuario.close();
        }else if(notas[1]>100){
            System.out.println("Montante maior ue 100! Encerra o programa!");
            resposta_usuario.close();
            
        }else if(notas[2]>100){]System.out.println("Montante maior ue 100! Encerra o programa!");
            resposta_usuario.close();
        }
            
        
        System.out.println("Sua média é: "+(notas[0]+notas[1]+notas[2])/3);
        
        if(notas[0]>notas[1]&&notas[0]>notas[2]){
            System.out.println("A primeira nota é maior! "+ "Nota 1: "+ notas[0]);
        }else if(notas[1]>notas[2]&&notas[1]>notas[0]){
            System.out.println("A segunda nota é maior! "+ "Nota 2: "+ notas[1]);
        }else{
            System.out.println("A terceira nota é maior! "+ "Nota 3: "+ notas[2]);
        }
    }
        
        
    }
    
}

