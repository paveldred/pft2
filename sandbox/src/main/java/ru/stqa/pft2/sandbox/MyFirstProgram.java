package ru.stqa.pft2.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
//        hello();
        System.out.println(convertCelsiumToFahrenheit(40));

    }

    public static void hello() {
        System.out.println("Hello, world!");
    }
    public static double convertCelsiumToFahrenheit(int celsium) {
        double TF = celsium * 9.0 / 5.0 + 32;//напишите тут ваш код
        return TF;
//        System.out.println(TF);
    }
}


//package ru.stqa.pft2.sandbox;
//
//public class MyFirstProgram {
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Fish fish = new Fish();
//        Woman anna = new Woman();
//        cat.owner = anna;
//        dog.owner = anna;
//        fish.owner = anna;
//    }
//
//    public static class Cat {
//        public Woman owner;
//    }
//
//    public static class Dog {
//        public Woman owner;
//    }
//
//    public static class Fish {
//        public Woman owner;
//    }
//
//    public static class Woman {
//    }
//}
