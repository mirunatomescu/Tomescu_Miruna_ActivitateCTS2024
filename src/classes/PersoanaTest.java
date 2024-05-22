package classes;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Test
    public void getSexReturnF() {
        // right
        Persoana persoana1= new Persoana("Simona","62542352345");
        assertEquals(persoana1.getSex(),"F");
    }

    @org.junit.Test
    public void getSexReturnM() {
        Persoana persoana2= new Persoana("Ionut","52542352345");
        assertEquals(persoana2.getSex(),"M");
    }

    @org.junit.Test
    public void getSexReturnBoundary() {
        // boundary
        Persoana persoana2= new Persoana("Ioana","62542352345");
        assertEquals(persoana2.getSex(),"F");
        Persoana persoana3= new Persoana("Ionut","12542352345");
        assertEquals(persoana3.getSex(),"M");
    }

    @org.junit.Test
    public void getSexCrossCheck(){
        String cnp = "104325234523";
        Persoana persoana = new Persoana("Andrei",cnp);
        String sex;
        if (Integer.valueOf(cnp.charAt(0))%2==0)
            sex =String.valueOf("F");
        else
            sex = String.valueOf("M");
        assertEquals(persoana.getSex(),sex);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorCondition(){
        Persoana persoana = new Persoana("Andrei","904325345243");
        persoana.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexWrongStringErrorCondition(){
        Persoana persoana = new Persoana("Andrei","fasdfasc");
        persoana.getSex();
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexEmptyStringErrorCondition(){
        Persoana persoana = new Persoana("Andrei","");
        persoana.getSex();
    }

    @org.junit.Test(timeout = 200)
    public void getSexPerformance() {
        Persoana persoana = new Persoana("Andrei","62345234042");
        persoana.getSex();
    }

    @org.junit.Test
    public void getSexCorrect(){
        Persoana persoana = new Persoana("Andrei","62345234042");
        assertEquals(1,persoana.getSex().length());
    }

    @org.junit.Test
    public void getSexLetterCorrect(){
        Persoana persoana = new Persoana("Andrei","62345234042");
        boolean isCorrect = persoana.getSex().equalsIgnoreCase("m") ||
                persoana.getSex().equalsIgnoreCase("f");
        assertTrue(isCorrect);
    }

    @org.junit.Test
    public void getSexRange(){
        Persoana persoana = new Persoana("Ioana","82345234042");
        assertEquals("F", persoana.getSex());
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexExistance(){
        Persoana persoana = new Persoana("Ioana",null);
        persoana.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexCardinality(){
        Persoana persoana = new Persoana("Ioana","00000000");
        persoana.getSex();
    }
}