//package tacos;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import lombok.*;
//import org.springframework.data.relational.core.mapping.Table;
//
//@Data
//@Entity
//@AllArgsConstructor
////@RequiredArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
//public class Ingredient {
//    @Id
//    private final String id;
//    private final String name;
//    private final Type type;
//
//    public enum Type {WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE}
//}
//
package tacos;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Table("ingredients")
public class Ingredient {
    @PrimaryKey
    private String id;
    private String name;
    private Type type;

    public enum Type {WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE}
}
