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
        return reverse2.replace("h", "1");
    }

    public static String convertDate(String m){
        String E = "";
        E += m.substring(3,6);
        E += m.substring(0,3);
        E += m.substring(6,10);
        return E;
    }

    public static String convertDate2(String m){

        String NewDate =  " ";

        int a = m.indexOf("/");
        int b = m.lastIndexOf("/");

        String month = m.substring(0,a);
        String day = m.substring(a+1,b);

        int mlength = month.length();
        int dlength = day.length();

        if(dlength == 1){
            NewDate += "0" + day;
        }
        else{
            NewDate += day;
        }

        NewDate += "-";

        if(mlength == 1){
            NewDate += "0" + month;
        }
        else{
            NewDate += month;
        }

        NewDate += "-2014";


        return NewDate;

    }

    public static boolean startsWith(String s, String P){
        int l = s.length();
        for(int i = 0; i<=l; i++){
            String t = s.substring(0,i);
            if(t.equalsIgnoreCase(P)){
                return true;
            }
        }
        return false;
    }

    public static boolean endsWith(String s, String suf){
        int l = s.length();
        for(int i = 0; i<=l; i++){
            String t = s.substring(i,l);
            if(t.equalsIgnoreCase(suf)){
                return true;
            }
        }
        return false;
    }

    public static String removeTag(String s, String t){
        String t1 = "<" + t + ">";
        String t2 = "</" + t + ">";
        if(s.contains(t1) && s.contains(t2)) {
            if(s.indexOf(t1) < s.indexOf(t2)){
                int L1 = t1.length();
                int ti1 = s.indexOf(t1);
                int ti2 = s.indexOf(t2);
                return s.substring(ti1 + L1, ti2);
            }
            else return s;
        }
        else return s;
    }



    public static void main(String[] args) {
        System.out.println(scroll("Hello World"));
        System.out.println(scroll("happy"));
        System.out.println(scroll("h"));

        System.out.println();

        System.out.println(convertName(" Reubenstein, Lori Renee "));
        System.out.println(convertName("Biden,Joe"));
        System.out.println(convertName("the Clown, Bozo"));

        System.out.println();

        System.out.println(negative("0010111001"));
        System.out.println(negative("11111111"));

        System.out.println("04/20/2014 becomes " + convertDate("04/20/2014"));

        System.out.println();

        System.out.println("04/20/2014 becomes" + convertDate2("04/20/2014"));
        System.out.println("4/20/2014 becomes" + convertDate2("4/20/2014"));
        System.out.println("04/2/2014 becomes" + convertDate2("04/2/2014"));
        System.out.println("4/2/2014 becomes" + convertDate2("4/2/2014"));

        System.out.println();

        System.out.println("\nstartsWith");
        System.out.println(startsWith("architecture", "arch"));
        System.out.println(startsWith("architecture", "a"));
        System.out.println(startsWith("arch", "architecture"));
        System.out.println(startsWith("architecture", "rch"));
        System.out.println(startsWith("architecture", "architecture"));

        System.out.println("\nendsWith");
        System.out.println(endsWith("astronomy", "nomy"));
        System.out.println(endsWith("astronomy", "y"));
        System.out.println(endsWith("astronomy", "nom"));
        System.out.println(endsWith("nomy", "astronomy"));
        System.out.println(endsWith("astronomy", "astronomy"));

        System.out.println("\nremoveTag");
        System.out.println(removeTag("<b>Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World</b>", "head"));
        System.out.println(removeTag("Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World", "b"));

        System.out.println(removeTag("</img>Hello World<img>", "img"));
        System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
        System.out.println(removeTag("<title>Hello World</title> Happy Birthday",
                "title"));
        System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));


    }
}


