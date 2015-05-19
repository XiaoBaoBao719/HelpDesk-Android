package com.example.helpdesk;

/**
 * Created by Xiao Bao Bao on 5/18/2015.
 */
public class Ticket {

    public Ticket(String name, String email, String summary, String contact, String position) {
        this.name = name;
        this.email = email;
        this.summary = summary;
        this.contact = contact;

        if(position.toUpperCase().equals("CONSULTANT")) {
            this.consultant = true;
        }
        else if(position.toUpperCase().equals("MANAGER")) {
            this.manager = true;
        }
        else if(position.toUpperCase().equals("ADMIN")) {
            this.admin = true;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public boolean isConsultant() {
        return consultant;
    }

    public void setConsultant(boolean consultant) {
        this.consultant = consultant;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    String name, email, summary, contact;
    boolean consultant, manager, admin;
}
