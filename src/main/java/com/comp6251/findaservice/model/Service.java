package com.comp6251.findaservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "service_provider_id")
    private ServiceProvider serviceProvider;
    @Column(name = "category")
    private int category;
    @Column(name = "description")
    private String description;
    @ElementCollection
    private List<String> photos;
    @Column(name = "price")
    private BigDecimal price;
    @ElementCollection
    private List<String> areasCovered;
    //可用性
    @Column(name = "availability")
    private String availability;

}
