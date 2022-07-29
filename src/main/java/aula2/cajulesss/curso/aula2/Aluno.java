/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2.cajulesss.curso.aula2;

/**
 *
 * @author xuxu
 */
public class Aluno {
    //Atributos
   private String nome;
    
    //Método construtor
    public Aluno(String name){
        this.setNome(name);
    }
    //Métodos acessores
    public String isNome(){
    return this.nome;
    }
    
    public void setNome(String nome_do_aluno){
        this.nome = nome_do_aluno;
    }
    
    //Método:
   public void Status_Aluno(){
    System.out.println("Nome do aluno: "+ isNome());
    }
}

