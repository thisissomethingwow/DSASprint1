public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
//        Task task1 = new Task("hello");
//        Task task2 = new Task("world");
        taskList.addToTaskList("hello",0);
        taskList.addToTaskList("world",1);
        taskList.printTaskList();
        taskList.markCompleted("hello");
        taskList.printTaskList();

    }

}
