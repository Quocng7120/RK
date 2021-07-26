package KhoiTao;

import java.time.LocalDate;

public class Accounts {

    private int accountID;
    private String email;
    private String username;
    private String fullName;
    private Department department;
    private Position position;
    private LocalDate CreateDate;
    private Group[] groups;

    public Accounts() {
    }

    public Accounts(int accountID, String email, String username, String firstName, String lastName) {
        this.accountID = accountID;
        this.email = email;
        this.username = username;
        this.fullName = firstName + lastName;
        this.position = new Position(1, "Dev");
        this.CreateDate = LocalDate.now();
    }
}
