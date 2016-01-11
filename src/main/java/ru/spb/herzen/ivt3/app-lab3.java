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
        
      ArrayList<Integer> newInts = new ArrayList<>();
            for (int x: ints) {
                if(x % 2 == 0) {
                    newInts.add(x);
                }
            }
            Collections.sort(newInts);
            for(int y: newInts) {
                System.out.println("One parameter: " +y);
                NumberCrusher multiple = (int num) -> num*2;
                System.out.println(multiple.multiply(y));
            }
        });
        myThread.start();

        if(myThread.isAlive()) {
            try {
                myThread.join();
            } catch(InterruptedException e) {
                System.out.print(e.getMessage());
            }
        }
        System.out.println("Главный поток завершён...");
    }
    @FunctionalInterface
    public interface NumberCrusher {
        int multiply(int num);
    }
}
