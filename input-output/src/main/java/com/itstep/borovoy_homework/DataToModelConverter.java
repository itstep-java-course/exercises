package com.itstep.borovoy_homework;

import java.util.List;

@FunctionalInterface
public interface DataToModelConverter<T> {
     List<T> convert(List<String> list);

}


