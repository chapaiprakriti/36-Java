public class OperatorClass {
    public static void main(String[] args) {
        //Arthmetic operator 
        // +,-,*,/,%
        int intVar1 =10, intVar2=20;
        int addOper = intVar1 + intVar2;
        int minusOper = intVar1 - intVar2;
        int multiOper = intVar1 * intVar2;
        int divOper = intVar1 / intVar2;
        int modOper = intVar1 % intVar2;

        //assignment operator 
        int assignVar = 10;
        assignVar += 20; // 10 + 20 -> 30
        assignVar -= 15;
        assignVar *=2;
        assignVar /=10;
        assignVar %=2;

        // unary operator
        int unaryVar =20;
        unaryVar ++; // unaryVar +=1; 20+1; 21
        unaryVar --; // unaryVar -= 1; 21-1;


       //Relation Operator
        int relVar1 =20, relVar2= 30;
        boolean equalOper = relVar1 == relVar2;
        boolean greaterOper = relVar1 > relVar2;
        boolean lessEqualOper =relVar2 <=30;
        boolean notEqual = 20 !=10;
 
 
        //logical operator
        int logVar1 = 10, logVar2 =20, logVar3 = 23;
        boolean andOper = true && true;
        boolean andOperVar =(logVar1 < logVar2) && (logVar3 == logVar2);
        boolean orOper = false || false || true;
        boolean orOperVar = (logVar1 < logVar2) || (logVar3 == logVar2);
        boolean notOper = ! (logVar1 < logVar2);// true -> false

        //Ternary operator
        /* 
        *String status;
        *int marking = 40;
        *if(marking >= 40){
        *    status = "pass";
        *}else{
        *    status = "fail";
        *}
        */
        int marking = 40;
        String status = (marking >= 40)? "pass" : "fail";
        System.out.println("Status : "+ status);

        /*
         * Task
         * Add the following variable
         * oppMarking -> int
         * architectureMarking -> int
         * databaseMarking -> int
         * creativeThinkingMarking -> Int
         * make a float avg and calculate the avg of the markings
         * make a boolean expression to check if
         * all the marking is greater or equal to 40
         * and check if the avg is greater than 50
         * Make a result -> String and check the boolean
         * if true set result as " Good job " else set result as "Bad job"
         * print the result
         */

         int oppMarking = 30;
         int architecture = 40;
         int databaseMarking = 50;
         int cre
 
          
         

 



    }
    
}


