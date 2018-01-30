
// Inappropriate use of static utility - inflexible & untestable
public class SpellChecker {
	private static final Lexicon dictionary = ...;

	private SpellChecker() {}

	public static boolean isValid(String word) { ... }
	public static List<String> suggestions(String typo) { ... }
}