import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

public class PolygonInCircle extends Application {

    // 四个顶点在圆上的角度（单位：度）
    // 顺序：左上 -> 右上 -> 右下 -> 左下
    private static final double[] ANGLES_DEG = {
            150,   // 左上
            10,    // 右上
            320,   // 右下
            210    // 左下
    };

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        // 圆心绑定到 pane 的中心
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        // 多边形
        Polygon polygon = new Polygon();
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);

        // pane 大小改变时更新图形
        pane.widthProperty().addListener((obs, oldVal, newVal) ->
                updateShapes(circle, polygon, pane));
        pane.heightProperty().addListener((obs, oldVal, newVal) ->
                updateShapes(circle, polygon, pane));

        // 初始化（stage 显示后也会再触发一次）
        updateShapes(circle, polygon, pane);

        pane.getChildren().addAll(circle, polygon);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("My Shape");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // 根据 pane 当前宽高，更新圆的半径和多边形的顶点
    private void updateShapes(Circle circle, Polygon polygon, Pane pane) {

        double w = pane.getWidth();
        double h = pane.getHeight();
        if (w <= 0 || h <= 0) {
            return; // 初始 0 尺寸时先不画
        }

        double cx = w / 2.0;
        double cy = h / 2.0;

        // 圆的半径：取较小边的一半，再缩一点，避免碰到窗口边
        double r = Math.min(w, h) / 2.2;
        circle.setRadius(r);

        polygon.getPoints().clear();

        // 每个顶点：同一个 r，不同角度 -> 全部在圆周上
        for (double angleDeg : ANGLES_DEG) {
            double angle = Math.toRadians(angleDeg);
            double x = cx + r * Math.cos(angle);
            double y = cy + r * Math.sin(angle);  // y 轴向下没关系，距离仍然是 r
            polygon.getPoints().addAll(x, y);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
