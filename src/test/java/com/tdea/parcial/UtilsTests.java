package com.tdea.parcial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilsTests {

    @Test
    public void blankTest() {}

    @Test
    public void ShouldNight_time() {

        int hour = 4;
        Assertions.assertEquals("Night",Utils.getTimeOfDay(hour));
    }
    @Test
    public void ShouldMorning_time (){
        int hour = 9;
        Assertions.assertEquals("Morning",Utils.getTimeOfDay(hour));


    }
    @Test
    public void invai_time (){
        int hour = 30;
        Assertions.assertEquals("Invalid hour",Utils.getTimeOfDay(hour));

    }
  @Test
  public void ShouldAfternoon_time (){
        int hour = 13;
        Assertions.assertEquals("Afternoon",Utils.getTimeOfDay(hour));
  }
  @Test
  public void  ShouldEvening_time (){
     int   hour = 20 ;
      Assertions.assertEquals("Evening",Utils.getTimeOfDay(hour));
  }


}
