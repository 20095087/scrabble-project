import java.util.*

private val input = Scanner(System.`in`);
private val scrabbleScore = ScrabbleScore();

//    - the user should be continually asked to enter a word until they type a sentinel value (e.g. -1) to end the program

fun main(args: Array<String>) {
    while (true) {
        println(scrabbleScore.letterValues())
        print("")
        print("Enter a word and compute the Scrabble Score: ")
        val word = input.nextLine()
        println("$word has the value of ${scrabbleScore.scoreWord(word)}")
    }
}


