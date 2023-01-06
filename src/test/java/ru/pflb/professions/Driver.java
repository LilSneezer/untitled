package ru.pflb.professions;

import ru.pflb.Person;

public class Driver extends Person {
    private String drivingExperience;
    private String licenseId;

    public Driver(String drivingExperience, String licenseId, String age, String name) {
        super(age, name);
        this.drivingExperience = drivingExperience;
        this.licenseId = licenseId;
    }

    public String toString() {
        return name + " - Возраст: " + age + "\n" +
                "- стаж: " + drivingExperience + "\n" +
                "- № удостоверения: " + licenseId;
    }

}
