public class Hello{
    public static void main(String[] args) {

        double dou = 20.00d;
        double dou2 = 80.00d;
        double dou3 = (dou + dou2) * 100.00d;
        System.out.println(dou3 % 40.00d);
        boolean isZero = (dou3 % 40.00) == 0 ? true:false;
        System.out.println(isZero);

        if (!isZero) {
            System.out.println("Got some remainder");
        }


//        System.out.println("Hello Cory");
//
//        boolean isAlien = false;
//        if (isAlien == false) {
//            System.out.println("It is not an alien!");
//            System.out.println("And I am scared of aliens");
//        }
//
//        int topScore = 80;
//        if ( topScore != 100) {
//            System.out.println("You got the high score!");
//        }
//
//        int secondTopScore = 81;
//        if (topScore > secondTopScore && topScore < 100) {
//            System.out.println("Greater than second top score and less than 100");
//        }
//
//        if((topScore > 90) || (secondTopScore <= 90)) {
//            System.out.println("Either or both of the conditions are true");
//        }
//
//        int newValue = 50;
//        if (newValue == 50) {
//            System.out.println("This is true");
//        }
//        boolean isCar = false;
//        if (!isCar) {
//            System.out.println("This is not supposed to happen");
//        }
//        String makeOfcar = "Volkswagen";
//        boolean is_Domestic = makeOfcar == "Volkswagen" ? true : false;
    }
}