package networkcalls;

import apiclient.ApiClient;
import dto.CreateUserResponse;
import dto.CreateUserRequest;
import dto.UserDataResponse;

public class UserAPI {

    public UserDataResponse getListOfUsers() {
        return new ApiClient().getSpecification("/users", UserDataResponse.class);
    }

    public CreateUserResponse postUser(CreateUserRequest createUserRequest) {
        return new ApiClient().postSpecification("/users", createUserRequest,
                CreateUserResponse.class);
    }

}
