package algorithmicThinking;

//Binary trees and recursion
//https://dmoj.ca/problem/dwite12c1p4

import java.util.Arrays;

class trickOrTreeing {
    public static void main(String[] args) {
        Stack stack = newStack();
        Node n;
        Node n1 = newHouse(20);
        Node n2 = newHouse(30);
        Node n3 = newHouse(10);
        pushStack(stack, n1);
        pushStack(stack, n2);
        pushStack(stack, n3);
        while (!isEmptyStack(stack)) {
            n = popStack(stack);
            System.out.printf("highestUsed: %d\n", stack.highestUsed);
            System.out.printf("%d\n", n.candy);
        }
    }

    public static Stack newStack() {
        Stack stack = new Stack(-1);
        return stack;
    }

    public static Node newHouse(int candy) {
        return new Node(candy, null, null);
    }

    public static void pushStack(Stack stack, Node value) {
        stack.highestUsed++;
        stack.values[stack.highestUsed] = value;
    }

    public static boolean isEmptyStack(Stack stack) {
        return stack.highestUsed == -1;
    }

    public static Node popStack(Stack stack) {
        Node value = stack.values[stack.highestUsed];
        stack.highestUsed--;
        return value;
    }

    public static int treeCandyRecursive(Node tree){
        if (tree.left == null && tree.right == null){
            return tree.candy;
        }
        return treeCandyRecursive(tree.left) + treeCandyRecursive(tree.right);
    }

    public static int treeCandy(Node tree) {
        int total = 0;
        Stack stack = newStack();
        while (tree != null) {
            if (tree.left != null && tree.right != null) {
                pushStack(stack, tree.left);
                tree = tree.right;
            } else {
                total += tree.candy;
                if (isEmptyStack(stack)) {
                    tree = null;
                } else {
                    tree = popStack(stack);
                }
            }
        }
        return total;
    }

    public static Node newNonHouse(Node left, Node right) {
        return new Node(left, right);
    }

    private static class Stack {

        Node[] values = new Node[255];

        int highestUsed = 0;

        public Stack(final int highestUsed) {
            this.highestUsed = highestUsed;
        }

        @Override
        public String toString() {
            return "Stack{" +
                    "values=" + Arrays.toString(values) +
                    ", highestUsed=" + highestUsed +
                    '}';
        }
    }

    private static class Node {
        int candy;

        Node left;

        Node right;

        public Node(final int candy, final Node left, final Node right) {
            this.candy = candy;
            this.left = left;
            this.right = right;
        }

        public Node(final Node left, final Node right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "candy=" + candy +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

}

