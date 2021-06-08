package useful_funcs;

public class Arrays_f {
	/**
	 * this function returns an array with given length. each argument will be a
	 * random number from (0-max)
	 */
	public static int[] random_arry(int length, int max) {
		int[] arry = new int[length];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = (int) (Math.random() * (max + 1));
		}
		return arry;
	}

	public static boolean is_int(Object value) {
//		Object ff = 5;
		try {
			Object fluck = Integer.valueOf((String) value);
//			return ff.getClass().getSimpleName() == fluck.getClass().getSimpleName();
			return true;
		} catch (Exception e) {
			return false;
		}

	}
}
