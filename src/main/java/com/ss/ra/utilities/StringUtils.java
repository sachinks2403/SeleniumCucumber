package com.ss.ra.utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class StringUtils {

    public static String randomString() {
        String generatedString = RandomStringUtils.randomAlphabetic(6);
        return generatedString;
    }
}
