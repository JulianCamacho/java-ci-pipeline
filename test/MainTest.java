import org.junit.Test;
import src.com.company.Main;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void sumaTest() {
        Main main = new Main();
        assertEquals(7, main.suma(3, 4));
        assertEquals(-3, main.suma(12, -15));
    }

    @Test
    public void restaTest() {
        Main main = new Main();
        assertEquals(5, main.resta(10, 5));
        assertEquals(-8, main.resta(10, 18));
    }

    @Test
    public void multiplicacionTest() {
        Main main = new Main();
        assertEquals(25, main.multiplicacion(5, 5));
        assertEquals(-35, main.multiplicacion(-5, 7));
    }

    @Test
    public void divisionTest() {
        Main main = new Main();
        assertEquals(15, main.division(45, 3));
        assertEquals(-7, main.division(28, -4));
    }
}