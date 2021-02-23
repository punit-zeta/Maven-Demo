package Testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        // All test files
        Testing.JUnitTest.class,
        Testing.JUnitTestCopy.class
})
public class JUnitTestSuite {
}
