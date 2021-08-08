package javapractice;

public class Exception {

    public static void main(String[] args) {

//        ******DEFAULT THROW & OUR CATCH*****
//        try {
//            System.out.println(3 / 0);
//            System.out.println("In Try Block");
//        } catch (NullPointerException e) {
//            System.out.println("Exception:" + e.getMessage());
//        } catch (ArithmeticException e) {
//            System.out.println("Exception:" + e.getMessage());
//        }
//        System.out.println("Hello");
//    }

//        *******OUR THROW & DEFAULT CATCH******
//        int bal = 5000;
//        int withdrawamount = 6000;
//        if (bal < withdrawamount) {
//            throw new ArithmeticException("Insufficient Bal.");
//        }
//        bal = bal - withdrawamount;
//        System.out.println("Transaction Success");
//        System.out.println("Program Continue...");
//    }

//        *****OUR THROW & OUR CATCH*******
        int bal = 5000;
        int withdrawamount = 6000;

        try {
            if (bal < withdrawamount) {
                throw new ArithmeticException("Insifficient Bal.");
            } else {
                bal = bal - withdrawamount;
                System.out.println("Transaction Sucess");
                System.out.println("Program Continue...");
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception:" + e.getMessage());
        }
        System.out.println("Program continues........");
    }
}