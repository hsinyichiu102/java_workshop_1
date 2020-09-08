import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *  Write a class Pie.java to represent all expenditures in a corresponding
 *  array of type Expenditure. Write a method public void start(Stage stage)
 *  throws Exception that displays the expenditures as a pie chart with the
 *  description placed next to the corresponding part of the pie chart.
 *  Take care that the description does not overlap with the pie chart itself.
 *  @author Hsin Yi CHiu
 *  @version 2019-12-03
 */



public class Pie extends Application {

    /**
     * declare the expenditure
     */
    private static Expenditure[] expenditures = new Expenditure[]{
            new Expenditure("Salaries", 11000),
            new Expenditure("Paper", 2000),
            new Expenditure("Rent", 5000),
            new Expenditure("Most popular books on Java etc.", 10000),
            new Expenditure("Heating", 3000),
            new Expenditure("Coffee/Tea", 7000),
            new Expenditure("Biscuits", 8000),
            new Expenditure("Travel", 18000),
            new Expenditure("Electricity", 1000),
            new Expenditure("Pencils", 3000)
    };
    private static final int maximum = 8;
    private final static int xCenter= 300;
    private final static int yCenter =300;
    private final static int radius = 150;
    private final static int radiusForText = 200;
    private static String[] texts = new String[maximum];
    private static int[] amounts = new int[maximum];
    //initialize sum
    private static int sum = 0;


    /*
     * sort method that sort an array of type expenditure from biggest to smallest
     */
    public static void sortExpenditure() {
        Arrays.sort(expenditures, (Expenditure exp1, Expenditure exp2) -> exp2.getValue() - exp1.getValue());
    }
    /*
     * the method to calculate the sum of the expenditures' value.
     */
    static void valueSum() {
        for(int i=0;i<expenditures.length;i++){
            sum=sum+expenditures[i].getValue();
        }
    }

    /*
     * method to calculate the amounts of the elements and get the name of the elements
     */
//    static void calculateAmount() {
//        int temAmounts = 0;
//        for (int i = 0; i <maximum-1; i++) {
//            texts[i] = expenditures[i].getDescription();
//            amounts[i] = (int) Math.round(expenditures[i].getValue() * 100.0 / sum);
//            temAmounts += amounts[i];
//        }
//        texts[maximum - 1] = "Other";
//        amounts[maximum - 1] = 100 - temAmounts;
//    }

    /**
     * To make a circle as requested
     * @param root put the circle into the root as an object
     * @return circle to get the value of the circle
     */

    public static Circle makeCircle(Group root){
        Circle circle= new Circle(xCenter,yCenter,radius);
        circle.setStroke(Color.BLACK);
        circle.setFill(null);
        root.getChildren().add(circle);
        return circle;
    }

    /**
     * to make the line which separate the circle into the requested percentage and show the text
     * of the corresponded cost
     * @param root to put the line into the root as a object
     * @return line to get the value
     */
    public static Line makeLine(Group root){
        Line makeLine = new Line(xCenter,yCenter,xCenter+radius,yCenter+radius);
        double angle =0;
        int temAmount=0;
        for (int i=0; i<maximum-1; i++){
            texts[i]=expenditures[i].getDescription();
            amounts[i] = (int) Math.round(expenditures[i].getValue() * 360 / sum);
            temAmount += amounts[i];
            texts[maximum - 1] = "Other";
            amounts[maximum- 1] = (int) (2*Math.PI - temAmount);
        }
        for (int i =0; i<maximum;i++){
            angle = angle-(amounts[i]*Math.PI/180);
            double lineX = xCenter + radius * Math.cos(angle);
            double lineY = yCenter + radius * Math.sin(angle);
            makeLine = new Line(xCenter,yCenter,lineX,lineY);
            root.getChildren().add(makeLine);
            double textAngle= (angle+Math.PI/6);
            double textX = xCenter + radiusForText * Math.cos(textAngle);
            double textY = yCenter + radiusForText * Math.sin(textAngle);
            Text text = new Text(textX,textY, texts[i]);
            if(textX> Math.PI/2 && textX < 3/2*Math.PI){
                text.setX(text.getX()-texts[i].length()*6);
                text.setY(text.getY()-10);
            }
            root.getChildren().add(text);

            }
        return makeLine;
        }

    /**
     * start to make the Pie chart from the corresponded value
     * @param stage a stage to show the pie chart
     * @throws Exception if any error then throw the exception
     */

    @Override
    public void start(Stage stage) throws Exception {
        sortExpenditure();
        valueSum();
        // Create a Group (scene graph).
        Group root = new Group();
        makeCircle(root);
        makeLine(root);

        // The scene consists of just one group.
        Scene scene = new Scene(root, 600, 600);
        // Give the stage (window) a title and add the scene.
        stage.setTitle("Pie chart");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) {
        launch(args);
    }


}

