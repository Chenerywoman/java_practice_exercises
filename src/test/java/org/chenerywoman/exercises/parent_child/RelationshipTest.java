package org.chenerywoman.exercises.parent_child;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RelationshipTest {

  Parent mum = new Parent();
  Child baby = new Child();

  @Test
    public void checkReturnsParent(){
      assertEquals("I am your parent", mum.returnParent());
  }

  @Test
  public void checkReturnsChild(){
    assertEquals("I am the baby", baby.returnChild());
  }

@Test
  public void checkChildReturnsParent(){
    assertEquals("I am your parent", baby.returnParent());
}


}
