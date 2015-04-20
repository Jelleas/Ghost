package nl.mprog.ghost.datastructure;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Joop Pascha on 20-4-2015.
 */
public class RadixTree implements Serializable {
    private static final long serialVersionUID = 2982342354611812945L;
    RadixTreeNode root;

    //store the last visited nodes of each game
    ArrayList<RadixTreeNode> activeNode;

    //for each lastVisited node preloaded possible children for quick lookup.
    ArrayList<RadixTreeNode[]> children;

    public RadixTree() {

    }

    public void getCompleteableWords(int gameIndex) {
        //pre-order traversal gives all the words in alphabetical order;
    }

    public void writeObject() {

    }

    public void readObject() {

    }
}
