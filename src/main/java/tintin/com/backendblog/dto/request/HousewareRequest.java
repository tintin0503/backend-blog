package tintin.com.backendblog.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tintin.com.backendblog.constant.enums.EHousewareStatus;
import tintin.com.backendblog.constant.enums.EHousewareType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HousewareRequest {

    private String name;
    private String descriptions;

    private EHousewareType type;
    private EHousewareStatus status;
    private Long price;
    private String url;
    private boolean useful;
//    private Date createDate;
//    private Date updateDate;
}
