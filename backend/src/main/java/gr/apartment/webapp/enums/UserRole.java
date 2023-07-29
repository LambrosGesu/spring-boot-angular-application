package gr.apartment.webapp.enums;

public enum UserRole {
    ADMIN("ADMIN"),
    USER("USER"),
    HOST("HOST");

    private final String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public static UserRole fromValue(String value) {
        if (value == null) {
            return USER; // default value
        }

        try {
            return valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e) {
            return USER; // default value
        }
    }
}
