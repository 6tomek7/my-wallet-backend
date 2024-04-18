package com.mywalletdatabase.mywalletdatabase.web.model.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class UserCreateRequest implements Serializable {
  @JsonProperty("nick_name")
  private String NickName;

  @JsonProperty("first_name")
  private String firstName;

  @JsonProperty("last_name")
  private String lastName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("password")
  private String password;

}
