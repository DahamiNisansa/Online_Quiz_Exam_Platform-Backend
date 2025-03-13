package edu.icet.dto;

import edu.icet.util.UserRoleEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Integer id;
    private String userName;
    private String password;
    private String email;
    private UserRoleEnum role;
    private String address;
    private String firstName;
    private String lastName;
    private String phoneNo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
