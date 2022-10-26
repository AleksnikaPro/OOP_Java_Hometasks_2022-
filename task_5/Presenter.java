package task_5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import task_5.Interfaces.IChoosingAction;
import task_5.Interfaces.ILogger;
import task_5.Interfaces.IView;

public class Presenter {
    private final IView myView;
    private final IChoosingAction myModel;
    private final ILogger mylogger;
    

    public Presenter(IView myView, IChoosingAction myModel, ILogger mylogger) {
        this.myView = myView;
        this.myModel = myModel;
        this.mylogger = mylogger;
    }

    public void buttonClick() throws IOException {
        double a = myView.getValue("first number");
        String sign = myView.getSign("math char");
        double b = myView.getValue("second number");
        List<Double> operandsList = new ArrayList<>();
        operandsList.add(a);
        operandsList.add(b);
        double result = myModel.chooseModel(sign, operandsList).result();
        String resString = String.format("%f %s %f = %f", a, sign, b, result);
        myView.showResult(resString);
        mylogger.log(Presenter.class.getSimpleName(), "buttonClick", resString);
    }
}