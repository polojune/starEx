
public class StarEx03 {
    public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i; j++) {
				
				System.out.print(" ");
			}
	     for (int k = 7; k >= i*2+1; k--) {
		     System.out.print("*");	
		 }	
	     System.out.println();
		}
	}
}
