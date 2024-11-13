public class SwitchCaseStatement {
    public static void main(String[] args) {
        int day = 5;
        switch (day){
            // day == 0
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Unknown day");
                break;
        }

        //nested switch statement 
        String beverage = "Coke"
        char gender= 'M';
        switch(beverage){
            case "Coke":
                switch(gender){
                    case 'M':
                        System.out.println("Male");
                        break;
                    case 'F':
                        System.out.println("Female");
                        break;

                }
                System.out.println("Black");
                break;
            default:
                System.out.println("Unknown Bevrages");
                break;
        }

        // Switch case or
        int status = 404;
        switch(status){
            case 200:
            case 201:
            case 202:
            System.out.println("Success");
            break;
         // status == 401 // status == 404
           case 401:
           case 404:
           System.out.println("Not found");
           break;
         default:
            System.out.println("Unknown status");
            break;
            


    }
    
}
          

    }         



}
