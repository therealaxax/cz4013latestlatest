package com.client;

public class AttributeValueInt extends AttributeValue {
  Integer value;

  AttributeValueInt(String attribute, Integer value){
    super(attribute);
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }
}
