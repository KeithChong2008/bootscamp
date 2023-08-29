package SwitchExpressingDemo.src;

public class Swithchdemo1 {
  // stati final (constant) (0-2)
  //instance variavle (1x)
  //static variable (1-2)
  // constructors
  // public instance Method //method
  //static Methods //tools
  //private Methods
 

  //Swithch pattern matching is a preview feature in Java 20

  public static void main(String[] args) throws Exception {
    System.out.println(90);
    Weekday weekday = Weekday.TUE;

    //Approach 1
     int result = switch(weekday){ 
        case MON ,TUE ->1;
        case WED ->3;
        case THU ->4;
        case FRI ->5;
  };
      //Approach 2
       int result2 = switch(weekday){ 
        case MON :{
          System.out.println("Monday");
          yield 1;
        }
        case TUE :{
          System.out.println("Tuesday");
          yield 2;
        }
        case WED :{
          System.out.println("Wednesday");
          yield 3;
        }
        case THU :{
          System.out.println("Thursday");
          yield 4;
        }
        case FRI :{
          System.out.println("Friday");
          yield 5;
        }
        
  };
        System.out.println(result2);
}

  public static int getWeekday(Weekday weekday){
      switch(weekday){ // enum
        case MON:
          return 1;
        case TUE:
          return 2;
        case WED:
          return 3;
        case THU:
          return 4;
        case FRI:
          return 5;
        default:
          return 0;
    }
  }

  public static char grade(int score){
    char grade = ' ';
    switch(score){
      case 90:
        grade = 'A';
        break;
      case 80:
        grade = 'B';
        break;
      default:
        grade = 'C';
      
    }
    return grade;
  }
}
