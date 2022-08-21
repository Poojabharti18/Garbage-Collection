package GarbageCollection;

public class Employee1Main {


		public static void main(String[] args) {
	        Employee1 E = new Employee1("GFG1", 56);
	        Employee1 F = new Employee1("GFG2", 45);
	        Employee1 G = new Employee1("GFG3", 25);
	        E.show();
	        F.show();
	        G.show();
	        E.showNextId();//1
	        F.showNextId();//2
	        G.showNextId();//3
	 
	        { // It is sub block to keep
	            // all those interns.
	            Employee1 X = new Employee1("GFG4", 23);
	            Employee1 Y = new Employee1("GFG5", 21);
	            X.show();//
	            Y.show();//
	            X.showNextId();//4
	            Y.showNextId();//5
	        }
	        // After countering this brace, X and Y
	        // will be removed.Therefore,
	        // now it should show nextId as 4.
	           
	          // Output of this line
	        E.showNextId();
	        // should be 4 but it will give 6 as output.
	    }
	}