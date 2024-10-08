package java_week_03;

public class bai16 {
	public static void main(String[] args) {
		int a;
		for (int i = 0; i < 7; i++) {
			a = i * i + 2 * i;
			System.out.print(a);
			if (i < 6) { 
				System.out.print(", ");
			} else {
				System.out.print(",...");
			}
		}
	}
}
