package TestNG.Cal;

import java.util.Scanner;

public class Calculator {
	/**
	 * @param args
	 */
	void Menu() {
		double a, b;
		Methods method = new Methods();
		Scanner sc = new Scanner(System.in);
		int s, d;
		double c;
		String y = "";
		do {
			System.out.println("Choose the operation\n 1)ADD\n 2)SUB \n 3)DIV \n 4)MUL ");
			System.out.println("=======================");
			s = sc.nextInt();
			System.out.println("Enter  no of  Elements");
			d = sc.nextInt();
			System.out.println("Enter the " + d + " Elements");
			double arr[] = new double[d];
			for (int i = 0; i < d; i++) {
				arr[i] = sc.nextDouble();
			}
			switch (s) {
			case 1:
				c = method.add(arr);
				System.out.println(c);
				break;
			case 2:
				c = method.sub(arr);
				System.out.println(c);
				break;
			case 3:
				c = method.div(arr);
				System.out.println(c);
				break;
			case 4:
				c = method.mul(arr);
				System.out.println(c);
				break;

			}
			System.out.println("you want continue? ( Y|N)");
			y = sc.next();
		} while (y.equals("y"));
	}
}
