package ru.sapteh;

import com.sun.javafx.charts.ChartLayoutAnimator;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.InputStream;

public class Program extends Application {
//  Переменные
    int count = 0;
//  Переопределение старта
    @Override
        public void start(Stage primaryStage){
            primaryStage.setTitle("Steam");
            primaryStage.setWidth(500);
            primaryStage.setHeight(400);

//  Иконка окна(No working/error)
//        InputStream iconStream = getClass().getResourceAsStream("skyrim.png");
//        Image image = new Image(iconStream);
//        primaryStage.getIcons().add(image);


        Pane root = new Pane();
//  Лейбл
            Label label = new Label("kotlarchik");
            label.setFont(new Font(20));
            label.setLayoutX(220);
//  Кнопки
            Button btn = new Button("Print.");
            btn.setLayoutX(0);
            btn.setLayoutY(50);
            btn.setPrefSize(90, 50);
            Button btn1 = new Button("Clicker");
            btn1.setLayoutX(100);
            btn1.setLayoutY(50);
            btn1.setPrefSize(120, 50);
//  Поле ввода
            TextField textField = new TextField();
            textField.setLayoutX(0);
            textField.setLayoutY(0);
            textField.setFont(new Font(17));
//  Метод второй кнопки
            btn1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    count++;
                    label.setText("Count" + count);
                }
            });
//  Метод первой кнопки
            btn.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    String txtText = textField.getText();
                    label.setText(txtText);
                    String text = "Not found is name";
                    if (!txtText.isEmpty()) {
                        label.setText("Name: " + txtText);
                    } else {
                        label.setText("Name: " + text);
                    }
                }
            });

        Scene scene = new Scene(root);
//  Вызовы
        root.getChildren().add(textField);
        root.getChildren().add(label);
        root.getChildren().add(btn1);
        root.getChildren().add(btn);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
       Application.launch(args);
    }
}
