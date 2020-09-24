package cn.xie.homework2;

/**
 * @author: xie
 * @create: 2020-09-23 21:27
 **/
public class Gaotu02 {
    public static class Node {

        private int data;
        private Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    static Node getCommon(Node headA, Node headB) {
        Node h1 = headA, h2 = headB;
        while (h1 != h2) {
            h1 = h1 == null ? headB : h1.next;
            h2 = h2 == null ? headA : h2.next;
        }

        return h1;
    }
}
