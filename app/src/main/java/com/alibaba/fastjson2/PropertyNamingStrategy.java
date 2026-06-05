package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.BeanUtils;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public enum PropertyNamingStrategy {
    CamelCase,
    CamelCase1x,
    PascalCase,
    SnakeCase,
    UpperCase,
    UpperCamelCaseWithSpaces,
    UpperCamelCaseWithUnderScores,
    UpperCamelCaseWithDashes,
    UpperCamelCaseWithDots,
    KebabCase,
    UpperCaseWithUnderScores,
    UpperCaseWithDashes,
    UpperCaseWithDots,
    LowerCase,
    LowerCaseWithUnderScores,
    LowerCaseWithDashes,
    LowerCaseWithDots,
    NeverUseThisValueExceptDefaultValue;

    public static PropertyNamingStrategy of(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        switch (str) {
            case "Camel":
            case "camel":
                return CamelCase;
            case "Lower":
            case "lower":
                return LowerCase;
            case "Upper":
            case "upper":
                return UpperCase;
            default:
                for (PropertyNamingStrategy propertyNamingStrategy : values()) {
                    if (propertyNamingStrategy.name().equals(str)) {
                        return propertyNamingStrategy;
                    }
                }
                return null;
        }
    }

    public static String snakeToCamel(String str) {
        if (str == null || str.indexOf(95) == -1) {
            return str;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '_') {
                i++;
            }
        }
        char[] cArr = new char[str.length() - i];
        int i3 = 0;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt != '_') {
                if (i4 > 0 && str.charAt(i4 - 1) == '_' && cCharAt >= 'a' && cCharAt <= 'z') {
                    cCharAt = (char) (cCharAt - ' ');
                }
                cArr[i3] = cCharAt;
                i3++;
            }
        }
        return new String(cArr);
    }

    public String fieldName(String str) {
        return BeanUtils.fieldName(str, name());
    }
}
