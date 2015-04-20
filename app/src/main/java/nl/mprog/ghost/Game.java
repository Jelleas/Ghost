package nl.mprog.ghost;

import nl.mprog.ghost.datastructure.Dictionary;
import nl.mprog.ghost.enumeration.Language;
import nl.mprog.ghost.enumeration.Mode;

/**
 * Created by Joop Pascha on 19-4-2015.
 */
public class Game {
    Dictionary dictionary;
    int minimalWordLength = 3;
    String string;

    Player[] players;
    int indexActivePlayer;
    int numberOfActivePlayers;

    Mode mode;

    /**
    boolean computers;
    String stringOfLetters;
    Difficulty difficulty;
     */
    public Game(Language language, int numberOfPlayers, int minimalWordLength) {
        this.dictionary = new Dictionary(language);
        this.minimalWordLength = minimalWordLength;

        numberOfActivePlayers = numberOfPlayers;
        createRandomPlayers(numberOfPlayers);
    }

    private void createRandomPlayers(int numberOfPlayers) {
        players = new Player[2];

        while (numberOfPlayers-- > 0) {
            players[numberOfPlayers] = new Player();
        }
    }

    public void itsAWord() {

    }

    public void proveIt() {

    }

    public void guess(String string) {
        dictionary.guess(string);
//        updateWord();

//        updateActivePlayer();
    }

    public boolean hasGameEnded() {
        return numberOfActivePlayers == 1;
    }

    public void showWinner() {
//        updateScreenForWinner();
    }

}
