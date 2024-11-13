public class VariableExample {
    //Instance variable 
    int instanceVariable =100;
    //instanceVariable can only be accessed wiyh the object 
    //static variable
    static boolean staticVariable = false;
    // staticVariable can be as acesed with Class directly 


    void firstFunction(){
        int localvariable =300;
        //local variable are made inside a function / constructer scope/block
        System.out.println("Local Variable :" + localvariable);

    }
    public static void main (String [] args) {
        int localVariable2 =400;
        System.out.println("Local Variable :" + localVariable2);
        //to use the instance variable of a class, make object
        //syntax:ClassName bojVariable = new ClassName();
        VariableExample variableExampleObj = new VariableExample();
        //the variable of the VariableExample is called object,here variableExampleObj
        System.out.println("Intance Variable :"+ variableExampleObj.instanceVariable);
        //static variable can be acessed with, ClassName.variableName
        System.out.println("Static Variable :"+ VariableExample.staticVariable);

        // Java TypeCasting Primitive Datatype
        // Widening Casting/Implicit Casting/ automatic
        // Conversion of smaller datatype to larger datatype (size/capacity)
        // byte -> Short -> char -> int -> long -> float-> double
        byte byteVariable = 10;
        short shortVariable = byteVariable; // here byte is automatically converted to short

        int mathMark = 20;
        double mathConverted = mathMark; // int is automatically convert to double -> 20.0
        System.out.println("Int to double " + mathConverted);

        
        //narrowing casting / Explict Casting /manusl
        //Conversion of larger datatype to smaller datatype
        double gpa =3.4;
        int gpaInt =(int) gpa;
        System.out.println("GPA int" + gpaInt);
        int floatConversion=(int) 400.33f; // 400

        // Calculation
        float mathCalc = 1/2; // 1/2 in int is 0 -> 0.0
        System.out.println(mathCalc); 
        float mathCalcSolve = 1.0f/2; // either one value float
        float mathCalcSollve = 1.0f/2; // either one value float
        


    }
    
}
