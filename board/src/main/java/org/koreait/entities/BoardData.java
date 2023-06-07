package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@Entity
@NoArgsConstructor @AllArgsConstructor
//@EqualsAndHashCode(callSuper=false)
public class BoardData extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String subject;

    @Lob
    @Column(nullable = false)
    private String content;
}
