import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//////////////////////// NUMBER 1 //////////////////////////////////
//       for ( int i =1 ; i <=100 ; i++) {
//           if ((i % 5 == 0 ) && (i % 3 == 0)) {
//               System.out.println("Fizz");
//           }
//           else if (i % 5 == 0) {
//               System.out.println("Buzz");
//           }
//           else if (i % 3 == 0) {
//               System.out.println("FizzBuzz");
//           }
//           else {
//               System.out.println(i);
//           }
//       }

//////////////////////// NUMBER 2 //////////////////////////////////

//       String str = "The quick brown fox ";
//        StringBuilder strb = new StringBuilder();
//        strb.append(str);
//        System.out.println("Reversed String is : " + strb.reverse());


//////////////////////// NUMBER 3 //////////////////////////////////

//        System.out.println("Please enter any number:");
//        int num = s.nextInt();
//        int factorial = 1;
//        for ( int i = 1 ; i<=num ; i++){
//            factorial = factorial*i;
//        }
//        System.out.println("The factorial of " + num + " is " + factorial );



//////////////////////// NUMBER 4 //////////////////////////////////

//        System.out.println("Please enter First number:");
//        int num1 = s.nextInt();
//        System.out.println("Please enter Second number:");
//        int num2 = s.nextInt();
//        int result =1;
//        for ( int i = 0 ; i<num2 ; i++){
//           result = result * num1;
//        }
//        System.out.println(num1 + " raised to the power " + num2 + " = " + result);



//////////////////////// NUMBER 5 //////////////////////////////////

//        System.out.print("Enter the number of elements: ");
//        int num = s.nextInt();
//        int evensum = 0;
//        int oddsum = 0;
//        for (int i = 0; i < num; i++) {
//            System.out.print(" number " + (i + 1) + ": ");
//            int num2 = s.nextInt();
//
//            if (num2 % 2 == 0) {
//                evensum = evensum+ num2;
//            } else {
//                oddsum = oddsum + num2;
//            }
//        }
//        System.out.println("Even Sum:" + evensum);
//        System.out.println("Odd Sum" + oddsum);




//////////////////////// NUMBER 6 //////////////////////////////////

//        System.out.println("Please enter a positive integer :");
//        int num = s.nextInt();
//       if (num < 0 ){
//           System.out.println("Not a positive integer") ;
//       }
//
//for ( int i = 2 ; i<= num/2; i++){
//if ((num%i) ==0){
//    System.out.println("Not a prime integer") ;
//    break;
//}
//else {
//    System.out.println("  prime integer") ;
//    break;
//
//}
//
//}


//////////////////////// NUMBER 7 //////////////////////////////////

//        for ( int i = 1 ; i<5 ; i++){
//        System.out.println("Week:" + i);
//            for ( int x= 1 ; x<8 ; x++){
//            System.out.println("   Day" + x);
//            }
//        }


//////////////////////// NUMBER 8 //////////////////////////////////

//        System.out.println("Please enter a word:");
//        String str = s.nextLine();
//int start = 0 ;
//int end = str.length()-1;
//
//while (start<end){
//    if (str.charAt(start) != str.charAt(end)) {
//        System.out.println("Not a palindrome");
//    }
//
//    start++;
//    end++;
//}
//        System.out.println("Yes a palindrome");
///// This calls an outbound exception due to the int i defined , so i made a separate class ///////

//        System.out.println("Please enter a word:");
//        String str = s.nextLine();
//      if (isPalindrome(str)){
//          System.out.println("Palindrome");
//      }
//        else {
//          System.out.println("Not aPalindrome");
//      }
    }
//    public static boolean isPalindrome(String str)
//    {
//        String reverse = "";
//        boolean answer = false;
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reverse = reverse + str.charAt(i);
//        }
//        if (str.equals(reverse)) {
//            answer = true;
//        }
//        return answer;
//    }


}


