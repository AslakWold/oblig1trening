package no.oslomet.cs.algdat.Oblig1;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {


        int[] b = {0,0,1,0,0,1,0,1,1,0,0,1,1,1,0,1,0,1,1,0};
        int[] a = {6, 10, 9, 4, 1, 3, 8, 5};

        Oblig1.delsortering(a);
        System.out.println(Arrays.toString(a));



    }
}
