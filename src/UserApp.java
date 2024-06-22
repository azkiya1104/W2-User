public class UserApp {
    public static void main(String[] args) throws Exception {
        /*object */
        var user1 = new User();
        User user2 = new User();
        User user3;
        user3 = new User();


        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);


        /*field */
       
        var user = new User();
        user.username = "Azkiya";
        user.password = "1104";
        user.phoneNumber = "081234567898";
        user.admin = true;
        //user.country = "Madinah"; 

        System.out.println("username : "+user.username);
        System.out.println("password : "+user.password);
        System.out.println("phoneNumber : "+user.phoneNumber);
        System.out.println("country : "+user.country  );

        /*method */
        var user4 = new User();
        user4.userMe();
        user4.login("Azkiya", "1104");

        var user5 = new User("Azkiya", "1104", true);
        user5.username = "Azkiya";
        user5.password = "1104";
        user5.admin = true;
        user5.userMe();
        user5.login("Azkiya", "1104");

        /*constructor overloading */
        var user6 = new User("username", "1104", "081234567898", true);
        user6.userMe();
        user6.login("username", "1104");

        var user7 = new User("Azkiya", "password");
        user7.userMe();
        user7.login("Azkiya", "password");
    }
} 
