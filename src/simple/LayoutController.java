/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author humberto
 */
public class LayoutController implements Initializable {

    @FXML
    private Button Button1;

    @FXML
    void Button1Action(ActionEvent event) {
        System.out.println("Button clicked");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Th document is loaded");
    }    
    
}
