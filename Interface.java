// =============================My Interface
interface MyInterface
{
   /* compiler will treat them as: 
    * public abstract void method1();
    * public abstract void method2();
    */
   public void method1();
   public void method2();
}
class Main implements MyInterface
{
   /* This class must have to implement both the abstract methods
    * else you will get compilation error
	*try removing one method and see the error
    */
   public void method1()
   {
	System.out.println("implementation of method1");
   }
   public void method2()
   {
	System.out.println("implementation of method2");
   }
   public static void main(String arg[])
   {
	MyInterface obj = new Main();
	obj.method1();
	obj.method2();
	
   }
}
// =============================Vehicle
//Creating a interface
interface Vehicle {
      
    // all are the abstract methods.
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
//we use keyword implements to inherit a interface
class Bicycle implements Vehicle{
      
    int speed;
    int gear;
      
     // to change gear
    @Override
    public void changeGear(int newGear){
          gear = newGear;
    }
      
    // to increase speed
    @Override
    public void speedUp(int increment){
          
        speed = speed + increment;
    }
      
    // to decrease speed
    @Override
    public void applyBrakes(int decrement){
          
        speed = speed - decrement;
    }
      
    public void printStates() {
         System.out.println("speed: " + speed
              + " gear: " + gear);
    }
}
  
class Car implements Vehicle {
      
    int speed;
    int gear;
      
    // to change gear
    @Override
    public void changeGear(int newGear){
          
        gear = newGear;
    }
      
    // to increase speed
    @Override
    public void speedUp(int increment){
          
        speed = speed + increment;
    }
      
    // to decrease speed
    @Override
    public void applyBrakes(int decrement){
          
        speed = speed - decrement;
    }
      
    public void printStates() {
         System.out.println("speed: " + speed
             + " gear: " + gear);
    }
      
}
class Main {
      
    public static void main (String[] args) {
      
        // creating an inatance of Bicycle 
        // doing some operations 
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
          
        System.out.println("Bicycle present state :");
        bicycle.printStates();
          
        // creating instance of the car.
        Car car = new Car();
        car.changeGear(1);
        car.speedUp(4);
        car.applyBrakes(3);
          
        System.out.println("Car present state :");
        car.printStates();
    }
}
