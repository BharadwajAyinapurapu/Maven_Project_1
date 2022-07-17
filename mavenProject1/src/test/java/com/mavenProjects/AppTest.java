package com.mavenProjects;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

//import static org.junit.Assert.*;

//import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    	App obj = new App();
	
	//@Before
	public void before(){
		System.out.println("This is executed before each test");
	}
	
	//@After
	public void after(){
		System.out.println("This is executed after each test");
	}
	
	public void testSum1() {
		int actual=obj.add(10,20);
		int expected=30;
		assertEquals(expected,actual);
	}
	
	public void testSum2(){
		int actual=obj.add(-10,-20);
		int expected=-30;
		assertEquals(expected,actual);
	}
	
	public void testSub1(){
		int actual=obj.sub(-10,-20);
		int expected=10;
		assertEquals(expected,actual);
	}
	
	public void testMul1(){
		int actual=obj.mul(-10,90);
		int expected=-900;
		assertEquals(expected,actual);
	}
	public void testDiv1(){
		try{
			int actual=obj.div(10,2);
			int expected=5;
			assertEquals(expected,actual);
		}catch(Exception e){
			e.printStackTrace(System.err);
		}
	}
	
	public void testDiv2(){
		int actual=obj.div(10,0);
		int expected=Integer.MIN_VALUE;
		assertEquals(expected,actual);
	}
	public void testEqual1(){
		boolean actual=obj.equalInteger(15,4);
		boolean expected=false;
		assertEquals(actual,expected);
	}
	public void testEqual2(){
		boolean actual=obj.equalInteger(4,4);
		boolean expected=true;
		assertEquals(actual,expected);
	}
}
