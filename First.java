import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        //Variables

        String surname = "Santoshi";
        int age = 30;
//
        String friend = surname ;
//        System.out.println(friend);

                        //Types
        //1.Primitive Type

        //a)byte -1  (-128 to 127)
        //b)short - 2
        //c)int - 4
        //d)long - 8
        //e)float - 4
        //f)double -8
        //g)boolean -2
        //h)char - 2 a,b,c,d

       // int number = 12345678900;// Error beyond int range

        long number2 = 12345678900L;//Store it in long

        float pi = 3.14F;
        char letter = '@';
        boolean IsBig = false;


        //2.Non-Primitive type  (Variable size , no fix size as that of primitve)
//        //a)String
//        String name1 ="Harsh";
//        String name2 = new String("Harsh");
//        System.out.println(name2.length());
//        System.out.println(name1.charAt(0));
//        System.out.println(name1.charAt(1));
//        //Replace
//        String name3 = name2.replace('a','z');
//        System.out.println(name3);
//
//        //substring(A original string is not changed
//        String name = "Harsh And San";
//        System.out.println(name.substring(0,5)); // print Harsh
//        System.out.println(name.substring(6,9));//Print And
//
//        //Array
        int []marks = new int[4];//To store marks of the student
        marks[0]=97;
        marks[1]=95;
        marks[2]=94;
        marks[3]=99;
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);

        //length
//        System.out.println(marks.length);
//
//        //sort
//        Arrays.sort(marks);//Sort in increasing order
//        System.out.println(marks[0]);
//
//        //2D array
//        int[][]arr2D ={{1,2},{4 ,5}};
//        System.out.println(arr2D[0][0]);

        //Casting
        double amount =100.00;
        double finalAmount = amount+18;
        System.out.println(finalAmount);

        int amount1 = 100;
       // int finalAmount1 = amount1 + 18.0;//Error as int size is small as compared with double
        //Explicit Type Casting
        int finalAmount1 = amount1 + (int)18.0;
        System.out.println(finalAmount1);

        //Constants
        final float PI = 3.14F;
       // PI=3.2;//Error as PI is a constant so can not be changed


//        //Operators
//        int a = 1;
//        int b = 5;
//        int sum = a+b;
//        System.out.println(sum);


                //Math Class
//        int num1 =523;
//        int num2 =413;
//        System.out.println(Math.max(num1,num2));
//        System.out.println(Math.min(num1,num2));

//        //Random(return a random value from 0.0 to 1.0)
//        System.out.println(Math.random());
//        //To make it in range 1 to 100 following casting can be done that to in int
//        System.out.println((int)(Math.random()*100));

//        //input
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age :");
//        int yourAge = sc.nextInt();
//        System.out.println(yourAge);
//        System.out.println("Enter your weight:");
//        float weight = sc.nextFloat();
//        System.out.println(weight);
//        System.out.println("Enter your name:");
//        String yourName = sc.next(); // Takes only a token not complete sentence
//        System.out.println(yourName);
//        System.out.println("Enter a sentence");
//        String sent = sc.nextLine();
//        System.out.println(sent);



//        //Switch Statement
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a day number:");
//        int day  = sc.nextInt();
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");break;
//            case 4:
//                System.out.println("Thursday");break;
//            case 5:
//                System.out.println("Friday");break;
//            case 6:
//                System.out.println("Saturday");break;
//            case 7:
//                System.out.println("Sunday");break;
//            default:
//                System.out.println("Enter between 1 to 7");
//        }

        //Loops
        //Same as C++


        //Try Catch in Exceptional Handling
        int []age1 = {52 ,13 ,15};
        try{
            //Check the following Statement whether it generates exception or not
            System.out.println(age1[5]);
        }catch (Exception exception){
            //If an exception is found in the try statement then execute the following
            System.out.println("Index is beyond the size of arr");
        }
        System.out.println("Exception Handling done");
    }
}
