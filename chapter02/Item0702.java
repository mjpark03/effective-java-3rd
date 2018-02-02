
public Object pop() {
	if (size == 0)
		throw new EmptyStackException();

	Object result = elements[--size];
	elements[size] = null; // Eliminate obsolete reference

	return result;
}