package ru.khripunov.laba3;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedList;

@Component
public class Compare {
    private ArrayList<Integer> aList;
    private LinkedList<Integer> lList;

    public Compare() {
        this.aList =new ArrayList<Integer>();
        this.lList =new LinkedList<Integer>();
    }


    public double timeAddLastA()
    {
        double start = System.nanoTime();
        for (int i = 0; i < 80000; i++)
        {
            aList.add(i);
        }
        double finish = System.nanoTime();
        double result = (finish - start)/1000000;
        return result;
    }
    public double timeAddA()
    {
        double start = System.nanoTime();
        for (int i = 0; i < 80000; i++)
        {
            aList.add(3000, i);
        }
        double finish = System.nanoTime();
        double result = (finish - start)/1000000;
        return result;
    }
    public double timeDeleteA()
    {
        double start = System.nanoTime();
        int edge = aList.size() - 80000;
        for (int i = aList.size() - 1; i >= edge; i--)
        {
            aList.remove(3000);
        }
        double finish = System.nanoTime();
        double result = (finish - start)/1000000;
        return result;
    }
    public double timeDeleteLastA()
    {
        double start = System.nanoTime();
        int edge = aList.size() - 80000;
        for (int i = aList.size() - 1; i >= edge; i--)
        {
            aList.remove(i);
        }
        double finish = System.nanoTime();
        double result = (finish - start)/1000000;
        return result;
    }
    public double timeGetA()
    {
        double start = System.nanoTime();
        for (int i = 0; i < 80000; i++)
        {
            aList.get(i);
        }
        double finish = System.nanoTime();
        double result = (finish - start)/1000000;
        return result;
    }

    public double timeAddLastL()
    {
        double start = System.nanoTime();
        for (int i = 0; i < 80000; i++)
        {
            lList.add(i);
        }
        double finish = System.nanoTime();
        double result = (finish - start)/1000000;
        return  result;
    }
    public double timeAddL()
    {
        double start = System.nanoTime();
        for (int i = 0; i < 80000; i++)
        {
            lList.add(3000, i);
        }
        double finish = System.nanoTime();
        double result = (finish - start)/1000000;
        return result;
    }
    public double timeDeleteL()
    {
        double start = System.nanoTime();
        int edge = lList.size() - 80000;
        for (int i = lList.size() - 1; i >= edge; i--)
        {
            lList.remove(3000);
        }
        double finish = System.nanoTime();
        double result = (finish - start)/1000000;
        return result;
    }
    public double timeDeleteLastL()
    {
        double start = System.nanoTime();
        int edge = lList.size() - 80000;
        for (int i = lList.size() - 1; i >= edge; i--)
        {
            lList.remove(i);
        }
        double finish = System.nanoTime();
        double result = (finish - start)/1000000;
        return result;
    }
    public  double timeGetL()
    {
        double start = System.nanoTime();
        for (int i = 0; i < 80000; i++)
        {
            lList.get(i);
        }
        double finish = System.nanoTime();
        double result = (finish - start)/1000000;
        return result;
    }
    public ArrayList<Integer> getaList()
    {
        return aList;
    }
    public void setaList(ArrayList<Integer> a)
    {
        this.aList=a;
    }


    public LinkedList<Integer> getlList() {
        return lList;
    }

    public void setlList(LinkedList<Integer> lList) {
        this.lList = lList;
    }
}
