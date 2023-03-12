package p_003_;

public class SinglyLinkedList {
    Node head;

    public class Node{
        int value;
        Node next;
    }
    public void reverse(){
        if (head != null && head.next != null) {
            Node temp =head;
            reverse(head.next,head);
            temp.next = null;
        }

    }
    public void reverse(Node currentNode, Node previousNode) {
        if (currentNode.next == null){
            head = currentNode;
        }else{
            reverse(currentNode.next, previousNode);

        }
        currentNode.next = previousNode;
        previousNode.next = null;
    }
    public void push(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }
    public Integer pop (){
        Integer result = null;
        if(head != null){
            result = head.value;
            head = head.next;
        }
        return result;

    }

}