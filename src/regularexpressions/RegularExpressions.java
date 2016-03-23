package regularexpressions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegularExpressions {

    
    public static void main(String[] args) throws FileNotFoundException{
        
        String[] s = new String[15];
        Scanner ins = new Scanner(new File ("Text.txt"));
        int i = 0;
        System.out.println("Проверяемый текст:\n");
        
        while(ins.hasNext()){
        s[i] = ins.nextLine();
        System.out.println(s[i]);
        i++;
        }
        System.out.println("\n\n");
        
        int a = 0, b = 0, c = 0;
        while (a < i){
          c = Match(s[a]);
          b += c;
          a++;
          System.out.println("Число совпадений в " + a + " строке: " + c);
          c = 0;
        }
        System.out.println("\n\nОбщее число совпадений в тексте: " + b);   
    }
    
    
    public static int Match(String str){ 
        boolean find;
     
        Pattern pat = Pattern.compile("[a-z]{1}[a-z0-9]+[a-z]{1}\\s\\s\\s[a-z]{1}[a-z0-9]+[a-z]{1}");  
        Matcher mat = pat.matcher(str);
       
        find = mat.find();
        int d = 0;
        
        while (find) {
            d++;
            find = mat.find();
        }
        return d;  
    }  
    
}
