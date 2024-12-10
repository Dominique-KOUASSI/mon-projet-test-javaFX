////////////////////////////////////////////////////////////////////////
// Title: Enregistrement d'une personne
// Nom, Prenom, Age
// Et affichage des informations dans la console
//
// Auteur: Dominique KOUASSI
// mvn clean compile  -->  pour la compilation
// mvn javafx:run     -->  pour executer l'application
//
///////////////////////////////////////////////////////////////////////

package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application {
  
    @Override
    public void start(Stage primaryStage) {
        // Labels et champ de text pour la personne a enregistrer
        Label nameLabel = new Label("Nom:");
        TextField nameField = new TextField();

        Label firstNameLabel = new Label("Prenom:");
        TextField firstNameField = new TextField();

        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField();

        // bouton de soumission
        Button submitButton = new Button("Inscrire");
        submitButton.setOnAction(e -> {
            String nom = nameField.getText();
            String prenom = firstNameField.getText();
            String age = ageField.getText();

            // Affichage dans la console
            System.out.println("Personne inscrite:");
            System.out.println("Nom: " + nom);
            System.out.println("Prenom: " + prenom);
            System.out.println("Age: " + age);
        });

        // Rendu Graphique
        VBox root = new VBox(10, nameLabel, nameField, firstNameLabel, firstNameField, ageLabel, ageField, submitButton);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Inscription Personne");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
