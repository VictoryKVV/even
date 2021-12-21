package ru.victory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> listMain = randomList(20);
        System.out.println(listMain);

        ArrayList<Integer> evenNums = new ArrayList<>();
        ArrayList<Integer> oddNums = new ArrayList<>();
        splitLists(listMain, evenNums, oddNums);
        System.out.println(evenNums);
        System.out.println(oddNums);

        Collections.sort(evenNums);
        Collections.sort(oddNums);

        System.out.println(evenNums);
        System.out.println(oddNums);
    }

    public static ArrayList<Integer> randomList (int size){
        ArrayList<Integer> list = new ArrayList<Integer>(size);
        Random rand = new Random();
        for (int i = 0; i < size; i++){
            list.add(rand.nextInt(0, 50));
        }
        return list;
    }

    public static void splitLists (ArrayList<Integer> listMain, ArrayList<Integer> evenNums, ArrayList<Integer> oddNums){
        for (int i=0; i < listMain.size(); i++){
            if (listMain.get(i) %2 == 0)
                evenNums.add(listMain.get(i));
            else
                oddNums.add(listMain.get(i));
        }
    }
}
