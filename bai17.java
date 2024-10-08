package java_week_03;

public class bai17 {
	public static void main(String[] args) {
		int n;
		n = 0;
		for (int i = 0; i < 6; i++) {
			n = n * 2 + 1;
			System.out.print(n);
			if (i < 5) {
				System.out.print(", ");
			} else { 
				System.out.print(",...");
			}
		}
	}
}



