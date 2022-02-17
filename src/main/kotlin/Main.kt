import java.util.*

private val input = Scanner(System.`in`);
private val scrabbleScore = ScrabbleScore();

fun main(args: Array<String>) {
    var word: String =""
    while (true) {
        println(scrabbleScore.letterValues())
        println("")
        println("type in -1 to exit the app")
        print("Enter a word and compute the Scrabble Score: ")
        word = input.nextLine()
        // I have made many attempts at this section before looking it up on the internet
        // trying various if statements but I completely forgot that you can
        // break a loop to stop any process
        // this link https://stackoverflow.com/questions/6850380/are-whiletrue-loops-so-bad
        // made me remember about break
        if(word == "-1"){
            println("Exiting App")
            break
        }
        println("$word has the value of ${scrabbleScore.scoreWord(word)}")
        println("")

    }
}


