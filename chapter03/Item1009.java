
// we don't need it
@Override public boolean equals(Object o) {
	if (o == null)
		return false;
}

// we need it
@Override public boolean equals(Object o) {
	if (!(o instanceof MyType))
		return false;
	MyType mt = (MyType) o;
}