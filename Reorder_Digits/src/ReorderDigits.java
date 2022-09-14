import java.util.ArrayList;
import java.util.Collections;

public class ReorderDigits {

	public static void main(String[] args) {
		
		if (args.length >= 2) {
			int numArr[] = new int[args.length-1];
			for (int i = 0; i < args.length - 1; i++) {
				numArr[i] = Integer.parseInt(args[i]);
			}
			numArr = reorderDigits(numArr, args[args.length - 1]);
			for (int i = 0; i < numArr.length; i++) {
				System.out.println(numArr[i]);
			}
		} else {
			System.out.println("You didn't enter anything.");
		}
	}
	
	public static int[] reorderDigits(int[] numArr, String order) {
		if (order.equals("asc")) {
			for (int i = 0; i < numArr.length; i++) {
				int temp = numArr[i];
				ArrayList<Integer> tempArr = new ArrayList<>();
				while (temp > 0) {
					//System.out.println(temp/10);
					tempArr.add(temp%10);
					temp /= 10;
				}
				Collections.sort(tempArr);
				for (int j = tempArr.size()-1; j >= 0; j--) {
					temp += tempArr.get(j) * Math.pow(10, tempArr.size()-j-1);
				}
				numArr[i] = temp;
			}
		} else if (order.equals("dsc")) {
			for (int i = 0; i < numArr.length; i++) {
				int temp = numArr[i];
				ArrayList<Integer> tempArr = new ArrayList<>();
				while (temp > 0) {
					//System.out.println(temp/10);
					tempArr.add(temp%10);
					temp /= 10;
				}
				Collections.sort(tempArr);
				for (int j = 0; j < tempArr.size(); j++) {
					temp += tempArr.get(j) * Math.pow(10, j);
				}
				numArr[i] = temp;
			}
		} else {
			System.out.println("Order not specified");
		}
		
		return numArr;
	}

}
