package dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class CreateUserResponse {
    private String name;
    private String job;
    private String id;
//    private ZonedDateTime createdAt;
}
