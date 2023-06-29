
public class Client {
    public String name;
    public String lastname;
    public int age;

    // public static void main( String args[] ) {
    // }

    // public Client() {
    // }

    public String toString() {
        String toStringData = "This.name: " + this.name +
            "\nThis.lastname: " + this.lastname +
            "\nThis.age: " + this.age + "\n";
        System.out.println( toStringData );
        return toStringData;
    }
}
