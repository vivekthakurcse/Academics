//Word Counter Using Java
//Programmed by Vivek Thakur
import  java.util.Scanner;

public class WordsCounter {

	public static void main(String[] args) {
		String sentence;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\n\t\t --------- Words Counter ----------\n\n");
		System.out.print("     Enter your sentence here : ");
		sentence = sc.nextLine();
		String words = sentence ;
		int countWords = words.split("\\s").length;
	    System.out.print("\n\n\t\t ------------  Output -------------\n\n");
		System.out.println("     Number of total words = " + countWords);
	}
}