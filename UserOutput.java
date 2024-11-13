public class UserOutput {
    public static void main(String[] args){
        //Standard output/ terminal output
        // continous printing
        System.out.print("This");
        System.out.print("is");
        System.out.print("Java\n");

        //Line break after Printing
        System.out.println("Next print will start from next line");

        //Print using formating
        // %f floating point, %d integral,%s String(any)
        System.out.printf("Temperature %f degree Celsius", 30.22);
        //can use multiple placeholder
        //can use multiple placeholder
        System.out.printf("Name %s ,Age %d, Weight %f","Mero nam",30,75.44);
        //the arrangement of the placeholder and value given after string must match
        //eg: 1 %s String,2 %d integer,3 %f float

    
}

}        
