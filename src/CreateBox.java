
// import java.util.Scanner;

// import javax.swing.Box;

// class CreateBox{
//     public static void main(String[] args) {

//         // create scanners instance to wrap std i/p
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter box dimentions : W D H");
//         // int data = 100;
//         Box box1; // box1 : ref type of var(class type of ref) , no obj created so far , method local variable 
//         // memory allocated on the stack : how many bytes : as per jvm spacifications
//         // System.out.println(box1); javac err
//         box1 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble()); // box class gets loaded in method area 
//         //its instance is created in heap.

//         //print box dimensions
//         System.out.println(box1.getBoxDimensions());
//         //print box volume
//         System.out.println("volume" +box1.getBoxVolume());
//         // close scannner
//         sc.close();
//     }                                       
// }

import java.util.Scanner;

public class CreateBox {
    public static void main(String[] args) {
        // 🧾 Create Scanner instance to read user input
        Scanner sc = new Scanner(System.in);

        // 🗣️ Prompt user for box dimensions
        System.out.println("Enter box dimensions (Width Depth Height):");

        // 🧱 Create Box object using user input
        Box box1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        // 🖨️ Print box dimensions
        System.out.println(box1.getBoxDimensions());

        // 🧮 Print box volume
        System.out.printf("Box Volume: %.2f cubic units\n", box1.getBoxVolume());

        // ✅ Close scanner to release resources
        sc.close();
    }
}


