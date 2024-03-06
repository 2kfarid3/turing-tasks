package az.edu.turing.EnumPractice;

public enum AccountStatus {
    ACTIVE("Farid Karimli", 200), CLOSED("closed", 500);

    private final String otherName;
    private final int code;
    AccountStatus(String otherName, int code) {
        this.otherName = otherName;
        this.code = code;
    }

    public String getOtherName() {
        return otherName;
    }

    public int getCode() {
        return code;
    }
}
