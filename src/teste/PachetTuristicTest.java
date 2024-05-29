package teste;

import clase.IPersoana;
import clase.PachetTuristic;
import clase.Persoana;
import clase.FakePersoana;
import org.junit.*;
import org.junit.experimental.categories.Category;
import teste.dubluri.AreFake;
import teste.dubluri.NuAreFake;

import static org.junit.Assert.*;

public class PachetTuristicTest {
    @Test
    @Category(NuAreFake.class)
    public void corectitudineDiscount()
    {
        IPersoana persoana = new Persoana("Ion", "1245498579232");
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Madrid", 100d);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(90, pachetTuristic.getPret(), 0.01f);
    }

    @Test
    @Category(NuAreFake.class)
    public void discountBoundary()
    {
        IPersoana persoana = new Persoana("Ion", "1590423199234");
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Milano", 100d);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(90, pachetTuristic.getPret(), 0.01f);
    }

    @Test
    @Category(AreFake.class)
    public void discountFakePerson()
    {
        IPersoana persoana = new FakePersoana();
        ((FakePersoana )persoana).setGetVarsta(65);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Palermo", 90d);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(81, pachetTuristic.getPret(), 0.01f);
    }

    @Test
    @Category(AreFake.class)
    public void testFakeNonDiscount()
    {
        IPersoana persoana = new FakePersoana();
        ((FakePersoana )persoana).setGetVarsta(55);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Miami", 65d);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(65f, pachetTuristic.getPret(), 0.01f);
    }
}