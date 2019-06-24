package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        Integer numLetters = countLetters(str);
        String[] answer = new String[numLetters];
        for(int i = 0;i<numLetters;i++){
            StringBuilder builder = new StringBuilder();
            Integer counter=0;
            for(int j = 0;j<str.length();j++){
                if(!Character.isAlphabetic(str.charAt(j)))builder.append(str.charAt(j));
                else if(i==counter++)builder.append(Character.toUpperCase(str.charAt(j)));
                else builder.append(Character.toLowerCase(str.charAt(j)));
            }
            answer[i]=builder.toString();
        }
        return answer;
    }

    private static Integer countLetters(String str){
        Integer counter=0;
        char[] chars = str.toCharArray();
        for(char c:chars)if(Character.isAlphabetic(c)) counter++;
        return counter;
    }
}
