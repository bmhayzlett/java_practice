/**
 * Created by brianhayzlett on 10/26/16.
 */
public class Main {
	int switchValue = 1;

	switch(switchValue) {
		case 1:
			System.out.println("value was 1");
			break;

		case 2:
			System.out.println("value was 2");
			break;

		case 3:case 4:case 5:
			System.out.println("value was a" + switchValue);
			break;

		default:
			System.out.println("Neither 1 nor 2");
	}
}
