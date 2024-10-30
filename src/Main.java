public class Main {
        static User[] users = new User[10];
        static int userCount = 0;
    public static void main(String[] args) {
        addUser("evan");
        addUser("joe");
        addUser("3");
        addUser("4");
        addUser("5");
        addUser("6");
        addUser("7");
        addUser("8");
        addUser("9");
        addUser("10");
        addTask("evan","hello",0);
        addTask("joe","world",0);
        printTask("evan");
        printTask("joe");
        markComplete("evan","hello");
        printTask("evan");




    }

    public static void addUser(String userName){
            if (userCount < 10){
                    if (findUser(userName)!=null){
                        System.out.println("user already exists");
                    }else {
                        users[userCount] = new User(userName);
                        userCount++;
                    }


            }else {
                System.out.println("user list is full");
            }
    }

    public static void addTask(String userName,String description,int location){
        User user = findUser(userName);
        if (user!=null){
            user.addTask(description,location);
        }else {
            System.out.println("User not found");
        }
    }

    public static User findUser(String userName){
        for (int i = 0; i < userCount; i++) {
            if (users[i].getName().equals(userName)){
                return users[i];
            }
        }
        return null;
    }

    public static void printTask(String userName){
        User user = findUser(userName);
        if (user!=null){
            user.printTask();
        }else {
            System.out.println("user not found");
        }
    }

    public static void markComplete(String userName,String description){
        User user = findUser(userName);
        if (user!=null){
            user.markCompleted(description);
        }else {
            System.out.println("user not found");
        }
    }


}
