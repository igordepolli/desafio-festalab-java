package com.mycompany.mavenproject1.controller;

import com.mycompany.mavenproject1.model.Bug;
import com.mycompany.mavenproject1.model.Priority;
import java.util.ArrayList;
import java.util.List;

public class BugController {

    private final List<Bug> bugsToResolveToday;
    
    public BugController() {
        bugsToResolveToday = new ArrayList<>();
    }
    
    public List<Bug> bugsToResolveToday(List<Bug> bugs) {
        for (Bug bug : bugs) {
            fillListOfBugs(bug);
        }

        return bugsToResolveToday;
    }

    private void fillListOfBugs(Bug bug) {
        if (bug.getPriority() == Priority.CRITICAL) {
            bugsToResolveToday.add(bug);
        } else if (bug.getAge() >= 3) {
            bugsToResolveToday.add(bug);
        }
    }

}
