public class ArrayProductCalculator {
	public static int calculateProduct(int[] arr) {
		return calculateProduct(arr, 0);
	}
	
	public static int calculateProduct(int[] arr, int index) {
		if (index == arr.length - 1) {
	        return arr[index];
		}
		int product = calculateProduct(arr, index+1);
		
		product *= arr[index];
		return product;
	}
	
	  public static void main(String[] args) {
		    int[] array = {
		      1,
		      3,
		      5,
		      7
		    };
		    int product = calculateProduct(array);
		    System.out.println("The product of all numbers in the array is: " + product);
		  }
}
