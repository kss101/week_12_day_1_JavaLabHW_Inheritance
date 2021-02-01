
import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Big Al", "A825010", 75000.00, "HR", 450000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Big Al", this.director.getName());
    }

    @Test
    public void canGetNINum(){
        assertEquals("A825010", this.director.getNin());
    }

    @Test
    public void canGetSalary(){
        assertEquals(75000.00, this.director.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("HR", this.director.getDeptName());
    }
    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000.00);
        assertEquals(80000.00, this.director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1500.00, this.director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(450000.00, this.director.getBudget(), 0.01);
    }
}
