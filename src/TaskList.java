import java.util.Objects;

public class TaskList {
    private Node head;
    private int size;

    public Node makeTaskList(String nodeData){
        Node node = new Node(nodeData);
        head = node;
        size = 1;
        return head;
    }

    public void addToTaskList(String description, int location){
        Node node = new Node(description);
        if (head == null){
            makeTaskList(description);
            return;
        }else {
            Node tempNode = head;
            int index = 0;
            while (index <location-1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            node.next = nextNode;
            tempNode.next = node;
        }
        size++;
    }

    public void printTaskList(){
        if (head ==null){
            System.out.println("No task list to print");
        }else {
            Node tempNode = head;
            while (tempNode != null){
                System.out.println(tempNode.task);
                tempNode = tempNode.next;
            }
        }
    }

    public void markCompleted(String description){
        if (head!=null){
            Node tempNode = head;
            while (tempNode != null){
                if (tempNode.task.getDescription().equals(description)){
                    tempNode.task.setCompleted(true);
                    return;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("task not found");
    }


}
