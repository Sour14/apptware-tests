package com.apptware.interview.spring.beans;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
class OnDemandA extends BaseOnDemand {

  OnDemandA(String someString) {
    super(someString);
  }

  @Override
  public SomeEnum getSomeEnum() {
    return SomeEnum.SOME_ENUM_A;
  }
}
