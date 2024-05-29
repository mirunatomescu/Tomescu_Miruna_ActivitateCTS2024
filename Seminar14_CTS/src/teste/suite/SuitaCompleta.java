package teste.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.PachetTuristicTest;
import teste.PachetTuristicTestWithFixture;
import teste.PersoanaTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PachetTuristicTestWithFixture.class, PersoanaTests.class})
public class SuitaCompleta {
}