package com.itheima.thread.fooddemo13;

/**
 * @author lina @date 2022/5/3010:45
 */
//厨师线程
public class cooker extends Thread {
    private desk desk;
    public cooker(desk desk) {
        this.desk = desk;
    }

    public cooker(String name) {
        super(name);
    }

    @Override
    public void run() {
                /*生产者步骤:
                1,判断桌子上是否有汉堡包
                如果有就等待，如果没有才生产。
                2,把汉堡包放在桌子上。
                3，叫醒等待的消费者开吃。
                 */
        while (true) {
            synchronized (desk.getLock()) {
                if (desk.getCount() == 0) {
                    break;
                } else {
                    if (!desk.isFlag()) {
//                        如果桌子上没有食物，就生产一个,放在桌上，叫醒消费者开吃
                        desk.getLock().notifyAll();
//                        desk.count++;
                        System.out.println("厨师生产了一个食物");
                        desk.setFlag(true);
                        desk.getLock().notifyAll();
                    } else {
//                        如果桌子上已经有了食物，就等待
                        try {
                            desk.getLock().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }



    }
}
