package com.itheima.thread.fooddemo13;

/**
 * @author lina @date 2022/5/3010:45
 */
public class desk {

    //定义一个标记,
    // true=有食物=吃货执行
    //false=没有食物=厨师执行
//    public static boolean flag = false;

    private boolean flag;
    //生产总量10个
//    public static int count = 10;
    private int count=10;
    //    锁对象
//    public static final Object lock = new Object();
    private final Object lock = new Object();


    public desk() {
    }

    public desk(boolean flag, int count) {
        this.flag = flag;
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }

    public int getCount() {
        return count;
    }

    public Object getLock() {
        return lock;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "desk{" +
                "flag=" + flag +
                ", count=" + count +
                ", lock=" + lock +
                '}';
    }
}
