
    import static org.junit.Assert.assertEquals;
    import org.junit.*;



public class ProgrammerTest{

Programmer programmer;
Coffee coffee;
Coffee coffee2;
Coffee coffee3;
Coffee coffee4;
Coffee coffee5;

@Before
public void before() {
programmer = new Programmer(); 
coffee = new Coffee();
coffee2 = new Coffee();
coffee3 = new Coffee();
coffee4 = new Coffee();
coffee5 = new Coffee();
}


@Test
public void test_coffeeCount(){
  programmer.drink(coffee);
  programmer.drink(coffee2);
  programmer.drink(coffee3);

  assertEquals(3, programmer.coffeeCount());
}

@Test
public void test_isFull(){
  programmer.drink(coffee);
  programmer.drink(coffee2);
  programmer.drink(coffee3);
  programmer.drink(coffee4);
  programmer.drink(coffee5);

  assertEquals(true, programmer.isFull() );
}







}