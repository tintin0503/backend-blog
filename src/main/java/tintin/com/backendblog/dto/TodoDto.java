package tintin.com.backendblog.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tintin.com.backendblog.constant.enums.EPriority;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TodoDto {
    @JsonProperty("user_id")
    private String userId;
    private String title;
    private String description;
    @JsonProperty("create_date")
    private Date createDate;
    @JsonProperty("update_date")
    private Date updatedDate;

    private EPriority priority;
}
