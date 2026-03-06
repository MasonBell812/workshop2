public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field

    // Contructor to initialze item
    public ToDoItem(String description){
        this.description = description;
        this.isDone = false;
    }

    // Getter for description
    public String getDescription(){return this.description; }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for description
    public boolean getIsDone(){return this.isDone; }

    // Setter for description
    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

}
