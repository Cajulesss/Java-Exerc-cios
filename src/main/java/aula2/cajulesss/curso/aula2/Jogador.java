/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2.cajulesss.curso.aula2;

/**
 *
 * @author xuxu
 */
public class Jogador {
    //Atributos:
    
    private String nome;
    private int gols;
    public int assistencias;
    
    //Construtor
    public Jogador(String recebe_nome,int recebe_gols,int nume_assis){
        this.setNome(recebe_nome);
        this.setGols(recebe_gols);
        this.Numero_de_Assistencias(nume_assis);
    }
    
    
    //Métodos Acessores
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String recebe_nome){
        this.nome = recebe_nome;
    }
    
    public int getGols(){
        return this.gols;
    }
    
    public void setGols(int recebe_gols){
        this.gols = recebe_gols;
    }
    
    public void Status_da_partida(){
        System.out.println("Nome do Jogador: " + this.getNome());
        System.out.println("Número de gols: " + this.getGols());
    }
    //Métodos
    
    /*public void Numero_de_Gols(int gol){
        this.gols = gol;
    }*/
    
    public void Numero_de_Assistencias(int nume_assis){
        System.out.println("Número de assistências recebidas:"+nume_assis);
        this.assistencias = nume_assis;
    }
}
