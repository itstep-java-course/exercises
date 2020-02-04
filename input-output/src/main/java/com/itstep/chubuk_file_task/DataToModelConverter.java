package com.itstep.chubuk_file_task;

import java.util.List;

public interface DataToModelConverter<T>
{
    abstract List<T> covert(List<String> data);
}
