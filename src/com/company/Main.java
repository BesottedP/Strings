package com.company;

public class Main {

    public static String scroll(String s){
        String result = "";
        result += s.substring(1, s.length());
        result += s.substring(0,1);
        return result;
    }

    public static String convertName(String name){
        String NewName = "";
        int w = name.indexOf(",");
        NewName += name.substring(w+1, name.length()).trim();
        NewName += " ";
        NewName += name.substring(0, w).trim();
        return NewName;
    }

    public static String negative(String num){
        String reverse1 = num.replace("0", "h");
        String reverse2 = reverse1.replace("1", "0");
        String reverse3 = reverse2.replace("h", "1");
        return reverse3;
    }

    public static String convertDate(String m){
        String E = "";
        E += m.substring(3,6);
        E += m.substring(0,3);
        E += m.substring(6,10);
        return E;
    }

//    public static String convertDate2(String m){
//        int a = m.indexOf("/");
//        int b = m.lastIndexOf("/");
//        String c = m.substring(a,b+1);
//
//        if(c.length() == 1){
//            String d = "0" + c.substring(0, 1);
//            return d;
//        }
//        else{
//            return "broke";
//        }
//    }

    public static boolean startsWith(String s, String P)
    public static void main(String[] args) {
        System.out.println(scroll("Hello World"));
        System.out.println(scroll("happy"));
        System.out.println(scroll("h"));

        System.out.println("");

        System.out.println(convertName(" Reubenstein, Lori Renee "));
        System.out.println(convertName("Biden,Joe"));
        System.out.println(convertName("the Clown, Bozo"));

        System.out.println("");

        System.out.println(negative("0010111001"));
        System.out.println(negative("11111111"));

        System.out.println("04/20/2014 becomes " + convertDate("04/20/2014"));

        System.out.println("");

//        System.out.println("04/2/2014 becomes" + convertDate2("04/2/2014"));
    }
}
