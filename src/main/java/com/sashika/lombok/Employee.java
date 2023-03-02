package com.sashika.lombok;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Sashika.Udana
 * on 02/Mar/2023
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Employee {

    private int id;
    private String name;
    private DESIGNATION designation;
}
