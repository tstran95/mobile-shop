package com.vn.mobileshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAccount;

    @NotEmpty(message = "First Name can't be empty")
    @Size(min = 1 , max = 200)
    private String firstName;

    @NotEmpty(message = "Last Name can't be empty")
    @Size(min = 1 , max = 200)
    private String lastName;

    @NotEmpty(message = "Email can't be empty")
    @Email(message = "Must be email")
    private String email;

    @NotEmpty(message = "User Name can't be empty")
    private String userName;

    @NotEmpty(message = "Password can't be empty")
    private String password;

    @NotEmpty(message = "Password can't be empty")
    private String passConfirm;

    @NotNull(message = "Gender can't be empty")
    private Integer gender;

    private boolean enable;

    @ManyToMany(mappedBy = "accounts")
    private Set<Role> roles = new HashSet<>();

    @AssertTrue(message = "Password  should match")
    public boolean isPasswordsEqual() {
        return password != null && password.equals(passConfirm);
    }
}
