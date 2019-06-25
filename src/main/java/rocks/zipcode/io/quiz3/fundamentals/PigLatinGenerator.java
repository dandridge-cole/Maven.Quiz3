package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        StringBuilder builder = new StringBuilder();
        String[] words = str.split(" ");
        for(int i=0;i<words.length-1;i++)builder.append(translateWord(words[i])).append(" ");
        builder.append(translateWord(words[words.length-1]));
        return builder.toString();
    }

    private String translateWord(String str){
        if(!VowelUtils.hasVowels(str))return str+"ay";
        if(VowelUtils.startsWithVowel(str))return str+"way";
        Integer firstVowel = VowelUtils.getIndexOfFirstVowel(str);
        return str.substring(firstVowel)+str.substring(0,firstVowel)+"ay";
    }
}
