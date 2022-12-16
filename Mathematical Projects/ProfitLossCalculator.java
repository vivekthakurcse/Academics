import java.util.Scanner;

class Data {
	float cp;
	float sp;
	float res;
	float percent;

	public void getInputs() {
		Scanner in = new Scanner(System.in);
		System.out.print("\n\n\t -------- Profit and Loss Calculator ------- \n");
		System.out.print("\n\t Cost Price : ");
		cp = in.nextInt();
		System.out.print("\t Selling Price : ");
		sp = in.nextInt();
	}

	public void calculateAndDisplay() {
		if (sp > cp) {
			System.out.print("\n\n\t Profit! ");
			res = sp - cp ;
			float temp = res * 100;
			percent = temp / cp;
			System.out.print("\n\t Profit = " + res);
			System.out.print("\n\t Profit in percentage : " + percent + "%");
			System.out.print("\n");

		} else if (cp > sp) {
			System.out.print("\n\n\t Loss! ");
			res = cp - sp ;
			float temp  = res * 100;
			percent = temp / cp;
			System.out.print("\n\t Loss = " + res);
			System.out.print("\n\t Loss in percentage : " + percent + "%");
			System.out.print("\n");
		} else {
			System.out.print(" No Profit No Loss happend here");
		}
	}
}


public class ProfitLossCalculator {
	public static void main(String[] args) {
		Data D = new Data();
		D.getInputs();
		System.out.print("\n\t ------------------ Output -----------------");
		D.calculateAndDisplay();
	}
}