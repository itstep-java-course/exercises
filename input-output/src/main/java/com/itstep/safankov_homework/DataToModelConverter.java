package com.itstep.safankov_homework;

import java.util.List;


public interface DataToModelConverter<T> {
    abstract List<T> covert(List<String> data);

}
