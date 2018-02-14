
// try-finally - No longer the best way to close resources!
static String firstLineOfFile(Stringn path) throws IOException {
	BufferedReader br = new BufferedReader(new FileReader(path));
	try {
		return br.readLine();
	} finally {
		br.close();
	}
}