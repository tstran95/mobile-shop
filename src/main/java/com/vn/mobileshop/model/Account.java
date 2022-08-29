package com.vn.mobileshop.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.validator.constraints.Range;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_account")
    private Long idAccount;

    @NotEmpty(message = "First Name can't be empty")
    @Size(min = 1, max = 200 , message = "Size must be in rage 6-200")
    @Column(name = "first_name")
    private String firstName;

    @NotEmpty(message = "Last Name can't be empty")
    @Size(min = 1, max = 200 , message = "Size must be in rage 6-200")
    @Column(name = "last_name")
    private String lastName;

    @NotEmpty(message = "Email can't be empty")
    @Email(message = "Must be email")
    @Column(name = "email" , unique = true)
    private String email;

    @NotEmpty(message = "User Name can't be empty")
    private String userName;

    @NotEmpty(message = "Password can't be empty")
    @Size(min = 6 , max = 256, message = "Password must in rage 6-256")
    @Column(name = "password")
    private String password;

    @NotEmpty(message = "Password can't be empty")
    @Column(name = "pass_confirm")
    private String passConfirm;

    @NotNull(message = "Gender can't be empty")
    @Range(max = 1, message = "Gender not match!!")
    @Column(name = "gender")
    private Integer gender;

    @Column(name = "is_enable")
    private boolean enable;

    @ManyToMany(mappedBy = "accounts" , cascade = CascadeType.ALL)
    private Set<Role> roles = new HashSet<>();

    @Transient
    private boolean passwordsEqual;
    @AssertTrue(message = "Password and Password Confirm should match")
    public boolean isPasswordsEqual() {
        this.passwordsEqual = password != null && password.equals(passConfirm);
        return this.passwordsEqual;
    }
}
