package com.mycompany.mavenproject1.controller;

import com.mycompany.mavenproject1.model.Bug;
import com.mycompany.mavenproject1.model.Priority;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class BugController {

    private final List<String> idsBugToResolveToday;
    
    public BugController() {
        idsBugToResolveToday = new ArrayList<>();
    }
    
    public List<String> bugsToResolveToday(List<Bug> bugs) {
        for (Bug bug : bugs) {
            addBug(bug);
        }

        return idsBugToResolveToday;
    }

    private void addBug(Bug bug) {
        if (bug.getPriority() == Priority.CRITICAL) {
            idsBugToResolveToday.add(bug.getId());
        } else {
            addNormalBug(bug);
        }
    }

    private void addNormalBug(Bug bug) {
        if (ChronoUnit.DAYS.between(bug.getDate(), LocalDate.now()) >= 3) {
            idsBugToResolveToday.add(bug.getId());
        }
    }
}
