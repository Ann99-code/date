package shujujiegou.demo1;

/**
 * @author lina @date 2022/7/2915:45
 */
public class dayinerjinzhi {
    public static void main(String[] args) {
//        int型是32位的，long是64位的
        int num=5245624;
         print(num);
        System.out.println();
         print(Integer.MAX_VALUE);
        System.out.println();
        System.out.println(Integer.MAX_VALUE);
         }
         public static void print(int num){
             for (int i = 31; i >=0 ; i--) {
//                 num和i进行与运算（就是1和1相遇才会是1，0与0相遇是0，0与1相遇还是0），因为num是一个32位的数
//                 当他和i进行与运算的时候，每个位置上的数都不会改变，当他为0时打印0，为1时打印1，循环32次，就把
//                 32位数字打印出来了。
                 System.out.print((num&(1<<i))==0?"0":"1");
//                 System.out.println(Integer.MAX_VALUE);
             }
    }
}
