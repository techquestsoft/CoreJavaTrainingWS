
package com.techquestsoft.training.encapsulation.mypack;
//first example
//import com.training.encapsulation.pack.*;

//Second example
import com.techquestsoft.training.encapsulation.pack.A;
class B {
	public static void main(String args[]) {
		A obj = new A();
		
		// third example
		com.techquestsoft.training.encapsulation.pack.A obj1 = new com.techquestsoft.training.encapsulation.pack.A();//using fully qualified name
		
		obj.msg();
	}
}
