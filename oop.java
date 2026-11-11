// import java.util.*;
// public class oop {
//     public static class Student {
//         String name;
//         int rno;
//         double cgpa;
//     }
//     public static void main (String args[]) {
//         Scanner sc= new Scanner (System.in);

//         Student s1 = new Student ();
//         s1.name = "Shivam";
//         s1.rno = 23;
//         s1.cgpa = 7.5;

//         Student s2 = new Student();
//         s2.name = "Lavish";
//         s2.rno = 33;
//         s2.cgpa = 2.2;


//         Student s3 = new Student();
//         s3.name = "Anagha";
//         s3.rno = sc.nextInt();
//         s3.cgpa = 8.5;


//         System.out.println(s1.name+" "+s1.cgpa+" "+s1.rno);
//         s2.cgpa = 9.8;
//         System.out.println (s3.rno);
//     }
// }


//POLYMORPHISM

// import java.util.*;
// public class oop {
//     public static class Dog {
//         void speak () {
//             System.out.println ("Bhau Bhau");
//         }
//     }
//     public static class Cat {
//         void speak () {
//             System.out.println ("Mew Mew");
//         }
//     }
//     public static class Lion {
//         void speak () {
//             System.out.println ("GRRR");
//         }
//     }
//     public static class Human {
//         void speak () {
//             System.out.println ("Hello");
//         }
//     }
//     public static void main (String args[]) {
//         Dog d = new Dog ();
//         Cat c = new Cat ();
//         Lion l = new Lion ();
//         Human h = new Human ();

//         d.speak ();
//         c.speak ();
//         l.speak ();
//         h.speak ();
//     }
// }


//ENCAPSULATION

// import java.util.*;
// public class oop {
//  String name;
// private int rno;
// double CGPA;
// void print () {   //getter
//     System.out.println (name + " " +CGPA+" "+rno);
// }
// int getRno() {
//     return rno;
// }
// void setRno(int x) {     //setter
//     rno =x;
// }
// }
// public class PrivateKeyword {
// public static void main (String args[]) {
//     Students s1 = new Students();

//     s1.CGPA = 8.5;
//     s1.name = "Shivam";

//     s1.setRno(45);
//     System.out.println (s1.getRno());
// }
// }


//Constructor


// import java.util.*;
// public class oop {
//     public static class Car {
//         // int seats;
//         // String name;
//         // double length;
//         // Car(int x, String s, double d) {
//         //     seats = x;
//         //     name = s;
//         //     length = d;

//         int price;
//         String name;
//         Car() {

//         }
//         Car (int x, String s) {
//             price x;
//             name s;
//         }

//         void print() {
//             System.out.println (price+" "+name);
//         }
//     }
//     public static void main (String [] args) {
//         Car c1 = new Car(23455, "Seltos");
//         // System.out.println (c1.name);
//         c1.print();
//         Car c2 = new Car (4987986, "Lord Alto");
//         c2.print();
//         Car c3 = new Car();
//         c3.name = "Honda Amaze";
//     }
// }   


//This keyword


// import java.util.*;
// public class oop {
//     public static class Car {
//         int price;
//         String name;
//         Car() {

//         }
//         Car (int price, String name) {
//             this.price = price;
//             this.name = name;
//         }
//         Car (String s, int x) {
//             this.price = x;
//             name = s;
//         } 
//          void print () {
//             int price = 12;
//             System.out.println (this.price+ " " +name);
//          }
//     }
//     public static void main (String args[]) {
//         Car c1 = new Car (1250000, "kia Sonet");
//         c1.print();

//         Car c2 = new Car("Lord Alto", 40000);
//         c2.print();

//         Car c3 = new Car();
//         c3.name = "Honda Amaze";
//     }
// }



// import java.util.*;
// public class Cricketer {
   
//     static String country = "NZ";
//     int runs;
//     String name;
//     double avg;
// }
// public class oop {
// public static void main (String[] args) {
//     Cricketer c1 = new Cricketer();

//     //c1.country = "England"; Error

//     Cricketer c2 = new Cricketer();
//     c1.country="India";
//     System.out.println (c2.country);
// }
// }


//Ques:-  Complex Number.


// import java.util.*;
// public class ComplexNumber {
//     int x;
//     int y;
//     ComplexNumber(int x, int y) {
//         this.x = x;
//         this.y = y;
//     }
//   void print() {
//     // System.out.println (x+" + i"+y);
//     if(y>=0) System.out.println(x+" + "+y+"i");
//     else System.out.println (x+" - "+(-y)+"i");
//   }
//   void add(ComplexNumber z2) {
//     z2.x = 8;
//   }
// } 
// public class oop {
//     public static void main (String[] args) {
//         ComplexNumber z1 = new ComplexNumber(2,-5);
//         ComplexNumber z2 = new ComplexNumber(3,4);
//         z1.print();
//         z2.print();
//         z1.add(z2);
//         z2.print();
//     }
// }


