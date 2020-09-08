import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *  we wrote a class Waffle.java to represent expenditures as a Waffle chart. For an array of up to maximum elements,
 *  display all elements (biggest to smallest). For an array with more than maximum elements, display only the maximum-1
 *  biggest ones (biggest to smallest) and accumulate the others summed up as an entry with the description "Other".
 *  For instance, with maximum = 8; and expenditures as left below the waffle chart should look like right (Fig. 2).
 *  Expenditures expenditures = new Expenditure[]
 *     {new Expenditure("Salaries", 11000),
 *      new Expenditure("Paper", 2000),
 *      new Expenditure("Rent", 5000),
 *      new Expenditure("Most popular books on Java etc.",10000),
 *      new Expenditure("Heating", 3000),
 *      new Expenditure("Coffee/Tea", 7000),
 *      new Expenditure("Biscuits", 8000),
 *      new Expenditure("Travel", 18000),
 *      new Expenditure("Electricity", 1000),
 *      new Expenditure("Pencils", 3000)
 *      }
 *  @author Hsin Yi CHiu
 *  @version 2019-11-30
 */



/**
 * declare the color
 */
public class Waffle extends Application {
    private static final Color[] COLORS = new Color[]{
            Color.BLACK, Color.BLUE, Color.ORANGE, Color.DIMGREY, Color.GREEN, Color.DARKRED,
            Color.DARKBLUE, Color.CYAN, Color.ORANGE, Color.PURPLE, Color.MEDIUMAQUAMARINE, Color.CORNFLOWERBLUE,
            Color.LIGHTSEAGREEN, Color.DARKSALMON, Color.BISQUE, Color.CHARTREUSE, Color.DARKGREEN, Color.GOLDENROD,
            Color.LAVENDER, Color.KHAKI, Color.CHARTREUSE, Color.GOLD, Color.DEEPPINK, Color.OLIVE,
            Color.PLUM, Color.WHEAT, Color.TOMATO, Color.AZURE, Color.MEDIUMORCHID, Color.TEAL
    };

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

    //the maximum elements of the array
    private static final int maximum = 8;
    //xPoint moves the board on the x-axis out of the left upper corner.
    private static double xPoint = 50;
    //yPoint moves the board on the y-axis out of the left upper corner.
    private static double yPoint = 100;
    //initialize the X of the first rectangle
    private static double rectangleX = xPoint;
    //initialize the Y of the first rectangle
    private static double rectangleY = yPoint;


    //the scale of each rectangle
    private static final double scale = 20;
    //the space between each rectangle
    private static final double distance=5;

    private static String[] texts = new String[maximum];
    //the percentage of one elements in the array
    private static int[] amounts = new int[maximum];
    //initialize sum
    private static int sum = 0;

    // sort method that sort an array of type expenditure from biggest to smallest
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
    static void calculateAmount() {
        int temAmounts = 0;
        for (int i = 0; i <maximum-1; i++) {
            texts[i] = expenditures[i].getDescription();
            amounts[i] = (int) Math.round(expenditures[i].getValue() * 100.0 / sum);
            temAmounts += amounts[i];
        }
        texts[maximum- 1] = "Other";
        amounts[maximum- 1] = 100 - temAmounts;
    }

    /**
     * A method to make the waffle chart and the result will be located in the root
     * @param root group the makeWaffleChart as a object and can be called in the start
     * @return waffleChart the finial shape of the waffleChart
     */

    public static Rectangle makeWaffleChart(Group root){
        Rectangle waffleChart = null;
                for (int i = 0; i < amounts.length; i++) {
            for (int j = 1; j <= amounts[i]; j++) {
                waffleChart = new Rectangle(rectangleX, rectangleY, scale, scale);
                waffleChart.setFill(COLORS[i]);
                root.getChildren().add(waffleChart);
                rectangleX += scale+distance;
                if (rectangleX > xPoint + 9 * (scale+distance)) {
                    rectangleX = xPoint;
                    rectangleY += scale+distance;
                }
            }
        }
          return waffleChart;
    }

    /**
     * A method to creat the side rectangle to indicate the name of the expenditure and the relavant colour
     * @param root group the sideRectangle as a object and can be called in the start
     * @return rectangle the final shape of the sideRectangle
     */
    public static Rectangle sideRectangle(Group root){
        Rectangle rectangle = null;
        for (int i = 0; i < maximum; i++) {
            rectangle = new Rectangle(xPoint + 9 * (scale + distance) + scale*3,
                    yPoint + (scale + distance) * (i + 1), scale, scale);
            rectangle.setFill(COLORS[i]);
            Text text = new Text(xPoint + 9 * (scale + distance)  + scale*4.5,
                    yPoint + (scale + distance) * (i + 1)+ scale*4/5, texts[i]);

            root.getChildren().add(rectangle);
            root.getChildren().add(text);
        }
        return rectangle;
    }

    /**
     *  create a frame with a panel on which the Waffle chart is displayed.
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        sortExpenditure();
        valueSum();
        calculateAmount();
        // Create a Group (scene graph).
        Group root = new Group();

        sideRectangle(root);

        makeWaffleChart(root);
        // The scene consists of just one group.
        Scene scene = new Scene(root, 600, 600);
        // Give the stage (window) a title and add the scene.
        stage.setTitle("Waffle chart");
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
