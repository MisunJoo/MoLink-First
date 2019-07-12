package com.mashup.molinkfirst.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponseModel<T> {
  private int statusCode;
  private String message;
  private T data;
}
