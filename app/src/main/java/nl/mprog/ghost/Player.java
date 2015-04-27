package nl.mprog.ghost;

import java.util.Random;

/**
 * Created by Joop Pascha on 20-4-2015.
 */
public class Player {
    String name;
    String[] defaultGhostNames = {"Casper McFadden", "Slimer", "Boo Berry", "Beetlejuice", "Inky",
            "Blinky", "Clyde", "Pinky", "Funny Phantom", "King Hamlet", "Ghost Rider",
            "The Phantom", "The Flying Dutchman", "Bloody Mary", "Slimer", "Space Ghost"};
    boolean isActive;

    public Player() {
        name = defaultGhostNames[randInt(defaultGhostNames.length)];
        isActive = true;
    }

    public Player(String playerName) {
        this.name = playerName;
    }

    public static int randInt(int max) {
        Random random = new Random();
        return random.nextInt(max + 1);
    }
}
