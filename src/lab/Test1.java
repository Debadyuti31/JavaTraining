package lab;

public class Test1 {

	public static void main(String[] args) {
	
		
		/* Infinite Loop
		 * do { System.out.println("LOOP"); } while (1 != 0);
		 */
		
		for (int i=1;i<5;i++) {
			System.out.print(i);
		}
		
		System.out.println("\n");
		
		boolean condition=true;
		while(condition) {
			System.out.println("loop");
			if (condition) {
				condition=false;
			}
		}
	}
}