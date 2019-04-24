package com.example.custom;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Endpoint(id = "mypoint")
@Component
public class CustomEndPoint {
  @ReadOperation
  public String myPoint() {
    return "{\"Value\": \"New custom end point\"}";
  }
}
