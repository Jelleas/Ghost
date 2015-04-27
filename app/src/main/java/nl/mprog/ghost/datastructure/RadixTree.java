package nl.mprog.ghost.datastructure;

import android.content.Context;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import nl.mprog.ghost.R;
import nl.mprog.ghost.enumeration.Language;

/**
 * Created by Joop Pascha on 20-4-2015.
 */
public class RadixTree implements Serializable {
    private RadixTreeNode mRoot = new RadixTreeNode();
    private ArrayList<RadixTreeNode> mActiveNodes;

    public RadixTree(Context context, Language language) {
        readInWords(getFileScanner(context, language));
    }

    public void readInWords(Scanner scanner) {
        String word;

        while (scanner.hasNextLine()) {
            word = scanner.nextLine();
            mRoot.insertWord(word, mRoot);
        }

        scanner.close();
    }

    public Scanner getFileScanner(Context context, Language language) {
        Scanner scanner;

        switch (language) {
            case DUTCH:
                scanner = new Scanner(context.getResources().openRawResource(R.raw.dutch));
                break;
            case ENGLISH:
                scanner = new Scanner(context.getResources().openRawResource(R.raw.english));
                break;
            default:
                scanner = new Scanner(context.getResources().openRawResource(R.raw.english));
                break;
        }

        return scanner;
    }

    public boolean isWord(String word) {
        RadixTreeNode activeNode = mRoot;
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            activeNode = activeNode.findNode(activeNode, chars[i]);
            if (activeNode == null) return false;
        }

        if (activeNode.mIsWordEnd) {
            return true;
        } else {
            return false;
        }
    }
}
