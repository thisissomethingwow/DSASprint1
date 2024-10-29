import java.util.Objects;

public class TaskList {
    private Node head;
    private Node tail;
    private int size;

    public Node makeTaskList(String nodeData){
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

    public void addToTaskList(String description, int location){
        Node node = new Node(description);
        node.data = description;
        if (head == null){
            makeTaskList(description);
            return;
        } else if (location == 0) {
            node.next = head;
            head.prev = node;
            head = node;
        }else if (location >=size){
            tail.next = node;
            tail.prev = tail;
            node.next = null;
            tail=node;
        }else {
            Node tempNode = head;
            int index = 0;
            while (index <location-1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            node.next = nextNode;
            node.prev = tempNode;
            tempNode.next = node;
            if (nextNode!=null){
                nextNode.prev = node;
            }
        }
        size++;
    }

    public void printTaskList(){
        if (head ==null){
            System.out.println("No task list to print");
        }else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.println(tempNode.data);
                tempNode=tempNode.next;
            }
        }
    }

    public void markCompleted(String description){
        if (head!=null){
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (Objects.equals(tempNode.data, description)){
                    tempNode.task.setCompleted(true);
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("task not found");
//        Node tempNode = head;
//        while (tempNode!=null){
//            if (tempNode.task.getDescription().equals(description)){
//                tempNode.task.setCompleted(true);
//                return;
//            }
//            tempNode = tempNode.next;
//        }
    }


}
