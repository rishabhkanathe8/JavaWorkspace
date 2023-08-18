package com.binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {
		this.root = null;

	}

	public void insertData(Integer data) {
		Node newNode = new Node(data);
		Node current = root;
		Node parent = null;
		if (root == null) {
			root = newNode;
		} else {
			while (current != null) {
				parent = current;
				if (newNode.data >= current.data) {
					current = current.rightChild;
				} else if (newNode.data < current.data) {
					current = current.leftChilld;
				}
			}
			if (parent.data > data) {
				parent.leftChilld = newNode;
			} else {
				parent.rightChild = newNode;
			}
		}
	}
	public void inOrder() {
		InOrder(root);
	}

	private void InOrder(Node root) {
		if (root == null) {
			return;
		}
		if (root.leftChilld != null) {
			InOrder(root.leftChilld);
		}
		System.out.print(root.data + ", ");
		if (root.rightChild != null) {
			InOrder(root.rightChild);
		}

	}

	public void preOrder() {
		PreOrder(root);
	}

	private void PreOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		if (root.leftChilld != null) {
			PreOrder(root.leftChilld);
		}

		if (root.rightChild != null) {
			PreOrder(root.rightChild);
		}
	}

	public void postOrder() {
		PostOrder(root);
	}

	private void PostOrder(Node root) {

		if (root == null) {
			return;
		}
		if (root.leftChilld != null) {
			PostOrder(root.leftChilld);
		}
		if (root.rightChild != null) {
			PostOrder(root.rightChild);
		}
		System.out.println(root.data);
	}

	public boolean search(Integer search) {
		Node current = root;
		if (root == null) {
			return false;
		} else {

			while (current != null) {
				if (current.data == search) {
					return true;
				}
				if (current.data > search) {
					current = current.leftChilld;
				} else {
					current = current.rightChild;
				}
			}
		}
		return false;
	}

	public void isSearch(Integer number) {

		Node current = root;

		if (root == null) {
			return;
		}
		while (current != null) {
			if (current.data == number) {
				System.out.println("The Number is Present in Tree");
			}
			if (current.leftChilld != null) {
				current = current.leftChilld;
			}

			current = current.rightChild;

		}

	}

	public void levelOrder() {
		levelOrderTraversal(root);
	}

	private void levelOrderTraversal(Node root) {

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
	//	queue.add(null);
		while (!queue.isEmpty()) {

			Node current = queue.poll();
//			if(current == null) {
//				if(queue.isEmpty()) {
//					return;
//				}
//				queue.add(null);
//				System.out.println();
//				continue;
//			}
			System.out.print(current.data + ", ");
			if (current.leftChilld != null) {
				queue.add(current.leftChilld);
			}
			if (current.rightChild != null) {
				queue.add(current.rightChild);
			}
		}

		
	}

	public int max() {
		return maxHeight(root);
	}

	private int maxHeight(Node root) {

		if (root == null) {
			return 0;
		}

		return Math.max(maxHeight(root.leftChilld), maxHeight(root.rightChild)) + 1;
	}

}
