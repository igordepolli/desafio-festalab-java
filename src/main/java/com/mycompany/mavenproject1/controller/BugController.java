package com.mycompany.mavenproject1.controller;

import com.mycompany.mavenproject1.model.Bug;
import com.mycompany.mavenproject1.model.Priority;
import java.util.ArrayList;
import java.util.List;

public class BugController {
    
    public static List<String> criticalBugs(List<Bug> bugs) {
        List<String> ids = new ArrayList<>();
        
        for (Bug b : bugs) {
            if (b.getPriority() == Priority.CRITICAL) {
                ids.add(b.getId());
            }
        }
        
        return ids;
    }
}
