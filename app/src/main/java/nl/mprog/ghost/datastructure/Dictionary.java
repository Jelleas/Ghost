package nl.mprog.ghost.datastructure;

import nl.mprog.ghost.enumeration.Language;

/**
 * Created by Joop Pascha on 19-4-2015.
 */
public class Dictionary {
    RadixTree radixTree;
    Language language;

    public Dictionary(Language language) {
        this.language = language;
        radixTree = new RadixTree(language);
    }

    public boolean isWord(String string) {
        return false;
    }

    public void guess(String string) {
        radixTree.updateNode(string);
    }

    public void count() {

    }

    public void result() {

    }

}
