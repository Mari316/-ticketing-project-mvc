package com.cydeo.dto;

import com.cydeo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data                     // always bring to View model
public class UserDTO { // we need this obj to bind in the view and then pass it to controller
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private boolean enabled;
    private String phone;
    private RoleDTO role; // in view we are iterating this in order to choose from dropdown
    private Gender gender;

}
