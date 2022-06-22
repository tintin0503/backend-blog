package tintin.com.backendblog.dto.tutorial;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TutorialDto {
    private long id;
    private String title;
    private String descriptions;
    private boolean published;
    @JsonProperty("created_date")
    private Date createdDate;
}
