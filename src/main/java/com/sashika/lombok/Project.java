package com.sashika.lombok;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by Sashika.Udana
 * on 02/Mar/2023
 */
@Builder
@Getter
@ToString(includeFieldNames = false)
public class Project {

    private int id;
    private String name;
    private int duration;
    private int budget;
}
