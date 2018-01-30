
// Inappropriate use of singleton - inflexible & untestable
public class SpellChecker {
	private final Lexicon dictionary = ...;

	private SpellChecker(...) { }
	public static INSTANCE = new SpellChecker(...);

	public boolean inValid(String word) { ... }
	public List<String> suggestions(String typo) { ... }
}