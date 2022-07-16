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

	public void test1() {
		int actual=obj.evaluate(10,20);
		int expected=30;
		assertEquals(expected,actual);
	}
	
	public void test2(){
		int actual=obj.evaluate(0,0);
		int expected=0;
		assertEquals(expected,actual);
	}
	
	public void test3(){
		int actual=obj.evaluate(-10,-20);
		int expected=-30;
		assertEquals(expected,actual);
	}
	
	public void test4(){
		int actual=obj.evaluate(-10,90);
		int expected=80;
		assertEquals(expected,actual);
	}
	public void test5(){
		int actual=obj.evaluate(560,97950);
		int expected=98510;
		assertEquals(expected,actual);
	}
}
