
// Room instantiations in try-with-resource blocks
// print "Goodbye" -> "Cleaning room" of Room class
public class Adult {
	public static void main(String[] args) {
		try (Room myRoom = new Room(7)) {
			System.out.println("Goodbye");
		}
	}
}

// Illbehaved program without try-with-resource blocks
// print "Peace out", but no guarantee "Cleaning room"
public class Teenager {
	public static void main(String[] args) {
		new Room(99);
		System.out.println("Peace out");
	}
}