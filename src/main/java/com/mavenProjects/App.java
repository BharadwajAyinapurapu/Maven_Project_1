package com.mavenProjects;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main(String[] args){
//		App obj =new App();
//		System.out.println(obj.evaluate(5,4));
	}
	static int add(int a,int b){
		return a+b;
	}
	static int sub(int a, int b){
		return a-b;
	}
	static int mul(int a, int b){
		return a*b;
	}
	static int div(int a, int b) {
		if(b==0){
			System.out.println("Divisor can't be zero");
			return Integer.MIN_VALUE;
		}
		return a/b;
	}
	static boolean equalInteger(int a, int b){
		boolean result = false;
		if(a==b){
			result=true;
		}
		return result;
	}
}	
