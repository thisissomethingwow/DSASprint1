public class Node {
    public String data;
    public Node next;
    public Task task;

    public Node(){

    }

    public Node(String description) {
        this.task = new Task(description);
    }
}
