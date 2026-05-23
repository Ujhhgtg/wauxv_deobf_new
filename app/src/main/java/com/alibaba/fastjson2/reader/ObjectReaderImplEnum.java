package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC1194;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplEnum implements ObjectReader {
    final Method createMethod;
    final Type createMethodParamType;
    final Class enumClass;
    private final long[] enumNameHashCodes;
    private final Enum[] enums;
    private long[] intValues;
    private final Enum[] ordinalEnums;
    private String[] stringValues;
    final long typeNameHash;
    final Member valueField;
    final Type valueFieldType;

    /* JADX WARN: Multi-variable type inference failed */
    public ObjectReaderImplEnum(Class cls, Method method, Member member, Enum[] enumArr, Enum[] enumArr2, long[] jArr) {
        this.enumClass = cls;
        this.createMethod = method;
        if (member instanceof AccessibleObject) {
            ((AccessibleObject) member).setAccessible(true);
        }
        this.valueField = member;
        Class<?> cls2 = null;
        Class<?> type = member instanceof Field ? ((Field) member).getType() : member instanceof Method ? ((Method) member).getReturnType() : null;
        this.valueFieldType = type;
        if (type != null) {
            this.stringValues = new String[enumArr.length];
            if (type != String.class) {
                this.intValues = new long[enumArr.length];
            }
            for (int i = 0; i < enumArr.length; i++) {
                Enum r9 = enumArr[i];
                try {
                    Object objInvoke = member instanceof Field ? ((Field) member).get(r9) : ((Method) member).invoke(r9, null);
                    if (type == String.class) {
                        this.stringValues[i] = (String) objInvoke;
                    } else {
                        this.stringValues[i] = objInvoke == null ? null : objInvoke.toString();
                        if (objInvoke instanceof Number) {
                            this.intValues[i] = ((Number) objInvoke).longValue();
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (method != null && method.getParameterCount() == 1) {
            cls2 = method.getParameterTypes()[0];
        }
        this.createMethodParamType = cls2;
        this.typeNameHash = Fnv.hashCode64(TypeUtils.getTypeName(cls));
        this.enums = enumArr;
        this.ordinalEnums = enumArr2;
        this.enumNameHashCodes = jArr;
    }

    private void oomCheck(Type type) {
        if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
            throw new JSONException("ObjectReaderImplEnum parses error, JSONReader not forward when field type belongs to collection to avoid OOM");
        }
    }

    public Enum getEnum(String str) {
        if (str == null) {
            return null;
        }
        return getEnumByHashCode(Fnv.hashCode64(str));
    }

    public Enum getEnumByHashCode(long j) {
        int iBinarySearch;
        if (this.enums != null && (iBinarySearch = Arrays.binarySearch(this.enumNameHashCodes, j)) >= 0) {
            return this.enums[iBinarySearch];
        }
        return null;
    }

    public Enum getEnumByOrdinal(int i) {
        if (i >= 0) {
            Enum[] enumArr = this.ordinalEnums;
            if (i < enumArr.length) {
                return enumArr[i];
            }
        }
        throw new JSONException("No enum ordinal " + this.enumClass.getCanonicalName() + "." + i);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return this.enumClass;
    }

    public Enum of(int i) {
        Member member = this.valueField;
        Enum r1 = null;
        if (member == null) {
            if (i >= 0) {
                Enum[] enumArr = this.ordinalEnums;
                if (i < enumArr.length) {
                    return enumArr[i];
                }
            }
            return null;
        }
        try {
            int i2 = 0;
            if (!(member instanceof Field)) {
                Method method = (Method) member;
                while (true) {
                    Enum[] enumArr2 = this.enums;
                    if (i2 >= enumArr2.length) {
                        break;
                    }
                    Enum r2 = enumArr2[i2];
                    if (((Number) method.invoke(r2, null)).intValue() == i) {
                        r1 = r2;
                        break;
                    }
                    i2++;
                }
            } else {
                while (true) {
                    Enum[] enumArr3 = this.enums;
                    if (i2 >= enumArr3.length) {
                        break;
                    }
                    Enum r0 = enumArr3[i2];
                    if (((Field) this.valueField).getInt(r0) == i) {
                        r1 = r0;
                        break;
                    }
                    i2++;
                }
            }
            if (r1 != null) {
                return r1;
            }
            throw new JSONException(AbstractC1194.m2779(i, "None enum ordinal or value "));
        } catch (Exception e) {
            throw new JSONException("parse enum error, class " + this.enumClass.getName() + ", value " + i, e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        Enum enumByHashCode;
        int offset = jSONReader.getOffset();
        int type2 = jSONReader.getType();
        if (type2 == -110) {
            ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(this.enumClass, 0L, j);
            if (objectReaderCheckAutoType != null) {
                if (objectReaderCheckAutoType != this) {
                    return objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j);
                }
            } else if (jSONReader.isEnabled(JSONReader.Feature.ErrorOnNotSupportAutoType)) {
                throw new JSONException(jSONReader.info("not support enumType : " + jSONReader.getString()));
            }
        }
        if (type2 >= -16 && type2 <= 72) {
            if (type2 <= 47) {
                jSONReader.next();
            } else {
                type2 = jSONReader.readInt32Value();
            }
            if (type2 >= 0) {
                Enum[] enumArr = this.ordinalEnums;
                if (type2 < enumArr.length) {
                    enumByHashCode = enumArr[type2];
                }
            }
            throw new JSONException("No enum ordinal " + this.enumClass.getCanonicalName() + "." + type2);
        }
        if (jSONReader.nextIfNullOrEmptyString()) {
            return null;
        }
        enumByHashCode = getEnumByHashCode(jSONReader.readValueHashCode());
        if (enumByHashCode == null) {
            enumByHashCode = getEnumByHashCode(jSONReader.getNameHashCodeLCase());
        }
        if (enumByHashCode == null && jSONReader.getOffset() == offset) {
            oomCheck(type);
        }
        return enumByHashCode;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        int i;
        int offset = jSONReader.getOffset();
        Type type2 = this.createMethodParamType;
        Enum enumValueOf = null;
        if (type2 != null) {
            Object obj2 = jSONReader.read(type2);
            try {
                return this.createMethod.invoke(null, obj2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new JSONException(jSONReader.info("create enum error, enumClass " + this.enumClass.getName() + ", paramValue " + obj2), e);
            }
        }
        int i2 = 0;
        if (jSONReader.isInt()) {
            int int32Value = jSONReader.readInt32Value();
            if (this.valueField == null) {
                if (int32Value >= 0) {
                    Enum[] enumArr = this.ordinalEnums;
                    if (int32Value < enumArr.length) {
                        enumValueOf = enumArr[int32Value];
                    }
                }
                throw new JSONException("No enum ordinal " + this.enumClass.getCanonicalName() + "." + int32Value);
            }
            if (this.intValues != null) {
                while (true) {
                    long[] jArr = this.intValues;
                    if (i2 >= jArr.length) {
                        break;
                    }
                    if (jArr[i2] == int32Value) {
                        enumValueOf = this.enums[i2];
                        break;
                    }
                    i2++;
                }
            }
            if (enumValueOf == null && jSONReader.isEnabled(JSONReader.Feature.ErrorOnEnumNotMatch)) {
                throw new JSONException(jSONReader.info("parse enum error, class " + this.enumClass.getName() + ", " + this.valueField.getName() + " " + int32Value));
            }
        } else if (!jSONReader.nextIfNullOrEmptyString()) {
            if (this.stringValues != null && jSONReader.isString()) {
                String string = jSONReader.readString();
                while (true) {
                    String[] strArr = this.stringValues;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if (string.equals(strArr[i2])) {
                        enumValueOf = this.enums[i2];
                        break;
                    }
                    i2++;
                }
                if (enumValueOf == null && this.valueField != null) {
                    try {
                        enumValueOf = Enum.valueOf(this.enumClass, string);
                    } catch (IllegalArgumentException unused) {
                    }
                }
            } else if (this.intValues == null || !jSONReader.isInt()) {
                long valueHashCode = jSONReader.readValueHashCode();
                if (valueHashCode == Fnv.MAGIC_HASH_CODE) {
                    return null;
                }
                Enum enumByHashCode = getEnumByHashCode(valueHashCode);
                if (enumByHashCode == null) {
                    enumByHashCode = getEnumByHashCode(jSONReader.getNameHashCodeLCase());
                }
                if (enumByHashCode == null) {
                    String string2 = jSONReader.getString();
                    if (TypeUtils.isInteger(string2) && (i = Integer.parseInt(string2)) >= 0) {
                        Enum[] enumArr2 = this.ordinalEnums;
                        if (i < enumArr2.length) {
                            enumByHashCode = enumArr2[i];
                        }
                    }
                }
                enumValueOf = enumByHashCode;
            } else {
                int int32Value2 = jSONReader.readInt32Value();
                while (true) {
                    long[] jArr2 = this.intValues;
                    if (i2 >= jArr2.length) {
                        break;
                    }
                    if (jArr2[i2] == int32Value2) {
                        enumValueOf = this.enums[i2];
                        break;
                    }
                    i2++;
                }
            }
            if (enumValueOf == null && jSONReader.isEnabled(JSONReader.Feature.ErrorOnEnumNotMatch)) {
                throw new JSONException(jSONReader.info("parse enum error, class " + this.enumClass.getName() + ", value " + jSONReader.getString()));
            }
        }
        if (enumValueOf == null && jSONReader.getOffset() == offset) {
            oomCheck(type);
        }
        return enumValueOf;
    }
}
