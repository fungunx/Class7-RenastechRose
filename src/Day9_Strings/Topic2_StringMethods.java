package Day9_Strings;

import java.sql.SQLOutput;

public class Topic2_StringMethods {
    public static void main(String[] args) {

        String str = "Something";

        /*

Method	              Description                                                     	Return Type
charAt()	          Returns the character at the specified index (position)	        char
concat()	          Appends a string to the end of another string	                    String
contains()	          Checks whether a string contains a sequence of characters	        boolean
endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
equals()	          Compares two strings. Returns true if the strings are equal,
                      and false if not	                                                boolean
equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
indexOf()	          Returns the position of the first found occurrence
                      of specified characters in a string	                            int
isEmpty()	          Checks whether a string is empty or not	                        boolean
lastIndexOf()	      Returns the position of the last found occurrence of
                      specified characters in a string	                                int
length()	          Returns the length of a specified string	                        int
replace()	          Searches a string for a specified value, and returns
                      a new string where the specified values are replaced	            String
replaceFirst()	      Replaces the first occurrence of a substring that matches the
                      given regular expression with the given replacement	            String

startsWith()	      Checks whether a string starts with specified characters	        boolean
substring()	          Extracts the characters from a string,
                      beginning at a specified start position,
                      and through the specified number of character	                    String
toLowerCase()	      Converts a string to lower case letters	                        String
toUpperCase()	      Converts a string to upper case letters	                        String
trim()	              Removes whitespace from both ends of a string	                    String

     */

        //charAt()	          Returns the character at the specified index (position)	        char
        String str1 = "Tanya"; // T ==> 0,  a==> 1, n==>2, y==> 3, a==>4
        char ch = str1.charAt(0);
        System.out.println("the char at the position 0 (or Index 0)"+ch);
        System.out.println("the char at the position 2 (or Index 2)"+ str1.charAt(2));
        System.out.println("the char at the position 3 (or Index 3)"+ str1.charAt(4));

        // concat()	          Appends a string to the end of another string	                    String
        String FirstName = "Ziya";
        String LastName = "Yilmaz";
        String FullName = FirstName.concat(" "+LastName);
        System.out.println("The Full name is:  "+FullName);

        //contains()	          Checks whether a string contains a sequence of characters	        boolean

        String str3 = "This is a test";
        boolean com = str3.contains("e");
        boolean com2 = str3.contains("r");
        boolean com3 = str3.contains("5");
        System.out.println("Contains the test: " +com3 + com + com2);

        //endsWith()	          Checks whether a string ends with the specified character(s)	    bool
        String str4 = "This is String";
        boolean ends = str4.endsWith("String");
        System.out.println("Does String end with ing:  "+ends);

        // equals()	          Compares two strings. Returns true if the strings are equal,
        //                      and false if not
        String str5 = "Hello";
        String str6 = "Hello";
        boolean eq = str5.equals(str6);
        System.out.println("Are they equal"  +eq);
        String str7 = new String("Hello");
        boolean eq1 = str5.equals(str7);
        System.out.println("Are they Equal in the new keyword as well:  "+eq1);

        // equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
        String str8 = "AnDy4";
        String str9 = "andy4";
        boolean eq3 = str8.equals(str9);
        System.out.println("Are they Equal:  "+eq3);
        boolean eq4 = str8.equalsIgnoreCase(str9);
        System.out.println("Are they Equal when we ignore case?"   +eq4);

       // indexOf()	          Returns the position of the first found occurrence
        // 0of specified characters in a string	                            int
        String str10 = "eloise";
        Integer pos = str10.indexOf("o");
        System.out.println("The index of e on the sting: " +pos);

        //lastIndexOf()	      Returns the position of the last found occurrence of
        //specified characters in a string	                                int
        String str11 = "eloisetytytytytytyty";
        Integer pos1 = str11.lastIndexOf("e");
        System.out.println("the last index of e: "+pos1);

        //isEmpty()	          Checks whether a string is empty or not	                        boolean
        String str12 = "";
        System.out.println("is string is Empty"+str12.isEmpty());

        //length()	          Returns the length of a specified string	                        int
        String str13 = "sdadsadd32423e$#@$@";
        System.out.println("the Lenght of the String is: "+str13.length());





    }
}
