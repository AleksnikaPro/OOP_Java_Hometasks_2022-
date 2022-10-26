package task_5.Calculator.Base;

import java.util.List;

import task_5.Calculator.Models.SumModel;
import task_5.Calculator.Interfaces.IChoosingAction;
import task_5.Calculator.Interfaces.IModel;
import task_5.Calculator.Models.DifModel;
import task_5.Calculator.Models.DivModel;
import task_5.Calculator.Models.ProdModel;

public class ChoseModelFactory implements IChoosingAction {

    @Override
    public IModel chooseModel(String sign, List<Double> operandList) {
        IModel myAction = null;
        switch (sign) {
            case "*" -> myAction = new ProdModel();
            case "/" -> myAction = new DivModel();
            case "+" -> myAction = new SumModel();
            case "-" -> myAction = new DifModel();
        }
        myAction.setX(operandList.get(0));
        myAction.setY(operandList.get(1));
        return myAction;
    }

}