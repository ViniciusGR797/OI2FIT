import DAO.AlunoDAO;
import Model.Treino;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DeletarTreinoTest {
    
    public DeletarTreinoTest() {
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
    public void testaDeletarTreino() {     
        AlunoDAO daoalunot = new AlunoDAO();
        Treino tr = new Treino();
        
        try{
            daoalunot.conexaoTeste();
            tr.setId_alu(3);
            System.out.println(tr.getId_alu());
            
            tr.setAtividade("Treino X de Posterior");
            tr.setId_treino(3);
            System.out.println(tr.getId_treino());
            daoalunot.criarTreino(tr);
            
        }catch(Exception oe){  
        }
        
        Assertions.assertEquals(true,daoalunot.deletarTreino(tr.getId_treino()));
        daoalunot.deletarLastTreino();//funcao q deleta o registro da ultima medida criada pra n poluir o banco
    }
    
}
