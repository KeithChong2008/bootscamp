public class Keyboard {
  
  private String buttonType;
  private int noOfButton;

  public Keyboard(String buttonType, int noOfButton){
    this.buttonType =buttonType;
    this.noOfButton = noOfButton;
  }

  public void setbuttonType(String buttonType){
    this.buttonType = buttonType;
  }
  public void setnoOfButton(int noOfButton){
    this.noOfButton = noOfButton;
  }
  public String getButtonType(){
    return buttonType;
  }
  public int getnoOfButto(){
    return noOfButton;
  }
  @Override
  public boolean equals(Object o){ //check addrress
    if (this == o) {
      return true;
    }
    if(!(o instanceof Keyboard)){ // check class
      return false;
    }

    Keyboard keyboard = (Keyboard) o;
    return Objects.equals(keyboard.buttonType,this.buttonType)
    && Objects.equals(keyboard.noOfButton,this.noOfButton);
  }
  
}
