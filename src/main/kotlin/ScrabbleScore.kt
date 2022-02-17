import java.util.*

class ScrabbleScore {

    fun scoreWord(word: String): Int{
        var value: Int = 0
        var char: Char
        for(i in word.indices){
            char = word[i].uppercaseChar()
            value += scoreLetter(char)
        }
        //println(value)
        return value
    }

    //Reference: https://exercism.org/tracks/kotlin/exercises/scrabble-score/solutions?page=1
    private fun scoreLetter(char: Char): Int {
        return when (char) {
            in "AEIOULNRST" -> 1
            in "DG" -> 2
            in "BCMP" -> 3
            in "FHVWY" -> 4
            in "K" -> 5
            in "JX" -> 8
            in "QZ" -> 10
            else -> error("Unknown character")
        }
    }

    fun letterValues() =
        """Letter                           Value
A, E, I, O, U, L, N, R, S, T       1
D, G                               2
B, C, M, P                         3
F, H, V, W, Y                      4
K                                  5
J, X                               8
Q, Z                               10"""
}