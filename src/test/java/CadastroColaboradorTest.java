/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.ColaboradorDAO;
import Model.Colaborador;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author lucas
 */
public class CadastroColaboradorTest {
    
    public CadastroColaboradorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    

    @Test
    public void testaCadastroColabCerto() {     
        ColaboradorDAO daocolabt = new ColaboradorDAO();
        
        Colaborador colabt = new Colaborador();
        try{
            daocolabt.conexaoTeste();
            colabt.setNome_colab("JonasTeste");
            colabt.setLogin_colab("loginTeste");
            colabt.setSenha_colab("senhaTeste");
            colabt.setCpf_colab("32323232");
        }catch(Exception oe){
            
        }
        Assertions.assertEquals(1,daocolabt.criarColab(colabt));
        
        
        daocolabt.pesquisa("32323232");
        Colaborador colaborador = daocolabt.getColaborador();
        Assertions.assertEquals("JonasTeste", colaborador.getNome_colab());
        Assertions.assertEquals("loginTeste", colaborador.getLogin_colab());
        Assertions.assertEquals("senhaTeste", colaborador.getSenha_colab());
        Assertions.assertEquals("32323232", colaborador.getCpf_colab());
        daocolabt.deletarLast();
    }
    
    @Test
    public void testaCadastroColabCerto2() {     
        ColaboradorDAO daocolabt = new ColaboradorDAO();
        
        Colaborador colabt = new Colaborador();
        try{
            daocolabt.conexaoTeste();
            colabt.setNome_colab("LucasTeste");
            colabt.setLogin_colab("loginT");
            colabt.setSenha_colab("senhaT");
            colabt.setCpf_colab("32323211");
        }catch(Exception oe){
            
        }
        Assertions.assertEquals(1,daocolabt.criarColab(colabt));
        
        
        daocolabt.pesquisa("32323211");
        Colaborador colaborador = daocolabt.getColaborador();
        Assertions.assertEquals("LucasTeste", colaborador.getNome_colab());
        Assertions.assertEquals("loginT", colaborador.getLogin_colab());
        Assertions.assertEquals("senhaT", colaborador.getSenha_colab());
        Assertions.assertEquals("32323211", colaborador.getCpf_colab());
        daocolabt.deletarLast();
    }
    
    @Test
    public void testaCadastroColabErrado() {    //COMO NAO PASSAMOS O CPF, E NO BD ELE N PODE SER NULL, E NO TESTE ESPERAMOS DAR -1 OU SEJA ERRO
        ColaboradorDAO daocolabt = new ColaboradorDAO();
        
        Colaborador colabt = new Colaborador();
        try{
            daocolabt.conexaoTeste();
            colabt.setNome_colab("JonasTeste");
            colabt.setLogin_colab("loginTeste");
            colabt.setSenha_colab("senhaTeste");
        }catch(Exception oe){
            
        }
        Assertions.assertEquals(-1,daocolabt.criarColab(colabt));
    }
    
    @Test
    public void testaCadastroColabErrado2() {    //COMO NAO PASSAMOS O CPF, E NO BD ELE N PODE SER NULL, E NO TESTE ESPERAMOS DAR -1 OU SEJA ERRO
        ColaboradorDAO daocolabt = new ColaboradorDAO();
        
        Colaborador colabt = new Colaborador();
        try{
            daocolabt.conexaoTeste();
            colabt.setNome_colab("PedroTeste");
            colabt.setLogin_colab("loginTest");
            colabt.setSenha_colab("senhaTest");
        }catch(Exception oe){
            
        }
        Assertions.assertEquals(-1,daocolabt.criarColab(colabt));
    }
}
