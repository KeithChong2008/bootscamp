public class DataType {
    public static void main (String []args){
        //1.Number,Text(Eng)
        //Declaration
        int num;// int is a way to declare a variable
        // from now on, you can only input integer to variable num.
        
        //Assignments
        num = 3; // from right to left 
        
        System.out.println(3);
        System.out.println("3");
        System.out.println(num);

        //2.String
        String str = "Hello";
        System.out.println(str);

        //Reassign
        num = 10;

        //3.double
        double f = 1.03;
        double f2 = 5;

        System.out.println(f);
        System.out.println(f2);

        //4.byte, long,short

        byte byte1 = -128;
        byte byte2 = 127;
        long long1 = 222222222;// -2^63 -> 2^63-1
        short short1 = 32627;
        short short2 = -32768;
        
        System.out.println(byte1);
        System.out.println(byte2);
        System.out.println(long1);
        System.out.println(short1);
        System.out.println(short2);
        
        //5.float
        float f3 = 1.01f; //declare float needs to add f into end
        System.out.println(f3);

        //6.char, and it should be assigned by single quote ''
        char gender1 = 'M';
        char gender2 = 'F';
        char space = ' '; // char empty is error

        //7.boolean
        boolean isMale = true;
        boolean isSalaryGreaterThan200000 = false;
        boolean isVaild = false;

        //8.String+operation
        String str1 = "Hello ";
        String str2 = "World!";
        String str3 = str1+str2;
        String str4 = "abc"+13;//convert true to String
        String str5 = " "+ true;
        String str6 = "" +13+13;

        System.out.println(str1+str2);
        System.out.println(str1+num);
        System.out.println(str1 + gender1 + str2);

        //Operators
        int a = 1+3;//4
        int b = 1-3;//-2
        int c = 1*3;//3
        int d = 10/3; //3
        int e = 10%3; //1 
        
        System.out.println(str4);
    

    }
}
