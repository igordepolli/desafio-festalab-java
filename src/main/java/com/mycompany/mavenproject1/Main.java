package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.controller.BugController;
import com.mycompany.mavenproject1.model.Bug;
import com.mycompany.mavenproject1.model.Priority;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        Bug bug1 = new Bug("Convidados não conseguem confirmar a presença em um evento", 1, Priority.CRITICAL);
        Bug bug2 = new Bug("Lorem ipsum dolor sit amet.", 2, Priority.NORMAL);
        Bug bug3 = new Bug("Cras non fringilla lectus. Pellentesque.", 3, Priority.NORMAL);
        Bug bug4 = new Bug("Proin ligula ante, vestibulum vel.", 3, Priority.CRITICAL);
        Bug bug5 = new Bug("Ut congue eleifend ante, a.", 4, Priority.CRITICAL);
        
        List<Bug> bugs = new ArrayList<>();
        bugs.addAll(Arrays.asList(bug1, bug2, bug3, bug4, bug5));
       
        BugController bugController = new BugController();
        List<Bug> bugsToResolveToday = bugController.bugsToResolveToday(bugs);
        
        System.out.println("ID's dos Bugs que devem ser resolvidos hoje: ");
        for (Bug b : bugsToResolveToday) {
            System.out.println(b.getId());
        }
        
    }
    
}
