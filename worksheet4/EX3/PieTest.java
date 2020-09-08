import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * This is the application which starts JavaFx.  It is controlled through the startJavaFx() method.
 */
public class PieTest extends Application
{

    /** The lock that guarantees that only one JavaFX thread will be started. */
    private static final ReentrantLock LOCK = new ReentrantLock();

    /** Started flag. */
    private static AtomicBoolean started = new AtomicBoolean();

    /**
     * Start JavaFx.
     */
    public static void Pie()
    {
        try
        {
            // Lock or wait.  This gives another call to this method time to finish
            // and release the lock before another one has a go
            LOCK.lock();

            if (!started.get())
            {
                // start the JavaFX application
                final ExecutorService executor = Executors.newSingleThreadExecutor();
                executor.execute(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        Pie.launch();
                    }
                });

                while (!started.get())
                {
                    Thread.yield();
                }
            }
        }
        finally
        {
            LOCK.unlock();
        }
    }

    /**
     * Launch.
     */
    protected static void launch()
    {
        Application.launch();
    }

    /**
     * An empty start method.
     *
     * @param stage The stage
     */
    @Override
    public void start(final Stage stage)
    {
        started.set(Boolean.TRUE);
    }
}

//    private Expenditure[] exp1= new Expenditure[]{
//        new Expenditure("Salaries", 110),
//                new Expenditure("Paper", 20),
//                new Expenditure("Rent", 50),
//                new Expenditure("Most popular books on Java etc.", 100),
//                new Expenditure("Heating", 30),
//                new Expenditure("Coffee/Tea", 70),
//                new Expenditure("Biscuits", 80),
//                new Expenditure("Travel", 180),
//                new Expenditure("Electricity", 10),
//                new Expenditure("Pencils", 30)
//    };
//    public void setExp1(Expenditure[] exp1) {
//        this.exp1 = exp1;
//    }
//    public Expenditure[] getExp1() {
//        return exp1;
//    }
//
//    private static int xPoint =100;
//    private static int yPoint =100;
//    private static int radius =50;
//    private static int radiusForText=100;
//    private Circle circle= new Circle(100,100,50);
//    private Pie makeLine = new Pie(xPoint,yPoint,xPoint+radius);
//
//
//    @Test
//    void test1(){
//        double[] expectedCircle = {100,100,50};
//        double[] actualCircle = {circle.getCenterX(), circle.getCenterY(), circle.getRadius()};
//        assertEquals(expectedCircle,actualCircle);
//    }
//
//    @Test
//    void test2(){
//        int amount = 0;
//        for(int i=0;i<exp1.length;i++) {
//            amount += exp1[i].getValue();
//        }
//        int sum = 680;
//        assertEquals(amount,sum);
//
//        int angle = (int)((exp1[0].getValue())*Math.PI/180);
//        int expectedAngle = (int) ((110/680)*Math.PI/180);
//        assertEquals(angle,amount);
//
//
//    }
//
//    @Test
//    void test3(){
//        Line makeLine = ;
//        Line expectedLine = new Line(100,100,150,150);
//    }




