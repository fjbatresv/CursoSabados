/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javier.ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author javie_000
 */
public class Login extends Application {


    public Login() {
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {
        //Creando Contenedor(Frame)
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);
        grid.setVisible(true);
        //labels
        Label usuarioLbl = new Label("Nombre de usuario: ");
        Label claveLbl = new Label("Clave de acceso: ");
        //nombre, columna, linea
        grid.add(usuarioLbl, 0, 1);
        grid.add(claveLbl, 0, 2);
        final TextField usuarioTxt = new TextField();
        usuarioTxt.setPromptText("Nombre de usaurio...");//placeholder
        usuarioTxt.setPrefColumnCount(10);//columna por preferencia
        usuarioTxt.getText();
        GridPane.setConstraints(usuarioTxt, 1, 1);//columna, linea
        grid.getChildren().add(usuarioTxt);
        final PasswordField claveTxt = new PasswordField();
        claveTxt.setPromptText("Clave de acceso...");
        GridPane.setConstraints(claveTxt, 1, 2);//columna, linea
        claveTxt.getText();
        grid.getChildren().add(claveTxt);
        Button submit = new Button("Acceder");
				submit.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event){
						if(false){
							primaryStage.close();
						}else{
							claveTxt.setText(null);
//							new ContraIncorrecta();
						}
					}
				});
				GridPane.setConstraints(submit, 0, 3);
				grid.getChildren().add(submit);
				//Defining the Clear button
				Button clear = new Button("Cancel");
				clear.setOnAction(new EventHandler<ActionEvent>(){
					public void handle(ActionEvent event){
						System.exit(0);
					}
				});
				GridPane.setConstraints(clear, 1, 3);
				grid.getChildren().add(clear);
				grid.setAlignment(Pos.CENTER);
        grid.setAlignment(Pos.CENTER);
        primaryStage.setTitle("Logeo");
        primaryStage.setScene(new Scene(grid, 250, 130));
        primaryStage.show();
    }
}
