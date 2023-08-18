package com.binarySearchTree;

public class Tester {
	public static void main(String[] args) {
		BinarySearchTree btree= new BinarySearchTree();
		btree.insertData(30);
		btree.insertData(130);
		btree.insertData(100);
		btree.insertData(60);
		btree.insertData(20);
		btree.insertData(10);
		btree.insertData(12);
		btree.insertData(40);
		btree.inOrder();
		System.out.println();
		btree.postOrder();
		btree.preOrder();
		System.out.println("\n\n");
		btree.levelOrder();
		System.out.println();
		System.out.println(btree.search(150));
		System.out.println("Height is " + btree.max());
	}
}
