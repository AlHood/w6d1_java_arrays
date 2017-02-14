import java.util.ArrayList;

  public class Programmer{
    private ArrayList<Coffee> stomach;

    public Programmer(){
      this.stomach = new ArrayList<Coffee>();
}

public int coffeeCount(){
  return stomach.size();

}

public void drink(Coffee coffee){
  stomach.add(coffee); 

}

public boolean isFull(){
return (this.coffeeCount() >= 5);

}






}




