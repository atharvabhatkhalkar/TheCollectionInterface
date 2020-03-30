/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_java.programs;
import java.lang.*;
import java.util.*;
import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;
/**
 *
 * @author Atharva
 */
public class SIMPLE_JAVAPROGRAMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.printf("Please enter the string\n");
        /*Scanner sobj = new Scanner(System.in);
        duplicateRemove(sobj.nextLine());
        List<String> objOfList = new LinkedList<String>();
        objOfList.add("pikok");
        objOfList.add("habhoha");
        objOfList.add("yellow");
        
        Iterator<String> itr = objOfList.iterator();
        
        for(int i=0; i < objOfList.size();i++){
            System.out.printf("%s ", objOfList.get(i));
        }*/
        
        //String[] MahString = {"HelloWorld"};
        Scanner sobj = new Scanner(System.in);
        String MahString = sobj.nextLine();
        
        char[] charArray = MahString.toCharArray();
        
        char temp;
        if(charArray.length == 0){
            System.out.println("Fuck you asshole");
        }
        
        for(int i=0,j=charArray.length-1; i< charArray.length ;i++,j--){
        temp = charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
    }
        for(int i=0;i< charArray.length;i++){
            System.out.print(charArray[i]);
        }
        
        String MahString1 = charArray.toString();
        
        
        //for(int i=0; i<MahString.length();i++){
            System.out.println(MahString1);
       
        
        
    }
    
    static void duplicateRemove(String str){
        String num1 = str; 
        //String num1="Hellobhaukadamamh";
        char[] ch=new char[num1.length()];
        for(int i=0;i<num1.length();i++){
        ch[i]=num1.charAt(i);
        }
        for(char c:ch){
        System.out.print(c);
        }
        System.out.println("");
        for(int i=0;i<num1.length();i++){
            for(int j=i+1;j<num1.length();j++){
                if(ch[i]==ch[j]){
                    ch[j]=0;
                }
            }
        }
        for(char c:ch){
        System.out.print(c);
        }
        System.out.println("");
    }
}
