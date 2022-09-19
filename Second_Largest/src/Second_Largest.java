import java.util.ArrayList;
import java.util.Collections;

public class Second_Largest {

	public static void main(String[] args) {
		
		if (args.length > 1) {
			int n = Integer.parseInt(args[0]);
			if (n*3 == args.length -1) {
				ArrayList<Integer>[] numArr = new ArrayList[n];
			
				for (int i = 0; i < n; i++) {
					numArr[i] = new ArrayList<Integer>();
				}
			
				for (int i = 1; i < args.length; i++) {
					numArr[(i-1)/3].add(Integer.parseInt(args[i]));
				}
				
				displayAnswers(numArr);
			} else {
				System.out.println("The number of args is wrong");
			}
		} else {
			System.out.println("You didn't enter anything.");
		}

	}
	
	public static void displayAnswers(ArrayList<Integer>[] numArr) {
		for (int i = 0; i < numArr.length; i++) {
			Collections.sort(numArr[i]);
			System.out.println(numArr[i].get(numArr[i].size()-2));
		}
	}

}
