import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

public class Collections {
    public static void main(String[] args) {
        //Lists,Maps,Linkelist ,vectors

        String[] names = {"Martha","Demba","Nixon"};
       //collection
        //ArrayList ,List
        for (int i=0;i<names.length;i++){
            //System.out.println(names[i]);
        }

        //List
        //Generics  - <E> -/*
        // Strings,ints,
        // */
        /*
        * users - name,email,phone,department
        * */
        List<String> ournames = new ArrayList();
        ournames.add("New Martha");
        ournames.add("New Demba");
        ournames.add("New Nixon");
        ournames.add("New Other Name");

        for (int i=0;i<ournames.size();i++){
            //System.out.println(ournames.get(i));
        }

        //in associative - key and value - maps
        HashMap<String,String> name_salary = new HashMap<>();
        name_salary.put("Martha","150,000");
        name_salary.put("Demba","150,000");
        name_salary.put("Nixon","150,000");

        //lamba
        name_salary.forEach((name, salary) -> {
            //System.out.println("Name "+name+" Salary Ksh: "+salary);
        });

        //Users - name,phone,email and department
        /*
        * class user
        * POJO - Plain Old Java Objects - behav
        * */
        List<Users> users = new ArrayList<>();
        users.add(new Users("Demba","83737383","demba@g.com","CS"));
        users.add(new Users("Martha","78838737","martha@g.com","CS"));
        users.add(new Users("John Doe","6464643","john@g.com","Eng"));

        printToConsole("Users List "+users.size());
       /* users.remove(2);
        users.removeAll(users);*/

        /*users.forEach(users1 -> {
            printToConsole(users1.getName()+" Tel "+users1.getPhone());
        });*/
        /*users.forEach(new Consumer<Users>() {
            @Override
            public void accept(Users user) {
                printToConsole("Name "+user.getName()+" Email: "+user.getEmail());
            }
        });*/
        for (int i=0;i<users.size();i++){
            printToConsole("Name: "+users.get(i).getName()+" Tel "+users.get(i).getPhone());
        }


    }

    public static void  printToConsole(String message){
        System.out.println(message);
    }
}
/*
* User class - [POJO]
* */
class Users{
    private String name;
    private String phone;
    private String email;
    private String department;

    public Users() {
    }

    //ALT + insert
    public Users(String name, String phone, String email, String department) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.department = department;
    }
    //get set


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
