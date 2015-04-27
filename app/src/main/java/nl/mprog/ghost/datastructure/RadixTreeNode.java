package nl.mprog.ghost.datastructure;

import java.io.Serializable;

/**
 * Created by Joop Pascha on 20-4-2015.
 */
public class RadixTreeNode implements Serializable {
    RadixTreeNode[] mChildren = new RadixTreeNode[0];
    char mCharacter = '0';
    boolean mIsWordEnd;

    public RadixTreeNode() {
    }

    public RadixTreeNode(char character) {
        this.mCharacter = character;
    }

    public RadixTreeNode(char character, boolean isWordEnd) {
        this.mCharacter = character;
        this.mIsWordEnd = isWordEnd;
    }

    public void insert(char character) {
        for (RadixTreeNode node : mChildren) {
            if (node.mCharacter == character) {
                return;
            }
        }

        addChild(new RadixTreeNode(character));
    }

    public void insert(char character, boolean isWordEnd) {
        for (RadixTreeNode node : mChildren) {
            if (node.mCharacter == character) {
                return;
            }
        }

        addChild(new RadixTreeNode(character, isWordEnd));
    }

    private void addChild(RadixTreeNode node) {
        if (mChildren.length == 0) {
            mChildren = new RadixTreeNode[1];
            mChildren[0] = node;
        } else {
            RadixTreeNode[] temp = new RadixTreeNode[mChildren.length + 1];
            System.arraycopy(mChildren, 0, temp, 0, mChildren.length);
            temp[mChildren.length] = node;
            mChildren = temp;
        }
    }

    public RadixTreeNode[] getChildren() {
        return mChildren;
    }

    public void insertWord(String word, RadixTreeNode root) {
        RadixTreeNode activeNode = root;
        char[] array = word.toCharArray();

        for (int i = 0; i < (array.length - 1); i++) {
            activeNode.insert(array[i]);
            activeNode = findNode(activeNode, array[i]);
        }

        activeNode.insert(array[array.length - 1], true);
    }

    public RadixTreeNode findNode(RadixTreeNode startPosition, char character) {
        RadixTreeNode[] children = startPosition.getChildren();
        if (children.length == 0) {
            return null;
        } else {
            for (RadixTreeNode rtn : children) {
                if (rtn.mCharacter == character) return rtn;
            }
        }

        return null;
    }
}
