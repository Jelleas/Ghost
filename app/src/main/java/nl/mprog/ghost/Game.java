package nl.mprog.ghost;

import nl.mprog.ghost.datastructure.Dictionary;

/**
 * Created by Joop Pascha on 19-4-2015.
 */
public class Game {
    Dictionary dictionary;
    Player[] players;

    boolean computers;
    String stringOfLetters;
    Difficulty difficulty;

    int minimalWordLength;
    Mode mode;

    public Game(Dictionary dictionary, int players, int computers) {
        this.dictionary = dictionary;

    }

    public void guess() {

    }

    public void turn() {

    }

    public void ended() {

    }

    public void winner() {

    }


}
