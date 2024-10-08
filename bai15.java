package java_week_03;

public class bai15 {
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
        n = 5;
        for (int i = 0; i < 3; i++) {
        	System.out.print(" ");
        	System.out.print(" ");
        	for(int j = 0; j < i; j++) {
        		System.out.print(" ");
        		System.out.print(" ");
        	}
        	for (int j = 0; j < n - i * 2; j++) {
        		System.out.print(" ");
        		System.out.print("*");
        	}
        	System.out.println();
        } 
	}
}

