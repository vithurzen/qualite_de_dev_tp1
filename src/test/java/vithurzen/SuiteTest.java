package vithurzen;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@SuiteDisplayName("JUnit Platform Suite Demo")
@Suite.SuiteClasses({ServiceTest.class, VoitureTest.class})
@SelectPackages("vithurzen")
public class SuiteTest {

}
