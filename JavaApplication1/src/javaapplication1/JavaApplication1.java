package javaapplication1;

abstract interface Runabled {

    public abstract void run();
}

class Cat implements Runabled {

    public void run() {
        System.out.println("Cat running...");
    }
}

class Animal {

    protected String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("An com");
    }

    public void sleep() {
        System.out.println("z Z z");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Dog extends Animal implements Runabled{
    
    public static void greeing(){
        System.out.println("Dog greeting");
    }

    private int foot;

    public Dog(String name, int age, int foot) {
        super(name, age);
        this.foot = foot;
    }
    
    public void run(){
        System.out.println("Dog running");
    }

    public int getFoot() {
        return foot;
    }

    public void eat() {
        System.out.printf(" %s an xuong %n", this.name);
    }
}

public class JavaApplication1 {
    
    public static void tracing(Runabled runableAnimal){
        System.out.println("I am tracing a animal call :");
        runableAnimal.run();
    }

    public static void main(String[] args) {
//        Dog pew = new Dog("pew", 12, 2);
//        System.out.printf("%s is %d years olds and he has %d foot%n", pew.getName(), pew.getAge(), pew.getFoot());
//        pew.eat();
//        pew.sleep();
      
          Dog dog = new Dog("Pipi",2,2);
          tracing(dog);
          
          Cat cat = new Cat();
          tracing(cat);
    }
}

JavaApplication1.main();
