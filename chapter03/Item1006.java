
public class Point {
	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Broken - violates Liskov substitution principle
	@Override public boolean equals(Object o) {
		if (o == null || o.getClass() != getClass())
			return false;
		Point p = (Point) o;
		return p.x == x && p.y == y;
	}
}