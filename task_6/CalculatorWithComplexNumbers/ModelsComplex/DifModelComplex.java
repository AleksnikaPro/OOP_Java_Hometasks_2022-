package task_6.CalculatorWithComplexNumbers.ModelsComplex;

import task_6.CalculatorWithComplexNumbers.BaseComplex.CalcModelComplex;
import task_6.CalculatorWithComplexNumbers.Complex.Complex;

public class DifModelComplex extends CalcModelComplex{
    protected Complex a;

    @Override
    public Complex result() {
        return new Complex((super.a.getX() - super.b.getX()), (super.a.getY() - super.b.getY()));
    }

    @Override
    public void setA(Complex a) {
        super.a = a;
    }

    @Override
    public void setB(Complex b) {
        super.b = b;
    }
    
}
