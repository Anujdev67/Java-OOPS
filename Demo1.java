// Abstract
class Laptop{
	public void compiler(){
		System.out.println("compiling");
	}
}
class Dev{
	public void code(Laptop lap){
		System.out.println("coding..");
		lap.compiler();
	}
}
class Demo1 {
public static void main(String argss[]) {
	Laptop lap = new Laptop();
	Dev dev1 = new Dev();
	dev1.code(lap);
}
}
//  Computer class which has no meaning
class Computer
{
	public void compiler() {
		
	}
}
class Desktop extends Computer{
	public void compiler(){
		System.out.println("compiling Faster");
	}
}
class Laptop extends Computer{
	public void compiler(){
		System.out.println("compiling");
	}
}
class Dev{
	public void code(Computer lap){
		System.out.println("coding..");
		lap.compiler();
	}
}
class Demo {
public static void main(String argss[]) {    // laptop *   computer both
//	Laptop lap = new Laptop();
	Computer lap = new Laptop();
	Computer desk1 = new Desktop();
	Dev dev1 = new Dev();
	dev1.code(desk1);
}
}

// Abstract class
package com.hexaware.abstraction;
abstract class Computer
{
	public abstract void compiler(); 
//	public void show() {
		
		
	}

abstract class Desktop extends Computer{
//	public void compiler(){    // if we remove says the type desktop must implement th inherited abscract method Computer.compiler()
//		System.out.println("compiling Faster");
//	}
//}
class Laptop extends Computer{
	public void compiler(){
		System.out.println("compiling");
	}
}
class Dev{
	public void code(Computer lap){
		System.out.println("coding..");
		lap.compiler();
	}
}
class Demo {
public static void main(String argss[]) {    // laptop *   computer both
//	Laptop lap = new Laptop();
	Computer lap = new Laptop();
	Computer desk1 = new Desktop();
	Dev dev1 = new Dev();
	dev1.code(desk1);
//	Computer com = new Computer();     // Type Abstract    you cannot create objects of interface and abstract class
}
}

// Interface
package com.hexaware.abstraction;
interface Computer
{
	int price = 30000;    // declare variables 
	void compiler();    // by default public
//	public void show() {
//		default void config()          // new default keyword
//		{
//			
//		}
		
		
	}
interface Portable
{
	void move();
}
class Desktop implements Computer{
	public void compiler(){    // if we remove says the type desktop must implement th inherited abscract method Computer.compiler()
		System.out.println("compiling Faster");
	}
}
class Laptop implements Computer,Portable  // you have to define this method like down public void move
{
	public void compiler(){
		System.out.println("compiling");
	}

public void move()
{
	System.out.println("Moving...");
}
}
class Dev{
	public void code(Computer lap){
		System.out.println("coding..");
		lap.compiler();
	}
}
class Demo {
public static void main(String argss[]) {    // laptop *   computer both
//	Laptop lap = new Laptop();
	Computer lap = new Laptop();     // you can create a refference of interface,but the objects should be of a class which implements it like inthis Laptop
	Computer desk1 = new Desktop();
	Dev dev1 = new Dev();
	dev1.code(lap);
	System.out.println(Computer.price);
	
//	Computer com = new Computer();     // Type Abstract
}
}

