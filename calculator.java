import java.util.Scanner;
public class calculator {
    public void calcul(char ct){
        int num1=9,num2=8;
        switch (ct) {
            case '+':
            
            int sum1=num1+num2;
            System.out.println(sum1);
                break;
            case '-':
            int minus=num1-num2;
            System.out.println(minus);
            break;
            case '/':
            double result=num1/num2;
            System.out.println(result);
            break;
            case 'x':
            double mult=num1*num2;
            System.out.println(mult);
            break;
            default:
                break;
        }
    }
    public static void main(String[] args) {
        calculator obj= new calculator();
        System.out.println("Enter the Command for calculator");
        Scanner obj2=new Scanner(System.in);
        char cmd=obj2.next().charAt(0);
        // obj.calcul('x');
        obj.calcul(cmd);

    }
}
