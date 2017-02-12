package com.livingoncodes.dto;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by sudip sarker on 2/12/2017.
 */
public class RegistrationForm {
    @NotEmpty
    private String boardName;
    @Size(min=4, max=100)
    private String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getBoardName() {
        return password;
    }
    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }
}
