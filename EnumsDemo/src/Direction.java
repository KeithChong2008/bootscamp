public enum Direction  { //special keyword since Java 1.5
  // ALL Unique
  //public class Direction extends Enum
  // Enum is final class

  EAST('E',90),
  SOUTH('S',180),
  WEST('W',270),
  NORTH('N',360)
  ;

  private char direction;
  private int degree;

  private Direction(char direction,int degree){

    this.direction = direction;
    this.degree = degree;
  }
  

  public char getDirection(){
    return this.direction;
  }

  public int getDegree(){
    return this.degree;
  }

  public boolean isOppsite(Direction direction){
    return Math.abs(this.degree - direction.getDegree())== 180;
  }

  public static void main(String[] args) {
    System.out.println(Direction.EAST); //EAST
    System.out.println(Direction.EAST.name());//EAST
    System.out.println(Direction.NORTH);//EAST

    Direction east = Direction.EAST;
    System.out.println(east == Direction.NORTH); // False
    System.out.println(east != Direction.NORTH); //True
    // == and != are checking the oject reference


    //values() -> loop
    for(Direction d: Direction.values()){
      System.out.println(d.name());
    }


    System.out.println(Direction.SOUTH.ordinal());//1
    System.out.println(Direction.EAST.ordinal());//0

    System.out.println(east.getDegree());
    System.out.println(east.getDirection());

    System.out.println(Direction.EAST.isOppsite(Direction.WEST)); //true
    System.out.println(Direction.NORTH.isOppsite(Direction.WEST)); //false
    System.out.println(Currency.HKD.getID());
    

    }



}
