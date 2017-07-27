/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changos;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;


/**
 *
 * @author daniel_f.caicedo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField label;
    
     
    @FXML
    private TextField label2;
    
    LinkedList<estudiante> LIstaE;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String nombre = label.getText();
        String edad = label2.getText();
        
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
