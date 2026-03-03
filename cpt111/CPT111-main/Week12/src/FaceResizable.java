import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class FaceResizable extends Application {

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();

        // 脸
        Circle face = new Circle();
        face.centerXProperty().bind(pane.widthProperty().divide(2));
        face.centerYProperty().bind(pane.heightProperty().divide(2));
        face.radiusProperty().bind(
                Bindings.min(pane.widthProperty(), pane.heightProperty()).divide(2.5)
        );
        face.setFill(Color.WHITE);
        face.setStroke(Color.BLACK);

        // 左眼（空心）
        Circle leftEye = new Circle();
        leftEye.radiusProperty().bind(face.radiusProperty().divide(6));
        leftEye.centerXProperty().bind(face.centerXProperty().subtract(face.radiusProperty().divide(2)));
        leftEye.centerYProperty().bind(face.centerYProperty().subtract(face.radiusProperty().divide(3)));
        leftEye.setFill(Color.WHITE);      // 关键：白色填充
        leftEye.setStroke(Color.BLACK);    // 黑色描边

        // 右眼（空心）
        Circle rightEye = new Circle();
        rightEye.radiusProperty().bind(face.radiusProperty().divide(6));
        rightEye.centerXProperty().bind(face.centerXProperty().add(face.radiusProperty().divide(2)));
        rightEye.centerYProperty().bind(leftEye.centerYProperty());
        rightEye.setFill(Color.WHITE);     // 关键：白色填充
        rightEye.setStroke(Color.BLACK);   // 黑色描边

        // 嘴
        Line mouth = new Line();
        mouth.startXProperty().bind(face.centerXProperty().subtract(face.radiusProperty().divide(2)));
        mouth.endXProperty().bind(face.centerXProperty().add(face.radiusProperty().divide(2)));
        mouth.startYProperty().bind(face.centerYProperty().add(face.radiusProperty().divide(3)));
        mouth.endYProperty().bind(mouth.startYProperty());

        pane.getChildren().addAll(face, leftEye, rightEye, mouth);

        Scene scene = new Scene(pane, 400, 400);
        stage.setTitle("My Shape");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

