
public class ArrayGreat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,5,8,3,9,1};
		int maxOne = 0;
        int maxTwo = 0;
        for(int num : arr){
            if(maxOne < num){
                maxTwo = maxOne;
                maxOne =num;
            } else if(maxTwo < num){
                maxTwo = num;
            }
        }
        System.out.println("First Max Number: " + maxOne);
        System.out.println("Second Max Number: " + maxTwo);
	}

}
