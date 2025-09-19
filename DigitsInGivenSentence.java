package Logic_Problems_Solutions;
/*
 * Accept a sentence from user and print the digits in the sentence.
 */
import java.util.Scanner;

public class DigitsInGivenSentence {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String sentence = sc.nextLine();
		sc.close();
		for(int i=0;i<sentence.length();) {
			char ch=sentence.charAt(i);
			if(Character.isDigit(ch)) {
				StringBuilder sb= new StringBuilder();
				for(int j=i;j<sentence.length();j++) {
					char nch=sentence.charAt(j);
					if(Character.isDigit(nch)) {
						sb.append(nch);
						i=j;
					}
					else {
						i=j-1;
						break;
					}
				}
				System.out.println(sb);
			}
				i++;
		}
	}
}
