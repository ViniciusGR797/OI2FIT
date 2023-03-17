import DAO.AlunoDAO;
import Model.Medidas;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CadastroMedidaTest {
    
    public CadastroMedidaTest() {
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
    public void testaCadastroMedidaCerto() {     //input de dados correto, esperado que cadastre no sistema
        AlunoDAO daoalunot = new AlunoDAO();
        Medidas med = new Medidas();
        
        try{
            daoalunot.conexaoTeste();
            med.setId_alu(3);
            med.setPeso(70);
            med.setAltura((float) 1.70);
            med.setId_medida(med.getId_medida());
            
        }catch(Exception oe){  
        }

        Assertions.assertEquals(1,daoalunot.criarMedida(med));
        daoalunot.deletarLastMedida();  //funcao q deleta o registro da ultima medida criada pra n poluir o banco
    }
    
    @Test
    public void testaCadastroMedidaCerto2() {     //input de dados correto, esperado que cadastre no sistema
        AlunoDAO daoalunot = new AlunoDAO();
        Medidas med = new Medidas();
        
        try{
            daoalunot.conexaoTeste();
            med.setId_alu(3);
            med.setPeso(75);
            med.setAltura((float) 1.72);
            med.setId_medida(med.getId_medida());
            
        }catch(Exception oe){  
        }

        Assertions.assertEquals(1,daoalunot.criarMedida(med));
        daoalunot.deletarLastMedida();  //funcao q deleta o registro da ultima medida criada pra n poluir o banco
    }
    
    @Test
    public void testaCadastroMedidaErrado() {    //input de dados passando um id inexistente no banco
        AlunoDAO daoalunot = new AlunoDAO();
        Medidas med = new Medidas();
        
        try{
            daoalunot.conexaoTeste();
            med.setId_alu(-3);
            med.setPeso((float) 0);
            med.setAltura((float) 1.70);
            med.setId_medida(med.getId_medida());

        }catch(Exception oe){  
        }
        Assertions.assertEquals(-1,daoalunot.criarMedida(med));
    }
    
    @Test
    public void testaCadastroMedidaErrado2() {    //input de dados passando um id inexistente no banco
        AlunoDAO daoalunot = new AlunoDAO();
        Medidas med = new Medidas();
        
        try{
            daoalunot.conexaoTeste();
            med.setId_alu(-1);
            med.setPeso((float) 0);
            med.setAltura((float) 1.70);
            med.setId_medida(med.getId_medida());

        }catch(Exception oe){  
        }
        Assertions.assertEquals(-1,daoalunot.criarMedida(med));
    }
    
    @Test
    public void testaCadastroIMC(){
        AlunoDAO daoalunot = new AlunoDAO();
        Medidas med = new Medidas();
        
        try{
            daoalunot.conexaoTeste();
            med.setId_alu(3);
            med.setPeso(70);
            med.setAltura((float) 1.70);
            med.setImc(med.get_peso()/(med.get_altura()*med.get_altura()));
            med.setId_medida(med.getId_medida());
            
        }catch(Exception oe){  
        }

        Assertions.assertEquals(1,daoalunot.criarMedida(med));
        daoalunot.deletarLastMedida();  //funcao q deleta o registro da ultima medida criada pra n poluir o banco
    }
    
    @Test
    public void testaCadastroIMC2(){
        AlunoDAO daoalunot = new AlunoDAO();
        Medidas med = new Medidas();
        
        try{
            daoalunot.conexaoTeste();
            med.setId_alu(4);
            med.setPeso(76);
            med.setAltura((float) 1.71);
            med.setImc(med.get_peso()/(med.get_altura()*med.get_altura()));
            med.setId_medida(med.getId_medida());
            
        }catch(Exception oe){  
        }

        Assertions.assertEquals(1,daoalunot.criarMedida(med));
        daoalunot.deletarLastMedida();  //funcao q deleta o registro da ultima medida criada pra n poluir o banco
    }
    
    @Test
    public void testaCadastroIMCErrado(){
        AlunoDAO daoalunot = new AlunoDAO();
        Medidas med = new Medidas();
        
        try{
            daoalunot.conexaoTeste();
            med.setId_alu(-3);
            med.setPeso(70);
            med.setAltura((float) 1.70);
            med.setImc(med.get_peso()/(med.get_altura()*med.get_altura()));
            med.setId_medida(med.getId_medida());
            
        }catch(Exception oe){  
        }

        Assertions.assertEquals(-1,daoalunot.criarMedida(med));
        daoalunot.deletarLastMedida();  //funcao q deleta o registro da ultima medida criada pra n poluir o banco
    }
    
    @Test
    public void testaCadastroIMCErrado2(){
        AlunoDAO daoalunot = new AlunoDAO();
        Medidas med = new Medidas();
        
        try{
            daoalunot.conexaoTeste();
            med.setId_alu(-1);
            med.setPeso(70);
            med.setAltura((float) 1.70);
            med.setImc(med.get_peso()/(med.get_altura()*med.get_altura()));
            med.setId_medida(med.getId_medida());
            
        }catch(Exception oe){  
        }

        Assertions.assertEquals(-1,daoalunot.criarMedida(med));
        daoalunot.deletarLastMedida();  //funcao q deleta o registro da ultima medida criada pra n poluir o banco
    }
}
