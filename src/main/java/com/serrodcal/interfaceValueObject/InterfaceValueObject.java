package com.serrodcal.interfaceValueObject;

import org.immutables.value.Value;

import java.util.List;

/**
 * Created by serrodcal on 16/6/16.
 */
@Value.Immutable
public interface InterfaceValueObject {

    String stringProperty();
    Integer integerProperty();
    List<String> listofStringProperties();

}
