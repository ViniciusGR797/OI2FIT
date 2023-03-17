/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author William Tanaka
 */
public class Treino {
    public Treino(int id_treino ,int id_alu, String atividade) {
        this.id_treino = id_treino;
        this.atividade = atividade;
    }
    
    public Treino(){
        
    }
    
    private int id_treino;
    private String atividade;
    private int id_alu;


    
    public int getId_treino() {
        return id_treino;
    }

    public String getAtividade() {
        return atividade;
    }
    
    public int getId_alu() {
        return id_alu;
    }

    public void setId_treino(int id_treino) {
        this.id_treino = id_treino;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    
    public void setId_alu(int id_alu) {
        this.id_alu = id_alu;
    }
}
