//package com.example.SpringDemo.purchase.entity;
//
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//import jakarta.persistence.*;
//import jakarta.validation.constraints.NotNull;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.List;
//@Getter
//@Setter
//@Entity
//public class PurchaseOrder {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @NotNull(message = "PO type cn not be null")
//    private  String poType;
//    private LocalDate deliveryDate;
//    private String guaranteeWarranty;
//
//    @Column(columnDefinition = "Decimal(10,2) default '0.00'")
//    private  Double otherCharges=0.0;
//    @Column(columnDefinition = "Decimal(10,2) default '0.00'")
//    private Double totalGstAmount=0.0;
//    @Column(columnDefinition = "Decimal(10,2) default '0.00'")
//    private Double totalNetAmount=0.0;
//
//    @Column(columnDefinition = "Decimal(10,2) default '0.00'")
//    private Double totalGrossAmount=0.0;
//    private String schedule;
//    private String remarks;
//    private  String  closeReason;
//    private LocalDateTime closeDateTime;
//    private  String  cancelledReason;
//    private LocalDateTime cancelledDateTime;
//    @OneToMany(mappedBy ="purchaseOrder",cascade = CascadeType.ALL)
//    @JsonManagedReference
//    private List<PurchaseOrderDetails> purchaseOrderDetails;
//
//
//}
//
//
//
