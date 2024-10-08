package java_week_03;

public class bai13 {
	public static void main(String[] args) {	   
        int n = 10;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 10 - i * 2; j++) {
            	System.out.print("*");
            }
            System.out.println();
        }
        n = 6;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 2 - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < n + i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } 
}
