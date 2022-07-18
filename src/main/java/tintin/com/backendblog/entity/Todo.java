package tintin.com.backendblog.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tintin.com.backendblog.constant.enums.EPriority;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // co nhieu todo doi voi 1 user
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "id", nullable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    private User user;

    private String title;

    private String description;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "updateDate")
    private Date updateDate;

    private EPriority priority;
}
