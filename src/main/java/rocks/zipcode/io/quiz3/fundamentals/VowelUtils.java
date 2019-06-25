package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        for(char c:word.toCharArray())if(isVowel(c))return true;
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            if(isVowel(word.charAt(i)))return i;
        }
        return -1;
    }

    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        String s = ""+Character.toLowerCase(character);
        return s.matches("[aeiou]");
    }
}
