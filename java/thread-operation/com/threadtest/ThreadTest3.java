package com.threadtest;
  
import java.util.concurrent.Callable;  
import java.util.concurrent.ExecutionException;  
import java.util.concurrent.FutureTask;  
  
public class ThreadTest3 implements Callable<Integer>  
{  
  
    public static void main(String[] args)  
    {  
        ThreadTest3 ctt = new ThreadTest3();  
        FutureTask<Integer> ft = new FutureTask<>(ctt);  
        for(int i = 0;i < 100;i++)  
        {  
            System.out.println(Thread.currentThread().getName()+" value "+i);
            if(i==20)  
            {  
                new Thread(ft,"return thread value ").start();  
            }  
        }  
        try  
        {  
            System.out.println("child thread value "+ft.get());  
        } catch (InterruptedException e)  
        {  
            e.printStackTrace();  
        } catch (ExecutionException e)  
        {  
            e.printStackTrace();  
        }  
  
    }  
  
    @Override  
    public Integer call() throws Exception  
    {  
        int i = 0;  
        for(;i<100;i++)  
        {  
            System.out.println(Thread.currentThread().getName()+" "+i);  
        }  
        return i;  
    }  
  
}  

