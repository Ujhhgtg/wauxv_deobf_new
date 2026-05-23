package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.function.ObjBoolConsumer;
import com.alibaba.fastjson2.function.ObjByteConsumer;
import com.alibaba.fastjson2.function.ObjCharConsumer;
import com.alibaba.fastjson2.function.ObjFloatConsumer;
import com.alibaba.fastjson2.function.ObjShortConsumer;
import com.alibaba.fastjson2.function.ToByteFunction;
import com.alibaba.fastjson2.function.ToCharFunction;
import com.alibaba.fastjson2.function.ToFloatFunction;
import com.alibaba.fastjson2.function.ToShortFunction;
import com.alibaba.fastjson2.introspect.PropertyAccessor;
import com.alibaba.fastjson2.introspect.PropertyAccessorFactory;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.JdbcSupport;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import p000.C1309;
import p000.C1310;
import p000.C1312;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class FieldReader<T> implements Comparable<FieldReader> {
    public final Object defaultValue;
    public final long features;
    public final Field field;
    public final Class fieldClass;
    final boolean fieldClassSerializable;
    public final String fieldName;
    final long fieldNameHash;
    final long fieldNameHashLCase;
    protected final long fieldOffset;
    public final Type fieldType;
    public final String format;
    final BiConsumer function;
    Class itemClass;
    volatile ObjectReader itemReader;
    Type itemType;
    public final Locale locale;
    public final Method method;
    final boolean noneStaticMemberClass;
    public final int ordinal;
    final String paramName;
    final long paramNameHash;
    final Parameter parameter;
    protected final PropertyAccessor propertyAccessor;
    final boolean readOnly;
    volatile ObjectReader reader;
    volatile JSONPath referenceCache;
    public final JSONSchema schema;

    public FieldReader(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field) {
        this(str, type, cls, i, j, str2, locale, obj, jSONSchema, method, field, null, null, null);
    }

    public static ObjectReader createFormattedObjectReader(Type type, Class cls, String str, Locale locale) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String typeName = type.getTypeName();
        typeName.getClass();
        switch (typeName) {
            case "byte[]":
            case "[B":
                return new ObjectReaderImplInt8Array(str);
            case "java.sql.Date":
                return JdbcSupport.createDateReader((Class) type, str, locale);
            case "java.sql.Time":
                return JdbcSupport.createTimeReader((Class) type, str, locale);
            case "java.sql.Timestamp":
                return JdbcSupport.createTimestampReader((Class) type, str, locale);
            default:
                if (Calendar.class.isAssignableFrom(cls)) {
                    return ObjectReaderImplCalendar.of(str, locale);
                }
                if (cls == ZonedDateTime.class) {
                    return ObjectReaderImplZonedDateTime.of(str, locale);
                }
                if (cls == LocalDateTime.class) {
                    return new ObjectReaderImplLocalDateTime(str, locale);
                }
                if (cls == LocalDate.class) {
                    return ObjectReaderImplLocalDate.of(str, locale);
                }
                if (cls == LocalTime.class) {
                    return new ObjectReaderImplLocalTime(str, locale);
                }
                if (cls == Instant.class) {
                    return ObjectReaderImplInstant.of(str, locale);
                }
                if (cls == OffsetTime.class) {
                    return ObjectReaderImplOffsetTime.of(str, locale);
                }
                if (cls == OffsetDateTime.class) {
                    return ObjectReaderImplOffsetDateTime.of(str, locale);
                }
                if (cls == Optional.class) {
                    return ObjectReaderImplOptional.of(type, str, locale);
                }
                if (cls == Date.class) {
                    return ObjectReaderImplDate.of(str, locale);
                }
                return null;
        }
    }

    private PropertyAccessor createPropertyAccessor(String str, Type type, Class cls, Method method, Field field, Object obj, JSONSchema jSONSchema) {
        PropertyAccessor propertyAccessorCreate;
        PropertyAccessorFactory propertyAccessorFactory = JSONFactory.PROPERTY_ACCESSOR_FACTORY;
        C1310 c1310 = new C1310(0);
        if (obj instanceof BiConsumer) {
            propertyAccessorCreate = propertyAccessorFactory.create(str, (Class<?>) cls, type, (Function) null, (BiConsumer) obj, c1310);
        } else if (obj instanceof ObjDoubleConsumer) {
            propertyAccessorCreate = propertyAccessorFactory.create(str, (ToDoubleFunction) null, (ObjDoubleConsumer) obj);
        } else if (obj instanceof ObjBoolConsumer) {
            propertyAccessorCreate = propertyAccessorFactory.create(str, (Predicate) null, (ObjBoolConsumer) obj);
        } else if (obj instanceof ObjFloatConsumer) {
            propertyAccessorCreate = propertyAccessorFactory.create(str, (ToFloatFunction) null, (ObjFloatConsumer) obj);
        } else if (obj instanceof ObjByteConsumer) {
            propertyAccessorCreate = propertyAccessorFactory.create(str, (ToByteFunction) null, (ObjByteConsumer) obj);
        } else if (obj instanceof ObjIntConsumer) {
            propertyAccessorCreate = propertyAccessorFactory.create(str, (ToIntFunction) null, (ObjIntConsumer) obj);
        } else if (obj instanceof ObjLongConsumer) {
            propertyAccessorCreate = propertyAccessorFactory.create(str, (ToLongFunction) null, (ObjLongConsumer) obj);
        } else if (obj instanceof ObjCharConsumer) {
            propertyAccessorCreate = propertyAccessorFactory.create(str, (ToCharFunction) null, (ObjCharConsumer) obj);
        } else if (obj instanceof ObjShortConsumer) {
            propertyAccessorCreate = propertyAccessorFactory.create(str, (ToShortFunction) null, (ObjShortConsumer) obj);
        } else if (obj instanceof Function) {
            propertyAccessorCreate = propertyAccessorFactory.create(str, (Class<?>) cls, type, (Function) obj, (BiConsumer) null);
        } else if (method != null) {
            propertyAccessorCreate = propertyAccessorFactory.create(method, c1310);
        } else {
            propertyAccessorCreate = field != null ? propertyAccessorFactory.create(field) : null;
        }
        return jSONSchema != null ? schema(propertyAccessorCreate, jSONSchema) : propertyAccessorCreate;
    }

    private String getActualFieldName(FieldReader fieldReader) {
        String name = fieldReader.method.getName();
        return fieldReader.isReadOnly() ? BeanUtils.getterName(name, PropertyNamingStrategy.CamelCase.name()) : BeanUtils.setterName(name, PropertyNamingStrategy.CamelCase.name());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RuntimeException lambda$createPropertyAccessor$0(PropertyAccessor propertyAccessor, Throwable th) {
        return new JSONException("set PropertyAccessor failed: " + propertyAccessor.name() + ", " + th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$schema$0(JSONSchema jSONSchema, Object obj, boolean z) {
        jSONSchema.assertValidate(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$schema$12(JSONSchema jSONSchema, Object obj, float f) {
        jSONSchema.assertValidate(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$schema$2(JSONSchema jSONSchema, Object obj, byte b) {
        jSONSchema.assertValidate(b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$schema$4(JSONSchema jSONSchema, Object obj, char c) {
        jSONSchema.assertValidate(c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$schema$6(JSONSchema jSONSchema, Object obj, short s) {
        jSONSchema.assertValidate(s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$schema$8(JSONSchema jSONSchema, Object obj, int i) {
        jSONSchema.assertValidate(i);
    }

    private boolean needCompareToActualFieldClass(Class cls) {
        return cls.isEnum() || cls.isInterface();
    }

    private static PropertyAccessor schema(PropertyAccessor propertyAccessor, final JSONSchema jSONSchema) {
        PropertyAccessorFactory propertyAccessorFactory = JSONFactory.PROPERTY_ACCESSOR_FACTORY;
        Class<?> clsPropertyClass = propertyAccessor.propertyClass();
        if (clsPropertyClass == Boolean.TYPE) {
            return propertyAccessorFactory.create(propertyAccessor, (ObjBoolConsumer) null, new C1309(0, jSONSchema));
        }
        if (clsPropertyClass == Boolean.class) {
            final int i = 2;
            return propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᤞᲁᲈᛸ
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    switch (i) {
                        case 0:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 1:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 2:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 3:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 4:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 5:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 6:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 7:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 8:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 9:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 10:
                            jSONSchema.assertValidate(obj2);
                            break;
                        default:
                            jSONSchema.assertValidate(obj2);
                            break;
                    }
                }
            });
        }
        if (clsPropertyClass == Byte.TYPE) {
            return propertyAccessorFactory.create(propertyAccessor, (ObjByteConsumer) null, new ObjByteConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᤞᲈᛸᲁ
                @Override // com.alibaba.fastjson2.function.ObjByteConsumer
                public final void accept(Object obj, byte b) {
                    FieldReader.lambda$schema$2(jSONSchema, obj, b);
                }
            });
        }
        if (clsPropertyClass == Byte.class) {
            final int i2 = 3;
            return propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᤞᲁᲈᛸ
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    switch (i2) {
                        case 0:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 1:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 2:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 3:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 4:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 5:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 6:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 7:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 8:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 9:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 10:
                            jSONSchema.assertValidate(obj2);
                            break;
                        default:
                            jSONSchema.assertValidate(obj2);
                            break;
                    }
                }
            });
        }
        if (clsPropertyClass == Character.TYPE) {
            return propertyAccessorFactory.create(propertyAccessor, (ObjCharConsumer) null, new ObjCharConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᤞᲈᲁᛸ
                @Override // com.alibaba.fastjson2.function.ObjCharConsumer
                public final void accept(Object obj, char c) {
                    FieldReader.lambda$schema$4(jSONSchema, obj, c);
                }
            });
        }
        if (clsPropertyClass == Character.class) {
            final int i3 = 4;
            return propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᤞᲁᲈᛸ
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    switch (i3) {
                        case 0:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 1:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 2:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 3:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 4:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 5:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 6:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 7:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 8:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 9:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 10:
                            jSONSchema.assertValidate(obj2);
                            break;
                        default:
                            jSONSchema.assertValidate(obj2);
                            break;
                    }
                }
            });
        }
        if (clsPropertyClass == Short.TYPE) {
            return propertyAccessorFactory.create(propertyAccessor, (ObjShortConsumer) null, new ObjShortConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᲁᛸᤞᲈ
                @Override // com.alibaba.fastjson2.function.ObjShortConsumer
                public final void accept(Object obj, short s) {
                    FieldReader.lambda$schema$6(jSONSchema, obj, s);
                }
            });
        }
        if (clsPropertyClass == Short.class) {
            final int i4 = 5;
            return propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᤞᲁᲈᛸ
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    switch (i4) {
                        case 0:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 1:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 2:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 3:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 4:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 5:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 6:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 7:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 8:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 9:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 10:
                            jSONSchema.assertValidate(obj2);
                            break;
                        default:
                            jSONSchema.assertValidate(obj2);
                            break;
                    }
                }
            });
        }
        if (clsPropertyClass == Integer.TYPE) {
            return propertyAccessorFactory.create(propertyAccessor, (ObjIntConsumer) null, new ObjIntConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᲁᛸᲈᤞ
                @Override // java.util.function.ObjIntConsumer
                public final void accept(Object obj, int i5) {
                    FieldReader.lambda$schema$8(jSONSchema, obj, i5);
                }
            });
        }
        if (clsPropertyClass == Integer.class) {
            final int i5 = 6;
            return propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᤞᲁᲈᛸ
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    switch (i5) {
                        case 0:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 1:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 2:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 3:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 4:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 5:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 6:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 7:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 8:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 9:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 10:
                            jSONSchema.assertValidate(obj2);
                            break;
                        default:
                            jSONSchema.assertValidate(obj2);
                            break;
                    }
                }
            });
        }
        if (clsPropertyClass == Long.TYPE) {
            return propertyAccessorFactory.create(propertyAccessor, (ObjLongConsumer) null, new ObjLongConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᲁᲈᛸᤞ
                @Override // java.util.function.ObjLongConsumer
                public final void accept(Object obj, long j) {
                    jSONSchema.assertValidate(j);
                }
            });
        }
        if (clsPropertyClass == Long.class) {
            final int i6 = 7;
            return propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᤞᲁᲈᛸ
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    switch (i6) {
                        case 0:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 1:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 2:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 3:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 4:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 5:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 6:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 7:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 8:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 9:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 10:
                            jSONSchema.assertValidate(obj2);
                            break;
                        default:
                            jSONSchema.assertValidate(obj2);
                            break;
                    }
                }
            });
        }
        if (clsPropertyClass == Float.TYPE) {
            return propertyAccessorFactory.create(propertyAccessor, (ObjFloatConsumer) null, new C1312(0, jSONSchema));
        }
        if (clsPropertyClass == Float.class) {
            final int i7 = 8;
            return propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᤞᲁᲈᛸ
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    switch (i7) {
                        case 0:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 1:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 2:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 3:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 4:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 5:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 6:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 7:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 8:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 9:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 10:
                            jSONSchema.assertValidate(obj2);
                            break;
                        default:
                            jSONSchema.assertValidate(obj2);
                            break;
                    }
                }
            });
        }
        if (clsPropertyClass == Double.TYPE) {
            return propertyAccessorFactory.create(propertyAccessor, (ObjDoubleConsumer) null, new ObjDoubleConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᲈᛸᤞᲁ
                @Override // java.util.function.ObjDoubleConsumer
                public final void accept(Object obj, double d) {
                    jSONSchema.assertValidate(d);
                }
            });
        }
        if (clsPropertyClass == Double.class) {
            final int i8 = 9;
            return propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᤞᲁᲈᛸ
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    switch (i8) {
                        case 0:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 1:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 2:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 3:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 4:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 5:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 6:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 7:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 8:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 9:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 10:
                            jSONSchema.assertValidate(obj2);
                            break;
                        default:
                            jSONSchema.assertValidate(obj2);
                            break;
                    }
                }
            });
        }
        if (clsPropertyClass == String.class) {
            final int i9 = 10;
            return propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᤞᲁᲈᛸ
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    switch (i9) {
                        case 0:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 1:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 2:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 3:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 4:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 5:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 6:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 7:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 8:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 9:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 10:
                            jSONSchema.assertValidate(obj2);
                            break;
                        default:
                            jSONSchema.assertValidate(obj2);
                            break;
                    }
                }
            });
        }
        if (clsPropertyClass == BigInteger.class) {
            final int i10 = 11;
            return propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᤞᲁᲈᛸ
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    switch (i10) {
                        case 0:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 1:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 2:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 3:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 4:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 5:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 6:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 7:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 8:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 9:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 10:
                            jSONSchema.assertValidate(obj2);
                            break;
                        default:
                            jSONSchema.assertValidate(obj2);
                            break;
                    }
                }
            });
        }
        if (clsPropertyClass == BigDecimal.class) {
            final int i11 = 0;
            return propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᤞᲁᲈᛸ
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    switch (i11) {
                        case 0:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 1:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 2:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 3:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 4:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 5:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 6:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 7:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 8:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 9:
                            jSONSchema.assertValidate(obj2);
                            break;
                        case 10:
                            jSONSchema.assertValidate(obj2);
                            break;
                        default:
                            jSONSchema.assertValidate(obj2);
                            break;
                    }
                }
            });
        }
        final int i12 = 1;
        return propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᤞᲁᲈᛸ
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i12) {
                    case 0:
                        jSONSchema.assertValidate(obj2);
                        break;
                    case 1:
                        jSONSchema.assertValidate(obj2);
                        break;
                    case 2:
                        jSONSchema.assertValidate(obj2);
                        break;
                    case 3:
                        jSONSchema.assertValidate(obj2);
                        break;
                    case 4:
                        jSONSchema.assertValidate(obj2);
                        break;
                    case 5:
                        jSONSchema.assertValidate(obj2);
                        break;
                    case 6:
                        jSONSchema.assertValidate(obj2);
                        break;
                    case 7:
                        jSONSchema.assertValidate(obj2);
                        break;
                    case 8:
                        jSONSchema.assertValidate(obj2);
                        break;
                    case 9:
                        jSONSchema.assertValidate(obj2);
                        break;
                    case 10:
                        jSONSchema.assertValidate(obj2);
                        break;
                    default:
                        jSONSchema.assertValidate(obj2);
                        break;
                }
            }
        });
    }

    public abstract void accept(T t, Object obj);

    public void accept(T t, boolean z) {
        accept(t, Boolean.valueOf(z));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0051 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Multi-variable type inference failed */
    public void acceptAny(T t, Object obj, long j) {
        Object object;
        boolean z;
        Type type;
        Class cls;
        Object objValueOf;
        Class<?> cls2;
        Function typeConvert;
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        if (obj != null) {
            Class<?> cls3 = obj.getClass();
            if (supportAcceptType(cls3)) {
                object = obj;
                z = true;
            } else {
                if (cls3 == String.class) {
                    if (this.fieldClass == Date.class) {
                        objValueOf = obj;
                        z = false;
                    }
                    cls2 = this.fieldClass;
                    if (cls3 == cls2 && z && (typeConvert = defaultObjectReaderProvider.getTypeConvert(cls3, cls2)) != 0) {
                        object = typeConvert.apply(objValueOf);
                    } else {
                        object = objValueOf;
                    }
                } else {
                    if (cls3 == Integer.class && (((cls = this.fieldClass) == Boolean.TYPE || cls == Boolean.class) && (JSONReader.Feature.NonZeroNumberCastToBooleanAsTrue.mask & j) != 0)) {
                        objValueOf = Boolean.valueOf(((Integer) obj).intValue() != 0);
                    }
                    z = true;
                    cls2 = this.fieldClass;
                    if (cls3 == cls2) {
                        object = objValueOf;
                    } else {
                        object = objValueOf;
                    }
                }
                objValueOf = obj;
                z = true;
                cls2 = this.fieldClass;
                if (cls3 == cls2) {
                    object = objValueOf;
                } else {
                    object = objValueOf;
                }
            }
        } else {
            object = obj;
            z = true;
        }
        if (object != null && this.fieldType != object.getClass() && (type = this.fieldType) != Object.class) {
            if (object instanceof JSONObject) {
                JSONReader.Feature feature = JSONReader.Feature.SupportSmartMatch;
                object = ((JSONObject) object).to(type, (j & feature.mask) != 0 ? new JSONReader.Feature[]{feature} : new JSONReader.Feature[0]);
            } else if (object instanceof JSONArray) {
                object = ((JSONArray) object).to(type, j);
            } else if ((j == 0 || j == JSONReader.Feature.SupportSmartMatch.mask) && !this.fieldClass.isInstance(object) && this.format == null) {
                ObjectReader initReader = getInitReader();
                object = initReader != null ? initReader.readObject(JSONReader.of(JSON.toJSONString(object)), this.fieldType, this.fieldName, j) : TypeUtils.cast(object, this.fieldType, defaultObjectReaderProvider);
            } else if (z) {
                JSONReader jSONReaderOf = JSONReader.of(JSON.toJSONString(object), JSONFactory.createReadContext(j));
                try {
                    object = getObjectReader(jSONReaderOf).readObject(jSONReaderOf, null, this.fieldName, j);
                    if (jSONReaderOf != null) {
                        jSONReaderOf.close();
                    }
                } catch (Throwable th) {
                    if (jSONReaderOf == null) {
                        throw th;
                    }
                    try {
                        jSONReaderOf.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
        }
        accept(t, object);
    }

    public void acceptDefaultValue(T t) {
        Object obj = this.defaultValue;
        if (obj != null) {
            accept(t, obj);
        }
    }

    public void addResolveTask(JSONReader jSONReader, Object obj, String str) {
        JSONPath jSONPathOf;
        if (this.referenceCache == null || !this.referenceCache.toString().equals(str)) {
            jSONPathOf = JSONPath.of(str);
            this.referenceCache = jSONPathOf;
        } else {
            jSONPathOf = this.referenceCache;
        }
        jSONReader.addResolveTask(this, obj, jSONPathOf);
    }

    public boolean belongTo(Class cls) {
        Field field = this.field;
        if (field != null && field.getDeclaringClass() == cls) {
            return true;
        }
        Method method = this.method;
        return method != null && method.getDeclaringClass().isAssignableFrom(cls);
    }

    public ObjectReader checkObjectAutoType(JSONReader jSONReader) {
        return null;
    }

    public BiConsumer getFunction() {
        return null;
    }

    public ObjectReader getInitReader() {
        return null;
    }

    public Class getItemClass() {
        Type type = this.itemType;
        if (type == null) {
            return null;
        }
        if (this.itemClass == null) {
            this.itemClass = TypeUtils.getClass(type);
        }
        return this.itemClass;
    }

    public long getItemClassHash() {
        Class itemClass = getItemClass();
        if (itemClass == null) {
            return 0L;
        }
        return Fnv.hashCode64(itemClass.getName());
    }

    public ObjectReader getItemObjectReader(JSONReader.Context context) {
        if (this.itemReader != null) {
            return this.itemReader;
        }
        ObjectReader objectReader = context.getObjectReader(this.itemType);
        this.itemReader = objectReader;
        return objectReader;
    }

    public Type getItemType() {
        return this.itemType;
    }

    public ObjectReader getObjectReader(JSONReader jSONReader) {
        if (this.reader != null) {
            return this.reader;
        }
        ObjectReader objectReader = jSONReader.getObjectReader(this.fieldType);
        this.reader = objectReader;
        return objectReader;
    }

    public final boolean isParameter() {
        return this.paramNameHash != 0;
    }

    public boolean isReadOnly() {
        return this.readOnly;
    }

    public boolean isUnwrapped() {
        return (this.features & FieldInfo.UNWRAPPED_MASK) != 0;
    }

    public void processExtra(JSONReader jSONReader, Object obj) {
        jSONReader.skipValue();
    }

    public abstract Object readFieldValue(JSONReader jSONReader);

    public abstract void readFieldValue(JSONReader jSONReader, T t);

    public void readFieldValueJSONB(JSONReader jSONReader, T t) {
        readFieldValue(jSONReader, t);
    }

    public boolean sameTo(FieldReader fieldReader) {
        Field field = this.field;
        if (field != null) {
            String name = field.getName();
            Field field2 = fieldReader.field;
            if (field2 != null && name.equals(field2.getName())) {
                return true;
            }
            if (fieldReader.method != null && name.equals(getActualFieldName(fieldReader))) {
                return true;
            }
        }
        if (this.method != null) {
            String actualFieldName = getActualFieldName(this);
            if (fieldReader.method != null) {
                String actualFieldName2 = getActualFieldName(fieldReader);
                if (actualFieldName != null && actualFieldName.equals(actualFieldName2)) {
                    return true;
                }
            }
            Field field3 = fieldReader.field;
            if (field3 != null && actualFieldName != null && actualFieldName.equals(field3.getName())) {
                return true;
            }
        }
        return false;
    }

    public boolean supportAcceptType(Class cls) {
        return this.fieldClass == cls;
    }

    public String toString() {
        Member member = this.method;
        if (member == null) {
            member = this.field;
        }
        return member != null ? member.getName() : this.fieldName;
    }

    public FieldReader(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, Object obj2, String str3, Parameter parameter) {
        this.fieldName = str;
        this.fieldType = type;
        this.fieldClass = cls;
        boolean z = false;
        this.fieldClassSerializable = cls != null && (Serializable.class.isAssignableFrom(cls) || Modifier.isInterface(cls.getModifiers()) || BeanUtils.isRecord(cls) || cls.isPrimitive());
        this.features = j;
        this.fieldNameHash = Fnv.hashCode64(str);
        this.fieldNameHashLCase = Fnv.hashCode64LCase(str);
        this.ordinal = i;
        this.format = str2;
        this.locale = locale;
        this.defaultValue = obj;
        this.schema = jSONSchema;
        this.method = method;
        this.field = field;
        this.paramName = str3;
        this.paramNameHash = str3 != null ? Fnv.hashCode64(str3) : 0L;
        this.parameter = parameter;
        if ((method != null && method.getParameterCount() == 0) || (field != null && Modifier.isFinal(field.getModifiers()))) {
            z = true;
        }
        this.readOnly = z;
        this.propertyAccessor = createPropertyAccessor(str, type, cls, method, field, obj2, jSONSchema);
        Class<?> declaringClass = null;
        this.function = obj2 instanceof BiConsumer ? (BiConsumer) obj2 : null;
        long jObjectFieldOffset = (field == null || (j & FieldInfo.DISABLE_UNSAFE) != 0) ? -1L : JDKUtils.UNSAFE.objectFieldOffset(field);
        this.fieldOffset = jObjectFieldOffset;
        if (jObjectFieldOffset == -1 && field != null && method == null) {
            try {
                field.setAccessible(true);
            } catch (Throwable th) {
                JDKUtils.setReflectErrorLast(th);
            }
        }
        if (method != null) {
            declaringClass = method.getDeclaringClass();
        } else if (field != null) {
            declaringClass = field.getDeclaringClass();
        }
        this.noneStaticMemberClass = BeanUtils.isNoneStaticMemberClass(declaringClass, cls);
    }

    public void accept(T t, byte b) {
        accept(t, Byte.valueOf(b));
    }

    @Override // java.lang.Comparable
    public int compareTo(FieldReader fieldReader) {
        Class<?> superclass;
        Class<?> superclass2;
        Class<?> type;
        Class<?> declaringClass;
        Class<?> declaringClass2;
        int iCompareTo = this.fieldName.compareTo(fieldReader.fieldName);
        if (iCompareTo != 0) {
            int i = this.ordinal;
            int i2 = fieldReader.ordinal;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            return iCompareTo;
        }
        int i3 = isReadOnly() == fieldReader.isReadOnly() ? 0 : isReadOnly() ? 1 : -1;
        if (i3 == 0) {
            Member member = this.field;
            if (member == null) {
                member = this.method;
            }
            Member member2 = fieldReader.field;
            if (member2 == null) {
                member2 = fieldReader.method;
            }
            if (member != null && member2 != null && member.getClass() != member2.getClass() && (declaringClass2 = member.getDeclaringClass()) != (declaringClass = member2.getDeclaringClass())) {
                if (declaringClass2.isAssignableFrom(declaringClass)) {
                    return 1;
                }
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    return -1;
                }
            }
            Field field = this.field;
            if (field != null && fieldReader.field != null) {
                Class<?> declaringClass3 = field.getDeclaringClass();
                Class<?> declaringClass4 = fieldReader.field.getDeclaringClass();
                for (Class<? super Object> superclass3 = declaringClass3.getSuperclass(); superclass3 != null && superclass3 != Object.class; superclass3 = superclass3.getSuperclass()) {
                    if (superclass3 == declaringClass4) {
                        return 1;
                    }
                }
                do {
                    declaringClass4 = declaringClass4.getSuperclass();
                    if (declaringClass4 == null || declaringClass4 == Object.class) {
                    }
                } while (declaringClass4 != declaringClass3);
                return -1;
            }
            Method method = this.method;
            if (method != null && fieldReader.method != null) {
                Class<?> declaringClass5 = method.getDeclaringClass();
                Class<?> declaringClass6 = fieldReader.method.getDeclaringClass();
                if (declaringClass5 != declaringClass6) {
                    for (Class<? super Object> superclass4 = declaringClass5.getSuperclass(); superclass4 != null && superclass4 != Object.class; superclass4 = superclass4.getSuperclass()) {
                        if (superclass4 == declaringClass6) {
                            return -1;
                        }
                    }
                    for (Class<? super Object> superclass5 = declaringClass6.getSuperclass(); superclass5 != null && superclass5 != Object.class; superclass5 = superclass5.getSuperclass()) {
                        if (superclass5 == declaringClass5) {
                            return 1;
                        }
                    }
                }
                if (this.method.getParameterCount() == 1 && fieldReader.method.getParameterCount() == 1 && (superclass = this.method.getParameterTypes()[0]) != (superclass2 = fieldReader.method.getParameterTypes()[0])) {
                    if (superclass.isAssignableFrom(superclass2)) {
                        return 1;
                    }
                    if (superclass2.isAssignableFrom(superclass)) {
                        return -1;
                    }
                    if (Collection.class.isAssignableFrom(superclass2) && !Collection.class.isAssignableFrom(superclass)) {
                        return 1;
                    }
                    if (Collection.class.isAssignableFrom(superclass) && !Collection.class.isAssignableFrom(superclass2)) {
                        return -1;
                    }
                    if (needCompareToActualFieldClass(superclass) || needCompareToActualFieldClass(superclass2)) {
                        try {
                            type = declaringClass5.getDeclaredField(this.fieldName).getType();
                            if (type == null) {
                                try {
                                    type = declaringClass6.getDeclaredField(this.fieldName).getType();
                                } catch (NoSuchFieldException unused) {
                                }
                            }
                        } catch (NoSuchFieldException unused2) {
                            type = null;
                        }
                        if (type != null) {
                            while (superclass != null && superclass != Object.class) {
                                if (superclass == type) {
                                    return -1;
                                }
                                superclass = superclass.getSuperclass();
                            }
                            while (superclass2 != null && superclass2 != Object.class) {
                                if (superclass2 == type) {
                                    return 1;
                                }
                                superclass2 = superclass2.getSuperclass();
                            }
                        }
                    }
                    JSONField jSONField = (JSONField) BeanUtils.findAnnotation(this.method, JSONField.class);
                    JSONField jSONField2 = (JSONField) BeanUtils.findAnnotation(fieldReader.method, JSONField.class);
                    boolean z = jSONField != null;
                    if (z == (jSONField2 == null)) {
                        return z ? -1 : 1;
                    }
                }
                String name = this.method.getName();
                String name2 = fieldReader.method.getName();
                if (!name.equals(name2)) {
                    boolean zStartsWith = name.startsWith("set");
                    if (zStartsWith != name2.startsWith("set")) {
                        return zStartsWith ? -1 : 1;
                    }
                    String str = BeanUtils.setterName(name, (String) null);
                    String str2 = BeanUtils.setterName(name2, (String) null);
                    boolean zEquals = this.fieldName.equals(str);
                    if (zEquals != fieldReader.fieldName.equals(str2)) {
                        return zEquals ? 1 : -1;
                    }
                }
            }
            ObjectReader initReader = getInitReader();
            ObjectReader initReader2 = fieldReader.getInitReader();
            if (initReader != null && initReader2 == null) {
                return -1;
            }
            if (initReader == null && initReader2 != null) {
                return 1;
            }
            Class cls = this.fieldClass;
            Class cls2 = fieldReader.fieldClass;
            boolean zIsPrimitive = cls.isPrimitive();
            boolean zIsPrimitive2 = cls2.isPrimitive();
            if (zIsPrimitive && !zIsPrimitive2) {
                return -1;
            }
            if (!zIsPrimitive && zIsPrimitive2) {
                return 1;
            }
            boolean zStartsWith2 = cls.getName().startsWith("java.");
            boolean zStartsWith3 = cls2.getName().startsWith("java.");
            if (zStartsWith2 && !zStartsWith3) {
                return -1;
            }
            if (!zStartsWith2 && zStartsWith3) {
                return 1;
            }
        }
        return i3;
    }

    public void accept(T t, short s) {
        accept(t, Short.valueOf(s));
    }

    public void accept(T t, int i) {
        accept(t, Integer.valueOf(i));
    }

    public ObjectReader getItemObjectReader(JSONReader jSONReader) {
        return getItemObjectReader(jSONReader.getContext());
    }

    public ObjectReader getObjectReader(JSONReader.Context context) {
        if (this.reader != null) {
            return this.reader;
        }
        ObjectReader objectReader = context.getObjectReader(this.fieldType);
        this.reader = objectReader;
        return objectReader;
    }

    public void accept(T t, long j) {
        accept(t, Long.valueOf(j));
    }

    public void addResolveTask(JSONReader jSONReader, List list, int i, String str) {
        jSONReader.addResolveTask(list, i, JSONPath.of(str));
    }

    public void accept(T t, char c) {
        accept(t, Character.valueOf(c));
    }

    public void accept(T t, float f) {
        accept(t, Float.valueOf(f));
    }

    public ObjectReader getObjectReader(ObjectReaderProvider objectReaderProvider) {
        if (this.reader != null) {
            return this.reader;
        }
        ObjectReader objectReader = objectReaderProvider.getObjectReader(this.fieldType, (this.features & JSONReader.Feature.FieldBased.mask) != 0);
        this.reader = objectReader;
        return objectReader;
    }

    public void accept(T t, double d) {
        accept(t, Double.valueOf(d));
    }

    public void acceptExtra(Object obj, String str, Object obj2) {
    }
}
