package com.ppa.enterprise.model;

/**
 * The fixed set of genders a puppy record can have,
 * each with a human-readable label for display.
 */
public enum Gender {

    MALE("Male"),
    FEMALE("Female");

    private final String displayName;

    Gender(String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return the human-readable label shown in the user interface
     */
    public String getDisplayName() {
        return displayName;
    }
}
