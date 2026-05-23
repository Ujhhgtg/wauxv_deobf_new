package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.internal.asm.ASMUtils;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.AbstractC2668;
import p000.C2252;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderException<T> extends ObjectReaderAdapter<T> {
    final Constructor constructorCause;
    final Constructor constructorDefault;
    final Constructor constructorMessage;
    final Constructor constructorMessageCause;
    final List<String[]> constructorParameters;
    final List<Constructor> constructors;
    private final FieldReader fieldReaderStackTrace;
    static final long HASH_TYPE = Fnv.hashCode64("@type");
    static final long HASH_MESSAGE = Fnv.hashCode64("message");
    static final long HASH_DETAIL_MESSAGE = Fnv.hashCode64("detailMessage");
    static final long HASH_LOCALIZED_MESSAGE = Fnv.hashCode64("localizedMessage");
    static final long HASH_CAUSE = Fnv.hashCode64("cause");
    static final long HASH_STACKTRACE = Fnv.hashCode64("stackTrace");
    static final long HASH_SUPPRESSED_EXCEPTIONS = Fnv.hashCode64("suppressedExceptions");

    public ObjectReaderException(Class<T> cls) {
        this(cls, Arrays.asList(BeanUtils.getConstructor(cls)), ObjectReaders.fieldReader("stackTrace", StackTraceElement[].class, new C2252(0)));
    }

    private Throwable createObject(String str, Throwable th) {
        try {
            Constructor constructor = this.constructorMessageCause;
            if (constructor != null && th != null && str != null) {
                return (Throwable) constructor.newInstance(str, th);
            }
            Constructor constructor2 = this.constructorMessage;
            if (constructor2 != null && str != null) {
                return (Throwable) constructor2.newInstance(str);
            }
            Constructor constructor3 = this.constructorCause;
            if (constructor3 != null && th != null) {
                return (Throwable) constructor3.newInstance(th);
            }
            if (constructor != null && (th != null || str != null)) {
                return (Throwable) constructor.newInstance(str, th);
            }
            Constructor constructor4 = this.constructorDefault;
            if (constructor4 != null) {
                return (Throwable) constructor4.newInstance(null);
            }
            if (constructor != null) {
                return (Throwable) constructor.newInstance(str, th);
            }
            if (constructor2 != null) {
                return (Throwable) constructor2.newInstance(str);
            }
            if (constructor3 != null) {
                return (Throwable) constructor3.newInstance(th);
            }
            return null;
        } catch (Throwable th2) {
            throw new JSONException("create Exception error, class " + this.objectClass.getName() + ", " + th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(Constructor constructor, Constructor constructor2) {
        return Integer.compare(constructor2.getParameterCount(), constructor.getParameterCount());
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(Map map, long j) {
        if (map == null) {
            return null;
        }
        return readObject(JSONReader.of(JSON.toJSONString(map)), j);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        ObjectReader objectReader;
        if (jSONReader.getType() == -110) {
            JSONReader.Context context = jSONReader.getContext();
            if (jSONReader.isSupportAutoType(j) || context.getContextAutoTypeBeforeHandler() != null) {
                jSONReader.next();
                ObjectReader objectReaderAutoType = context.getObjectReaderAutoType(jSONReader.readTypeHashCode());
                if (objectReaderAutoType == null) {
                    String string = jSONReader.getString();
                    ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(string, null);
                    if (objectReaderAutoType2 == null) {
                        StringBuilder sbM4679 = AbstractC2668.m4679("autoType not support : ", string, ", offset ");
                        sbM4679.append(jSONReader.getOffset());
                        throw new JSONException(sbM4679.toString());
                    }
                    objectReader = objectReaderAutoType2;
                } else {
                    objectReader = objectReaderAutoType;
                }
                return (T) objectReader.readJSONBObject(jSONReader, type, obj, 0L);
            }
        }
        return readObject(jSONReader, type, obj, j);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0093  */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        int i;
        Object obj2;
        Throwable th;
        String str;
        Throwable th2;
        Object obj3;
        String string = null;
        if (!jSONReader.nextIfObjectStart() && jSONReader.nextIfNullOrEmptyString()) {
            return null;
        }
        Throwable th3 = null;
        HashMap map = null;
        HashMap map2 = null;
        StackTraceElement[] stackTraceElementArr = null;
        String reference = null;
        int i2 = 0;
        while (!jSONReader.nextIfObjectEnd()) {
            String str2 = string;
            Throwable th4 = th3;
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (i2 == 0 && fieldNameHashCode == HASH_TYPE && jSONReader.isSupportAutoType(j)) {
                long typeHashCode = jSONReader.readTypeHashCode();
                JSONReader.Context context = jSONReader.getContext();
                ObjectReader objectReaderAutoType = autoType(context, typeHashCode);
                if (objectReaderAutoType == null) {
                    String string2 = jSONReader.getString();
                    ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(string2, this.objectClass, j);
                    if (objectReaderAutoType2 == null) {
                        throw new JSONException(jSONReader.info("No suitable ObjectReader found for" + string2));
                    }
                    objectReaderAutoType = objectReaderAutoType2;
                }
                if (objectReaderAutoType != this) {
                    return (T) objectReaderAutoType.readObject(jSONReader);
                }
            } else {
                if (fieldNameHashCode == HASH_MESSAGE || fieldNameHashCode == HASH_DETAIL_MESSAGE) {
                    string = jSONReader.readString();
                    th3 = th4;
                } else if (fieldNameHashCode == HASH_LOCALIZED_MESSAGE) {
                    jSONReader.readString();
                } else if (fieldNameHashCode == HASH_CAUSE) {
                    if (jSONReader.isReference()) {
                        jSONReader.readReference();
                    } else {
                        th3 = (Throwable) jSONReader.read((Class) Throwable.class);
                        string = str2;
                    }
                } else if (fieldNameHashCode == HASH_STACKTRACE) {
                    if (jSONReader.isReference()) {
                        reference = jSONReader.readReference();
                    } else {
                        stackTraceElementArr = (StackTraceElement[]) jSONReader.read((Class) StackTraceElement[].class);
                    }
                } else if (fieldNameHashCode != HASH_SUPPRESSED_EXCEPTIONS) {
                    FieldReader fieldReader = getFieldReader(fieldNameHashCode);
                    if (map == null) {
                        map = new HashMap();
                    }
                    String fieldName = fieldReader != null ? fieldReader.fieldName : jSONReader.getFieldName();
                    if (jSONReader.isReference()) {
                        String reference2 = jSONReader.readReference();
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        map2.put(fieldName, reference2);
                    } else {
                        map.put(fieldName, fieldReader != null ? fieldReader.readFieldValue(jSONReader) : jSONReader.readAny());
                    }
                } else if (jSONReader.isReference()) {
                    jSONReader.readReference();
                } else if (jSONReader.getType() == -110) {
                } else {
                    jSONReader.readArray(Throwable.class);
                }
                i2++;
            }
            string = str2;
            th3 = th4;
            i2++;
        }
        Throwable thCreateObject = createObject(string, th3);
        if (thCreateObject == null) {
            int i3 = 0;
            while (true) {
                if (i3 < this.constructors.size()) {
                    String[] strArr = this.constructorParameters.get(i3);
                    if (strArr == null || strArr.length == 0) {
                        th = thCreateObject;
                        str = string;
                        th2 = th3;
                    } else {
                        int length = strArr.length;
                        int i4 = 0;
                        boolean z = true;
                        while (true) {
                            byte b = 2;
                            i = 0;
                            th = thCreateObject;
                            str = string;
                            th2 = th3;
                            if (i4 < length) {
                                String str3 = strArr[i4];
                                if (str3 == null) {
                                    z = false;
                                } else {
                                    switch (str3.hashCode()) {
                                        case 94434409:
                                            b = str3.equals("cause") ? (byte) 0 : (byte) -1;
                                            break;
                                        case 954925063:
                                            b = str3.equals("message") ? (byte) 1 : (byte) -1;
                                            break;
                                        case 1615686570:
                                            if (!str3.equals("errorIndex")) {
                                                b = -1;
                                            }
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    switch (b) {
                                        case 0:
                                        case 1:
                                            break;
                                        case 2:
                                            if (this.objectClass != DateTimeParseException.class && !map.containsKey(str3)) {
                                                z = false;
                                            }
                                            break;
                                        default:
                                            if (!map.containsKey(str3)) {
                                                z = false;
                                            }
                                            break;
                                    }
                                    i4++;
                                    thCreateObject = th;
                                    string = str;
                                    th3 = th2;
                                }
                            }
                        }
                        if (z) {
                            Object[] objArr = new Object[strArr.length];
                            for (int i5 = 0; i5 < strArr.length; i5++) {
                                String str4 = strArr[i5];
                                str4.getClass();
                                switch (str4) {
                                    case "cause":
                                        obj3 = th2;
                                        break;
                                    case "message":
                                        obj3 = str;
                                        break;
                                    case "errorIndex":
                                        obj3 = map.get(str4);
                                        if (obj3 != null || this.objectClass != DateTimeParseException.class) {
                                            break;
                                        } else {
                                            obj3 = 0;
                                            break;
                                        }
                                        break;
                                    default:
                                        obj3 = map.get(str4);
                                        break;
                                }
                                objArr[i5] = obj3;
                            }
                            Constructor constructor = this.constructors.get(i3);
                            try {
                                obj2 = (T) ((Throwable) constructor.newInstance(objArr));
                            } catch (Throwable th5) {
                                throw new JSONException("create error, objectClass " + constructor + ", " + th5.getMessage(), th5);
                            }
                        }
                    }
                    i3++;
                    thCreateObject = th;
                    string = str;
                    th3 = th2;
                } else {
                    i = 0;
                    obj2 = (T) thCreateObject;
                }
            }
        } else {
            i = 0;
            obj2 = (T) thCreateObject;
        }
        if (false) {
            throw new JSONException(jSONReader.info(jSONReader.info("not support : ".concat(this.objectClass.getName()))));
        }
        if (stackTraceElementArr != null) {
            int length2 = stackTraceElementArr.length;
            int i6 = 0;
            int i7 = 0;
            while (i6 < length2) {
                if (stackTraceElementArr[i6] == null) {
                    i7++;
                }
                i6++;
            }
            if (stackTraceElementArr.length == 0 || i7 != stackTraceElementArr.length) {
                ((Throwable) obj2).setStackTrace(stackTraceElementArr);
            }
        }
        if (reference != null) {
            jSONReader.addResolveTask(this.fieldReaderStackTrace, obj2, JSONPath.of(reference));
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                FieldReader fieldReader2 = getFieldReader((String) entry.getKey());
                if (fieldReader2 != null) {
                    fieldReader2.accept(obj2, entry.getValue());
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                FieldReader fieldReader3 = getFieldReader((String) entry2.getKey());
                if (fieldReader3 != null) {
                    fieldReader3.addResolveTask(jSONReader, obj2, (String) entry2.getValue());
                }
            }
        }
        return (T) obj2;
    }

    public ObjectReaderException(Class<T> cls, List<Constructor> list, FieldReader... fieldReaderArr) {
        int i;
        String[] strArrLookupParameterNames;
        super(cls, null, cls.getName(), 0L, null, null, null, fieldReaderArr);
        this.constructors = list;
        Iterator<Constructor> it = list.iterator();
        Constructor constructor = null;
        Constructor constructor2 = null;
        Constructor constructor3 = null;
        Constructor constructor4 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Constructor next = it.next();
            if (next != null && constructor3 == null) {
                int parameterCount = next.getParameterCount();
                if (parameterCount == 0) {
                    constructor = next;
                } else {
                    Class<?>[] parameterTypes = next.getParameterTypes();
                    Class<?> cls2 = parameterTypes[0];
                    if (parameterCount == 1) {
                        if (cls2 == String.class) {
                            constructor2 = next;
                        } else if (Throwable.class.isAssignableFrom(cls2)) {
                            constructor4 = next;
                        }
                    }
                    if (parameterCount == 2 && cls2 == String.class && Throwable.class.isAssignableFrom(parameterTypes[1])) {
                        constructor3 = next;
                    }
                }
            }
        }
        this.constructorDefault = constructor;
        this.constructorMessage = constructor2;
        this.constructorMessageCause = constructor3;
        this.constructorCause = constructor4;
        list.sort(new C0011());
        this.constructorParameters = new ArrayList(list.size());
        for (Constructor constructor5 : list) {
            if (constructor5.getParameterCount() > 0) {
                strArrLookupParameterNames = ASMUtils.lookupParameterNames(constructor5);
                Parameter[] parameters = constructor5.getParameters();
                FieldInfo fieldInfo = new FieldInfo();
                for (int i2 = 0; i2 < parameters.length && i2 < strArrLookupParameterNames.length; i2++) {
                    fieldInfo.init();
                    JSONFactory.getDefaultObjectReaderProvider().getFieldInfo(fieldInfo, cls, constructor5, i2, parameters[i2]);
                    String str = fieldInfo.fieldName;
                    if (str != null) {
                        strArrLookupParameterNames[i2] = str;
                    }
                }
            } else {
                strArrLookupParameterNames = null;
            }
            this.constructorParameters.add(strArrLookupParameterNames);
        }
        FieldReader fieldReader = null;
        for (FieldReader fieldReader2 : fieldReaderArr) {
            if ("stackTrace".equals(fieldReader2.fieldName) && fieldReader2.fieldClass == StackTraceElement[].class) {
                fieldReader = fieldReader2;
            }
        }
        this.fieldReaderStackTrace = fieldReader;
    }
}
