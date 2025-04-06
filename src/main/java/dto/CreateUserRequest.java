package dto;

import lombok.*;

@Builder
@AllArgsConstructor
@Getter
public class CreateUserRequest extends BaseRequest {
    private String name;
    private String job;
}
