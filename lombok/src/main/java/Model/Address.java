package Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.experimental.NonFinal;

@AllArgsConstructor
//@RequiredArgsConstructor 
@Builder
public class Address {
  
  private String addressLine1;
  private String addressLine2;
  private String addressLine3;
  
  
  //@NonNull
  private Country country;

  public Address(Country country){
    if(country == null){
      throw new NullPointerException();
    }
    this.country =  country;
  }

  public static void main(String[] args) {
    Address a1 = new Address(Country.HK); 
    Address a2 = Address.builder()
                .addressLine1("")
                .addressLine2("")
                .addressLine3("")
                .country(Country.US) // run-time error
                .build();

  Address a3 = new Address(null);
  
  }
}
