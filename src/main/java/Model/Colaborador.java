/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author lucas
 */
public class Colaborador {

    public Colaborador(int id_colab, String nome_colab, String cpf_colab , String login_colab, String senha_colab) {
        this.id_colab = id_colab;
        this.nome_colab = nome_colab;
        this.cpf_colab = cpf_colab;
        this.login_colab = login_colab;
        this.senha_colab = senha_colab;
        
    }
    
    public Colaborador(){
        
    }

    private int id_colab;
    private String nome_colab;
    private String login_colab;
    private String senha_colab;
    private String cpf_colab;
    
    public int getId_colab() {
        return id_colab;
    }

    public String getNome_colab() {
        return nome_colab;
    }

    public String getLogin_colab() {
        return login_colab;
    }

    public String getSenha_colab() {
        return senha_colab;
    }

    public String getCpf_colab() {
        return cpf_colab;
    }

    public void setId_colab(int id_colab) {
        this.id_colab = id_colab;
    }

    public void setNome_colab(String nome_colab) {
        this.nome_colab = nome_colab;
    }

    public void setLogin_colab(String login_colab) {
        this.login_colab = login_colab;
    }

    public void setSenha_colab(String senha_colab) {
        this.senha_colab = senha_colab;
    }

    public void setCpf_colab(String cpf_colab) {
        this.cpf_colab = cpf_colab;
    }
    
}
