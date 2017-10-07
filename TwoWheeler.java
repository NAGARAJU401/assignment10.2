package Mypack;
//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
//package is array
public class TwoWheeler {
	//public : members which can access as public,public members are visible to all other classes.
		//class : is a context of java that are used to create objects and to define object data types and methods.
		//declares a class called evennumbers.
	public static void main(String[] args) {
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		// TODO Auto-generated method stub
		System.out.println("The Properties of a two wheeler are :");     //prints the properties of a bike 
		//system : system is a class in java language.lang package
	  	//out : out is the static member of system class.It's type PrintStream
	  	//println: which is used to print the output.

		Mypack.Bike bike =new Mypack.Bike();
		bike.gears();  //displays the get methods for the objects provided
		bike.milage();//displays millage
		bike.speed();//displays speed
		bike.model();//displays model
	}

}
