package GitAccount.Lending;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
        
        HtmlUnitDriver unitdriver= new HtmlUnitDriver();
 		unitdriver.get("https://www.amazon.in");
 		System.out.println(unitdriver.getTitle());
 		unitdriver.quit();
    }
}
