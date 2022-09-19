
public class SumDigits {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		
		if (n == args.length-1) {
			for (int i = 1; i < n+1; i++) {
				int sum = 0;
				for (int j = 0; j < args[i].length()-1; j++) {
					if (args[i].charAt(j) < 58 && args[i].charAt(0) > 47) {
						sum += args[i].charAt(j)-48;
					}
				}
				System.out.println(sum);
			}
		} else {
			System.out.println("The number of args is wrong");
		}

	}

}