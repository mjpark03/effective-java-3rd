
// Dependency injection provides flexibility and testability
public class SpellChecker {
	private final Lexicon dictionary;

	public SpellChecker(Lexicon dictionary) {
		this.dictionary = Objects.requireNonNull(dictionary);
	}

	public boolean isValid(String word) { ... }
	public List<String> suggestions(String typo) { ... }
}