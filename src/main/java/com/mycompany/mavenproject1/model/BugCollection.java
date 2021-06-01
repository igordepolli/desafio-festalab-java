package com.mycompany.mavenproject1.model;

import java.util.ArrayList;
import java.util.List;

public class BugCollection {
    
    private final List<Bug> bugs;

    public BugCollection() {
        bugs = new ArrayList<>();
    }
    
    public void addBug(Bug bug) {
        bugs.add(bug);
    }
    
    public Bug searchBugById(String bugId) throws Exception {
        for (Bug b : bugs) {
            if (bugId.equals(b.getId())) {
                return b;
            }
        }
        
        throw new Exception("Bug não existe na lista!");
    }
    
    public void removeBug(Bug bug) throws Exception {
        bugs.remove(searchBugById(bug.getId()));
    }

    public List<Bug> getBugs() {
        return bugs;
    }
    
}
