//package com.example.SpringDemo.purchase.controller;
//
//import com.example.SpringDemo.purchase.entity.PurchaseOrder;
//import com.example.SpringDemo.purchase.service.PurchaseOrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class PurchaseOrderController {
//    @Autowired
//    private PurchaseOrderService purchaseOrderService;
//
//    @PostMapping("savePo")
//    public ResponseEntity<?> savePo(@RequestBody PurchaseOrder purchaseOrder){
//        return purchaseOrderService.savePo(purchaseOrder);
//    }
//}
