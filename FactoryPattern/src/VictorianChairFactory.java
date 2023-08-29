package FactoryPattern.src;

public class VictorianChairFactory implements FunitureFactory {
  
  @Override
  public Chair createChair(Style style){
    return new ModernChair();
  }

  @Override
  public Sofa createSofa(Style style){
    return
  }

}
