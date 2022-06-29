package com.itheima.thread.fooddemo13;

/**
 * @author lina @date 2022/5/3010:44
 */
//吃货线程


public class foodie extends Thread {
    private desk desk;
    public foodie(desk desk) {
        this.desk = desk;
    }

    public foodie(String name) {
        super(name);
    }

    @Override
    public void run() {
            /*消费者步骤:
            1，判断桌子上是否有汉堡包。
            2，如果没有就等待。
            3，如果有就开吃
            4，吃完之后，桌子上的汉堡包就没有了
            叫醒等待的生产者继续生产
            汉堡包的总数量减一*/
//        首先是循环，因为吃货不止吃一次
        while (true) {
            //同步代码块的生产者和消费者的锁对象必须一致，所以设置为final变量并且在desk类中创建
            synchronized (desk.getLock()) {
                if (desk.getCount() == 0) {
                    break;
                } else {
                    if (desk.isFlag()) {
//                        有就吃
                        System.out.println("吃货在吃好吃的");
                        desk.setFlag(false);
//                        吃完唤醒
                        desk.getLock().notifyAll();
                        desk.setCount(desk.getCount()-1);
                    } else {
//                          没有就等待
//                            使用什么对象当作锁，那么就必须用这个对象去调用等待和唤醒的方法
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
