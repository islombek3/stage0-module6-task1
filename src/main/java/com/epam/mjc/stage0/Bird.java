package com.epam.mjc.stage0;

public class Bird {
  public Bird(){
    super("Blue", 2, false);
  }

  @Override
  public String getDescription(){
    return super.getDescription() + "Moreover, it has 2 wings and can fly.";
  }
}
