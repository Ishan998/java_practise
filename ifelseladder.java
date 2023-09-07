import java.util.Scanner;
 class ifelseLadder {
    public int calcif(int num1,int num2,char cmd)
    {
        if (cmd=='+'){
            int sum=num1+num2;
            // System.out.println(sum);
            return sum;

        }
        else if (cmd=='-') {
            int sub=num1-num2;
            return sub;

        }
        else if(cmd=='x'){
            int mul=num1*num2;
            return mul;
        }
        else if(cmd=='/'){
            int div=num1/num2;
            return div;
        }
        else{
            return 0;
        }

    }
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the number1:");
        int in1=obj.nextInt();
        System.out.print("Enter the number2:");
        int in2=obj.nextInt();
        System.out.println("enter the operation to be performed");
        char cd=obj.next().charAt(0);

        ifelseLadder ob=new ifelseLadder();
        int response=ob.calcif(in1, in2, cd);
        System.out.println(response);

    }
}
