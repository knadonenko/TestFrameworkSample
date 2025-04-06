package restAssuredTests;

import dto.CreateUserResponse;
import dto.CreateUserRequest;
import dto.UserDataResponse;
import networkcalls.UserAPI;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetUsersComplexTest {

    @Test
    public void getUsersTest() {
        UserDataResponse userDataResponse = new UserAPI().getListOfUsers();

        assertEquals("George", userDataResponse.getData().getFirst().getFirst_name());
    }

    @Test
    public void createUserTest() {
        CreateUserResponse userDataResponse = new UserAPI().postUser(CreateUserRequest.builder()
                .name("morpheus")
                .job("leader").build());

        assertAll(
                () -> assertEquals("morpheus", userDataResponse.getName()),
                () -> assertEquals("leader", userDataResponse.getJob())
        );
    }

}
