package nl.mprog.ghost.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import nl.mprog.ghost.enumeration.Language;

/**
 * Created by Joop Pascha on 20-4-2015.
 */
public class RadixTree implements Serializable {
    RadixTreeNode root;
    String wordFile;

    /**
     * store the last visited nodes of each game
     */
    ArrayList<RadixTreeNode> activeNodes;
    /**
     * for each lastVisited node preloaded possible children for quick lookup.
     */
    ArrayList<RadixTreeNode[]> childrenOfActiveNodes;
    String currentUnmatchedWord;

    public RadixTree(Language language) {
        setLanguage(language);
        readWordsFromFileIntoRadixTree();
    }


    public void readWordsFromFileIntoRadixTree() {
        String str;

        try {
            BufferedReader br = new BufferedReader(new FileReader(wordFile));

            while ((str = br.readLine()) != null) {
                insert(str);
            }

            br.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void stringParser() {

    }

    public void insert(String str) {

    }

    public void writeObject() {

    }

    public void readObject() {

    }

    public void updateNode(String string) {

    }

    public void setLanguage(Language language) {
        switch (language) {
            case ENGLISH:
                wordFile = "main/res/dictionary/dutch";
                break;
            case DUTCH:
                wordFile = "main/res/dictionary/dutch";
                break;
        }
    }
}
