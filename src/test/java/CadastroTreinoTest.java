import DAO.AlunoDAO;
import Model.Treino;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CadastroTreinoTest {
    
    public CadastroTreinoTest() {
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
    public void testaCadastroTreinoCerto() {     
        AlunoDAO daoalunot = new AlunoDAO();
        Treino tr = new Treino();
        
        try{
            daoalunot.conexaoTeste();
            tr.setId_alu(3);
            System.out.println(tr.getId_alu());
            System.out.println(tr.getId_treino());
            tr.setAtividade("Treino X de Posterior");
            tr.setId_treino(tr.getId_treino());
            
        }catch(Exception oe){  
        }
        
        Assertions.assertEquals(1,daoalunot.criarTreino(tr));
        daoalunot.deletarLastTreino();//funcao q deleta o registro da ultima medida criada pra n poluir o banco
    }
    
    @Test
    public void testaCadastroTreinoCerto2() {     
        AlunoDAO daoalunot = new AlunoDAO();
        Treino tr = new Treino();
        
        try{
            daoalunot.conexaoTeste();
            tr.setId_alu(2);
            System.out.println(tr.getId_alu());
            System.out.println(tr.getId_treino());
            tr.setAtividade("Treino B de Pescoço");
            tr.setId_treino(tr.getId_treino());
            
        }catch(Exception oe){  
        }
        
        Assertions.assertEquals(1,daoalunot.criarTreino(tr));
        daoalunot.deletarLastTreino();//funcao q deleta o registro da ultima medida criada pra n poluir o banco
    }
    
    @Test
    public void testaCadastroTreinoErrado() {    //input de dados passando um id inexistente no banco
        AlunoDAO daoalunot = new AlunoDAO();
        Treino tr = new Treino();
        
        try{
            daoalunot.conexaoTeste();
            tr.setId_alu(-3);
            tr.setAtividade("Treino X de Posterior");
            tr.setId_treino(tr.getId_treino());

        }catch(Exception oe){  
        }
        Assertions.assertEquals(-1,daoalunot.criarTreino(tr));
    }
    
    @Test
    public void testaCadastroTreinoErrado2() {    //input de dados passando um id inexistente no banco
        AlunoDAO daoalunot = new AlunoDAO();
        Treino tr = new Treino();
        
        try{
            daoalunot.conexaoTeste();
            tr.setId_alu(-1);
            tr.setAtividade("Treino Y de Posterior");
            tr.setId_treino(tr.getId_treino());

        }catch(Exception oe){  
        }
        Assertions.assertEquals(-1,daoalunot.criarTreino(tr));
    }
    
}
