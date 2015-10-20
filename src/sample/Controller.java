package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import javax.xml.soap.Text;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {//most of code goes here
    ObservableList<ToDoItem> items = FXCollections.observableArrayList();//adding list to store info
    @FXML
    TextField textField;
    @FXML
    ListView listView;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listView.setItems(items);

    }

    public void addItem(){//adding behavior to add button
        ToDoItem item = new ToDoItem(textField.getText(),false);
        items.add(item);
        textField.setText("");
    }

    public void toggleItem(){
       ToDoItem item = (ToDoItem) listView.getSelectionModel().getSelectedItem();
        if (item !=null) {
            item.isDone = !item.isDone;
        }

        listView.setItems(null);//force listview to refresh
        listView.setItems(items);
    }
}
