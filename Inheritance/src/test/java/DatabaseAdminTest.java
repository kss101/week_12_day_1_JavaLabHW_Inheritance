import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Sue", "S951753", 30000);
    }

    @Test
    public void canGetName(){
        assertEquals("Sue", this.databaseAdmin.getName());
    }

    @Test
    public void canGetNINum(){
        assertEquals("S951753", this.databaseAdmin.getNin());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000, this.databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(2500.00);
        assertEquals(32500.00, this.databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300.00, this.databaseAdmin.payBonus(), 0.0);
    }

}
