package com.company;

public class Main
    {
        
        public static void main(String[] args)
            {
                
                String returnValue = getMyName();
                System.out.println(returnValue);
                
                String myFancyName = getMyFancyName("#!#");
                System.out.println(myFancyName);
            }
        
        private static String getMyName()
            {
                String name = "Tony";
                return name;
            }
        
        private static String getMyFancyName(String decoration)
            {
                String fancyName = decoration + "Tony" + decoration;
                return fancyName;
                
            }
    }