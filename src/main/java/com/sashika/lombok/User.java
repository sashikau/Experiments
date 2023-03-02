package com.sashika.lombok;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Sashika.Udana
 * on 03/Mar/2023
 */

@Builder
@ToString
@EqualsAndHashCode(exclude = {"password"})
public class User {

    @ToString.Include(rank = 1)
    private int id;
    @ToString.Include(name = "userName")
    private String name;
    @ToString.Exclude
    private String password;

    @ToString.Include
    String description() {
        return "User description";
    }
}
