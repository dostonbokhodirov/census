package uz.tuit.census.entity.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PersonCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<PersonSubCategory> subCategories;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private PersonCategory category;

}
