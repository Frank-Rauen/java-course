package com.company;

public class Main {

    public static void main(String[] args) {

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

	    String stringData = "1 2 3 4 5 6 7 8 9 10 ";

	    String[] data = stringData.split(" ");
	    for (String s : data) {
            tree.addItem(new Node(s));
        }

//	    tree.traverse(tree.getRoot());
    }
}
