
// Hideously slow with autoboxing
private static long sum() {
	Long sum = 0L;

	for (long i = 0; i <= Integer.MAX_VALUE; i++)
		sum += i;

	return sum;
}