public class User {
    private String name;
    private TaskList taskList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskList getTaskList() {
        return taskList;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }


    public void printTask(){
        taskList.printTaskList();
    }

    public void addTask(String description,int location){
        taskList.addToTaskList(description,location);
    }

    public void markCompleted(String description){
        taskList.markCompleted(description);
    }




}
