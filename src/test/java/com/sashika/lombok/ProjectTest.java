package com.sashika.lombok;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Sashika.Udana
 * on 02/Mar/2023
 */
public class ProjectTest {

    @Test
    public void testBuilder()
    {
        int id = 1;
        String name = "Test";
        int duration = 200;
        int budget = 100000;

        Project project = Project.builder().id(id).name(name).duration(duration).budget(budget).build();

        assertThat(project.getId()).isEqualTo(id);
        assertThat(project.getName()).isEqualTo(name);
        assertThat(project.getDuration()).isEqualTo(duration);
        assertThat(project.getBudget()).isEqualTo(budget);
        assertThat(project).isEqualTo("Project(1, Test, 200, 100000)");
    }
}
