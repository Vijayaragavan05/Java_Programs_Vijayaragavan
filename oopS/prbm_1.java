package oopS;

import java.util.Scanner;

/*1.Write a Java program to Create a class named Player with the following member variables/attributes

Datatype  Variablename
String		Name
String		Country
String		Skill

Create another class named Main and write a main method to test the above class. */

class player{
    public String name;
    public String Country;
    public String Skill;
}
public class prbm_1 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    player ob = new player();
    ob.name=scan.nextLine();
    ob.Country=scan.nextLine();
    ob.Skill=scan.nextLine();
    System.out.println("Name: "+ob.name +" Age : "+ob.Country+" Skill: "+ob.Skill);
    }
}
