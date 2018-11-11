package com.example.chyesy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toOctalString(n));
        System.out.println(Integer.toHexString(n));

    }
}

















