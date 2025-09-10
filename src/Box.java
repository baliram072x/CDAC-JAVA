
public class Box {
    // state of the box : tight encapsulation
    private double width ,depth ,height; // instance variables
    // parameterized constructor to init complete state of the box 
    Box(double w ,double d , double height){
        width = w;
        depth = d;
        // this keyword is used to unhide instance var from local var
        this.height = height;

    } 
    // behavior : methods 
    /// write a non static method (instatnce method ) to return box
    /// details in string form ( diamensions of box )
    String getBoxDimensions(){
        return "Box Dims" + this.width +"" + depth + "" + height;
    }
    // write a non static method to retun computed volume of the box
    double getBoxVolume(){
         return width*depth*this.height;
    }
}


