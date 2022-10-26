package task_5.Calculator.Models;

import task_5.Calculator.Base.CalcModel;

public class SumModel extends CalcModel{

    @Override
    public double result() {
        return x + y;
    }

    @Override
    public void setX (double value) {
        super.x = value;    
    }

    @Override
    public void setY(double value) {
        super.y = value;   
    }


    
}