
public class CanPartition {

	public static void main(String[] args) {
		
		if (args.length >= 1) {
			int numArr[] = new int[args.length];
			for (int i = 0; i < args.length; i++) {
				numArr[i] = Integer.parseInt(args[i]);
			}
			if (canPartition(numArr)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		} else {
			System.out.println("You didn't enter anything.");
		}
		
	}
	
	public static boolean canPartition(int[] numArr) {
		
		for (int i = 0; i < numArr.length; i++) {
			int temp = 1;
			for (int j = 0; j < numArr.length; j++) {
				if (j == i) {
					continue;
				} else {
					temp *= numArr[j];
				}
			}
			if (temp == numArr[i]) {
				return true;
			}
		}
		
		return false;
	}

}
