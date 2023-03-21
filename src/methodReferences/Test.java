package methodReferences;

import java.util.function.BiFunction;

public class Test {
	public static void main(String[] args) {
		Room room = Home::flower;
		Room room1 = Home::flower2;
		Room ro = Car::Ac;
		room.kitchen();
		room1.kitchen();
		ro.kitchen();

		// noon Static method calling
		Room r = new District()::solapur;
		r.kitchen();
		District dis = new District();
		Room r1 = dis::solapur;
		r1.kitchen();

	}
}
