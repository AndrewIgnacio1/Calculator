package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ additionTest.class, subtractionTest.class, multiplicationTest.class, divisionTest.class, squaredTest.class })
public class AllTests {

}
