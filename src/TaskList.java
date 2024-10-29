public class TaskList {
    public Node head;
    public Node tail;
    public int size;

    public Node makeTaskList(int nodeData){
        head = new Node();
        Node node = new Node();
        node.prev = null;
        node.next = null;
        node.data = nodeData;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

}
