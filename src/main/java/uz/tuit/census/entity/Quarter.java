package uz.tuit.census.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;
import uz.tuit.census.entity.base.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Where(clause = "deleted is false")
public class Quarter extends Auditable {

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String code;

}
