package teste;

import clase.FakePersoana;
import clase.IPersoana;
import clase.PachetTuristic;
import clase.FakePersoana;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import teste.dubluri.AreFake;

import static org.junit.Assert.*;

public class PachetTuristicTestWithFixture {

    private PachetTuristic pachetTuristic;

    @Before
    public void setUp() throws Exception {
        IPersoana persoana = new FakePersoana();
        this.pachetTuristic = new PachetTuristic(persoana, "Palermo", 90d);
    }

    @Test
    @Category(AreFake.class)
    public void testDiscountZero()
    {
        this.pachetTuristic.aplicaDiscountVarstnici(0);
        assertEquals(90d, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(AreFake.class)
    public void testDiscountCuOSuta()
    {
        this.pachetTuristic.aplicaDiscountVarstnici(100);
        assertEquals(90d, pachetTuristic.getPret(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(AreFake.class)
    public void testDiscountCuNegativ()
    {
        this.pachetTuristic.aplicaDiscountVarstnici(-10);
    }

    @Test(timeout=10)
    @Category(AreFake.class)
    public void testTimeout()
    {
        this.pachetTuristic.aplicaDiscountVarstnici(1);
    }
}