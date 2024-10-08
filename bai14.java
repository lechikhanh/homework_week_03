package java_week_03;

public class bai14 {
	public static void main(String[] args) {
		int n = 1;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j <3 - i; j++) {
            	System.out.print(" ");
            	System.out.print(" ");	
            }
            for(int j = 0; j < n + i * 2; j++) {
            	System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        } 
	}
}
