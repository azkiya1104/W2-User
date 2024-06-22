class User {
    protected String username;
    protected String password;
    protected String phoneNumber;
    protected String email;
    protected Boolean admin = false;
    protected final String country = "Indonesia";

    User(String paramUsername, String paramPassword, String paramPhoneNumber, Boolean paramadmin) {
        username = paramUsername;
        password = paramPassword;
        phoneNumber = paramPhoneNumber;
        admin = paramadmin;
    }

    User(String paramUsername, String paramPassword, Boolean paramadmin){
        username = paramUsername;
        password = paramPassword;
        admin = paramadmin;    
    }

    User(String paramUsername, String paramPassword, String paramPhoneNumber) {
        username = paramUsername;
        password = paramPassword;
        phoneNumber = paramPhoneNumber;
    }

    User(String paramUsername, String paramPassword) {
        username = paramUsername;
        password = paramPassword;
    }
    
    User(String paramUsername) {
        username = paramUsername;
    }

    User() {

    }

     void userMe() throws Exception {
        System.out.println("My username is "+this.username+
        " password "+ password+
        " phoneNumber "+ phoneNumber+
        " email "+ email+
        (admin? " is_admin ": "")+
        " country "+this.country);

     };
     void login (String paramUsername, String paramPassword) {
        if (username == paramUsername && password == paramPassword) {
        System.out.println("Success login with username "+username);
        }else {
            System.out.println("failed login with username "+username);
        }
     }
}

