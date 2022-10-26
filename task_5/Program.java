package task_5;

import java.io.IOException;

import task_5.Base.ChoseModelFactory;
import task_5.Interfaces.ILogger;
import task_5.Logging.SimpleLogger;

public class Program {
    
    public static void main(String[] args) throws IOException {
        ILogger logger = new SimpleLogger();
        Presenter pres = new Presenter (new View(), new ChoseModelFactory(), logger);
        logger.getLog();
        logger.log(Program.class.getSimpleName(), "Main", "the program is started");

        pres.buttonClick();
       

        logger.log(Program.class.getSimpleName(), "Main","the program finished");
    }
}