package com.comp6251.findaservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "service_request")
public class ServiceRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "service_id")
    private Service service;
    //status (请求状态：等待接受0、拒绝2、接受1、需要更多详细信息3、已完成4)
    @Column(name = "status")
    private int status;
    @Column(name = "customer_detail")
    private String customerDetail;
    @Column(name = "service_categoty")
    private int serviceCategoty;
    @Column(name = "description")
    private String description;
}
