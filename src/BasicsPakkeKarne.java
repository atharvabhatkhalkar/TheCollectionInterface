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

    public static void main(String[] args){
        BasicsPakkeKarne bs1 = new BasicsPakkeKarne(101, "Atharva", 'A');
        BasicsPakkeKarne bs2 = new BasicsPakkeKarne(102, "Ramesh", 'A');
        BasicsPakkeKarne bs3 = new BasicsPakkeKarne(103, "Abhishek Upmanyu", 'F');
        List<BasicsPakkeKarne> objList = new LinkedList<BasicsPakkeKarne>();
        objList.add(bs1);
        objList.add(bs2);
        objList.add(bs3);
        
        for(BasicsPakkeKarne bs:objList){
            System.out.println(bs.rollNo + " " +bs.Name + " " + bs.division);
        }
    }
}


