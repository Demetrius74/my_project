package org.example.rest.client;
import org.example.rest.client.types.UserListType;
import okhttp3.Request;
import org.example.dto.UserDto;

import java.util.List;

public class UserApiClient extends RestClient<UserDto, List<UserDto>>{
    private static final String USER_ENDPOINT = "/users";
    public UserApiClient(String baseUrl) {
        super(baseUrl, UserDto.class, new UserListType());
    }

    @Override
    public List<UserDto> get() {
        Request.Builder request = createRequest(USER_ENDPOINT);
        return excecuteAndGetList(request.build());
    }

    @Override
    public UserDto post(UserDto user) {
        Request request = createRequest(USER_ENDPOINT)
                .post(createBody(user))
                .build();
        return execute(request);
    }

    @Override
    public void delete(Long id) {

    }
}
