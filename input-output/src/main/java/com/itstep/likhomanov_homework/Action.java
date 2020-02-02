package com.itstep.likhomanov_homework;

import java.util.List;

@FunctionalInterface
interface Action {

    List<String> apply(List<String> lines);
}
