package July.ex_13072024;

public class Lab024 {
    public static void main(String[] args) {
        int a=20;
        int b=34;
        System.out.println(a+b);
        //o/p  ->54

        String s1="Supriya";
        String s2="Maharana";
        System.out.println(s1+s2);
        //o/p  ->supriyamaharana

        String s3="Amit";
        int x=99;
        int y=100;

        System.out.println(x+y+s3);
        //o/p ->99+100+Amit = 199Amit
        System.out.println(s3+x+y);
        //o/p ->Amit+99+100  ==Amit99100
        System.out.println(x+s3+y);
        //o/p ->99+Amit+100 =99AMit100

        System.out.println(x+y+s3+y+s3+x+y);
        //o/p  ->99+100+Amit+100+Amit+99+100 =199Amit100Amit99100
    }
}
