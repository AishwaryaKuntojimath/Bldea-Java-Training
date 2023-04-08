package com.bldea.encapsulation.pkg2;
class Animal extends Object{
	Animal (){
	super();
	System.out.println("Inside zero-parameterized Constructor");
	}
		Animal (int a){
	    super();
	    System.out.println("Inside parameterized Constructor");
		}
       }
     class Cat extends Animal{
    	 Cat(){
    		 super();
    		  }
    	 }
     
    public class Launch2 {

	public static void main(String[] args) {
		 Cat d1=new Cat();
		
		// TODO Auto-generated method stub

	}

}
