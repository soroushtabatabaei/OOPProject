package com.company;

import java.util.Scanner;

public class Scan {
    Scanner Ms = new Scanner(System.in);
    void Scanner(Circuit circuit )
    {
        String Line;
        String [] Lines;
        Line = Ms.nextLine();
        Lines = Line.split("  ",-1);
    }
    Node ResistorScan(String[] Lines)
    {
        Node ModelNode= new Node();
        ModelNode.name= Lines[0];
    }
}
