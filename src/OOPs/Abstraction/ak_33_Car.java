package OOPs.Abstraction;

public abstract class ak_33_Car {
    public abstract void accelerate();
    public abstract void brake();
    public void honk(){
        System.out.println("Car is honking");
    }
}

//Agar parent class ka  method abstract ho to uske children ko uski implementation karni padti hai
// An abstract class should also have non-abstract methods known as concrete methods.

// In Encapsulation data hiding takes place due to security reasons to prevent unauthorized access of class to any variable and in Abstraction, Data hiding is used to reduce complexity of the program.
