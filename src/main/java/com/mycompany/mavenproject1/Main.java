package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.controller.BugController;
import com.mycompany.mavenproject1.model.Bug;
import com.mycompany.mavenproject1.model.BugCollection;
import com.mycompany.mavenproject1.model.Priority;
import java.util.Arrays;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        Bug bug1 = new Bug("1", "Convidados não conseguem confirmar a presença em um evento", 1, Priority.CRITICAL);
        Bug bug2 = new Bug("2", "Lorem ipsum dolor sit amet.", 4, Priority.NORMAL);
        Bug bug3 = new Bug("3", "Cras non fringilla lectus. Pellentesque.", 3, Priority.NORMAL);
        Bug bug4 = new Bug("4", "Proin ligula ante, vestibulum vel.", 2, Priority.CRITICAL);
        Bug bug5 = new Bug("5", "Ut congue eleifend ante, a.", 1, Priority.CRITICAL);
        
        BugCollection bugCollection = new BugCollection();
        bugCollection.getBugs().addAll(Arrays.asList(bug1, bug2, bug3, bug4, bug5));
        
        List<String> idsOfBugs = BugController.criticalBugs(bugCollection.getBugs());
        
        System.out.println("ID's dos Bugs que devem ser resolvidos hoje: ");
        for (String id : idsOfBugs) {
            System.out.println(id);
        }
        
    }
    
}
