# API
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringdemo;

/**
 *
 * @author Sorath
 */

/**
 * This String Api is used for counting the words in the sentence.
 * In this Api users can give the sentence and then it tells how many
 * words the sentence have.
 * @author Sorath
 */
public class StringDemo
/**
 * it takes only the string and return the integer 
 * value to count the words in the sentence.
 */
{
    static int i,c=0,res;
    /**
     * use the wordcount method 
     * to count the words in the sentence.
     * @param s
     * @return 
     */
    static int wordcount(String s)
    {
        char ch[]= new char[s.length()];      //in string especially we have to mention the () after length
        for(i=0;i<s.length();i++)
        {
            ch[i]= s.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
            c++;
        }
        return c;
    }
    
    public static void main (String args[])
    {
        res=StringDemo.wordcount("My name is Sorath");
        //string is always passed in double quotes
        
        System.out.println("The number of words in the String are :  "+res);
    }
}
