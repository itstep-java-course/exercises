package com.itstep.likhomanov_homework;

import java.util.List;

interface DataToModelConverter<T> {

    List<T> convert(List<String> data);
}
