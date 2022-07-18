package tintin.com.backendblog.entity;

import lombok.*;
import tintin.com.backendblog.constant.enums.EHousewareStatus;
import tintin.com.backendblog.constant.enums.EHousewareType;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "houseware")
public class Houseware {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String descriptions;

    private EHousewareType type;
    private EHousewareStatus status;
    private Long price;
    private String url;
    private boolean useful;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "update_date")
    private Date updateDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private User user;
}
