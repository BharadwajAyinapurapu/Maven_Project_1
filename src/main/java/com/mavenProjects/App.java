package com.mavenProjects;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main(String[] args){
		App obj =new App();
		System.out.println(obj.add(5,4));
		System.out.println(obj.sub(5,4));
		System.out.println(obj.mul(5,4));
		System.out.println(obj.div(5,4));
		System.out.println(obj.equalInteger(5,4));
	}
	 int add(int a,int b){
		return a+b;
	}
	 int sub(int a, int b){
		return a-b;
	}
	 int mul(int a, int b){
		return a*b;
	}
	 int div(int a, int b) {
		if(b==0){
			System.out.println("Divisor can't be zero");
			return Integer.MIN_VALUE;
		}
		return a/b;
	}
	 boolean equalInteger(int a, int b){
		boolean result = false;
		if(a==b){
			result=true;
		}
		return result;
	}
}	
