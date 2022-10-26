package task_5.Models;

import task_5.Base.CalcModel;

public class DifModel extends CalcModel{

    @Override
    public double result() {
        return x - y;
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