package com.itstep.strahov_homework;

import java.util.List;

public interface DataToModelConverter<T> {
    List<T> convert(List<String> content);



}
