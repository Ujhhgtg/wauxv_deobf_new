package com.alibaba.fastjson2.internal.asm;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONPathCompilerReflect;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.annotation.JSONType;
import com.alibaba.fastjson2.function.ObjBoolConsumer;
import com.alibaba.fastjson2.function.ObjByteConsumer;
import com.alibaba.fastjson2.function.ObjCharConsumer;
import com.alibaba.fastjson2.function.ObjFloatConsumer;
import com.alibaba.fastjson2.function.ObjShortConsumer;
import com.alibaba.fastjson2.reader.ByteArrayValueConsumer;
import com.alibaba.fastjson2.reader.CharArrayValueConsumer;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReader1;
import com.alibaba.fastjson2.reader.ObjectReader10;
import com.alibaba.fastjson2.reader.ObjectReader11;
import com.alibaba.fastjson2.reader.ObjectReader12;
import com.alibaba.fastjson2.reader.ObjectReader2;
import com.alibaba.fastjson2.reader.ObjectReader3;
import com.alibaba.fastjson2.reader.ObjectReader4;
import com.alibaba.fastjson2.reader.ObjectReader5;
import com.alibaba.fastjson2.reader.ObjectReader6;
import com.alibaba.fastjson2.reader.ObjectReader7;
import com.alibaba.fastjson2.reader.ObjectReader8;
import com.alibaba.fastjson2.reader.ObjectReader9;
import com.alibaba.fastjson2.reader.ObjectReaderAdapter;
import com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.ParameterizedTypeImpl;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriter1;
import com.alibaba.fastjson2.writer.ObjectWriter10;
import com.alibaba.fastjson2.writer.ObjectWriter11;
import com.alibaba.fastjson2.writer.ObjectWriter12;
import com.alibaba.fastjson2.writer.ObjectWriter2;
import com.alibaba.fastjson2.writer.ObjectWriter3;
import com.alibaba.fastjson2.writer.ObjectWriter4;
import com.alibaba.fastjson2.writer.ObjectWriter5;
import com.alibaba.fastjson2.writer.ObjectWriter6;
import com.alibaba.fastjson2.writer.ObjectWriter7;
import com.alibaba.fastjson2.writer.ObjectWriter8;
import com.alibaba.fastjson2.writer.ObjectWriter9;
import com.alibaba.fastjson2.writer.ObjectWriterAdapter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import p000.AbstractC1095;
import p000.AbstractC2844;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ASMUtils {
    public static final String DESC_FIELD_READER;
    public static final String DESC_FIELD_READER_ARRAY;
    public static final String DESC_FIELD_WRITER;
    public static final String DESC_FIELD_WRITER_ARRAY;
    public static final String DESC_JSONSCHEMA;
    public static final String DESC_JSON_READER;
    public static final String DESC_JSON_WRITER;
    public static final String DESC_OBJECT_READER;
    public static final String DESC_OBJECT_READER_ADAPTER;
    public static final String DESC_OBJECT_WRITER;
    public static final String DESC_SUPPLIER = "Ljava/util/function/Supplier;";
    public static final String TYPE_BYTE_ARRAY_VALUE_CONSUMER;
    public static final String TYPE_CHAR_ARRAY_VALUE_CONSUMER;
    public static final String TYPE_DATE_UTILS;
    public static final String TYPE_FIELD_WRITER;
    public static final String TYPE_IO_UTILS;
    public static final String TYPE_JSONB_IO;
    public static final String TYPE_JSON_READER;
    public static final String TYPE_JSON_WRITER;
    public static final String TYPE_OBJECT = "java/lang/Object";
    public static final String TYPE_OBJECT_READER;
    public static final String TYPE_OBJECT_READER_1;
    public static final String TYPE_OBJECT_READER_10;
    public static final String TYPE_OBJECT_READER_11;
    public static final String TYPE_OBJECT_READER_12;
    public static final String TYPE_OBJECT_READER_2;
    public static final String TYPE_OBJECT_READER_3;
    public static final String TYPE_OBJECT_READER_4;
    public static final String TYPE_OBJECT_READER_5;
    public static final String TYPE_OBJECT_READER_6;
    public static final String TYPE_OBJECT_READER_7;
    public static final String TYPE_OBJECT_READER_8;
    public static final String TYPE_OBJECT_READER_9;
    public static final String TYPE_OBJECT_READER_ADAPTER;
    public static final String TYPE_OBJECT_READER_NONE_DEFAULT_CONSTRUCTOR;
    public static final String TYPE_OBJECT_WRITER;
    public static final String TYPE_TYPE_UTILS;
    static final AtomicReference<char[]> descCacheRef;
    static final Map<Class, String> descMapping;
    static final Map<MethodInfo, String[]> paramMapping;
    static final Map<Class, String> typeMapping;
    public static final String TYPE_UNSAFE_UTILS = JDKUtils.class.getName().replace('.', '/');
    public static final String TYPE_OBJECT_WRITER_ADAPTER = ObjectWriterAdapter.class.getName().replace('.', '/');
    public static final String TYPE_OBJECT_WRITER_1 = ObjectWriter1.class.getName().replace('.', '/');
    public static final String TYPE_OBJECT_WRITER_2 = ObjectWriter2.class.getName().replace('.', '/');
    public static final String TYPE_OBJECT_WRITER_3 = ObjectWriter3.class.getName().replace('.', '/');
    public static final String TYPE_OBJECT_WRITER_4 = ObjectWriter4.class.getName().replace('.', '/');
    public static final String TYPE_OBJECT_WRITER_5 = ObjectWriter5.class.getName().replace('.', '/');
    public static final String TYPE_OBJECT_WRITER_6 = ObjectWriter6.class.getName().replace('.', '/');
    public static final String TYPE_OBJECT_WRITER_7 = ObjectWriter7.class.getName().replace('.', '/');
    public static final String TYPE_OBJECT_WRITER_8 = ObjectWriter8.class.getName().replace('.', '/');
    public static final String TYPE_OBJECT_WRITER_9 = ObjectWriter9.class.getName().replace('.', '/');
    public static final String TYPE_OBJECT_WRITER_10 = ObjectWriter10.class.getName().replace('.', '/');
    public static final String TYPE_OBJECT_WRITER_11 = ObjectWriter11.class.getName().replace('.', '/');
    public static final String TYPE_OBJECT_WRITER_12 = ObjectWriter12.class.getName().replace('.', '/');
    public static final String TYPE_FIELD_READE = FieldReader.class.getName().replace('.', '/');

    static {
        String strReplace = JSONReader.class.getName().replace('.', '/');
        TYPE_JSON_READER = strReplace;
        String strReplace2 = ObjectReader.class.getName().replace('.', '/');
        TYPE_OBJECT_READER = strReplace2;
        String strReplace3 = ObjectReaderAdapter.class.getName().replace('.', '/');
        TYPE_OBJECT_READER_ADAPTER = strReplace3;
        TYPE_OBJECT_READER_1 = ObjectReader1.class.getName().replace('.', '/');
        TYPE_OBJECT_READER_2 = ObjectReader2.class.getName().replace('.', '/');
        TYPE_OBJECT_READER_3 = ObjectReader3.class.getName().replace('.', '/');
        TYPE_OBJECT_READER_4 = ObjectReader4.class.getName().replace('.', '/');
        TYPE_OBJECT_READER_5 = ObjectReader5.class.getName().replace('.', '/');
        TYPE_OBJECT_READER_6 = ObjectReader6.class.getName().replace('.', '/');
        TYPE_OBJECT_READER_7 = ObjectReader7.class.getName().replace('.', '/');
        TYPE_OBJECT_READER_8 = ObjectReader8.class.getName().replace('.', '/');
        TYPE_OBJECT_READER_9 = ObjectReader9.class.getName().replace('.', '/');
        TYPE_OBJECT_READER_10 = ObjectReader10.class.getName().replace('.', '/');
        TYPE_OBJECT_READER_11 = ObjectReader11.class.getName().replace('.', '/');
        TYPE_OBJECT_READER_12 = ObjectReader12.class.getName().replace('.', '/');
        TYPE_OBJECT_READER_NONE_DEFAULT_CONSTRUCTOR = ObjectReaderNoneDefaultConstructor.class.getName().replace('.', '/');
        TYPE_BYTE_ARRAY_VALUE_CONSUMER = ByteArrayValueConsumer.class.getName().replace('.', '/');
        TYPE_CHAR_ARRAY_VALUE_CONSUMER = CharArrayValueConsumer.class.getName().replace('.', '/');
        TYPE_TYPE_UTILS = TypeUtils.class.getName().replace('.', '/');
        TYPE_DATE_UTILS = DateUtils.class.getName().replace('.', '/');
        String strReplace4 = ObjectWriter.class.getName().replace('.', '/');
        TYPE_OBJECT_WRITER = strReplace4;
        String strReplace5 = JSONWriter.class.getName().replace('.', '/');
        TYPE_JSON_WRITER = strReplace5;
        TYPE_JSONB_IO = JSONB.IO.class.getName().replace('.', '/');
        TYPE_FIELD_WRITER = com.alibaba.fastjson2.writer.FieldWriter.class.getName().replace('.', '/');
        TYPE_IO_UTILS = IOUtils.class.getName().replace('.', '/');
        String str = "L" + com.alibaba.fastjson2.writer.FieldWriter.class.getName().replace('.', '/') + ';';
        DESC_FIELD_WRITER = str;
        DESC_FIELD_WRITER_ARRAY = AbstractC2844.m4790("[", str);
        String str2 = "L" + FieldReader.class.getName().replace('.', '/') + ';';
        DESC_FIELD_READER = str2;
        DESC_FIELD_READER_ARRAY = AbstractC2844.m4790("[", str2);
        DESC_JSON_READER = AbstractC2844.m4783("L", strReplace, ';');
        DESC_JSON_WRITER = AbstractC2844.m4783("L", strReplace5, ';');
        DESC_OBJECT_READER = AbstractC2844.m4783("L", strReplace2, ';');
        DESC_OBJECT_READER_ADAPTER = AbstractC2844.m4783("L", strReplace3, ';');
        DESC_OBJECT_WRITER = AbstractC2844.m4783("L", strReplace4, ';');
        DESC_JSONSCHEMA = "L" + JSONSchema.class.getName().replace('.', '/') + ';';
        HashMap map = new HashMap();
        paramMapping = map;
        HashMap map2 = new HashMap();
        descMapping = map2;
        HashMap map3 = new HashMap();
        typeMapping = map3;
        map.put(new MethodInfo(ParameterizedTypeImpl.class.getName(), "<init>", new String[]{"[Ljava.lang.reflect.Type;", "java.lang.reflect.Type", "java.lang.reflect.Type"}), new String[]{"actualTypeArguments", "ownerType", "rawType"});
        map.put(new MethodInfo("org.apache.commons.lang3.tuple.Triple", "of", new String[]{"java.lang.Object", "java.lang.Object", "java.lang.Object"}), new String[]{"left", "middle", "right"});
        map.put(new MethodInfo("org.apache.commons.lang3.tuple.MutableTriple", "<init>", new String[]{"java.lang.Object", "java.lang.Object", "java.lang.Object"}), new String[]{"left", "middle", "right"});
        map.put(new MethodInfo("org.javamoney.moneta.Money", "<init>", new String[]{"java.math.BigDecimal", "javax.money.CurrencyUnit", "javax.money.MonetaryContext"}), new String[]{"number", "currency", "monetaryContext"});
        map.put(new MethodInfo("org.javamoney.moneta.Money", "<init>", new String[]{"java.math.BigDecimal", "javax.money.CurrencyUnit"}), new String[]{"number", "currency"});
        Class cls = Integer.TYPE;
        map2.put(cls, "I");
        Class cls2 = Void.TYPE;
        map2.put(cls2, "V");
        Class cls3 = Boolean.TYPE;
        map2.put(cls3, "Z");
        Class cls4 = Character.TYPE;
        map2.put(cls4, "C");
        Class cls5 = Byte.TYPE;
        map2.put(cls5, "B");
        Class cls6 = Short.TYPE;
        map2.put(cls6, "S");
        Class cls7 = Float.TYPE;
        map2.put(cls7, "F");
        Class cls8 = Long.TYPE;
        map2.put(cls8, "J");
        Class cls9 = Double.TYPE;
        map2.put(cls9, "D");
        map3.put(cls, "I");
        map3.put(cls2, "V");
        map3.put(cls3, "Z");
        map3.put(cls4, "C");
        map3.put(cls5, "B");
        map3.put(cls6, "S");
        map3.put(cls7, "F");
        map3.put(cls8, "J");
        map3.put(cls9, "D");
        Class[] clsArr = {String.class, List.class, Collection.class, ObjectReader.class, ObjectReader1.class, ObjectReader2.class, ObjectReader3.class, ObjectReader4.class, ObjectReader5.class, ObjectReader6.class, ObjectReader7.class, ObjectReader8.class, ObjectReader9.class, ObjectReader10.class, ObjectReader11.class, ObjectReader12.class, ObjectReaderAdapter.class, FieldReader.class, JSONReader.class, ObjBoolConsumer.class, ObjCharConsumer.class, ObjByteConsumer.class, ObjShortConsumer.class, ObjIntConsumer.class, ObjLongConsumer.class, ObjFloatConsumer.class, ObjDoubleConsumer.class, BiConsumer.class, JDKUtils.class, ObjectWriterAdapter.class, ObjectWriter1.class, ObjectWriter2.class, ObjectWriter3.class, ObjectWriter4.class, ObjectWriter5.class, ObjectWriter6.class, ObjectWriter7.class, ObjectWriter8.class, ObjectWriter9.class, ObjectWriter10.class, ObjectWriter11.class, ObjectWriter12.class, com.alibaba.fastjson2.writer.FieldWriter.class, JSONPathCompilerReflect.SingleNamePathTyped.class, JSONWriter.Context.class, JSONB.class, JSONSchema.class, JSONType.class, Date.class, Supplier.class};
        for (int i = 0; i < 50; i++) {
            Class cls10 = clsArr[i];
            String strReplace6 = cls10.getName().replace('.', '/');
            typeMapping.put(cls10, strReplace6);
            descMapping.put(cls10, "L" + strReplace6 + ';');
        }
        Map<Class, String> map4 = typeMapping;
        map4.put(JSONWriter.class, TYPE_JSON_WRITER);
        Map<Class, String> map5 = descMapping;
        map5.put(JSONWriter.class, DESC_JSON_WRITER);
        map4.put(ObjectWriter.class, TYPE_OBJECT_WRITER);
        map5.put(ObjectWriter.class, DESC_OBJECT_WRITER);
        map5.put(com.alibaba.fastjson2.writer.FieldWriter[].class, DESC_FIELD_WRITER_ARRAY);
        map5.put(FieldReader[].class, DESC_FIELD_READER_ARRAY);
        descCacheRef = new AtomicReference<>();
    }

    public static String desc(Class<?> cls) {
        String str = descMapping.get(cls);
        if (str != null) {
            return str;
        }
        if (cls.isArray()) {
            return "[" + desc(cls.getComponentType());
        }
        String name = cls.getName();
        char[] andSet = descCacheRef.getAndSet(null);
        if (andSet == null) {
            andSet = new char[512];
        }
        andSet[0] = 'L';
        name.getChars(0, name.length(), andSet, 1);
        for (int i = 1; i < andSet.length; i++) {
            if (andSet[i] == '.') {
                andSet[i] = '/';
            }
        }
        andSet[name.length() + 1] = ';';
        String str2 = new String(andSet, 0, name.length() + 2);
        AtomicReference<char[]> atomicReference = descCacheRef;
        while (!atomicReference.compareAndSet(null, andSet)) {
            if (atomicReference.get() != null) {
                return str2;
            }
        }
        return str2;
    }

    public static String[] lookupParameterNames(AccessibleObject accessibleObject) {
        Class<?>[] parameterTypes;
        Class<?> declaringClass;
        int parameterCount;
        String name;
        Class<?> declaringClass2;
        int i = 1;
        if (accessibleObject instanceof Constructor) {
            Constructor constructor = (Constructor) accessibleObject;
            Class<?>[] parameterTypes2 = constructor.getParameterTypes();
            Class declaringClass3 = constructor.getDeclaringClass();
            if (declaringClass3 == DateTimeParseException.class) {
                int length = parameterTypes2.length;
                Class<?> cls = Integer.TYPE;
                if (length == 3) {
                    if (parameterTypes2[0] == String.class && parameterTypes2[1] == CharSequence.class && parameterTypes2[2] == cls) {
                        return new String[]{"message", "parsedString", "errorIndex"};
                    }
                } else if (parameterTypes2.length == 4 && parameterTypes2[0] == String.class && parameterTypes2[1] == CharSequence.class && parameterTypes2[2] == cls && parameterTypes2[3] == Throwable.class) {
                    return new String[]{"message", "parsedString", "errorIndex", "cause"};
                }
            }
            if (Throwable.class.isAssignableFrom(declaringClass3)) {
                int length2 = parameterTypes2.length;
                if (length2 == 1) {
                    Class<?> cls2 = parameterTypes2[0];
                    if (cls2 == String.class) {
                        return new String[]{"message"};
                    }
                    if (Throwable.class.isAssignableFrom(cls2)) {
                        return new String[]{"cause"};
                    }
                } else if (length2 == 2 && parameterTypes2[0] == String.class && Throwable.class.isAssignableFrom(parameterTypes2[1])) {
                    return new String[]{"message", "cause"};
                }
            }
        }
        if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            parameterTypes = method.getParameterTypes();
            name = method.getName();
            declaringClass = method.getDeclaringClass();
            parameterCount = method.getParameterCount();
        } else {
            Constructor constructor2 = (Constructor) accessibleObject;
            parameterTypes = constructor2.getParameterTypes();
            declaringClass = constructor2.getDeclaringClass();
            parameterCount = constructor2.getParameterCount();
            name = "<init>";
        }
        if (parameterTypes.length == 0) {
            return new String[parameterCount];
        }
        String[] strArr = paramMapping.get(new MethodInfo(declaringClass.getName(), name, parameterTypes));
        if (strArr != null) {
            return strArr;
        }
        ClassLoader classLoader = declaringClass.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(declaringClass.getName().replace('.', '/') + ".class");
        if (resourceAsStream != null) {
            try {
                ClassReader classReader = new ClassReader(resourceAsStream);
                TypeCollector typeCollector = new TypeCollector(name, parameterTypes);
                classReader.accept(typeCollector);
                String[] parameterNamesForMethod = typeCollector.getParameterNamesForMethod();
                if (parameterNamesForMethod != null && parameterNamesForMethod.length == parameterCount - 1 && (declaringClass2 = declaringClass.getDeclaringClass()) != null && declaringClass2.equals(parameterTypes[0])) {
                    String[] strArr2 = new String[parameterCount];
                    strArr2[0] = "this$0";
                    System.arraycopy(parameterNamesForMethod, 0, strArr2, 1, parameterNamesForMethod.length);
                    parameterNamesForMethod = strArr2;
                }
                IOUtils.close(resourceAsStream);
                return parameterNamesForMethod;
            } catch (IOException | ArrayIndexOutOfBoundsException unused) {
                IOUtils.close(resourceAsStream);
            } catch (Throwable th) {
                IOUtils.close(resourceAsStream);
                throw th;
            }
        }
        String[] strArr3 = new String[parameterCount];
        if (parameterTypes[0] != declaringClass.getDeclaringClass() || Modifier.isStatic(declaringClass.getModifiers())) {
            i = 0;
        } else {
            strArr3[0] = "this.$0";
        }
        while (i < parameterCount) {
            strArr3[i] = AbstractC1095.m2794(i, "arg");
            i++;
        }
        return strArr3;
    }

    public static String type(Class<?> cls) {
        String str = typeMapping.get(cls);
        if (str != null) {
            return str;
        }
        if (!cls.isArray()) {
            return cls.getName().replace('.', '/');
        }
        return "[" + desc(cls.getComponentType());
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodInfo {
        final String className;
        int hash;
        final String methodName;
        final String[] paramTypeNames;

        public MethodInfo(String str, String str2, String[] strArr) {
            this.className = str;
            this.methodName = str2;
            this.paramTypeNames = strArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && MethodInfo.class == obj.getClass()) {
                MethodInfo methodInfo = (MethodInfo) obj;
                if (Objects.equals(this.className, methodInfo.className) && Objects.equals(this.methodName, methodInfo.methodName) && Arrays.equals(this.paramTypeNames, methodInfo.paramTypeNames)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (this.hash == 0) {
                this.hash = (Objects.hash(this.className, this.methodName) * 31) + Arrays.hashCode(this.paramTypeNames);
            }
            return this.hash;
        }

        public MethodInfo(String str, String str2, Class[] clsArr) {
            this.className = str;
            this.methodName = str2;
            this.paramTypeNames = new String[clsArr.length];
            for (int i = 0; i < clsArr.length; i++) {
                this.paramTypeNames[i] = clsArr[i].getName();
            }
        }
    }
}
