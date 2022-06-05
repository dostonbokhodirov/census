package uz.tuit.census.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;
import uz.tuit.census.entity.base.Auditable;
import uz.tuit.census.enums.AuthRole;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Where(clause = "deleted is false")
public class AuthUser extends Auditable {

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column
    @Enumerated(value = EnumType.STRING)
    private AuthRole role;

    @Column
    @OneToOne(cascade = CascadeType.ALL)
    private Quarter quarter;

}
