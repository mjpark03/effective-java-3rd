
// readResolve method to preserve singleton property
private Object readResolve() {
	return INSTANCE;
}