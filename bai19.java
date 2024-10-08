package java_week_03;

public class bai19 {
	public static void main(String[] args) {
		int a;
		a = 1;
		for (int i = 0; i < 10; i++) {	
			System.out.print(a);
			a = a * 3;
			if (i < 9) {
				System.out.print(", ");
			} else { 
				System.out.print(",...");
			}
		}
	}
}