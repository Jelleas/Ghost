package nl.mprog.ghost;

import java.io.Serializable;

/**
 * Created by Joop Pascha on 20-4-2015.
 */
public class RadixTree implements Serializable{
    private static final long serialVersionUID = 2982342354611812945L;
    RadixTreeNode root;

    //one node for each active game
    RadixTreeNode[] lastVisited;

    //for each lastVisited node preloaded possible children for quick lookup.
    RadixTreeNode[][] children;

    public RadixTree() {

    }

    public void getCompleteableWords(int gameIndex) {
        //pre-order traversal gives all the words in alphabetical order;
    }

    public void writeObject() {

    }



}
