package dogs;

  class dog {
      int license_ID;
      String name;

      public void eat() {
          System.out.println(name + " eats");
      }

  }

public class Main {

    public static void main(String[] args) {

        dog dog1 = new dog();
        dog1.name = "bruno";
        dog1.eat();


    }


}
