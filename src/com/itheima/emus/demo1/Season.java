package com.itheima.emus.demo1;

/**
 * @author lina @date 2022/8/1010:24
 */
public enum Season {
    SPRING("春"){
        @Override
        public void show() {
            System.out.println("春天到了");
        }
    },
    SUMMER("夏"){
        @Override
        public void show() {
            System.out.println("夏天到了");
        }
    },
    AUTUMN("秋"){
        @Override
    public void show() {
        System.out.println("秋天到了");
    }},
    WINTER("冬"){
        @Override
        public void show() {
            System.out.println("冬天到了");
        }
    };
    private String name;


/*    Season() {

    }*/

    Season(String name) {
        this.name = name;
    }

//    最后一个演示
//    定义一个抽象方法
    public abstract void show();
}
