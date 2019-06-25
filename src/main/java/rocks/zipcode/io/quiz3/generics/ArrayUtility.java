package rocks.zipcode.io.quiz3.generics;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {

    private Map<SomeType,Integer> map = new HashMap<>();

    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
        for(SomeType s:this.array){
            Integer qty = map.get(s);
            if(qty==null)map.put(s,1);
            else map.replace(s,qty+1);
        }
    }

    public SomeType findOddOccurringValue() {
        for(Map.Entry<SomeType,Integer> entry:this.map.entrySet()){
            if(entry.getValue()%2==1)return entry.getKey();
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for(Map.Entry<SomeType,Integer> entry:this.map.entrySet()){
            if(entry.getValue()%2==0)return entry.getKey();
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return map.get(valueToEvaluate);
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        SomeType[] working = array.clone();
   //     List<SomeType> list = new ArrayList<>();//Arrays.asList(array);
   //     for(int i = 0;i<array.length;i++) if(predicate.apply(array[i])) list.add(array[i]);
        // return list.toArray(array);
        Integer counter = 0;
        for(int i = 0;i<array.length;i++) if(predicate.apply(array[i])) working[counter++]=array[i];
        SomeType[] answer = Arrays.copyOf(working,counter);
        return answer;
    }
}
