package TestNG.Cal;

public class Methods {
	public double add(double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public double mul(double[] arr) {
		double mul = 1;
		for (int i = 0; i < arr.length; i++) {
			mul *= arr[i];
		}
		return mul;
	}

	public double div(double[] arr) {
		double div = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				div = arr[i];
				System.out.println(div);
			} else {
				div /= arr[i];
				System.out.println("*" + arr[i] + "=" + div);
			}
		}

		return div;
	}

	public double sub(double[] arr) {
		double sub = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				sub = arr[i];
			} else {
				sub -= arr[i];
			}
		}
		return sub;
	}
}