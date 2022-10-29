package task_6.CalculatorWithComplexNumbers.Interfaces;

import java.util.List;

import task_6.CalculatorWithComplexNumbers.Complex.Complex;

public interface IChoosingComplexFactory {
    IModelComplex chooseModelComplex(String sign, List<Complex> operandList);
}
