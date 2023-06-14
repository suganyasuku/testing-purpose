package exce.com;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Class {
	
	@Test
	public void method1() {
		String sample="suganya";
		String actual="SUGANYA";
		String expected= sample.toUpperCase();
		assertEquals(expected, actual);
		
	}
	@Test
	public void method2() {
		String a= "abcd";
		boolean b=a.equals("ab");
		assertfalse("false", b);
		}
	private void assertfalse(String string, boolean b) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void method3() {
		String c="ab";
		boolean d=c.equals("ab");
		assertTrue("true", d);
		
		
	}
	
	@Test(expected=NullPointerException.class)
	public void method4() {
		String e= null;
		String f="ab";
		String g=e.toLowerCase();
		assertEquals(f, g);
	}
		
	}


