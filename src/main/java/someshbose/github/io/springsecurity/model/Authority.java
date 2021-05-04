package someshbose.github.io.springsecurity.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "SP_AUTHORITY")
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;

    // Omitted getters and setters
}
