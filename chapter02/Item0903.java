
// try-with-resources - the best way to close resources!
static String firstLineOfFile(String path) throws IOException {
	try (BufferedReader br = new BufferedReader(
			new FileReader(path))) {
		return br.readLine();
	}
}