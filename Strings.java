package JavaBasics;

import java.util.Scanner;

public class Strings {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String name="Pratik";
            System.out.println("my name is "+name);
            System.out.println("lenght="+name.length());
            System.out.println("upper case="+name.toUpperCase());
            System.out.println("lower case="+name.toLowerCase());
            String str="      pratik annaso patil      ";
            System.out.println(str.trim());
            System.out.println("substring="+name.substring(3));
            System.out.println("substring="+name.substring(2,6));
            System.out.println("replace="+name.replace('P','k'));
            System.out.println("start="+name.startsWith("Pr"));
            System.out.println("end="+name.endsWith("ti"));
            System.out.println("char at="+name.charAt(3));
            System.out.println("index at="+name.indexOf("ti"));
            System.out.println("index at="+name.indexOf("r",1));
            System.out.println("last index="+name.lastIndexOf('r',0));
            System.out.println("equal="+name.equals("Pratik"));
            System.out.println("equal="+name.equalsIgnoreCase("pratik"));

        }
    }


