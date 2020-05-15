package app;

public class ArrayUtil {

	public static void reverse(Object[] array) {

		Object[] temp = new Object[array.length];
		
		int i, j;
		
		for(i = array.length - 1 , j = 0; i>= 0 ; i--, i++) {
			temp[j] = array[i];
		}
		
		for(i = 0; i < array.length; i++) {
			array[i] = temp;
		}
	}

}
