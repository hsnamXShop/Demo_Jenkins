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
		Assert.assertEquals(3, CongHaiSoNguyen(1, 2));
	}
	
	@Test
	public void TestTruHaiSoNguyen()
	{
		Assert.assertEquals(-1, TruHaiSoNguyen(1, 2));
	}
	
}
