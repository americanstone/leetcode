package array;
//Given an array and a value, remove all instances of that > value in place and return the new length.
//
//		The order of elements can be changed. It doesn't matter what you leave beyond the new length.
public class RemoveElement {

	static public int removeElementFromArray(int[] a, int target){
		int j = 0;
		for(int i = 0 ; i < a.length; i++){
			if(a[i] == target){
				continue;
			}
			a[j] = a[i];
			j++;
		}
		return j;
	}
    public static void main(String[] args) {
        int[] a = {1,2,2,3,4,5};
	    int result = removeElementFromArray(a, 2);

	    System.out.println("final length is: " + result);

	    for(int i = 0; i < result; i++){
		    System.out.println( a[i]);
	    }

	    int[] b = {2,2,2,3,4,5};
	    int result1 = removeElementFromArray(b, 2);

	    System.out.println("final length is: " + result1);

	    for(int i = 0; i < result1; i++){
		    System.out.println( b[i]);
	    }
    }
}
