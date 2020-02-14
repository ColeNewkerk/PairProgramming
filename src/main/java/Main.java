import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){

        while (true){
            System.out.println("Welcome to Scrabble Calculator. Type any word and type '!' to quit.");
            try{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                String input = br.readLine();
                if (input == "!"){
                    break;
                }
                Word word = new Word(input);
                System.out.println("The value for " + word.getWord() + " is: " + word.calculateTotal());

                br.close();
            }catch (IOException e){
                System.out.println("Error: IOException Occurred.");
            }
        }

    }
}
