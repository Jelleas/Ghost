package nl.mprog.ghost;

import nl.mprog.ghost.datastructure.Vocabulary;
import nl.mprog.ghost.enumeration.Mode;

/**
 * Created by Joop Pascha on 19-4-2015.
 */
public class Game {
    Mode mode;
    Vocabulary mVocabulary;
    Player[] mPlayers;
    String mCurrentString;
    int mMinimalWordLength = 3;
    int indexActivePlayer;
    int numberOfActivePlayers;

    public Game(Vocabulary vocabulary, int numberOfPlayers, int minimalWordLength, Player[] players) {
        this.mVocabulary = vocabulary;
        this.mMinimalWordLength = minimalWordLength;
        this.numberOfActivePlayers = numberOfPlayers;
        this.mPlayers = players;
        createRandomPlayers(numberOfPlayers);
    }

    private void createRandomPlayers(int numberOfPlayers) {
        mPlayers = new Player[2];

        while (numberOfPlayers-- > 0) {
            mPlayers[numberOfPlayers] = new Player();
        }
    }
}
