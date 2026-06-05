package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.MultiType;
import com.alibaba.fastjson2.util.ParameterizedTypeImpl;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class TypeReference<T> {
    protected final Class<? super T> rawType;
    protected final Type type;

    public static Type arrayType(Class<?> cls) {
        return new BeanUtils.GenericArrayTypeImpl(cls);
    }

    private static Type canonicalize(Class<?> cls, ParameterizedType parameterizedType, Type[] typeArr, int i) {
        char c;
        Type rawType = parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
            if ((actualTypeArguments[i2] instanceof TypeVariable) && i < typeArr.length) {
                actualTypeArguments[i2] = typeArr[i];
                i++;
            }
            Type genericComponentType = actualTypeArguments[i2];
            if (genericComponentType instanceof GenericArrayType) {
                int i3 = 0;
                while (genericComponentType instanceof GenericArrayType) {
                    i3++;
                    genericComponentType = ((GenericArrayType) genericComponentType).getGenericComponentType();
                }
                if (genericComponentType instanceof Class) {
                    Class cls2 = (Class) genericComponentType;
                    if (cls2.isPrimitive()) {
                        if (cls2 == Integer.TYPE) {
                            c = 'I';
                        } else if (cls2 == Long.TYPE) {
                            c = 'J';
                        } else if (cls2 == Float.TYPE) {
                            c = 'F';
                        } else if (cls2 == Double.TYPE) {
                            c = 'D';
                        } else if (cls2 == Boolean.TYPE) {
                            c = 'Z';
                        } else if (cls2 == Character.TYPE) {
                            c = 'C';
                        } else if (cls2 == Byte.TYPE) {
                            c = 'B';
                        } else if (cls2 == Short.TYPE) {
                            c = 'S';
                        }
                        char[] cArr = new char[i3 + 1];
                        for (int i4 = 0; i4 < i3; i4++) {
                            cArr[i4] = '[';
                        }
                        cArr[i3] = c;
                        actualTypeArguments[i2] = TypeUtils.loadClass(new String(cArr));
                    }
                }
            }
            Type type = actualTypeArguments[i2];
            if (type instanceof ParameterizedType) {
                actualTypeArguments[i2] = canonicalize(cls, (ParameterizedType) type, typeArr, i);
            }
        }
        return new ParameterizedTypeImpl(actualTypeArguments, cls, rawType);
    }

    public static Type collectionType(Class<? extends Collection> cls, Class<?> cls2) {
        return new ParameterizedTypeImpl(cls, cls2);
    }

    public static TypeReference<?> get(Type type) {
        return new TypeReference<Object>(type) { // from class: com.alibaba.fastjson2.TypeReference.1
        };
    }

    public static Type mapType(Class<? extends Map> cls, Class<?> cls2, Class<?> cls3) {
        return new ParameterizedTypeImpl(cls, cls2, cls3);
    }

    public static Type of(Type... typeArr) {
        return new MultiType(typeArr);
    }

    public static Type parametricType(Class<?> cls, Class<?>... clsArr) {
        return new ParameterizedTypeImpl(cls, clsArr);
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public List<T> parseArray(String str, JSONReader.Feature... featureArr) {
        return JSON.parseArray(str, this.type, featureArr);
    }

    public T parseObject(String str) {
        return (T) JSON.parseObject(str, this.type);
    }

    public T to(JSONArray jSONArray) {
        return (T) jSONArray.to(this.type);
    }

    @Deprecated
    public T toJavaObject(JSONArray jSONArray) {
        return (T) jSONArray.to(this.type);
    }

    public TypeReference() {
        Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.type = type;
        this.rawType = (Class<? super T>) BeanUtils.getRawType(type);
    }

    public static Type mapType(Class<?> cls, Type type) {
        return new ParameterizedTypeImpl(Map.class, cls, type);
    }

    public static Type parametricType(Class<?> cls, Type... typeArr) {
        return new ParameterizedTypeImpl(cls, typeArr);
    }

    public List<T> parseArray(byte[] bArr, JSONReader.Feature... featureArr) {
        return JSON.parseArray(bArr, this.type, featureArr);
    }

    public T parseObject(byte[] bArr) {
        return (T) JSON.parseObject(bArr, this.type);
    }

    public T to(JSONObject jSONObject, JSONReader.Feature... featureArr) {
        return (T) jSONObject.to(this.type, featureArr);
    }

    @Deprecated
    public T toJavaObject(JSONObject jSONObject, JSONReader.Feature... featureArr) {
        return (T) jSONObject.to(this.type, featureArr);
    }

    private TypeReference(Type type) {
        type.getClass();
        this.type = BeanUtils.canonicalize(type);
        this.rawType = (Class<? super T>) BeanUtils.getRawType(type);
    }

    public TypeReference(Type... typeArr) {
        if (typeArr != null && typeArr.length != 0) {
            if (typeArr.length == 1 && typeArr[0] == null) {
                typeArr = new Type[]{Object.class};
            }
            Class<?> cls = getClass();
            Type typeCanonicalize = canonicalize(cls, (ParameterizedType) ((ParameterizedType) cls.getGenericSuperclass()).getActualTypeArguments()[0], typeArr, 0);
            this.type = typeCanonicalize;
            this.rawType = (Class<? super T>) BeanUtils.getRawType(typeCanonicalize);
            return;
        }
        throw null;
    }
}
