package task_5.Calculator.Interfaces;

public interface IView {
    
    public double getValue (String stringName);

    public String getSign (String stringName);

    public void showResult(String stringName);
}