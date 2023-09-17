public class Calculator{
    public Calculator(){
    }
    public int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public int substract(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
    public int multiply(int firstNumber, int secondNumber ){
        return firstNumber * secondNumber;
    }
    public int divide(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
    public int modula(int firstNumber, int secondNumber){
        return firstNumber % secondNumber;
    }
    public static void main(String[] args) {
      Calculator myCalculator = new Calculator();
      System.out.println(myCalculator.add(9,5));
      System.out.println(myCalculator.substract(18,7));
      System.out.println(myCalculator.modula(47,11));
      System.out.println(myCalculator.divide(499,3));
      System.out.println(myCalculator.multiply(31,3));
    }
}