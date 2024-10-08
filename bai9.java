package java_week_03;

public class bai9 {

	public static void main(String[] args) {
		int i, max;
		max = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				max = i;
			}
		}
		System.out.println(max);
	}
}


