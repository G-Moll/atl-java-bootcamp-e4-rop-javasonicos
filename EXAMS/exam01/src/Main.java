// import User;

public class Main {

    public static void main(String[] args){
        User userOne = new User();
        userOne.setId( 1 );
        userOne.setName( "User One" );
        userOne.setLastname( "UserInstance" );
        userOne.setEmail( "user1@mymail.com" );
        userOne.setPassword( "abc" );
        userOne.setPhonenumber( "22 1447 2558" );
        userOne.toString();

        User userTwo = new User( 2, "User Two", "UserInstance", "user2@mymail.com", "123", "55 1223 4556" );
        userTwo.toString();
    }

}
