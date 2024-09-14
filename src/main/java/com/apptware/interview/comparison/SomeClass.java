package com.apptware.interview.comparison;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Objects;

@Data
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
class SomeClass {

  // This is a unique identifier
  private Integer id;
  private Date lastInvoked;


}
