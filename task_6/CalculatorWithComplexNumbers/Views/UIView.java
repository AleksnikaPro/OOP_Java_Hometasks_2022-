package task_6.CalculatorWithComplexNumbers.Views;

import java.io.IOException;
import java.util.Scanner;

import task_6.CalculatorWithComplexNumbers.Base.ChoseModelFactory;
import task_6.CalculatorWithComplexNumbers.BaseComplex.ChoseModelComplexFactory;
import task_6.CalculatorWithComplexNumbers.Interfaces.ILogger;
import task_6.CalculatorWithComplexNumbers.Logging.SimpleLogger;
import task_6.CalculatorWithComplexNumbers.Presenters.Presenter;
import task_6.CalculatorWithComplexNumbers.Presenters.PresenterComplex;

public class UIView {
    public Scanner sc = new Scanner(System.in);

    public void consoleUICalc() throws IOException {
        ILogger logger = new SimpleLogger();
        logger.getLog();
        logger.log(UIView.class.getSimpleName(), "consoleUICalc", "the calculator starts");
        Presenter pres = new Presenter(new View(), new ChoseModelFactory(), logger);
        PresenterComplex presComplex = new PresenterComplex(new ViewComplex(), new ChoseModelComplexFactory(), logger);
        System.out.println("Menu:\n1 - Classic calc;\n2 - Complex calc;\n0 - exit.");
        boolean loop = true;
        while (loop) {
            System.out.println("Enter the command from the menu or enter 0 to quit: ");
            int myChoice = sc.nextInt();
            switch (myChoice) {
                case 1 -> {
                    logger.log(UIView.class.getSimpleName(), "consoleUICalc", "a common regime is initialised");
                    pres.buttonClick();
                }
                case 2 -> {
                    logger.log(UIView.class.getSimpleName(), "consoleUICalc", "a complex regime is initialised");
                    presComplex.buttonClickComplex();
                }
                case 0 -> {
                    sc.close();
                    loop = false;
                }
            }
        }
        logger.log(UIView.class.getSimpleName(), "consoleUICalc", "the calculator finishes");
    }
}
