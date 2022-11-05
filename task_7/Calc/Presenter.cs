using Calc;


class Presenter
{
    View myView;
    ChooseModel myModel;
    

    
    public Presenter(View myView, ChooseModel myModel) 
    {
        this.myView = myView;
        this.myModel = myModel;
                
    }

    public void ButtonClick()
    {
        double a = myView.GetValue("first number: ");
        string sign = myView.GetSign("math char: ");
        double b = myView.GetValue("second number: ");

        List<double> operandList = new List<double>();
        operandList.Add(a);
        operandList.Add(b);
        
        double result = myModel.ChooseMod(sign, operandList).Result();
       
        myView.ShowResult(result);
        
     
    }
}

