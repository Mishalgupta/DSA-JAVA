package JavaBasicPrograms;

public class CommandLine {

    public static void main(String[] args) {
        if(args.length==2) {
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int sum=a+b;
            System.out.println("Sum of"+a+"and"+b+"="+sum);
        }
        else {
            System.out.println("Invalid argument length");
        }

    }

}
