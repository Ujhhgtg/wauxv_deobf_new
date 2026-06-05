package com.alibaba.fastjson2.introspect;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface PropertyAccessor {
    boolean getBooleanValue(Object obj);

    byte getByteValue(Object obj);

    char getCharValue(Object obj);

    double getDoubleValue(Object obj);

    float getFloatValue(Object obj);

    int getIntValue(Object obj);

    long getLongValue(Object obj);

    Object getObject(Object obj);

    short getShortValue(Object obj);

    String name();

    Class<?> propertyClass();

    Type propertyType();

    void setBooleanValue(Object obj, boolean z);

    void setByteValue(Object obj, byte b);

    void setCharValue(Object obj, char c);

    void setDoubleValue(Object obj, double d);

    void setFloatValue(Object obj, float f);

    void setIntValue(Object obj, int i);

    void setLongValue(Object obj, long j);

    void setObject(Object obj, Object obj2);

    void setShortValue(Object obj, short s);

    boolean supportGet();

    boolean supportSet();
}
