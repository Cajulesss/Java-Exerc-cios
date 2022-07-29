/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2.cajulesss.curso.aula2;

/**
 *
 * @author xuxu
 */
//import java.util.Scanner;
public class Jogo_Futebol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criar uma classe Jogador ue tenha as propriedades nome,gols,assistências.E os métodos adicionarGol e adicionarAssistencia que receba como argumento as quantidades de gols/assistências

        //Scanner resposta_usuario = new Scanner(System.in);
        Jogador primeira_partida_futebol = new Jogador("Jullyene",1,67);
        primeira_partida_futebol.Status_da_partida();
        System.out.println("\n");
        
        /*partidas_futebol.setNome("junior");
        partidas_futebol.setGols(2);*/
        
        Jogador segunda_partida_futebol = new Jogador("Igor",3,45);
        segunda_partida_futebol.Status_da_partida();
        
        
        
        
    }
    
}
