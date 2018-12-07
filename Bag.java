package Ex06;

import java.util.*;

public class Bag <E> {
  private int maxX;
  private ArrayList<E> list = new ArrayList<E>();
  
  public Bag() {
	  this.maxX = 0;
	  
  }

  public Bag(int maxX) {
	  this.maxX = maxX;
  }

  public int maximum() {
	  return maxX;
  }

  public int amount() {
	  return list.size();
  }

  public void add(E el) //throws FullBagException //nb unchecked, niet correct voor iets binnen programma logica
  {
	if (this.amount() < this.maximum())
		list.add(el);
	else
		System.out.println("Bag full");
//		throw new FullBagException("Bag full");
  }

  public E take() //throws EmptyBagException//, zie boven
  {
    int amount = this.amount();
    if (amount > 0) {
    	E el = list.get(amount - 1);//get(amount) zou ArrayIndexOutofBounds exception genereren
        list.remove(el);
        return el;
    }
    else {
//    	throw new EmptyBagException("Bag empty");
    	System.out.println("Bag empty");
	    return null;
    }
  }

@Override
   public String toString() {
	 return list.toString();
   }

}
