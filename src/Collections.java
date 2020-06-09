import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        //Lists,Maps,Linkelist ,vectors

        String[] names = {"Martha","Demba","Nixon"};
       //collection
        //ArrayList ,List
        for (int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

        //List
        //Generics  - <E> -
        List<String> ournames = new ArrayList();
        ournames.add("New Martha");
        ournames.add("New Demba");
        ournames.add("New Nixon");
        ournames.add("New Other Name");

        for (int i=0;i<ournames.size();i++){
            System.out.println(ournames.get(i));
        }

        //in associative - key and value - maps
        HashMap<String,String> name_salary = new HashMap<>();
        name_salary.put("Martha","150,000");
        name_salary.put("Demba","150,000");
        name_salary.put("Nixon","150,000");

        //lamba
        name_salary.forEach((name, salary) -> {
            System.out.println("Name "+name+" Salary Ksh: "+salary);
        });
    }
}
