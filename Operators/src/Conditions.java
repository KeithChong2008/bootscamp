public class Conditions {
    public static void main(String[] args) {
        //if,else,else if
        int i =10;
        if (i>9 /*event*/ ){ // asking if i>9, if yes,executive the block of codes
            System.out.println("i = " + i);// i =10 
        }
        //flow control: if-else
        if (i<8){// Not fulfill
            System.out.println("i is smaller than 8 " );
        } else{
           System.out.println("i is larger than 8 " );
        }

        //else-if
        if (i>12){
            System.out.println("i is larger than 12 " );
        }else if (i<=12 && i>0){
            System.out.println("i is smaller than 12 and i is larger than 0 " );
        }else{
            System.out.println("i is smaller than 12 " );
        }
        int a =2;
        int b =5;
        int box = 0;
        if(a>b){
            box = 10;
        }else{
            box = 19;
        } //box = 19
        int number =12;
        if(number% 2 ==1){ //checking if number is an odd number
            //do someting here
            System.out.println("number is a odd number");
        }else if (number% 2 ==0){ //checking if number is an even number
            System.out.println("number is a even number");
        }

        //String
        String str ="Monday";
        if (str.equals( "Monday")){
            System.out.println("Today is Monday");
        }
        if (str.charAt(4)=='d'){ // false, charAt(4)-> 'a'
            System.out.println("Yes");
        }
        if(str.length() > 10){//false
            System.out.println("String Length is larger than 10");
        }        
        if(str.equals("Monday")||str.charAt(4)=='d' ||str.length() > 10 ){ //Quiz Tips
            System.out.println("What is the result now? ");
        }

        int score =89;
        char grade = ' ';
        if(score >= 90){ //false
            grade ='A';//Not executed
        } else if (score >=80){//true
            grade ='B';//executed
        }else if (score >=70){// No checked.
            grade = 'C';
        }else if (score >=60){
            grade = 'D';
        }else {
            grade ='F';
        }
        int age = 65;
        boolean isElderly= age>= 65;
        if(isElderly){// equal if(age == 65)
            System.out.println("Yes do something here");
        } 
          
        //switch
        //Simple Version
        int dayofWeek = 1;
        String dayName = "";
        switch (dayofWeek)/*events */{// check if the value equals to the following cases
            case 1:
                dayName = "Monday";
                break;//exit
            case 2:
                dayName = "Tuesday";
                break;//exit
            case 3:
                dayName = "Wednesday";
                break;//exit
            case 4:
                dayName = "Thursaday";
                break;//exit
            case 5:
                dayName = "Friday";
                break;//exit
            case 6:
                dayName = "Saturday";
                break;//exit
            case 7:
                dayName = "Sunday";
                
        } System.out.println(dayName);
        char grades = 'F';
        int pocketMoney = 1;
        switch (grades){
            case 'A' :
                pocketMoney += 100;
                break;
            case 'B':
                pocketMoney += 80;
                break;
            case 'C':
                pocketMoney += 70;
                break;
            default:
                pocketMoney += 50;
        }   System.out.println(pocketMoney);
        
    

    }
}
