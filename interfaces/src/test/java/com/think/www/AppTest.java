package com.think.www;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.concurrent.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    ExecutorService executorService = Executors.newFixedThreadPool(10);
    @Test
    public void testFuture() throws Exception{



        FutureTask<Integer> integerFutureTask = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 10;
            }
        });

        executorService.submit(integerFutureTask);



        Integer integer = integerFutureTask.get();


        System.out.println(integer);


    }


    @Test
    public void test() throws Exception{

        int count = 10;

        final CountDownLatch latch = new CountDownLatch(count);



        for (int i = 0; i < count; i++) {

            executorService.execute(new MyRunnable1(latch, i));

        }



        latch.await();

        Thread.sleep(10000);
        System.err.println("等待线程被唤醒！");

        executorService.shutdown();


    }

    class MyRunnable1 implements Runnable {



        CountDownLatch latch = null;

        int i;



        public MyRunnable1(CountDownLatch latch, int i) {

            this.latch = latch;

            this.i = i;

        }



        @Override

        public void run() {

            System.err.println("线程" + i +"完成了操作...");

            try {

                Thread.currentThread();

                Thread.sleep(4000);

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

            latch.countDown();

            System.out.println("线程"+i+"请求发送");

        }



    }



}
