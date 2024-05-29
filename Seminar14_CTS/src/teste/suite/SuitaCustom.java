package teste.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.dubluri.AreFake;
import teste.dubluri.NuAreFake;

@RunWith(Categories.class)
@Suite.SuiteClasses(SuitaCompleta.class)
@Categories.IncludeCategory(AreFake.class)
public class SuitaCustom {
}