package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return str.substring(0,indexToCapitalize)+Character.toUpperCase(str.charAt(indexToCapitalize))+str.substring(indexToCapitalize+1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return characterToCheckFor.equals(baseString.charAt(indexOfString));
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> set = buildSubstringSet(string);
        return set.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){
        Set<String> set = buildSubstringSet(input);
        return set.size();
    }

    private static Set<String> buildSubstringSet(String input) {
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 1; j < input.length() - i+1; j++)
                set.add(input.substring(i, i + j));
        }
        return set;
    }

}
