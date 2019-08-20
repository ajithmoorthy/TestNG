package TestNG.Cal;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

/**
 * The Class NewTest.
 */

public class NewTest {

	/**
	 * Adds the.
	 *
	 * @param arr the arr
	 * @return the double
	 */

	@Test
	public double add(double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	/**
	 * Mul.
	 *
	 * @param arr the arr
	 * @return the double
	 */
	@Test
	public double mul(double[] arr) {
		double mul = 1;
		for (int i = 0; i < arr.length; i++) {
			mul *= arr[i];
		}
		return mul;
	}

	/**
	 * Div.
	 *
	 * @param arr the arr
	 * @return the double
	 */
	@Test
	public double div(double[] arr) {
		double div = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				div = arr[i];
			} else {
				div /= arr[i];
			}
		}
		return div;

	}

	/**
	 * Sub.
	 *
	 * @param arr the arr
	 * @return the double
	 */
	@Test
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
