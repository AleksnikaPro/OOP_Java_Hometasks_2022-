package task_6.CalculatorWithComplexNumbers.BaseComplex;

import java.util.List;

import task_6.CalculatorWithComplexNumbers.Complex.Complex;
import task_6.CalculatorWithComplexNumbers.Interfaces.IChoosingComplexFactory;
import task_6.CalculatorWithComplexNumbers.Interfaces.IModelComplex;
import task_6.CalculatorWithComplexNumbers.ModelsComplex.DifModelComplex;
import task_6.CalculatorWithComplexNumbers.ModelsComplex.DivModelComplex;
import task_6.CalculatorWithComplexNumbers.ModelsComplex.ProdModelComplex;
import task_6.CalculatorWithComplexNumbers.ModelsComplex.SumModelComplex;

public class ChoseModelComplexFactory implements IChoosingComplexFactory {

    @Override
    public IModelComplex chooseModelComplex(String sign, List<Complex> operandList) {
        IModelComplex myAction = null;
        switch(sign) {
            case "*" -> myAction = new ProdModelComplex();
            case "/" -> myAction = new DivModelComplex();
            case "+" -> myAction = new SumModelComplex();
            case "-" -> myAction = new DifModelComplex();
        }
        
        myAction.setA(operandList.get(0));
        myAction.setB(operandList.get(1));
        return myAction;
    }
    
}
