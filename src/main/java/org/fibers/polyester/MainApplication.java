package org.fibers.polyester;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.embed.swing.SwingNode;
import org.fibers.polyester.ui.LabelButton;

import javax.swing.*;

public class MainApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        createSwingContent();

        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");

        LabelButton l1 = new LabelButton("Result");
        l1.setLayoutX(10);
        l1.setLayoutY(10);

        LabelButton l2 = new LabelButton("Body");
        l2.setLayoutX(60);
        l2.setLayoutY(10);

        Scene scene = new Scene(new Pane(l1, l2), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    private SwingNode createSwingContent() {
        final SwingNode swingNode = new SwingNode();
        swingNode.setContent(new JButton("Click me!"));

        return swingNode;
    }

}
