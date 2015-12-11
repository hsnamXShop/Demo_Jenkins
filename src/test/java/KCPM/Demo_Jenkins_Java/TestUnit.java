package KCPM.Demo_Jenkins_Java;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;

import org.junit.*;
/**
 * Unit test for simple App.
 */
public class TestUnit extends Function
{
	@Test
	public void TestCongHaiSoNguyen()
	{
		Assert.assertEquals(2, CongHaiSoNguyen(1, 2));
	}
	
	
}
