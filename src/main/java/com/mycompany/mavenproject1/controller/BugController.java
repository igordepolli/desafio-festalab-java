package com.mycompany.mavenproject1.controller;

import com.mycompany.mavenproject1.model.Bug;
import java.util.ArrayList;
import java.util.List;

public class BugController {

    private final List<Bug> bugsToResolveToday;

    public BugController() {
        bugsToResolveToday = new ArrayList<>();
    }

    public List<Bug> bugsToResolveToday(List<Bug> bugs) {
        for (Bug bug : bugs) {
            if (bug.isCritical() || bug.getAge() >= 3) {
                bugsToResolveToday.add(bug);
            }
        }

        return bugsToResolveToday;
    }

}
