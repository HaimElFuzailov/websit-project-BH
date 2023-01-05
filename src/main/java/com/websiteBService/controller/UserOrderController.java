package com.websiteBService.controller;

import com.websiteBService.model.User;
import com.websiteBService.model.UserOrder;
import com.websiteBService.service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userOrder")
public class UserOrderController {
    @Autowired
    private UserOrderService userOrderService;

    @PostMapping(value = "/create")
    public void createOrder(@RequestBody UserOrder userOrder) throws Exception {
        userOrderService.createOrder(userOrder);
    }
    @PutMapping(value = "/{userOrderId}/update")
    public void updateUserOrderById(@PathVariable Long userOrderId,
                                        @RequestBody UserOrder userOrder) throws Exception {
        userOrderService.updateUserOrderById(userOrderId, userOrder);
    }

    @DeleteMapping(value = "/{userOrderId}/delete")
    public void deleteUserOrderById(@PathVariable Long userOrderId) throws Exception {
        userOrderService.deleteUserOrderById(userOrderId);
    }

    @GetMapping(value = "/{userOrderId}")
    public UserOrder getUserOrderById(@PathVariable Long userOrderId) {
        return userOrderService.getUserOrderById(userOrderId);
    }

    @GetMapping(value = "/{id}/all")
    public List<UserOrder> getAllOrders(@PathVariable Long id){
        return userOrderService.getAllOrders(id);
    }
}
