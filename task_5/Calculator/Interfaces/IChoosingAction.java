package task_5.Calculator.Interfaces;

import java.util.List;

public interface IChoosingAction {
    public IModel chooseModel(String sign, List<Double> operandList);
}