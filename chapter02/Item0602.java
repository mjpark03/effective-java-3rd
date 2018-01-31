
// Performance can be greatly improved
static boolean isRomanNumeral(String s) {
	return s.matches("^(? =.) M*( C[ MD] | D? C{ 0,3})" + "( X[ CL] | L? X{ 0,3})( I[ XV] | V? I{ 0,3}) $");
}

// Reusing expensive object for improved performance
public class RomanNumerals {
	private static final Pattern ROMAN = Pattern.compile( "^(? =.) M*( C[ MD] | D? C{ 0,3})" + "( X[ CL] | L? X{ 0,3})( I[ XV] | V? I{ 0,3}) $");

	static boolean isRomanNumeral(String s) {
		return ROMAN.matchers(s).matches();
	}
}