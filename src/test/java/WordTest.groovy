import org.junit.jupiter.api.Test

class WordTest extends GroovyTestCase {
    @Test
    void testNormalWord(){
        Word word = new Word("School");
        assertEquals(11,word.calculateTotal());
    }
    @Test
    void testExtremelyLongWord() {
        Word word = new Word("Impedimenta");
        assertEquals(18,word.calculateTotal());

    }
    @Test
    void testVeryShortWord(){
        Word word = new Word("The");
        assertEquals(6,word.calculateTotal());
    }
    @Test
    void testOneLetterWord(){
        Word word = new Word("A");
        assertEquals(1,word.calculateTotal());
    }
    @Test
    void testForSymbols(){
        Word word = new Word("Money#");
        assertEquals(10,word.calculateTotal());
    }
    @Test
    void testUpperAndLowercase(){
        Word word = new Word("Money");
        assertEquals(10,word.calculateTotal());
    }
}
