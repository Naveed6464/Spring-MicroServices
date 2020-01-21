/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naveed.micro.services.demo.controller;

import org.springframework.core.env.Environment;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 21, 2020
 */
class ResponseWrapper<T> {

    private final Integer port;
    private final T data;

    public ResponseWrapper(final Environment environment, final T data) {
        String serverPort = environment.getProperty("server.port");
        this.port = serverPort != null ? Integer.parseInt(serverPort) : null;
        this.data = data;
    }

    public Integer getPort() {
        return port;
    }

    public T getData() {
        return data;
    }
}
