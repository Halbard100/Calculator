public class Calc {

    double res;
//    public enum function {
//        ADD, SUBTRACT, DIVIDE, MULTIPLY, EQUALS
//    }
//    function functy;

    public Calc(){

    }
    public Calc(double param){
        this.res = param;
    }
    public void Calculate(double param, String functy){
        switch (functy) {
            case "+":
                this.res = ADD(param);
                break;
            case "-":
                this.res = SUB(param);
                break;
            case "/":
                this.res = DIV(param);
                break;
            case "*":
                this.res = MULT(param);
                break;
        }
    }
    private double ADD(double param){
        return res + param;
    }
    private double SUB(double param){
        return res - param;
    }
    private double DIV(double param){
        return res/param;
    }
    private double MULT(double param){
        return res*param;
    }
    public double RESULT(){
        return res;
    }



}
