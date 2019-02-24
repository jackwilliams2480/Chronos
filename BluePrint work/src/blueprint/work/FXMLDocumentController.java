/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueprint.work;

import java.net.URL;
import java.io.*;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.Initializable;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;

/**
 *
 * @author jackw
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private void loadSecond(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/blueprint/work/SceneOne/FXMLDocumentSceneOne.fxml"));
        Scene scene = label.getScene();
    } 
}
    