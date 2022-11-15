package Methods_HomeWorks;

public class HomeWork_1 {

    /*
the method is a collection of statements that perform the static task, it's useful and avoids duplication.
     */
    public static void main(String[] args) {
        String a = "Murat";
        String b = "Fahrettin";
        String c = "";
        String d = "  Murat ";
        // CharArt ==> It shows us a specified index in a string. It always starts to count 0!!
        System.out.println("CharArt  "+a.charAt(0));
        System.out.println("**********************************************");
        //Concat The concat() method appends add a string to the end of another string.
        System.out.println("Concat  "+a.concat(b));
        System.out.println("**********************************************");
        //contains()	Method is help to find in a sting some letter or letters contain.
        System.out.println("contains  "+a.contains("A"));
        System.out.println("**********************************************");
        //endsWith() It shows us the String which word ends with
        System.out.println("endsWith()  "+a.endsWith("Murat"));
        System.out.println("**********************************************");
        // equals() This method compares two strings is equal or not.
        System.out.println("equals() "+a.equals(b));
        System.out.println( "equals() "+a.equals(a));
        System.out.println("**********************************************");
        //indexOf() The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
        System.out.println("indexOf()  "+a.indexOf("u"));
        System.out.println("**********************************************");
        //isEmpty() This method showing us is String is empty or not
        System.out.println("isEmpty()  "+a.isEmpty());
        System.out.println("isEmpty() "+c.isEmpty());
        System.out.println("**********************************************");
        //lastIndexOf() This method show us Returns the position of the last found occurrence of specified characters in a string
        System.out.println("lastIndexOf  "+a.lastIndexOf("a"));
        System.out.println("**********************************************");
        //length()	  Returns the length of a specified string, It starts to count from 1
        System.out.println("length  "+a.length());
        System.out.println("**********************************************");
        //replace()	 Searches a string for a specified value, and returns a new string where the specified values are replaced
        System.out.println("replace() "+a.replace('a','e'));
        System.out.println("**********************************************");
        //replaceFirst() This method replaces the first occurrence of a substring that matches the given regular expression with the given replacement
        System.out.println("replaceFirst "+a.replaceFirst("Mu", "mu"));
        System.out.println("**********************************************");
        //StartsWith() This method checks whether a string starts with specified characters
        System.out.println("StartsWith()  "+a.startsWith("Mu"));
        System.out.println("**********************************************");
        //substring()  Extracts the characters from a string,    beginning at a specified start position, and through the specified number of character
        System.out.println("substring()  "+a.substring(2,4)); // M=1 U=2 {R=3 A=4} T=5
        System.out.println("**********************************************");
        //toLowerCase()	 This method is converts a string to lower case letters
        System.out.println("toLowerCase()  "+a.toLowerCase());
        System.out.println("**********************************************");
        //toUpperCase()  This method is converts a string to upper case letters
         System.out.println("toUpperCase()  "+a.toUpperCase());
        System.out.println("**********************************************");
        //trim() This method is removes whitespace from both ends of a string
        System.out.println("trim()  "+d);
        System.out.println("trim()  "+d.trim());

















        /*

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


    }
}
