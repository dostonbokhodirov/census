package uz.tuit.census.entity.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;
import uz.tuit.census.entity.base.Auditable;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Where(clause = "deleted is false")
public class PersonAddress extends Auditable {
    private String region;
    private String district;
    private String quarter;
    private String street;
    private String home;
}
