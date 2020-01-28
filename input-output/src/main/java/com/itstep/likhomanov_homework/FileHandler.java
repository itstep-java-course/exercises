package com.itstep.likhomanov_homework;

import java.util.List;

interface FileHandler {

    String NAMES_PATH = "input-output/src/main/java/com/itstep/likhomanov_homework/data/names.txt";
    String ADDRESSES_PATH = "input-output/src/main/java/com/itstep/likhomanov_homework/data/addresses.txt";
    String PROFILES_PATH = "input-output/src/main/java/com/itstep/likhomanov_homework/data/userProfiles.txt";

    String NAMES_HEADER = "id;name;last_name";
    String ADDRESSES_HEADER = "id;street;house";
    String PROFILE_HEADER = "id;name;last_name;street;house;age";

    default boolean writeFile(String path, String header, List<?> data){
        return false;
    }

    default List<String> readFile(String path){
        return null;
    }
}
