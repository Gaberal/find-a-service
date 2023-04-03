package com.comp6251.findaservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "service_provider")
public class ServiceProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "description")
    private String description;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "address")
    private String address;
    @Column(name = "isApproved")
    private int isApproved;
    @Column(name = "service_ategoty")
    private int serviceCategoty;
    @OneToMany(mappedBy = "serviceProvider",cascade = CascadeType.PERSIST)
    private List<Service> services;

}
