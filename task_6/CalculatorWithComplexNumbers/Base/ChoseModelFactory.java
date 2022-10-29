package task_6.CalculatorWithComplexNumbers.Base;

import java.util.List;

import task_6.CalculatorWithComplexNumbers.Models.SumModel;
import task_6.CalculatorWithComplexNumbers.Interfaces.IChoosingAction;
import task_6.CalculatorWithComplexNumbers.Interfaces.IModel;
import task_6.CalculatorWithComplexNumbers.Models.DifModel;
import task_6.CalculatorWithComplexNumbers.Models.DivModel;
import task_6.CalculatorWithComplexNumbers.Models.ProdModel;

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
