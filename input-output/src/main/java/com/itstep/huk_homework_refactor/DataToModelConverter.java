package com.itstep.huk_homework_refactor;

import java.util.List;

public interface DataToModelConverter<T> {
    public List<T> convert (List<String> content );

}
