package demo1;

public class Outer {
    int num = 10;

    public class Inner{

        int num = 20;

        public void methodInner(){
            int num  = 30;
            System.out.println(num);//局部变量
            System.out.println(this.num);//内部类成员变量
            System.out.println(Outer.this.num);//外部类成员变量 Outer
        }

    }
}
