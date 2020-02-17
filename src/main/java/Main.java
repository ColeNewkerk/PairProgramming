import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Scrabble Calculator. Type any word and type '!' to quit.");
        while (true){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try{
                String input = br.readLine();
                if (input == "!"){
                    br.close();
                    break;
                }
                Word word = new Word(input);
                System.out.println("The value for " + word.getWord() + " is: " + word.calculateTotal());
            }catch (IOException e){
                System.out.println("Error: IOException Occurred.");
            }
        }
    }
}