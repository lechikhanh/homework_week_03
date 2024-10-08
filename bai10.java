package java_week_03;

public class bai10 {

	public static void main(String[] args) {
			int i, tong;
			tong = 0;
			for (i = 1; i <= 100; i++) {
				if (i % 7 == 0) {
				tong += i;
			}
		}
			System.out.println(tong);
	}
}
