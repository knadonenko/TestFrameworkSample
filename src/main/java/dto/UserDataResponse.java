package dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

import java.util.List;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDataResponse {
    private int page;
    private int per_page;
    private int total;
    private int total_pages;
    private List<UserData> data;
}
