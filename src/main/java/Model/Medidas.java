/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ramon
 */
public class Medidas {
    
    public Medidas(int id_medida, float peso_kg, float altura_m, float imc, int id_alu) {
        this.id_medida = id_medida;
        this.peso_kg = peso_kg;
        this.altura_m = altura_m;
        this.imc = imc;
        this.id_alu = id_alu;
    }
    
    public Medidas(){
        
    }
    
    private int id_medida;
    private float peso_kg;
    private float altura_m;
    private float imc;
    private int id_alu;
 
    public int getId_medida() {
        return id_medida;
    }

    public float get_peso() {
        return peso_kg;
    }
    
    public float get_altura(){
        return altura_m;
    }

    public float get_imc() {
        return imc;
    }

   public int getId_alu() {
        return id_alu;
    }

   public void setId_medida(int id_medida) {
        this.id_medida = id_medida;
    }
   
    public void setId_alu(int id_alu) {
        this.id_alu = id_alu;
    }

    public void setPeso(float peso_kg) {
        this.peso_kg = peso_kg;
    }
    
    public void setAltura(float altura_m){
        this.altura_m = altura_m;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }
}
