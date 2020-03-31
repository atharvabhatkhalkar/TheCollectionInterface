/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Atharva
 */
import javax.swing.*;
import java.util.*;
public class BasicsPakkeKarne{
    int rollNo;
    String Name;
    char division;
    
    public BasicsPakkeKarne(int rollNo,String Name,char division) {
    
        this.rollNo=rollNo;
        this.Name=Name;
        this.division=division;
    }

    public static void mapMethod(){
        Map<Integer,String> mymap = new HashMap<Integer,String>();
        mymap.put(101,"Bassi");
        mymap.put(102,"Chinki");
        mymap.put(103, "Munna");
            
        
        /**@OLD WAY
        Set setObj = mymap.entrySet();
        Iterator itr = setObj.iterator();
        Map.Entry entry = (Map.Entry)itr.next();
        System.out.println(entry.getKey() + " "+ entry.getValue());
        **/
        /**@NEW WAY**/
        for(Map.Entry m : mymap.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());   
        }
        
    }
    
    public static void main(String[] args){
        Scanner sobj = new Scanner(System.in);
        sobj.nextLine();
        BasicsPakkeKarne bs1 = new BasicsPakkeKarne(101, "Atharva", 'A');
        BasicsPakkeKarne bs4 = new BasicsPakkeKarne(104, "Apoorva", 'C');
        BasicsPakkeKarne bs2 = new BasicsPakkeKarne(102, "Ramesh", 'A');
        BasicsPakkeKarne bs3 = new BasicsPakkeKarne(103, "Abhishek Upmanyu", 'F');
        List<BasicsPakkeKarne> objList = new LinkedList<BasicsPakkeKarne>();
        objList.add(bs1);
        objList.add(bs2);
        objList.add(bs3);
        objList.add(bs4);
        
        for(BasicsPakkeKarne bs:objList){
            System.out.println(bs.rollNo + " " +bs.Name + " " + bs.division);
        }
        mapMethod();
    }
}


