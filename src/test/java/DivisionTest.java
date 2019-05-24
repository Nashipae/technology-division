import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
//    Test if division object is correctly created.
    @Test
    public void NewDivisionObjectGetsCorrectlyCreated_true() throws Exception {
        Division division = new Division("RNIO", "Power",1800,"James K.","Support Engineer","Checks on power maintenance works.");
        assertEquals(true, division instanceof Division);
    }

    @Test
    public void getDepartment() {
    }

    @Test
    public void getSection() {
    }

    @Test
    public void getId() {
    }

    @Test
    public void getStaff() {
    }

    @Test
    public void getRole() {
    }

    @Test
    public void getResponsibilities() {
    }
}