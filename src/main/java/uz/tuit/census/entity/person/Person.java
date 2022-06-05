package uz.tuit.census.entity.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;
import uz.tuit.census.entity.Quarter;
import uz.tuit.census.entity.base.Auditable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Where(clause = "deleted is false")
public class Person extends Auditable {

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String middleName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    @OneToOne(cascade = CascadeType.ALL)
    private PersonAddress address;

    @Column(nullable = false)
    private Date birthDate;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String passportSerial;

    @Column(nullable = false)
    private String jshshir;

    @Column(nullable = false)
    @OneToOne(cascade = CascadeType.ALL)
    private PersonStatus status;

    @Column(nullable = false)
    @OneToOne(cascade = CascadeType.ALL)
    private Quarter quarter;
}
