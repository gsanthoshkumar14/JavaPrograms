import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		int randomNum = random.nextInt(1000);
		long randomLong = random.nextLong();
		System.out.println(randomLong);
		System.out.println(randomNum);
	}

}
