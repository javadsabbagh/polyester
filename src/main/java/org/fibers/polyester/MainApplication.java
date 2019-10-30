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

    @Override
    public void start(Stage stage) {
        final SwingNode swingNode = new SwingNode();
        createSwingContent(swingNode);

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

    public static void main(String[] args) {
        launch();
    }

    private void createSwingContent(final SwingNode swingNode) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                swingNode.setContent(new JButton("Click me!"));
            }
        });
    }

}
