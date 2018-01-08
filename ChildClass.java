package trainingsession;

public class ChildClass extends BaseClass {
	public void disp(){
	      System.out.println("Child class method");
	   }
	   public static void main( String args[]) {
	      ChildClass obj = new ChildClass();
	      obj.disp();
	   }

}
