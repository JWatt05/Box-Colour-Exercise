public class Box {

    public final char colour; // colour of the Box, represented by a character (e.g. 'g' for green)

    public final int width; // width of the Box

    private Box stackedBox = null; // this references the Box that is stacked on top of the current Box


    //TODO: complete constructor
    public Box(char colour, int width); // constructor

    //TODO: complete stack method
    public boolean stack(Box otherBox); // this method attempts to stack otherBox on top of the current Box. True on success, false if impossible

    //TODO: complete prettyPrint method (see main method to determine output)
    public prettyPrint(); // this method exists so we can print out the box in a way that is more visually appealing than default object code


    // Main method for testing
    public static void main(String[] args){
        Box a = new Box('r', 100);
        Box b = new Box('g', 50);
        Box y = new Box('y', 10000);
        Box c = new Box('b', 2);

        a.prettyPrint(); // should print out "[r:100]"
        b.prettyPrint(); // should print out "[g:50]"
        y.prettyPrint(); // should print out "[y:10000]"
        c.prettyPrint(); // should print out "[c:2]"

        System.out.println();

        System.out.println(a.stack(y)); // should print "false"
        System.out.println(a.stack(b)); // should print "true"
        System.out.println(a.stack(c)); // should print "false"
        System.out.println(b.stack(c)); // should print "true"
    }
}