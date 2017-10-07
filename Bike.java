package Mypack;
//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
//package is array
public class Bike {
	//public : members which can access as public,public members are visible to all other classes.
		//class : is a context of java that are used to create objects and to define object data types and methods.
		//declares a class called evennumbers.
	
	 public void speed(){ //created speed method
		//Public is a keyword that is used as an access modifier for methods and variables.
		//void: it is void if the method does not return a value.
		 int speed = 120;
		 System.out.println("bike has a property of speed ....");
		 System.out.println("bike goes with a speed of :"+speed);
		//system : system is a class in java language.lang package
		  	//out : out is the static member of system class.It's type PrintStream
		  	//println: which is used to print the output.

	 
	 }
	  
		 public void milage( ){ //created milage  method
			//Public is a keyword that is used as an access modifier for methods and variables.
			//void: it is void if the method does not return a value.
			 int  milage  =450;
			 System.out.println("bike has another property called milage  ...."+milage);
			 
		 } 
		  public void model(){           //  created four methods and declared their properties
			//Public is a keyword that is used as an access modifier for methods and variables.
			//void: it is void if the method does not return a value.
			  String model = "Honda Shine";
			  System.out.println("bike model is"+ model);
		  }
	  public void gears(){
		//Public is a keyword that is used as an access modifier for methods and variables.
		//void: it is void if the method does not return a value.
		  System.out.println("bike has 4 gears ....");
		//system : system is a class in java language.lang package
		  	//out : out is the static member of system class.It's type PrintStream
		  	//println: which is used to print the output.


	}

}
