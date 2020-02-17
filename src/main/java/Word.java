import java.util.HashMap;
import java.util.Map;
public class Word {

    Map<String, Integer> letterToValue;
    String word;

    public Word(String word){
        this.word = word.toUpperCase();
        letterToValue = new HashMap<String,Integer>();
        populate();
    }

    public void populate(){
        letterToValue.put("A",1);
        letterToValue.put("B",3);
        letterToValue.put("C",3);
        letterToValue.put("D",2);
        letterToValue.put("E",1);
        letterToValue.put("F",4);
        letterToValue.put("G",2);
        letterToValue.put("H",4);
        letterToValue.put("I",1);
        letterToValue.put("J",8);
        letterToValue.put("K",5);
        letterToValue.put("L",1);
        letterToValue.put("M",3);
        letterToValue.put("N",1);
        letterToValue.put("O",1);
        letterToValue.put("P",3);
        letterToValue.put("Q",10);
        letterToValue.put("R",1);
        letterToValue.put("S",1);
        letterToValue.put("T",1);
        letterToValue.put("U",1);
        letterToValue.put("V",4);
        letterToValue.put("W",4);
        letterToValue.put("X",8);
        letterToValue.put("Y",4);
        letterToValue.put("Z",10);
    }

    public String getWord() {
        return word;
    }

    public int calculateTotal(){
        int sum = 0;

        for (int i = 0; i<word.length();i++){
            String letter = word.substring(i,i+1);
            if (letterToValue.containsKey(letter)) {
                sum += letterToValue.get(letter);
            }
        }
        return sum;
    }
}