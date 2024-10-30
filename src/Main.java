public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        taskList.addToTaskList("hello",0);
        taskList.addToTaskList("world",1);
        taskList.printTaskList();
        taskList.markCompleted("hello");
        taskList.printTaskList();

    }

}
