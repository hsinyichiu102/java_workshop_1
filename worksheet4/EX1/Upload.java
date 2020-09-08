import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;

/**
 * displays an upload icon
 * @author Hsin Yi Chiu
 * @version 11-26-2019
 */

public class Upload extends Application {
    public static Polygon[] polygons;

    /**
     * To set the polygon for making the upload icon
     * @param vertices the angles of the polygon
     * @param rotation how muchthe angle will move from the orginal point
     * @param scaleY the length of Y from the point to the circle center
     * @param scaleX the lengthe of x from the point to the circle center
     * @param xOffset the x pont
     * @param yOffset the y pont
     * @return polygon
     */
    public static Polygon makePolygons(int vertices, double rotation, double scaleX, double scaleY, double xOffset, double yOffset){
        // create the empty space of 2 vertices which need to include the x-coordinate and y-coordinate in an array
        Double[] coordinates= new Double[2 * vertices];
        // int i is the variable vertices of the polygon and i is less than the vertices
        for(int i=0; i<vertices;i++){
            // as place 0 is presented the index of x and 1 is presented the index of 2
            // if only use i and i+1 to present x and y then there will be 1 space with 2 value and it is not allow
            // thus need to *2 to avoid the situation
            coordinates[2*i]= xOffset +
                    scaleX * Math.cos(rotation+ 2 * i * Math.PI/vertices);
            coordinates[2*i+1]= yOffset+
                    scaleY*Math.sin(rotation + 2 * i * Math.PI/vertices);
        }


        Polygon polygon = new Polygon();

        polygon.getPoints().addAll(coordinates);

        polygon.setFill(Color.BLACK);

        polygon.setStroke(Color.BLACK);
        return polygon;

    }
    /**
     * @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {

        // Create a Group (scene graph) with the polygons as elements.
        Group root = new Group();
        for (Polygon polygon : polygons) {
            root.getChildren().add(polygon);
        }

        // The scene consists of just one group.
        Scene scene = new Scene(root, 600, 300);

        // Give the stage (window) a title and add the scene.
        stage.setTitle("Upload");
        stage.setScene(scene);
        stage.show();
    }

    /**
    * setting all the points and the relavant percentage of the scale and making the icon
    * @param scale_X setting a length for X to decide how big the icon will be
    * @param scale_Y setting a length for Y to decide how big the icon will be
    */
    public static Polygon[] makeUpload(double scale_X, double scale_Y){
        double rotation = -Math.PI/2;
        double scaleX_For_Rectangle = scale_X-30;
        double scaleX_For_wide_MRectangle=scale_X+100;
        double scaleY_For_MRectangle= scale_Y+40;
        double scaleY_For_SRectangle= scale_Y+60;
        double scaleY_For_Wide_MRectangle= scale_Y-10;

        Polygon triangle = makePolygons(3, rotation, scale_X, scale_Y, 150.0,50.0);
        Polygon rectangle_1 = makePolygons(4,rotation/2,scaleX_For_Rectangle,scaleY_For_MRectangle,150,115);
        Polygon rectangle_2 = makePolygons(4,rotation/2,scaleX_For_Rectangle,scaleY_For_SRectangle,50,160);
        Polygon rectangle_3 = makePolygons(4,rotation/2,scaleX_For_wide_MRectangle,scaleY_For_Wide_MRectangle,150,209);
        Polygon rectangle_4 = makePolygons(4,rotation/2,scaleX_For_Rectangle,scaleY_For_SRectangle,250,160);

        Polygon[] poly = {triangle, rectangle_1,rectangle_2,rectangle_3,rectangle_4};
        polygons = poly;
        return polygons;
    }
    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) {

        makeUpload(50,30);

        launch(args);

    }
}
