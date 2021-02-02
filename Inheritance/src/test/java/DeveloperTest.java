import techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Kurt", "K2468123", 29000);
    }

    @Test
    public void canGetName(){
        assertEquals("Kurt", this.developer.getName());
    }

    @Test
    public void canGetNINum(){
        assertEquals("K2468123", this.developer.getNin());
    }

    @Test
    public void canGetSalary(){
        assertEquals(29000, this.developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(2000.00);
        assertEquals(31000.00, this.developer.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(290.00, this.developer.payBonus(), 0.0);
    }

}
