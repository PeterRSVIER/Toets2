package Ex06;

public class TestBag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      try {
	  Bag<Integer> myBag = new Bag<Integer>(5);
      System.out.println(myBag);
      myBag.add(1);
      myBag.add(9);
      myBag.add(7);
      myBag.add(0);
      myBag.add(6);
      myBag.add(2);
      myBag.add(3);
      System.out.println(myBag);
      System.out.println(myBag.take());
      System.out.println(myBag);
//      }
//      catch (EmptyBagException ex) {
//    	  System.out.println(ex);
//      }
//      catch (FullBagException ex) {
//    	  System.out.println(ex);
//      }

//      try {
      Bag<String> myBag2 = new Bag<String>(5);
      System.out.println("\n"+ myBag2);
//      myBag2.take();
      myBag2.add("Boudewijn");
      myBag2.add("Geert");
      myBag2.add("van");
      myBag2.add("Beckhoven");
      System.out.println(myBag2);
      System.out.println(myBag2.take());
      System.out.println(myBag2);
//      }
//      catch (EmptyBagException ex) {
//    	  System.out.println(ex);
//      }
//      catch (FullBagException ex) {
//    	  System.out.println(ex);
//      }
	}

}
