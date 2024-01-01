package com.mywalletdatabase.mywalletdatabase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String nick_name;
    private String name;
    private String last_name;
    private String password;
    private String email;

}
