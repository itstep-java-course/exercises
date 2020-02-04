package com.itstep.perepeliatnyk_homework;

import java.util.List;

public interface DataToModelConverter <T> {

    List <T> convert(List<String> data);
}
