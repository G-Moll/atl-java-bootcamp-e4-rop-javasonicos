public class User {

    int id;
    String name;
    String lastname;
    String email;
    String password;
    String phonenumber;

    public User() {
    }

    public User( int id, String name, String lastname, String email, String password, String phonenumber ) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.phonenumber = phonenumber;
    }

    public static void main(String[] args){

    }

    public String toString() {
        String message =
            "id "          + this.getId() + "\n" +
            "name "        + this.getName() + "\n" +
            "lastname "    + this.getLastname() + "\n" +
            "email "       + this.getEmail() + "\n" +
            "phonenumber " + this.getPhonenumber() + "\n";

        System.out.println( message );
        return message;
    }


    public int getId() {
        return this.id;
    }
    public void setId( int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    public void setName( String name) {
        this.name = name;
    }

    public String getLastname() {
        return this.lastname;
    }
    public void setLastname( String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail( String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }
    public void setPassword( String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return this.phonenumber;
    }
    public void setPhonenumber( String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
