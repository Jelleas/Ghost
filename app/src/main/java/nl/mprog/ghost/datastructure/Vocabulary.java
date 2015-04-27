package nl.mprog.ghost.datastructure;

import android.content.Context;

import java.io.Serializable;

import nl.mprog.ghost.enumeration.Language;

public class Vocabulary implements Serializable {
    RadixTree mRadixTree;
    Language mLanguage;

    public Vocabulary(Context context, Language language) {
        this.mLanguage = language;
        mRadixTree = new RadixTree(context, language);
    }

    public boolean isWord(String word) {
        return mRadixTree.isWord(word);
    }


}
