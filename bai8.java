package java_week_03;

public class bai8 {
	public static void main(String[] args) {
		int i, tong_so, so_hang;
		tong_so = 0;
		so_hang = 0;
		for (i = 1; i <= 100; i++) {
			tong_so += i;
			so_hang ++;
		}
		double trungbinh = (double) tong_so / so_hang;
		System.out.println(trungbinh);
	}
}
