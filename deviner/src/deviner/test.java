package deviner;
import java.util.Random;

public class test {

	public static void main(String[] args) {
		int min = 1;
		int max = 100;
		int d = new Random().nextInt(max - min) + min;
		System.out.println(d);
	}

}
