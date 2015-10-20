package sample;

/**
 * Created by cameronoakley on 10/20/15.
 */
public class ToDoItem {
    String text;
    boolean isDone;

    public ToDoItem(String textl, boolean isDone) {
        this.text = textl;
        this.isDone = isDone;
    }

    @Override
    public String toString(){
        String done = "";
        if (isDone){
            done = "(done)";
        }
        return String.format("%s %s", text, done);
    }
}
