package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String princFirstName;
    private String princLastname;

    public Principal(String princLastname, String princFirstName){
        this.princLastname = princLastname;
        this.princFirstName = princFirstName;
    }

    public String getPrincFirstName() {
        return princFirstName;
    }

    public String getPrincLastname() {
        return princLastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(princFirstName, principal.princFirstName) && Objects.equals(princLastname, principal.princLastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(princFirstName, princLastname);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "princFirstName='" + princFirstName + '\'' +
                ", princLastname='" + princLastname + '\'' +
                '}';
    }
}
