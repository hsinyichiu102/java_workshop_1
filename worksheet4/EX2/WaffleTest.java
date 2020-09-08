// import org.junit.Test;

// import java.util.Arrays;

// import static junit.framework.TestCase.assertEquals;

// class WaffleTest{
//     private static Expenditure[] expenditures;
//      public static void setExpenditures(Expenditure[] exp){expenditures =exp;}

//      @Test
//     public void test1() {
//          Expenditure[] expenditures = new Expenditure[]{
//                  new Expenditure("Salaries", 10),
//                  new Expenditure("Paper", 10),
//                  new Expenditure("Rent", 10),
//                  new Expenditure("Most popular books on Java etc.", 10),
//                  new Expenditure("Heating", 10),
//                  new Expenditure("Coffee/Tea", 10),
//                  new Expenditure("Biscuits", 10),
//                  new Expenditure("Travel", 10),
//                  new Expenditure("Electricity", 10),
//                  new Expenditure("Pencils", 10)
//          };
//          Arrays.sort(expenditures, (Expenditure exp1, Expenditure exp2) -> exp2.getValue() - exp1.getValue());


//      }


// }

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * This is the application which starts JavaFx.  It is controlled through the startJavaFx() method.
 */
public class WaffleTest extends Application
{

    /** The lock that guarantees that only one JavaFX thread will be started. */
    private static final ReentrantLock LOCK = new ReentrantLock();

    /** Started flag. */
    private static AtomicBoolean started = new AtomicBoolean();

    /**
     * Start JavaFx.
     */
    public static void WaffleTest()
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
                        Waffle.launch();
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