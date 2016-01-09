package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class App 
{
    public static void main( String[] args )
    { List<Integer> rand = new ArrayList<>();
        for (int i = 0; i < 10; i = i + 1) {
            rand.add((int) (Math.random() * ((1000) + 1)));
        }
