package uz.tuit.census.entity.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;
import uz.tuit.census.entity.base.Auditable;
import uz.tuit.census.enums.PersonCondition;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Where(clause = "deleted is false")
public class PersonStatus extends Auditable {
    @Column
    @Enumerated(value = EnumType.STRING)
    private PersonCondition condition;

    @Column
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<PersonCategory> categories;
}
