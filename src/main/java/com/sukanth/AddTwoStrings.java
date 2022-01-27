package com.sukanth;
import org.junit.Assert;
public class AddTwoStrings {
    public static void main(String[] args) {
        String testCaseOne = addStrings("123456789012345678901", "12345678");
        Assert.assertEquals("123456789012358024579",testCaseOne);

        String testCaseTwo = addStrings("123", "11");
        Assert.assertEquals("134",testCaseTwo);
    }

    private static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int carry =0;

        int pointer1 = num1.length() -1 ;
        int pointer2 = num2.length() -1 ;

        while (pointer1 >=0 ||pointer2>=0){
            int x = pointer1>=0?num1.charAt(pointer1) - '0' :0;
            int y = pointer2>=0?num2.charAt(pointer2) - '0' :0;
            int value = (x+y+carry) %10;
            carry = (x+y+carry) /10;
            result.append(value);
            pointer1--;
            pointer2--;
        }
        if(carry !=0){
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
