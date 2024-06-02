package com.teamwill.leasing.Entity.ParamPM;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.teamwill.leasing.Entity.Client;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TblPmActivity")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActivityPm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(length = 30)
    String name;

    @JsonIgnore
    @OneToMany(mappedBy = "activityPm")
    List<Client> clients;

}
