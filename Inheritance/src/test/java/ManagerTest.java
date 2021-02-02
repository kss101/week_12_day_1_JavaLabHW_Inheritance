import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "B123456", 45500, "HR");
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", this.manager.getName());
    }

    @Test
    public void canGetNINum(){
        assertEquals("B123456", this.manager.getNin());
    }

    @Test
    public void canGetSalary(){
        assertEquals(45500, this.manager.getSalary(), 0.0);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("HR", this.manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(4500.00);
        assertEquals(50000, this.manager.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(455.00, this.manager.payBonus(), 0.0);
    }

}
