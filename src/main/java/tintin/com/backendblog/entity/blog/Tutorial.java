package tintin.com.backendblog.entity.blog;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "tutorial")
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tutorial_generator")
    private long id;
    private String title;
    private String descriptions;
    private boolean published;
    @Column(name = "created_date")
    private Date createdDate;
}
