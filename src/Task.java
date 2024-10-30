public class Task {
    private String description;
    private boolean completed;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Task(String description) {
        this.description = String.valueOf(description);
        this.completed = false;
    }

    @Override
    public String toString() {
        if (completed){
            return (description+"(completed)");
        }
        return (description+ "(pending)");
    }
}
