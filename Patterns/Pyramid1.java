public class Pyramid1{
	public static void main(String[] args) {
		int i , j;
		for(i=0;i<=8;i++){
			for(j=1;j<=i;j++){
				System.out.print("  ∆\t");
			}
			System.out.println();
		}
	}
}