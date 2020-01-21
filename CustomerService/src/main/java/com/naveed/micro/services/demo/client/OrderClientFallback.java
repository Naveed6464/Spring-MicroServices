/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naveed.micro.services.demo.client;

import java.util.Collections;
import org.springframework.stereotype.Component;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 21, 2020
 */
@Component
public class OrderClientFallback implements OrderClient {

    @Override
    public Object getOrdersForCustomer(int customerId) {
        return Collections.emptyList();
    }
}
