package sit707_week2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Ahsan Habib
 */
public class MainTest {
	
	public MainTest() {
		System.out.println("MainTest");
	}
	
	@Before
	public void setup() {
		System.out.println("Before...");
	}
	
	@Test
	public void testStudentIdentity() {
		String studentId = null;
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = null;
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
	public void testAssertTrue()
    {
		System.out.println("testAssertTrue...");
        Assert.assertTrue( true );
    }
	
	@Test
	public void testAssertFalse()
    {
		System.out.println("testAssertFalse...");
        Assert.assertFalse( !true );
    }
}
