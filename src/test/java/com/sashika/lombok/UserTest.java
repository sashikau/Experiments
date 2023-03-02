package com.sashika.lombok;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Sashika.Udana
 * on 03/Mar/2023
 */
public class UserTest {

    @Test
    public void testToString() {
        User user = User.builder().name("Adam").id(3).password("a44r55d").build();

        assertThat(user.toString()).isEqualTo("User(id=3, userName=Adam, description=User description)");
    }

    @Test
    public void testEquality_whenAllFieldsButPasswordDifferent_thenReturnTrue()
    {
        User user1 = User.builder().name("Adam").id(3).password("A").build();
        User user2 = User.builder().name("Adam").id(3).password("B").build();

        assertThat(user1.equals(user2)).isTrue();
    }

    @Test
    public void testEquality_whenAnyFieldChangedOtherThanPassword_thenReturnFalse()
    {
        User user1 = User.builder().name("Adam").id(3).password("A").build();
        User user2 = User.builder().name("Ben").id(3).password("B").build();

        assertThat(user1.equals(user2)).isFalse();
    }
}
