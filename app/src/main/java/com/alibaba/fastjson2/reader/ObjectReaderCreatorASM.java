package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.function.FieldBiConsumer;
import com.alibaba.fastjson2.function.FieldConsumer;
import com.alibaba.fastjson2.function.ObjBoolConsumer;
import com.alibaba.fastjson2.function.ObjByteConsumer;
import com.alibaba.fastjson2.function.ObjCharConsumer;
import com.alibaba.fastjson2.function.ObjFloatConsumer;
import com.alibaba.fastjson2.function.ObjShortConsumer;
import com.alibaba.fastjson2.internal.CodeGenUtils;
import com.alibaba.fastjson2.internal.asm.ASMUtils;
import com.alibaba.fastjson2.internal.asm.ClassWriter;
import com.alibaba.fastjson2.internal.asm.Label;
import com.alibaba.fastjson2.internal.asm.MethodWriter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.DynamicClassLoader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.function.ToLongFunction;
import okhttp3.internal.http2.Settings;
import p000.AbstractC0924feyxiexzfUjhhgtg;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.C1292feyxiexzfUjhhgtg;
import p000.C1300feyxiexzfUjhhgtg;
import p000.C1301feyxiexzfUjhhgtg;
import p000.C1311feyxiexzfUjhhgtg;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderCreatorASM extends ObjectReaderCreator {
    static final String METHOD_DESC_ADAPTER_INIT;
    static final String METHOD_DESC_ADD_RESOLVE_TASK;
    static final String METHOD_DESC_CHECK_ARRAY_AUTO_TYPE;
    static final String METHOD_DESC_GET_FIELD_READER;
    static final String METHOD_DESC_GET_ITEM_OBJECT_READER;
    static final String METHOD_DESC_GET_OBJECT_READER_1;
    static final String METHOD_DESC_INIT;
    static final String METHOD_DESC_JSON_READER_CHECK_ARRAY_AUTO_TYPE;
    static final String METHOD_DESC_PROCESS_EXTRA;
    static final String METHOD_DESC_READ_ARRAY_MAPPING_JSONB_OBJECT0;
    static final String METHOD_DESC_READ_FIELD_VALUE;
    static final String METHOD_DESC_READ_OBJECT;
    static final String READ_FIELD_READER_UL;
    static final int THIS = 0;
    private static final String[] TYPE_OBJECT_READERS;
    static final String[] fieldItemObjectReader;
    static final Map<Class, FieldReaderInfo> infos;
    static final String packageName;
    protected final DynamicClassLoader classLoader;
    public static final ObjectReaderCreatorASM INSTANCE = new ObjectReaderCreatorASM(DynamicClassLoader.getInstance());
    protected static final AtomicLong seed = new AtomicLong();

    /* JADX INFO: compiled from: obf */
    public static class FieldReaderInfo {
        final String acceptDesc;
        final String interfaceDesc;
        final int loadCode;
        final String readMethodDesc;
        final String readMethodName;
        final String setterDesc;
        final int storeCode;

        public FieldReaderInfo(String str, String str2, String str3, int i, String str4, String str5, int i2) {
            this.interfaceDesc = str;
            this.acceptDesc = str2;
            this.setterDesc = str3;
            this.loadCode = i;
            this.readMethodName = str4;
            this.readMethodDesc = str5;
            this.storeCode = i2;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class ObjectReadContext {
        final BeanInfo beanInfo;
        final String classNameFull;
        final String classNameType;
        final ClassWriter cw;
        final Constructor defaultConstructor;
        final boolean externalClass;
        final int fieldNameCharLengthMax;
        final int fieldNameCharLengthMin;
        final int fieldNameLengthMax;
        final int fieldNameLengthMin;
        final FieldReader[] fieldReaders;
        final boolean hasStringField;
        final Class objectClass;
        ObjectReaderAdapter objectReaderAdapter;
        final String objectType;
        final boolean publicClass;

        public ObjectReadContext(BeanInfo beanInfo, Class cls, ClassWriter classWriter, boolean z, FieldReader[] fieldReaderArr, Constructor constructor) {
            this.beanInfo = beanInfo;
            this.objectClass = cls;
            this.cw = classWriter;
            this.publicClass = cls == null || Modifier.isPublic(cls.getModifiers());
            this.externalClass = z;
            this.fieldReaders = fieldReaderArr;
            this.defaultConstructor = constructor;
            this.objectType = cls == null ? ASMUtils.TYPE_OBJECT : ASMUtils.type(cls);
            boolean z2 = false;
            int iMin = 0;
            int iMax = 0;
            int iMin2 = 0;
            int iMax2 = 0;
            for (int i = 0; i < fieldReaderArr.length; i++) {
                FieldReader fieldReader = fieldReaderArr[i];
                z2 = fieldReader.fieldClass == String.class ? true : z2;
                int length = fieldReader.fieldName.length();
                iMin2 = iMin2 == 0 ? length : Math.min(length, iMin2);
                iMax2 = Math.max(length, iMax2);
                byte[] bytes = fieldReader.fieldName.getBytes(StandardCharsets.UTF_8);
                int length2 = bytes.length;
                for (byte b : bytes) {
                    if (b <= 0) {
                        length2 = -1;
                        break;
                    }
                }
                if (i == 0) {
                    iMin = length2;
                    iMax = iMin;
                } else {
                    iMin = Math.min(length2, iMin);
                    iMax = Math.max(length2, iMax);
                }
            }
            this.hasStringField = z2;
            this.fieldNameLengthMin = iMin;
            this.fieldNameLengthMax = iMax;
            this.fieldNameCharLengthMin = iMin2;
            this.fieldNameCharLengthMax = iMax2;
            StringBuilder sb = new StringBuilder("ORG_");
            sb.append(ObjectReaderCreatorASM.seed.incrementAndGet());
            sb.append("_");
            sb.append(fieldReaderArr.length);
            sb.append(cls == null ? "" : "_".concat(cls.getSimpleName()));
            String string = sb.toString();
            if (ObjectReaderCreatorASM.class.getPackage() == null) {
                this.classNameType = string;
                this.classNameFull = string;
                return;
            }
            String str = ObjectReaderCreatorASM.packageName + '.' + string;
            this.classNameFull = str;
            this.classNameType = str.replace('.', '/');
        }

        public boolean disableAutoType() {
            return (this.beanInfo.readerFeatures & FieldInfo.DISABLE_AUTO_TYPE) != 0;
        }

        public boolean disableJSONB() {
            return (this.beanInfo.readerFeatures & FieldInfo.DISABLE_JSONB) != 0;
        }

        public boolean disableReferenceDetect() {
            return (this.beanInfo.readerFeatures & FieldInfo.DISABLE_REFERENCE_DETECT) != 0;
        }

        public boolean disableSmartMatch() {
            return (this.beanInfo.readerFeatures & FieldInfo.DISABLE_SMART_MATCH) != 0;
        }

        public boolean disableSupportArrayMapping() {
            return (this.beanInfo.readerFeatures & FieldInfo.DISABLE_ARRAY_MAPPING) != 0;
        }
    }

    static {
        StringBuilder sb = new StringBuilder("(");
        String str = ASMUtils.DESC_JSON_READER;
        sb.append(str);
        sb.append(")");
        String str2 = ASMUtils.DESC_OBJECT_READER;
        sb.append(str2);
        METHOD_DESC_GET_ITEM_OBJECT_READER = sb.toString();
        METHOD_DESC_GET_OBJECT_READER_1 = "(" + str + ")" + str2;
        StringBuilder sb2 = new StringBuilder("(Ljava/lang/Class;Ljava/util/function/Supplier;");
        String str3 = ASMUtils.DESC_FIELD_READER_ARRAY;
        METHOD_DESC_INIT = AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(sb2, str3, ")V");
        METHOD_DESC_ADAPTER_INIT = "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;J" + ASMUtils.DESC_JSONSCHEMA + "Ljava/util/function/Supplier;Ljava/util/function/Function;" + str3 + ")V";
        METHOD_DESC_READ_OBJECT = AbstractC3317feyxiexzfUjhhgtg.m4801Ujhhgtgfeyxiexzf("(", str, "Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;");
        StringBuilder sb3 = new StringBuilder("(J)");
        sb3.append(ASMUtils.DESC_FIELD_READER);
        METHOD_DESC_GET_FIELD_READER = sb3.toString();
        METHOD_DESC_READ_FIELD_VALUE = AbstractC3317feyxiexzfUjhhgtg.m4801Ujhhgtgfeyxiexzf("(", str, "Ljava/lang/Object;)V");
        READ_FIELD_READER_UL = AbstractC3317feyxiexzfUjhhgtg.m4801Ujhhgtgfeyxiexzf("(J", str, "JLjava/lang/Object;)V");
        METHOD_DESC_ADD_RESOLVE_TASK = AbstractC3317feyxiexzfUjhhgtg.m4801Ujhhgtgfeyxiexzf("(", str, "Ljava/lang/Object;Ljava/lang/String;)V");
        METHOD_DESC_CHECK_ARRAY_AUTO_TYPE = "(" + str + ")" + str2;
        METHOD_DESC_PROCESS_EXTRA = AbstractC3317feyxiexzfUjhhgtg.m4801Ujhhgtgfeyxiexzf("(", str, "Ljava/lang/Object;J)V");
        METHOD_DESC_JSON_READER_CHECK_ARRAY_AUTO_TYPE = "(" + str + "J)" + str2;
        METHOD_DESC_READ_ARRAY_MAPPING_JSONB_OBJECT0 = AbstractC3317feyxiexzfUjhhgtg.m4801Ujhhgtgfeyxiexzf("(", str, "Ljava/lang/Object;I)V");
        HashMap map = new HashMap();
        infos = map;
        Package r1 = ObjectReaderCreatorASM.class.getPackage();
        packageName = r1 != null ? r1.getName() : "";
        map.put(Boolean.TYPE, new FieldReaderInfo(ASMUtils.type(ObjBoolConsumer.class), "(Ljava/lang/Object;Z)V", "(Z)V", 21, "readFieldBoolValue", "()Z", 54));
        map.put(Character.TYPE, new FieldReaderInfo(ASMUtils.type(ObjCharConsumer.class), "(Ljava/lang/Object;C)V", "(C)V", 21, "readInt32Value", "()C", 54));
        map.put(Byte.TYPE, new FieldReaderInfo(ASMUtils.type(ObjByteConsumer.class), "(Ljava/lang/Object;B)V", "(B)V", 21, "readInt32Value", "()B", 54));
        map.put(Short.TYPE, new FieldReaderInfo(ASMUtils.type(ObjShortConsumer.class), "(Ljava/lang/Object;S)V", "(S)V", 21, "readInt32Value", "()S", 54));
        map.put(Integer.TYPE, new FieldReaderInfo(ASMUtils.type(ObjIntConsumer.class), "(Ljava/lang/Object;I)V", "(I)V", 21, "readInt32Value", "()I", 54));
        map.put(Long.TYPE, new FieldReaderInfo(ASMUtils.type(ObjLongConsumer.class), "(Ljava/lang/Object;J)V", "(J)V", 22, "readInt64Value", "()V", 55));
        map.put(Float.TYPE, new FieldReaderInfo(ASMUtils.type(ObjFloatConsumer.class), "(Ljava/lang/Object;F)V", "(F)V", 23, "readFieldFloatValue", "()F", 56));
        map.put(Double.TYPE, new FieldReaderInfo(ASMUtils.type(ObjDoubleConsumer.class), "(Ljava/lang/Object;D)V", "(D)V", 24, "readFloatDoubleValue", "()D", 57));
        map.put(String.class, new FieldReaderInfo(ASMUtils.type(BiConsumer.class), "(Ljava/lang/Object;Ljava/lang/Object;)V", "(Ljava/lang/String;)V", 25, "readString", "()Ljava/lang/String;", 58));
        map.put(Integer.class, new FieldReaderInfo(ASMUtils.type(BiConsumer.class), "(Ljava/lang/Object;Ljava/lang/Integer;)V", "(Ljava/lang/Integer;)V", 25, "readInt32", "()Ljava/lang/Integer;", 58));
        TYPE_OBJECT_READERS = new String[]{ASMUtils.TYPE_OBJECT_READER_ADAPTER, ASMUtils.TYPE_OBJECT_READER_1, ASMUtils.TYPE_OBJECT_READER_2, ASMUtils.TYPE_OBJECT_READER_3, ASMUtils.TYPE_OBJECT_READER_4, ASMUtils.TYPE_OBJECT_READER_5, ASMUtils.TYPE_OBJECT_READER_6, ASMUtils.TYPE_OBJECT_READER_7, ASMUtils.TYPE_OBJECT_READER_8, ASMUtils.TYPE_OBJECT_READER_9, ASMUtils.TYPE_OBJECT_READER_10, ASMUtils.TYPE_OBJECT_READER_11, ASMUtils.TYPE_OBJECT_READER_12};
        fieldItemObjectReader = new String[1024];
    }

    public ObjectReaderCreatorASM(ClassLoader classLoader) {
        this.classLoader = classLoader instanceof DynamicClassLoader ? (DynamicClassLoader) classLoader : new DynamicClassLoader(classLoader);
    }

    private static int[] buildHashCode32Map(long[] jArr, Map<Integer, List<Long>> map) {
        int i = 0;
        for (long j : jArr) {
            map.computeIfAbsent(Integer.valueOf((int) ((j >>> 32) ^ j)), new C1311feyxiexzfUjhhgtg(8)).add(Long.valueOf(j));
        }
        int[] iArr = new int[map.size()];
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        Arrays.sort(iArr);
        return iArr;
    }

    private void createObjectForNonConstructor(ObjectReadContext objectReadContext, MethodWriterContext methodWriterContext) {
        Constructor constructor;
        Class cls;
        Constructor constructor2;
        FieldReader[] fieldReaderArr = objectReadContext.fieldReaders;
        MethodWriter methodWriter = methodWriterContext.mw;
        ObjectReaderNoneDefaultConstructor objectReaderNoneDefaultConstructor = (ObjectReaderNoneDefaultConstructor) objectReadContext.objectReaderAdapter;
        int i = 0;
        if (!this.classLoader.isExternalClass(objectReadContext.objectClass) && objectReadContext.objectClass.getTypeParameters().length == 0 && (((constructor = objectReaderNoneDefaultConstructor.constructor) == null || Modifier.isPublic(constructor.getModifiers())) && (((cls = objectReadContext.objectClass) == null || Modifier.isPublic(cls.getModifiers())) && objectReaderNoneDefaultConstructor.factoryFunction == null && ((constructor2 = objectReaderNoneDefaultConstructor.noneDefaultConstructor) == null || Modifier.isPublic(constructor2.getModifiers()))))) {
            methodWriter.new_(objectReadContext.objectType);
            methodWriter.dup();
            StringBuilder sb = new StringBuilder("(");
            int length = fieldReaderArr.length;
            while (i < length) {
                FieldReader fieldReader = fieldReaderArr[i];
                methodWriter.loadLocal(fieldReader.fieldClass, methodWriterContext.var(fieldReader));
                sb.append(ASMUtils.desc(fieldReader.fieldClass));
                i++;
            }
            sb.append(")V");
            methodWriter.invokespecial(objectReadContext.objectType, "<init>", sb.toString());
            return;
        }
        methodWriter.aload(0);
        methodWriter.iconst_n(fieldReaderArr.length);
        methodWriter.anewArray(ASMUtils.TYPE_OBJECT);
        while (i < fieldReaderArr.length) {
            FieldReader fieldReader2 = fieldReaderArr[i];
            methodWriter.dup();
            methodWriter.iconst_n(i);
            methodWriter.loadLocal(fieldReader2.fieldClass, methodWriterContext.var(fieldReader2));
            Class cls2 = fieldReader2.fieldClass;
            if (cls2 == Integer.TYPE) {
                methodWriter.invokestatic("java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
            } else if (cls2 == Long.TYPE) {
                methodWriter.invokestatic("java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
            } else if (cls2 == Float.TYPE) {
                methodWriter.invokestatic("java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
            } else if (cls2 == Double.TYPE) {
                methodWriter.invokestatic("java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
            } else if (cls2 == Boolean.TYPE) {
                methodWriter.invokestatic("java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
            } else if (cls2 == Short.TYPE) {
                methodWriter.invokestatic("java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
            } else if (cls2 == Byte.TYPE) {
                methodWriter.invokestatic("java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
            } else if (cls2 == Character.TYPE) {
                methodWriter.invokestatic("java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
            }
            methodWriter.aastore();
            i++;
        }
        methodWriter.invokevirtual(ASMUtils.TYPE_OBJECT_READER_NONE_DEFAULT_CONSTRUCTOR, "createInstance", "([Ljava/lang/Object;)Ljava/lang/Object;");
    }

    private Function createValueConsumer0(Class cls, FieldReader[] fieldReaderArr, boolean z) {
        String strReplace;
        String strDesc;
        String strM4801Ujhhgtgfeyxiexzf;
        FieldReader[] fieldReaderArr2 = fieldReaderArr;
        Constructor defaultConstructor = BeanUtils.getDefaultConstructor(cls, false);
        if (defaultConstructor == null || !Modifier.isPublic(cls.getModifiers())) {
            return null;
        }
        ClassWriter classWriter = new ClassWriter(new C1300feyxiexzfUjhhgtg(0, cls));
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "VBACG_" : "VCACG_");
        sb.append(seed.incrementAndGet());
        sb.append("_");
        sb.append(fieldReaderArr2.length);
        sb.append("_");
        sb.append(cls.getSimpleName());
        String string = sb.toString();
        if (ObjectReaderCreatorASM.class.getPackage() != null) {
            string = packageName + '.' + string;
            strReplace = string.replace('.', '/');
        } else {
            strReplace = string;
        }
        String strType = ASMUtils.type(cls);
        String strDesc2 = ASMUtils.desc(cls);
        classWriter.visitField(17, "consumer", "Ljava/util/function/Consumer;");
        classWriter.visitField(1, "object", strDesc2);
        String str = "object";
        classWriter.visit(52, 49, strReplace, ASMUtils.TYPE_OBJECT, new String[]{z ? ASMUtils.TYPE_BYTE_ARRAY_VALUE_CONSUMER : ASMUtils.TYPE_CHAR_ARRAY_VALUE_CONSUMER});
        MethodWriter methodWriterVisitMethod = classWriter.visitMethod(1, "<init>", "(Ljava/util/function/Consumer;)V", 32);
        methodWriterVisitMethod.aload(0);
        methodWriterVisitMethod.invokespecial(ASMUtils.TYPE_OBJECT, "<init>", "()V");
        methodWriterVisitMethod.aload(0);
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.putfield(strReplace, "consumer", "Ljava/util/function/Consumer;");
        methodWriterVisitMethod.return_();
        methodWriterVisitMethod.visitMaxs(3, 3);
        String str2 = "(I)V";
        MethodWriter methodWriterVisitMethod2 = classWriter.visitMethod(1, "beforeRow", "(I)V", 32);
        methodWriterVisitMethod2.aload(0);
        newObject(methodWriterVisitMethod2, strType, defaultConstructor);
        methodWriterVisitMethod2.putfield(strReplace, str, strDesc2);
        methodWriterVisitMethod2.return_();
        methodWriterVisitMethod2.visitMaxs(3, 3);
        MethodWriter methodWriterVisitMethod3 = classWriter.visitMethod(1, "afterRow", "(I)V", 32);
        methodWriterVisitMethod3.aload(0);
        methodWriterVisitMethod3.getfield(strReplace, "consumer", "Ljava/util/function/Consumer;");
        methodWriterVisitMethod3.aload(0);
        methodWriterVisitMethod3.getfield(strReplace, str, strDesc2);
        methodWriterVisitMethod3.invokeinterface("java/util/function/Consumer", "accept", "(Ljava/lang/Object;)V");
        methodWriterVisitMethod3.aload(0);
        methodWriterVisitMethod3.aconst_null();
        methodWriterVisitMethod3.putfield(strReplace, str, strDesc2);
        methodWriterVisitMethod3.return_();
        methodWriterVisitMethod3.visitMaxs(3, 3);
        MethodWriter methodWriterVisitMethod4 = classWriter.visitMethod(1, "accept", z ? "(II[BIILjava/nio/charset/Charset;)V" : "(II[CII)V", 32);
        Label label = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        methodWriterVisitMethod4.iload(5);
        methodWriterVisitMethod4.ifne(label2);
        methodWriterVisitMethod4.return_();
        methodWriterVisitMethod4.visitLabel(label2);
        methodWriterVisitMethod4.iload(2);
        methodWriterVisitMethod4.ifge(label3);
        methodWriterVisitMethod4.return_();
        methodWriterVisitMethod4.visitLabel(label3);
        methodWriterVisitMethod4.iload(2);
        methodWriterVisitMethod4.visitLdcInsn(fieldReaderArr2.length);
        methodWriterVisitMethod4.if_icmple(label);
        methodWriterVisitMethod4.return_();
        methodWriterVisitMethod4.visitLabel(label);
        Label label4 = new Label();
        int length = fieldReaderArr2.length;
        Label[] labelArr = new Label[length];
        int length2 = fieldReaderArr2.length;
        int[] iArr = new int[length2];
        for (int i = 0; i < length2; i++) {
            iArr[i] = i;
            labelArr[i] = new Label();
        }
        methodWriterVisitMethod4.iload(2);
        methodWriterVisitMethod4.visitLookupSwitchInsn(label4, iArr, labelArr);
        int i2 = 0;
        while (i2 < length) {
            methodWriterVisitMethod4.visitLabel(labelArr[i2]);
            FieldReader fieldReader = fieldReaderArr2[i2];
            Field field = fieldReader.field;
            Class cls2 = fieldReader.fieldClass;
            int i3 = i2;
            Type type = fieldReader.fieldType;
            ClassWriter classWriter2 = classWriter;
            methodWriterVisitMethod4.aload(0);
            methodWriterVisitMethod4.getfield(strReplace, str, strDesc2);
            String str3 = strDesc2;
            Class cls3 = Byte.TYPE;
            String str4 = str;
            String str5 = strReplace;
            Class cls4 = Short.TYPE;
            String str6 = str2;
            int i4 = length;
            Class cls5 = Integer.TYPE;
            Label[] labelArr2 = labelArr;
            if (type == Integer.class || type == cls5 || type == Short.class || type == cls4 || type == Byte.class || type == cls3) {
                methodWriterVisitMethod4.aload(3);
                methodWriterVisitMethod4.iload(4);
                methodWriterVisitMethod4.iload(5);
                methodWriterVisitMethod4.invokestatic(ASMUtils.TYPE_TYPE_UTILS, "parseInt", z ? "([BII)I" : "([CII)I");
                if (type == cls4) {
                    strDesc = "S";
                    strM4801Ujhhgtgfeyxiexzf = "(S)V";
                } else if (type == Short.class) {
                    methodWriterVisitMethod4.invokestatic("java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
                    strDesc = "Ljava/lang/Short;";
                    strM4801Ujhhgtgfeyxiexzf = "(Ljava/lang/Short;)V";
                } else if (type == cls3) {
                    strDesc = "B";
                    strM4801Ujhhgtgfeyxiexzf = "(B)V";
                } else if (type == Byte.class) {
                    methodWriterVisitMethod4.invokestatic("java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
                    strDesc = "Ljava/lang/Byte;";
                    strM4801Ujhhgtgfeyxiexzf = "(Ljava/lang/Byte;)V";
                } else if (type == cls5) {
                    strDesc = "I";
                    strM4801Ujhhgtgfeyxiexzf = str6;
                } else {
                    methodWriterVisitMethod4.invokestatic("java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                    strDesc = "Ljava/lang/Integer;";
                    strM4801Ujhhgtgfeyxiexzf = "(Ljava/lang/Integer;)V";
                }
            } else {
                strM4801Ujhhgtgfeyxiexzf = "(J)V";
                Class cls6 = Long.TYPE;
                if (type == Long.class || type == cls6) {
                    methodWriterVisitMethod4.aload(3);
                    methodWriterVisitMethod4.iload(4);
                    methodWriterVisitMethod4.iload(5);
                    methodWriterVisitMethod4.invokestatic(ASMUtils.TYPE_TYPE_UTILS, "parseLong", z ? "([BII)J" : "([CII)J");
                    if (type == cls6) {
                        strDesc = "J";
                    } else {
                        methodWriterVisitMethod4.invokestatic("java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
                        strDesc = "Ljava/lang/Long;";
                        strM4801Ujhhgtgfeyxiexzf = "(Ljava/lang/Long;)V";
                    }
                } else {
                    Class cls7 = Float.TYPE;
                    if (type == Float.class || type == cls7) {
                        methodWriterVisitMethod4.aload(3);
                        methodWriterVisitMethod4.iload(4);
                        methodWriterVisitMethod4.iload(5);
                        methodWriterVisitMethod4.invokestatic(ASMUtils.TYPE_TYPE_UTILS, "parseFloat", z ? "([BII)F" : "([CII)F");
                        if (type == cls7) {
                            strDesc = "F";
                            strM4801Ujhhgtgfeyxiexzf = "(F)V";
                        } else {
                            methodWriterVisitMethod4.invokestatic("java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
                            strDesc = "Ljava/lang/Float;";
                            strM4801Ujhhgtgfeyxiexzf = "(Ljava/lang/Float;)V";
                        }
                    } else {
                        Class cls8 = Double.TYPE;
                        if (type == Double.class || type == cls8) {
                            methodWriterVisitMethod4.aload(3);
                            methodWriterVisitMethod4.iload(4);
                            methodWriterVisitMethod4.iload(5);
                            methodWriterVisitMethod4.invokestatic(ASMUtils.TYPE_TYPE_UTILS, "parseDouble", z ? "([BII)D" : "([CII)D");
                            if (type == cls8) {
                                strDesc = "D";
                                strM4801Ujhhgtgfeyxiexzf = "(D)V";
                            } else {
                                methodWriterVisitMethod4.invokestatic("java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
                                strDesc = "Ljava/lang/Double;";
                                strM4801Ujhhgtgfeyxiexzf = "(Ljava/lang/Double;)V";
                            }
                        } else {
                            Class cls9 = Boolean.TYPE;
                            if (type == Boolean.class || type == cls9) {
                                methodWriterVisitMethod4.aload(3);
                                methodWriterVisitMethod4.iload(4);
                                methodWriterVisitMethod4.iload(5);
                                methodWriterVisitMethod4.invokestatic(ASMUtils.TYPE_TYPE_UTILS, "parseBoolean", z ? "([BII)Ljava/lang/Boolean;" : "([CII)Ljava/lang/Boolean;");
                                if (type == cls9) {
                                    methodWriterVisitMethod4.invokevirtual("java/lang/Boolean", "booleanValue", "()Z");
                                    strDesc = "Z";
                                    strM4801Ujhhgtgfeyxiexzf = "(Z)V";
                                } else {
                                    strDesc = "Ljava/lang/Boolean;";
                                    strM4801Ujhhgtgfeyxiexzf = "(Ljava/lang/Boolean;)V";
                                }
                            } else if (type == Date.class) {
                                methodWriterVisitMethod4.new_("java/util/Date");
                                methodWriterVisitMethod4.dup();
                                methodWriterVisitMethod4.aload(3);
                                methodWriterVisitMethod4.iload(4);
                                methodWriterVisitMethod4.iload(5);
                                if (z) {
                                    methodWriterVisitMethod4.aload(6);
                                    methodWriterVisitMethod4.invokestatic(ASMUtils.TYPE_DATE_UTILS, "parseMillis", "([BIILjava/nio/charset/Charset;)J");
                                } else {
                                    methodWriterVisitMethod4.invokestatic(ASMUtils.TYPE_DATE_UTILS, "parseMillis", "([CII)J");
                                }
                                methodWriterVisitMethod4.invokespecial("java/util/Date", "<init>", "(J)V");
                                strDesc = "Ljava/util/Date;";
                                strM4801Ujhhgtgfeyxiexzf = "(Ljava/util/Date;)V";
                            } else if (type == BigDecimal.class) {
                                methodWriterVisitMethod4.aload(3);
                                methodWriterVisitMethod4.iload(4);
                                methodWriterVisitMethod4.iload(5);
                                methodWriterVisitMethod4.invokestatic(ASMUtils.TYPE_TYPE_UTILS, "parseBigDecimal", z ? "([BII)Ljava/math/BigDecimal;" : "([CII)Ljava/math/BigDecimal;");
                                strDesc = "Ljava/math/BigDecimal;";
                                strM4801Ujhhgtgfeyxiexzf = "(Ljava/math/BigDecimal;)V";
                            } else {
                                methodWriterVisitMethod4.new_("java/lang/String");
                                methodWriterVisitMethod4.dup();
                                methodWriterVisitMethod4.aload(3);
                                methodWriterVisitMethod4.iload(4);
                                methodWriterVisitMethod4.iload(5);
                                if (z) {
                                    methodWriterVisitMethod4.aload(6);
                                    methodWriterVisitMethod4.invokespecial("java/lang/String", "<init>", "([BIILjava/nio/charset/Charset;)V");
                                } else {
                                    methodWriterVisitMethod4.invokespecial("java/lang/String", "<init>", "([CII)V");
                                }
                                if (type == String.class) {
                                    strDesc = "Ljava/lang/String;";
                                    strM4801Ujhhgtgfeyxiexzf = "(Ljava/lang/String;)V";
                                } else {
                                    strDesc = ASMUtils.desc(cls2);
                                    strM4801Ujhhgtgfeyxiexzf = cls2 == Character.TYPE ? "(C)V" : AbstractC3317feyxiexzfUjhhgtg.m4801Ujhhgtgfeyxiexzf("(", strDesc, ")V");
                                    methodWriterVisitMethod4.visitLdcInsn(cls2);
                                    methodWriterVisitMethod4.invokestatic(ASMUtils.TYPE_TYPE_UTILS, "cast", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;");
                                    methodWriterVisitMethod4.checkcast(ASMUtils.type(cls2));
                                }
                            }
                        }
                    }
                }
            }
            Method method = fieldReader.method;
            if (method != null) {
                if (method.getReturnType() != Void.TYPE) {
                    return null;
                }
                methodWriterVisitMethod4.invokevirtual(strType, fieldReader.method.getName(), strM4801Ujhhgtgfeyxiexzf);
                methodWriterVisitMethod4.goto_(label4);
                i2 = i3 + 1;
                fieldReaderArr2 = fieldReaderArr;
                classWriter = classWriter2;
                strDesc2 = str3;
                str = str4;
                strReplace = str5;
                str2 = str6;
                length = i4;
                labelArr = labelArr2;
            } else {
                if (field == null) {
                    return null;
                }
                methodWriterVisitMethod4.putfield(strType, field.getName(), strDesc);
                methodWriterVisitMethod4.goto_(label4);
                i2 = i3 + 1;
                fieldReaderArr2 = fieldReaderArr;
                classWriter = classWriter2;
                strDesc2 = str3;
                str = str4;
                strReplace = str5;
                str2 = str6;
                length = i4;
                labelArr = labelArr2;
            }
        }
        methodWriterVisitMethod4.visitLabel(label4);
        methodWriterVisitMethod4.return_();
        methodWriterVisitMethod4.visitMaxs(3, 3);
        byte[] byteArray = classWriter.toByteArray();
        try {
            return new C1292feyxiexzfUjhhgtg(1, this.classLoader.defineClassPublic(string, byteArray, 0, byteArray.length).getConstructor(Consumer.class));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String fieldItemObjectReader(int i) {
        String[] strArr = fieldItemObjectReader;
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        int iStringSize = IOUtils.stringSize(i) + 10;
        char[] cArr = new char[iStringSize];
        "itemReader".getChars(0, 10, cArr, 0);
        IOUtils.getChars(i, iStringSize, cArr);
        String str2 = new String(cArr);
        strArr[i] = str2;
        return str2;
    }

    public static String fieldObjectReader(int i) {
        switch (i) {
            case 0:
                return "objectReader0";
            case 1:
                return "objectReader1";
            case 2:
                return "objectReader2";
            case 3:
                return "objectReader3";
            case 4:
                return "objectReader4";
            case 5:
                return "objectReader5";
            case 6:
                return "objectReader6";
            case 7:
                return "objectReader7";
            case 8:
                return "objectReader8";
            case 9:
                return "objectReader9";
            case 10:
                return "objectReader10";
            case 11:
                return "objectReader11";
            case Opcodes.FCONST_1 /* 12 */:
                return "objectReader12";
            case 13:
                return "objectReader13";
            case Opcodes.DCONST_0 /* 14 */:
                return "objectReader14";
            case 15:
                return "objectReader15";
            default:
                int iStringSize = IOUtils.stringSize(i) + 12;
                char[] cArr = new char[iStringSize];
                "objectReader".getChars(0, 12, cArr, 0);
                IOUtils.getChars(i, iStringSize, cArr);
                return new String(cArr);
        }
    }

    private void genCheckAutoType(String str, MethodWriterContext methodWriterContext) {
        MethodWriter methodWriter = methodWriterContext.mw;
        int iVar = methodWriterContext.var("autoTypeObjectReader");
        Label label = new Label();
        methodWriter.aload(0);
        methodWriter.aload(1);
        methodWriter.lload(4);
        methodWriter.invokevirtual(str, "checkAutoType", METHOD_DESC_JSON_READER_CHECK_ARRAY_AUTO_TYPE);
        methodWriter.dup();
        methodWriter.astore(iVar);
        methodWriter.ifnull(label);
        methodWriter.aload(iVar);
        methodWriter.aload(1);
        methodWriter.aload(2);
        methodWriter.aload(3);
        methodWriter.lload(4);
        methodWriter.invokeinterface(ASMUtils.TYPE_OBJECT_READER, "readJSONBObject", METHOD_DESC_READ_OBJECT);
        methodWriter.areturn();
        methodWriter.visitLabel(label);
    }

    private <T> void genCreateObject(MethodWriter methodWriter, ObjectReadContext objectReadContext, String str) {
        Constructor constructor = objectReadContext.defaultConstructor;
        Supplier<T> supplier = objectReadContext.objectReaderAdapter.creator;
        Class<?> cls = objectReadContext.objectClass;
        boolean z = Modifier.isPublic(cls == null ? 1 : cls.getModifiers()) && (cls == null || !this.classLoader.isExternalClass(cls));
        if (constructor != null && z && Modifier.isPublic(constructor.getModifiers())) {
            newObject(methodWriter, objectReadContext.objectType, objectReadContext.defaultConstructor);
        } else {
            if (supplier != null) {
                methodWriter.aload(0);
                methodWriter.getfield(str, "creator", ASMUtils.DESC_SUPPLIER);
                methodWriter.invokeinterface("java/util/function/Supplier", "get", "()Ljava/lang/Object;");
            } else {
                methodWriter.aload(0);
                methodWriter.aload(1);
                methodWriter.lload(4);
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "features", "(J)J");
                methodWriter.invokevirtual(str, "createInstance", "(J)Ljava/lang/Object;");
            }
            if (z) {
                methodWriter.checkcast(objectReadContext.objectType);
            }
        }
        if (objectReadContext.hasStringField) {
            Label label = new Label();
            methodWriter.lload(4);
            methodWriter.visitLdcInsn(JSONReader.Feature.InitStringFieldAsEmpty.mask);
            methodWriter.land();
            methodWriter.lconst_0();
            methodWriter.lcmp();
            methodWriter.ifeq(label);
            methodWriter.dup();
            methodWriter.aload(0);
            methodWriter.swap();
            methodWriter.invokevirtual(str, "initStringFieldAsEmpty", "(Ljava/lang/Object;)V");
            methodWriter.visitLabel(label);
        }
    }

    private void genFields(FieldReader[] fieldReaderArr, ClassWriter classWriter, String str) {
        if (str == ASMUtils.TYPE_OBJECT_READER_ADAPTER || str == ASMUtils.TYPE_OBJECT_READER_NONE_DEFAULT_CONSTRUCTOR) {
            for (int i = 0; i < fieldReaderArr.length; i++) {
                classWriter.visitField(1, CodeGenUtils.fieldReader(i), ASMUtils.DESC_FIELD_READER);
            }
            for (int i2 = 0; i2 < fieldReaderArr.length; i2++) {
                classWriter.visitField(1, fieldObjectReader(i2), ASMUtils.DESC_OBJECT_READER);
            }
        }
        for (int i3 = 0; i3 < fieldReaderArr.length; i3++) {
            if (List.class.isAssignableFrom(fieldReaderArr[i3].fieldClass)) {
                classWriter.visitField(1, fieldItemObjectReader(i3), ASMUtils.DESC_OBJECT_READER);
            }
        }
    }

    private void genInitFields(FieldReader[] fieldReaderArr, String str, boolean z, int i, MethodWriter methodWriter, String str2) {
        if ((str2 == ASMUtils.TYPE_OBJECT_READER_ADAPTER || str2 == ASMUtils.TYPE_OBJECT_READER_NONE_DEFAULT_CONSTRUCTOR) && z) {
            for (int i2 = 0; i2 < fieldReaderArr.length; i2++) {
                methodWriter.aload(0);
                methodWriter.aload(i);
                methodWriter.iconst_n(i2);
                methodWriter.aaload();
                methodWriter.putfield(str, CodeGenUtils.fieldReader(i2), ASMUtils.DESC_FIELD_READER);
            }
        }
    }

    private static void genInitForNonDefaultConstructor(FieldReader[] fieldReaderArr, MethodWriterContext methodWriterContext) {
        MethodWriter methodWriter = methodWriterContext.mw;
        for (FieldReader fieldReader : fieldReaderArr) {
            Class cls = fieldReader.fieldClass;
            int iVar = methodWriterContext.var(fieldReader);
            if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Boolean.TYPE || cls == Character.TYPE) {
                methodWriter.iconst_0();
                methodWriter.istore(iVar);
            } else if (cls == Long.TYPE) {
                methodWriter.lconst_0();
                methodWriter.lstore(iVar);
            } else if (cls == Float.TYPE) {
                methodWriter.iconst_0();
                methodWriter.i2f();
                methodWriter.fstore(iVar);
            } else if (cls == Double.TYPE) {
                methodWriter.iconst_0();
                methodWriter.i2d();
                methodWriter.dstore(iVar);
            } else {
                methodWriter.aconst_null();
                methodWriter.astore(iVar);
            }
        }
    }

    private void genMethodGetFieldReader(ObjectReadContext objectReadContext) {
        ObjectReaderAdapter objectReaderAdapter = objectReadContext.objectReaderAdapter;
        genMethodGetFieldReaderImpl(objectReadContext, "getFieldReader", objectReaderAdapter.hashCodes, objectReaderAdapter.mapping, new C1301feyxiexzfUjhhgtg(0));
    }

    private void genMethodGetFieldReaderImpl(ObjectReadContext objectReadContext, String str, long[] jArr, short[] sArr, ToLongFunction<FieldReader> toLongFunction) {
        FieldReader[] fieldReaderArr = objectReadContext.fieldReaders;
        int i = 1;
        MethodWriter methodWriterVisitMethod = objectReadContext.cw.visitMethod(1, str, "(J)" + ASMUtils.DESC_FIELD_READER, 512);
        Label label = new Label();
        if (fieldReaderArr.length > 6) {
            TreeMap treeMap = new TreeMap();
            int[] iArrBuildHashCode32Map = buildHashCode32Map(jArr, treeMap);
            methodWriterVisitMethod.lload(1);
            methodWriterVisitMethod.lload(1);
            methodWriterVisitMethod.bipush(32);
            methodWriterVisitMethod.lushr();
            methodWriterVisitMethod.lxor();
            methodWriterVisitMethod.l2i();
            methodWriterVisitMethod.istore(3);
            Label label2 = new Label();
            int length = iArrBuildHashCode32Map.length;
            Label[] labelArr = new Label[length];
            for (int i2 = 0; i2 < length; i2++) {
                labelArr[i2] = new Label();
            }
            methodWriterVisitMethod.iload(3);
            methodWriterVisitMethod.visitLookupSwitchInsn(label2, iArrBuildHashCode32Map, labelArr);
            int i3 = 0;
            while (i3 < length) {
                methodWriterVisitMethod.visitLabel(labelArr[i3]);
                List list = (List) treeMap.get(Integer.valueOf(iArrBuildHashCode32Map[i3]));
                int size = list.size();
                int i4 = 0;
                while (i4 < size) {
                    Label label3 = label2;
                    long jLongValue = ((Long) list.get(i4)).longValue();
                    Label label4 = size > i ? new Label() : label3;
                    methodWriterVisitMethod.lload(i);
                    methodWriterVisitMethod.visitLdcInsn(jLongValue);
                    methodWriterVisitMethod.lcmp();
                    methodWriterVisitMethod.ifne(label4);
                    short s = sArr[Arrays.binarySearch(jArr, jLongValue)];
                    methodWriterVisitMethod.aload(0);
                    methodWriterVisitMethod.getfield(objectReadContext.classNameType, CodeGenUtils.fieldReader(s), ASMUtils.DESC_FIELD_READER);
                    methodWriterVisitMethod.goto_(label);
                    if (label4 != label3) {
                        methodWriterVisitMethod.visitLabel(label4);
                    }
                    i4++;
                    label2 = label3;
                    i = 1;
                }
                methodWriterVisitMethod.goto_(label2);
                i3++;
                i = 1;
            }
            methodWriterVisitMethod.visitLabel(label2);
        } else {
            for (int i5 = 0; i5 < fieldReaderArr.length; i5++) {
                Label label5 = new Label();
                long jApplyAsLong = toLongFunction.applyAsLong(fieldReaderArr[i5]);
                methodWriterVisitMethod.lload(1);
                methodWriterVisitMethod.visitLdcInsn(jApplyAsLong);
                methodWriterVisitMethod.lcmp();
                methodWriterVisitMethod.ifne(label5);
                methodWriterVisitMethod.aload(0);
                methodWriterVisitMethod.getfield(objectReadContext.classNameType, CodeGenUtils.fieldReader(i5), ASMUtils.DESC_FIELD_READER);
                methodWriterVisitMethod.goto_(label);
                methodWriterVisitMethod.visitLabel(label5);
            }
        }
        methodWriterVisitMethod.aconst_null();
        methodWriterVisitMethod.areturn();
        methodWriterVisitMethod.visitLabel(label);
        methodWriterVisitMethod.areturn();
        methodWriterVisitMethod.visitMaxs(5, 5);
    }

    private void genMethodGetFieldReaderLCase(ObjectReadContext objectReadContext) {
        ObjectReaderAdapter objectReaderAdapter = objectReadContext.objectReaderAdapter;
        genMethodGetFieldReaderImpl(objectReadContext, "getFieldReaderLCase", objectReaderAdapter.hashCodesLCase, objectReaderAdapter.mappingLCase, new C1301feyxiexzfUjhhgtg(1));
    }

    private <T> void genMethodReadJSONBObject(ObjectReadContext objectReadContext, long j) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        FieldReader[] fieldReaderArr;
        ObjectReadContext objectReadContext2;
        int i3;
        String str = objectReadContext.classNameType;
        FieldReader[] fieldReaderArr2 = objectReadContext.fieldReaders;
        Class cls = objectReadContext.objectClass;
        boolean z3 = (j & JSONReader.Feature.FieldBased.mask) != 0;
        ObjectReaderAdapter objectReaderAdapter = objectReadContext.objectReaderAdapter;
        ClassWriter classWriter = objectReadContext.cw;
        String str2 = METHOD_DESC_READ_OBJECT;
        MethodWriter methodWriterVisitMethod = classWriter.visitMethod(1, "readJSONBObject", str2, 2048);
        boolean zDisableSupportArrayMapping = objectReadContext.disableSupportArrayMapping();
        boolean zDisableAutoType = objectReadContext.disableAutoType();
        boolean z4 = z3;
        MethodWriterContext methodWriterContext = new MethodWriterContext(methodWriterVisitMethod, 6, true);
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.lload(4);
        String str3 = ASMUtils.TYPE_JSON_READER;
        methodWriterVisitMethod.invokevirtual(str3, "features", "(J)J");
        methodWriterVisitMethod.lstore(4);
        int iVar = methodWriterContext.var("object");
        int iVar2 = methodWriterContext.var("I");
        int iVar3 = methodWriterContext.var2("hashCode64");
        int iVar4 = methodWriterContext.var("hashCode32");
        int iVar5 = methodWriterContext.var("fieldReader");
        if (!zDisableAutoType) {
            genCheckAutoType(str, methodWriterContext);
        }
        int i4 = iVar5;
        Label label = new Label();
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.invokevirtual(str3, "nextIfNull", "()Z");
        methodWriterVisitMethod.ifeq(label);
        methodWriterVisitMethod.aconst_null();
        methodWriterVisitMethod.areturn();
        methodWriterVisitMethod.visitLabel(label);
        if (cls != null && !Serializable.class.isAssignableFrom(cls)) {
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.aload(0);
            methodWriterVisitMethod.getfield(str, "objectClass", "Ljava/lang/Class;");
            methodWriterVisitMethod.invokevirtual(str3, "errorOnNoneSerializable", "(Ljava/lang/Class;)V");
        }
        if (!zDisableSupportArrayMapping) {
            Label label2 = new Label();
            new Label();
            Label label3 = new Label();
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.invokevirtual(str3, "isArray", "()Z");
            methodWriterVisitMethod.ifeq(label2);
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.invokevirtual(str3, "isSupportBeanArray", "()Z");
            methodWriterVisitMethod.ifeq(label3);
            methodWriterVisitMethod.aload(0);
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.aload(2);
            methodWriterVisitMethod.aload(3);
            methodWriterVisitMethod.lload(4);
            methodWriterVisitMethod.invokevirtual(str, "readArrayMappingObject", str2);
            methodWriterVisitMethod.areturn();
            methodWriterVisitMethod.visitLabel(label3);
            methodWriterVisitMethod.visitLabel(label2);
        }
        if (objectReadContext.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor) {
            Label label4 = new Label();
            Label label5 = new Label();
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.invokevirtual(str3, "hasAutoTypeBeforeHandler", "()Z");
            methodWriterVisitMethod.ifne(label4);
            methodWriterVisitMethod.lload(4);
            methodWriterVisitMethod.visitLdcInsn(JSONReader.Feature.SupportSmartMatch.mask | JSONReader.Feature.SupportAutoType.mask);
            methodWriterVisitMethod.land();
            methodWriterVisitMethod.lconst_0();
            methodWriterVisitMethod.lcmp();
            methodWriterVisitMethod.ifeq(label5);
            methodWriterVisitMethod.visitLabel(label4);
            methodWriterVisitMethod.aload(0);
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.aload(2);
            methodWriterVisitMethod.aload(3);
            methodWriterVisitMethod.lload(4);
            methodWriterVisitMethod.invokespecial(ASMUtils.TYPE_OBJECT_READER_NONE_DEFAULT_CONSTRUCTOR, "readJSONBObject", str2);
            methodWriterVisitMethod.areturn();
            methodWriterVisitMethod.visitLabel(label5);
            genInitForNonDefaultConstructor(fieldReaderArr2, methodWriterContext);
        } else {
            genCreateObject(methodWriterVisitMethod, objectReadContext, str);
            methodWriterVisitMethod.astore(iVar);
        }
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.invokevirtual(str3, "nextIfObjectStart", "()Z");
        methodWriterVisitMethod.pop();
        Label label6 = new Label();
        Label label7 = new Label();
        Label label8 = new Label();
        if (!zDisableAutoType) {
            methodWriterVisitMethod.iconst_0();
            methodWriterVisitMethod.istore(iVar2);
        }
        methodWriterVisitMethod.visitLabel(label6);
        Label label9 = new Label();
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.invokevirtual(str3, "nextIfObjectEnd", "()Z");
        methodWriterVisitMethod.ifne(label7);
        if (objectReadContext.fieldNameLengthMin < 2 || objectReadContext.fieldNameLengthMax > 43) {
            i = iVar;
            z = z4;
            z2 = false;
        } else {
            genRead243(objectReadContext, z4, methodWriterContext, iVar, label8, label9);
            i = iVar;
            z = z4;
            z2 = true;
        }
        methodWriterVisitMethod.visitLabel(label9);
        String str4 = objectReadContext.objectReaderAdapter.typeKey;
        int length = str4 == null ? 5 : str4.length();
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.iconst_n(length);
        methodWriterVisitMethod.iconst_n(objectReadContext.fieldNameCharLengthMin);
        methodWriterVisitMethod.iconst_n(objectReadContext.fieldNameCharLengthMax);
        methodWriterVisitMethod.invokevirtual(str3, fieldReaderArr2.length <= 2 ? "readFieldNameHashCodeE" : "readFieldNameHashCode", "(III)J");
        methodWriterVisitMethod.dup2();
        methodWriterVisitMethod.lstore(iVar3);
        methodWriterVisitMethod.lconst_0();
        methodWriterVisitMethod.lcmp();
        methodWriterVisitMethod.ifeq(label8);
        if (!zDisableAutoType && !(objectReadContext.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor)) {
            Label label10 = new Label();
            methodWriterVisitMethod.lload(iVar3);
            methodWriterVisitMethod.aload(0);
            methodWriterVisitMethod.getfield(str, "typeKeyHashCode", "J");
            methodWriterVisitMethod.lcmp();
            methodWriterVisitMethod.ifne(label10);
            methodWriterVisitMethod.lload(iVar3);
            methodWriterVisitMethod.lconst_0();
            methodWriterVisitMethod.lcmp();
            methodWriterVisitMethod.ifeq(label10);
            methodWriterVisitMethod.aload(0);
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.invokevirtual(str, "autoType", AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder("("), ASMUtils.DESC_JSON_READER, ")Ljava/lang/Object;"));
            methodWriterVisitMethod.astore(i);
            methodWriterVisitMethod.goto_(label7);
            methodWriterVisitMethod.visitLabel(label10);
        }
        if (z2) {
            if (objectReadContext.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor) {
                genReadHashCode64ValueForNonDefaultConstructor(objectReadContext, methodWriterContext, iVar3, z, i, label8);
                methodWriterContext = methodWriterContext;
            } else {
                methodWriterVisitMethod.aload(0);
                methodWriterVisitMethod.lload(r0);
                methodWriterVisitMethod.aload(1);
                methodWriterVisitMethod.lload(4);
                methodWriterVisitMethod.aload(i);
                methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_OBJECT_READER_ADAPTER, "readFieldValue", READ_FIELD_READER_UL);
            }
            methodWriterVisitMethod.goto_(label8);
            objectReadContext2 = objectReadContext;
            i2 = iVar2;
        } else {
            label8 = label8;
            int i5 = r0;
            String str5 = "(J)Z";
            String str6 = "()J";
            if (fieldReaderArr2.length > 6) {
                TreeMap treeMap = new TreeMap();
                String str7 = "getNameHashCodeLCase";
                ObjectReaderAdapter objectReaderAdapter2 = objectReaderAdapter;
                int[] iArrBuildHashCode32Map = buildHashCode32Map(objectReaderAdapter2.hashCodes, treeMap);
                methodWriterVisitMethod.lload(i5);
                methodWriterVisitMethod.lload(i5);
                boolean z5 = z;
                methodWriterVisitMethod.bipush(32);
                methodWriterVisitMethod.lushr();
                methodWriterVisitMethod.lxor();
                methodWriterVisitMethod.l2i();
                methodWriterVisitMethod.istore(r21);
                Label label11 = new Label();
                String str8 = "isSupportSmartMatch";
                int length2 = iArrBuildHashCode32Map.length;
                Label[] labelArr = new Label[length2];
                MethodWriterContext methodWriterContext2 = methodWriterContext;
                for (int i6 = 0; i6 < length2; i6++) {
                    labelArr[i6] = new Label();
                }
                methodWriterVisitMethod.iload(iVar4);
                methodWriterVisitMethod.visitLookupSwitchInsn(label11, iArrBuildHashCode32Map, labelArr);
                int i7 = 0;
                while (i7 < length2) {
                    methodWriterVisitMethod.visitLabel(labelArr[i7]);
                    List list = (List) treeMap.get(Integer.valueOf(iArrBuildHashCode32Map[i7]));
                    int i8 = length2;
                    int size = list.size();
                    int i9 = i7;
                    int i10 = 0;
                    while (i10 < size) {
                        int[] iArr = iArrBuildHashCode32Map;
                        Label label12 = label11;
                        long jLongValue = ((Long) list.get(i10)).longValue();
                        TreeMap treeMap2 = treeMap;
                        Label label13 = size > 1 ? new Label() : label12;
                        methodWriterVisitMethod.lload(i5);
                        methodWriterVisitMethod.visitLdcInsn(jLongValue);
                        methodWriterVisitMethod.lcmp();
                        methodWriterVisitMethod.ifne(label13);
                        Label label14 = label13;
                        short s = objectReaderAdapter2.mapping[Arrays.binarySearch(objectReaderAdapter2.hashCodes, jLongValue)];
                        FieldReader fieldReader = fieldReaderArr2[s];
                        int i11 = size;
                        boolean z6 = z5;
                        String str9 = str6;
                        List list2 = list;
                        MethodWriterContext methodWriterContext3 = methodWriterContext2;
                        Label[] labelArr2 = labelArr;
                        int i12 = i5;
                        String str10 = str7;
                        int i13 = i10;
                        int i14 = iVar2;
                        FieldReader[] fieldReaderArr3 = fieldReaderArr2;
                        int i15 = i4;
                        String str11 = str8;
                        ObjectReaderAdapter objectReaderAdapter3 = objectReaderAdapter2;
                        String str12 = str5;
                        genReadFieldValue(objectReadContext, fieldReader, z6, methodWriterContext3, i, s, true);
                        methodWriterVisitMethod.goto_(label8);
                        if (label14 != label12) {
                            methodWriterVisitMethod.visitLabel(label14);
                        }
                        int i16 = i13 + 1;
                        str5 = str12;
                        str7 = str10;
                        size = i11;
                        objectReaderAdapter2 = objectReaderAdapter3;
                        labelArr = labelArr2;
                        iArrBuildHashCode32Map = iArr;
                        i5 = i12;
                        fieldReaderArr2 = fieldReaderArr3;
                        z5 = z6;
                        methodWriterContext2 = methodWriterContext3;
                        label11 = label12;
                        str8 = str11;
                        list = list2;
                        i4 = i15;
                        i10 = i16;
                        str6 = str9;
                        treeMap = treeMap2;
                        iVar2 = i14;
                    }
                    methodWriterVisitMethod.goto_(label8);
                    label11 = label11;
                    objectReaderAdapter2 = objectReaderAdapter2;
                    length2 = i8;
                    iVar2 = iVar2;
                    i5 = i5;
                    fieldReaderArr2 = fieldReaderArr2;
                    i7 = i9 + 1;
                    methodWriterContext2 = methodWriterContext2;
                    str8 = str8;
                    treeMap = treeMap;
                    i4 = i4;
                }
                objectReadContext2 = objectReadContext;
                String str13 = str5;
                i2 = iVar2;
                int i17 = i4;
                String str14 = str7;
                String str15 = str6;
                String str16 = str8;
                methodWriterContext = methodWriterContext2;
                methodWriterVisitMethod.visitLabel(label11);
                if (!objectReadContext2.disableSmartMatch() && !(objectReadContext2.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor)) {
                    Label label15 = new Label();
                    if ((j & JSONReader.Feature.SupportSmartMatch.mask) == 0) {
                        methodWriterVisitMethod.aload(1);
                        methodWriterVisitMethod.lload(4);
                        methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_READER, str16, str13);
                        methodWriterVisitMethod.ifeq(label15);
                    }
                    methodWriterVisitMethod.aload(0);
                    methodWriterVisitMethod.aload(1);
                    methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_READER, str14, str15);
                    methodWriterVisitMethod.invokeinterface(ASMUtils.TYPE_OBJECT_READER, "getFieldReaderLCase", METHOD_DESC_GET_FIELD_READER);
                    methodWriterVisitMethod.dup();
                    methodWriterVisitMethod.astore(i17);
                    methodWriterVisitMethod.ifnull(label15);
                    methodWriterVisitMethod.aload(i17);
                    methodWriterVisitMethod.aload(1);
                    methodWriterVisitMethod.aload(i);
                    methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_FIELD_READE, "readFieldValueJSONB", METHOD_DESC_READ_FIELD_VALUE);
                    methodWriterVisitMethod.goto_(label8);
                    methodWriterVisitMethod.visitLabel(label15);
                }
            } else {
                FieldReader[] fieldReaderArr4 = fieldReaderArr2;
                int i18 = i5;
                i2 = iVar2;
                int i19 = 0;
                while (true) {
                    fieldReaderArr = fieldReaderArr4;
                    if (i19 >= fieldReaderArr.length) {
                        break;
                    }
                    Label label16 = new Label();
                    FieldReader fieldReader2 = fieldReaderArr[i19];
                    long jHashCode64 = Fnv.hashCode64(fieldReader2.fieldName);
                    int i20 = i18;
                    methodWriterVisitMethod.lload(i20);
                    methodWriterVisitMethod.visitLdcInsn(jHashCode64);
                    methodWriterVisitMethod.lcmp();
                    methodWriterVisitMethod.ifne(label16);
                    fieldReaderArr4 = fieldReaderArr;
                    genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, i19, false);
                    methodWriterVisitMethod.goto_(label8);
                    methodWriterVisitMethod.visitLabel(label16);
                    i19++;
                    i18 = i20;
                }
                int i21 = i18;
                Label label17 = new Label();
                if ((j & JSONReader.Feature.SupportSmartMatch.mask) == 0) {
                    methodWriterVisitMethod.aload(1);
                    methodWriterVisitMethod.lload(4);
                    methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_READER, "isSupportSmartMatch", "(J)Z");
                    methodWriterVisitMethod.ifeq(label17);
                }
                methodWriterVisitMethod.aload(1);
                methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_READER, "getNameHashCodeLCase", str6);
                methodWriterVisitMethod.lstore(i21);
                for (int i22 = 0; i22 < fieldReaderArr.length; i22++) {
                    Label label18 = new Label();
                    FieldReader fieldReader3 = fieldReaderArr[i22];
                    long jHashCode65 = Fnv.hashCode64(fieldReader3.fieldName);
                    methodWriterVisitMethod.lload(i21);
                    methodWriterVisitMethod.visitLdcInsn(jHashCode65);
                    methodWriterVisitMethod.lcmp();
                    methodWriterVisitMethod.ifne(label18);
                    genReadFieldValue(objectReadContext, fieldReader3, z, methodWriterContext, i, i22, false);
                    methodWriterVisitMethod.goto_(label8);
                    methodWriterVisitMethod.visitLabel(label18);
                }
                objectReadContext2 = objectReadContext;
                methodWriterVisitMethod.visitLabel(label17);
            }
        }
        if (objectReadContext2.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor) {
            i3 = 1;
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_READER, "skipValue", "()V");
        } else {
            i3 = 1;
            methodWriterVisitMethod.aload(0);
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.aload(i);
            methodWriterVisitMethod.lload(4);
            methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_OBJECT_READER_ADAPTER, "processExtra", METHOD_DESC_PROCESS_EXTRA);
        }
        methodWriterVisitMethod.goto_(label8);
        methodWriterVisitMethod.visitLabel(label8);
        if (!zDisableAutoType) {
            methodWriterVisitMethod.visitIincInsn(i2, i3);
        }
        methodWriterVisitMethod.goto_(label6);
        methodWriterVisitMethod.visitLabel(label7);
        if (objectReadContext2.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor) {
            createObjectForNonConstructor(objectReadContext2, methodWriterContext);
        } else {
            methodWriterVisitMethod.aload(i);
        }
        methodWriterVisitMethod.areturn();
        methodWriterVisitMethod.visitMaxs(5, 10);
    }

    private <T> void genMethodReadJSONBObjectArrayMapping(ObjectReadContext objectReadContext, long j) {
        ObjectReadContext objectReadContext2 = objectReadContext;
        FieldReader[] fieldReaderArr = objectReadContext2.fieldReaders;
        String str = objectReadContext2.classNameType;
        boolean z = (j & JSONReader.Feature.FieldBased.mask) != 0;
        MethodWriter methodWriterVisitMethod = objectReadContext2.cw.visitMethod(1, "readArrayMappingJSONBObject", METHOD_DESC_READ_OBJECT, 512);
        MethodWriterContext methodWriterContext = new MethodWriterContext(methodWriterVisitMethod, 6, true);
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.lload(4);
        String str2 = ASMUtils.TYPE_JSON_READER;
        methodWriterVisitMethod.invokevirtual(str2, "features", "(J)J");
        methodWriterVisitMethod.lstore(4);
        int iVar = methodWriterContext.var("object");
        int iVar2 = methodWriterContext.var("entryCnt");
        if (!objectReadContext2.disableAutoType()) {
            genCheckAutoType(str, methodWriterContext);
        }
        Label label = new Label();
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.invokevirtual(str2, "nextIfNull", "()Z");
        methodWriterVisitMethod.ifeq(label);
        methodWriterVisitMethod.aconst_null();
        methodWriterVisitMethod.areturn();
        methodWriterVisitMethod.visitLabel(label);
        genCreateObject(methodWriterVisitMethod, objectReadContext2, str);
        methodWriterVisitMethod.astore(iVar);
        Label label2 = new Label();
        Label label3 = new Label();
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.invokevirtual(str2, "startArray", "()I");
        methodWriterVisitMethod.dup();
        methodWriterVisitMethod.istore(iVar2);
        methodWriterVisitMethod.visitLdcInsn(fieldReaderArr.length);
        methodWriterVisitMethod.if_icmpne(label3);
        int i = 0;
        while (i < fieldReaderArr.length) {
            int i2 = iVar;
            genReadFieldValue(objectReadContext2, fieldReaderArr[i], z, methodWriterContext, i2, i, true);
            i++;
            objectReadContext2 = objectReadContext;
            iVar = i2;
        }
        int i3 = iVar;
        methodWriterVisitMethod.goto_(label2);
        methodWriterVisitMethod.visitLabel(label3);
        methodWriterVisitMethod.aload(0);
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.aload(i3);
        methodWriterVisitMethod.iload(iVar2);
        methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_OBJECT_READER_ADAPTER, "readArrayMappingJSONBObject0", METHOD_DESC_READ_ARRAY_MAPPING_JSONB_OBJECT0);
        methodWriterVisitMethod.visitLabel(label2);
        methodWriterVisitMethod.aload(i3);
        methodWriterVisitMethod.areturn();
        methodWriterVisitMethod.visitMaxs(5, 10);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0554  */
    /* JADX WARN: Code duplicated, block: B:104:0x055e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0583  */
    /* JADX WARN: Code duplicated, block: B:110:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:111:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:115:0x05da  */
    /* JADX WARN: Code duplicated, block: B:117:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:118:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:122:0x060e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0629  */
    /* JADX WARN: Code duplicated, block: B:126:0x062d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0429 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0244  */
    /* JADX WARN: Code duplicated, block: B:48:0x0247  */
    /* JADX WARN: Code duplicated, block: B:51:0x0260  */
    /* JADX WARN: Code duplicated, block: B:52:0x0263  */
    /* JADX WARN: Code duplicated, block: B:61:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:64:0x0301  */
    /* JADX WARN: Code duplicated, block: B:66:0x0307  */
    /* JADX WARN: Code duplicated, block: B:67:0x0314  */
    /* JADX WARN: Code duplicated, block: B:70:0x0343  */
    /* JADX WARN: Code duplicated, block: B:72:0x0355  */
    /* JADX WARN: Code duplicated, block: B:74:0x0390 A[LOOP:0: B:73:0x038e->B:74:0x0390, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:79:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:81:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x0426  */
    /* JADX WARN: Code duplicated, block: B:94:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:96:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:99:0x0511 A[LOOP:3: B:97:0x050e->B:99:0x0511, LOOP_END] */
    private <T> void genMethodReadObject(ObjectReadContext objectReadContext, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        FieldReader[] fieldReaderArr;
        Label label;
        boolean z;
        Label label2;
        int i5;
        MethodWriterContext methodWriterContext;
        boolean z2;
        boolean z3;
        MethodWriterContext methodWriterContext2;
        String str;
        int length;
        String str2;
        int i6;
        boolean z4;
        int i7;
        MethodWriterContext methodWriterContext3;
        boolean z5;
        String str3;
        Label label3;
        Label label4;
        Label label5;
        boolean z6;
        int i8;
        Label label6;
        Label label7;
        int i9;
        Label label8;
        JSONReader.Feature feature;
        int i10;
        Label label9;
        long j2;
        long j3;
        TreeMap treeMap;
        int[] iArrBuildHashCode32Map;
        boolean z7;
        String str4;
        Label label10;
        int length2;
        Label[] labelArr;
        MethodWriterContext methodWriterContext4;
        int i11;
        int i12;
        String str5;
        String str6;
        Label label11;
        JSONReader.Feature feature2;
        List list;
        Label label12;
        int size;
        int i13;
        Label label13;
        Label label14;
        Label label15;
        ObjectReadContext objectReadContext2 = objectReadContext;
        FieldReader[] fieldReaderArr2 = objectReadContext2.fieldReaders;
        String str7 = objectReadContext2.classNameType;
        boolean z8 = (j & JSONReader.Feature.FieldBased.mask) != 0;
        ClassWriter classWriter = objectReadContext2.cw;
        String str8 = METHOD_DESC_READ_OBJECT;
        MethodWriter methodWriterVisitMethod = classWriter.visitMethod(1, "readObject", str8, 2048);
        MethodWriterContext methodWriterContext5 = new MethodWriterContext(methodWriterVisitMethod, 6, false);
        int iVar = methodWriterContext5.var("object");
        int iVar2 = methodWriterContext5.var("I");
        int iVar3 = methodWriterContext5.var2("hashCode64");
        int iVar4 = methodWriterContext5.var("hashCode32");
        int iVar5 = methodWriterContext5.var("fieldReader");
        boolean zDisableSupportArrayMapping = objectReadContext2.disableSupportArrayMapping();
        boolean zDisableAutoType = objectReadContext2.disableAutoType();
        boolean zDisableJSONB = objectReadContext2.disableJSONB();
        boolean zDisableSmartMatch = objectReadContext2.disableSmartMatch();
        if (zDisableJSONB) {
            i = 1;
            i2 = 4;
        } else {
            Label label16 = new Label();
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.getfield(ASMUtils.TYPE_JSON_READER, "jsonb", "Z");
            methodWriterVisitMethod.ifeq(label16);
            methodWriterVisitMethod.aload(0);
            i = 1;
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.aload(2);
            methodWriterVisitMethod.aload(3);
            i2 = 4;
            methodWriterVisitMethod.lload(4);
            methodWriterVisitMethod.invokevirtual(str7, "readJSONBObject", str8);
            methodWriterVisitMethod.areturn();
            methodWriterVisitMethod.visitLabel(label16);
        }
        methodWriterVisitMethod.aload(i);
        methodWriterVisitMethod.lload(i2);
        String str9 = ASMUtils.TYPE_JSON_READER;
        methodWriterVisitMethod.invokevirtual(str9, "features", "(J)J");
        methodWriterVisitMethod.lstore(i2);
        if (zDisableSmartMatch && zDisableSupportArrayMapping) {
            fieldReaderArr2 = fieldReaderArr2;
            iVar3 = iVar3;
        } else {
            Label label17 = new Label();
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.invokevirtual(str9, "isArray", "()Z");
            methodWriterVisitMethod.ifeq(label17);
            if (zDisableSupportArrayMapping) {
                i3 = 0;
            } else {
                Label label18 = new Label();
                if ((j & JSONReader.Feature.SupportArrayToBean.mask) == 0) {
                    i4 = 1;
                    methodWriterVisitMethod.aload(1);
                    methodWriterVisitMethod.lload(4);
                    methodWriterVisitMethod.invokevirtual(str9, "isSupportBeanArray", "(J)Z");
                    methodWriterVisitMethod.ifeq(label18);
                } else {
                    i4 = 1;
                }
                i3 = 0;
                methodWriterVisitMethod.aload(0);
                methodWriterVisitMethod.aload(i4);
                methodWriterVisitMethod.aload(2);
                methodWriterVisitMethod.aload(3);
                methodWriterVisitMethod.lload(4);
                methodWriterVisitMethod.invokevirtual(str7, "readArrayMappingObject", str8);
                methodWriterVisitMethod.areturn();
                methodWriterVisitMethod.visitLabel(label18);
            }
            methodWriterVisitMethod.aload(i3);
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.aload(2);
            methodWriterVisitMethod.aload(3);
            methodWriterVisitMethod.lload(4);
            methodWriterVisitMethod.invokevirtual(str7, "processObjectInputSingleItemArray", str8);
            methodWriterVisitMethod.areturn();
            methodWriterVisitMethod.visitLabel(label17);
        }
        Label label19 = new Label();
        Label label20 = new Label();
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.invokevirtual(str9, "nextIfObjectStart", "()Z");
        methodWriterVisitMethod.ifne(label20);
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.invokevirtual(str9, "nextIfNullOrEmptyString", "()Z");
        methodWriterVisitMethod.ifeq(label20);
        methodWriterVisitMethod.aconst_null();
        methodWriterVisitMethod.areturn();
        methodWriterVisitMethod.visitLabel(label20);
        if (objectReadContext2.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor) {
            Label label21 = new Label();
            Label label22 = new Label();
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.invokevirtual(str9, "hasAutoTypeBeforeHandler", "()Z");
            methodWriterVisitMethod.ifne(label21);
            methodWriterVisitMethod.lload(4);
            methodWriterVisitMethod.visitLdcInsn(JSONReader.Feature.SupportSmartMatch.mask | JSONReader.Feature.SupportAutoType.mask);
            methodWriterVisitMethod.land();
            methodWriterVisitMethod.lconst_0();
            methodWriterVisitMethod.lcmp();
            methodWriterVisitMethod.ifeq(label22);
            methodWriterVisitMethod.visitLabel(label21);
            methodWriterVisitMethod.aload(0);
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.aload(2);
            methodWriterVisitMethod.aload(3);
            methodWriterVisitMethod.lload(4);
            methodWriterVisitMethod.invokespecial(ASMUtils.TYPE_OBJECT_READER_NONE_DEFAULT_CONSTRUCTOR, "readObject", str8);
            methodWriterVisitMethod.areturn();
            methodWriterVisitMethod.visitLabel(label22);
            fieldReaderArr = fieldReaderArr2;
            genInitForNonDefaultConstructor(fieldReaderArr, methodWriterContext5);
        } else {
            fieldReaderArr = fieldReaderArr2;
            genCreateObject(methodWriterVisitMethod, objectReadContext2, str7);
            methodWriterVisitMethod.astore(iVar);
        }
        Label label23 = new Label();
        Label label24 = new Label();
        Label label25 = new Label();
        if (!zDisableAutoType) {
            methodWriterVisitMethod.iconst_0();
            methodWriterVisitMethod.istore(iVar2);
        }
        methodWriterVisitMethod.visitLabel(label23);
        int i14 = iVar;
        Label label26 = label25;
        Label label27 = new Label();
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.invokevirtual(str9, "nextIfObjectEnd", "()Z");
        methodWriterVisitMethod.ifne(label24);
        int i15 = objectReadContext2.fieldNameLengthMin;
        if (i15 < 5 || objectReadContext2.fieldNameLengthMax > 7) {
            label = label27;
            z = z8;
            label2 = label26;
            i5 = i14;
            methodWriterContext = methodWriterContext5;
            if (i15 < 2 || objectReadContext2.fieldNameLengthMax > 43) {
                z2 = false;
            } else {
                z3 = z;
                methodWriterContext2 = methodWriterContext;
                i14 = i5;
                label26 = label2;
                label27 = label;
                genRead243(objectReadContext2, z3, methodWriterContext2, i14, label26, label27);
            }
            methodWriterVisitMethod.visitLabel(label);
            str = objectReadContext2.objectReaderAdapter.typeKey;
            if (str == null) {
                length = 5;
            } else {
                length = str.length();
            }
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.iconst_n(length);
            methodWriterVisitMethod.iconst_n(objectReadContext2.fieldNameCharLengthMin);
            methodWriterVisitMethod.iconst_n(objectReadContext2.fieldNameCharLengthMax);
            if (fieldReaderArr.length <= 2) {
                str2 = "readFieldNameHashCodeE";
            } else {
                str2 = "readFieldNameHashCode";
            }
            methodWriterVisitMethod.invokevirtual(str9, str2, "(III)J");
            methodWriterVisitMethod.dup2();
            i6 = iVar3;
            methodWriterVisitMethod.lstore(i6);
            z4 = z;
            methodWriterVisitMethod.visitLdcInsn(-1L);
            methodWriterVisitMethod.lcmp();
            methodWriterVisitMethod.ifeq(label24);
            if (zDisableAutoType && !(objectReadContext2.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor)) {
                Label label28 = new Label();
                methodWriterVisitMethod.iload(iVar2);
                methodWriterVisitMethod.ifne(label28);
                methodWriterVisitMethod.lload(i6);
                methodWriterVisitMethod.visitLdcInsn(ObjectReader.HASH_TYPE);
                methodWriterVisitMethod.lcmp();
                methodWriterVisitMethod.ifne(label28);
                if ((j & JSONReader.Feature.SupportAutoType.mask) == 0) {
                    methodWriterVisitMethod.aload(1);
                    methodWriterVisitMethod.lload(4);
                    methodWriterVisitMethod.invokevirtual(str9, "isSupportAutoTypeOrHandler", "(J)Z");
                    methodWriterVisitMethod.ifeq(label28);
                }
                methodWriterVisitMethod.aload(0);
                methodWriterVisitMethod.aload(1);
                methodWriterVisitMethod.aload(0);
                methodWriterVisitMethod.getfield(str7, "objectClass", "Ljava/lang/Class;");
                methodWriterVisitMethod.lload(4);
                methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_OBJECT_READER_ADAPTER, "autoType", "(" + ASMUtils.desc(JSONReader.class) + "Ljava/lang/Class;J)Ljava/lang/Object;");
                methodWriterVisitMethod.areturn();
                methodWriterVisitMethod.visitLabel(label28);
            }
            if (z2) {
                i7 = i6;
                z5 = z4;
                str3 = "()J";
                label3 = label2;
                if (fieldReaderArr.length > 6) {
                    treeMap = new TreeMap();
                    iArrBuildHashCode32Map = buildHashCode32Map(objectReadContext2.objectReaderAdapter.hashCodes, treeMap);
                    methodWriterVisitMethod.lload(i7);
                    methodWriterVisitMethod.lload(i7);
                    z7 = z5;
                    methodWriterVisitMethod.bipush(32);
                    methodWriterVisitMethod.lushr();
                    methodWriterVisitMethod.lxor();
                    methodWriterVisitMethod.l2i();
                    methodWriterVisitMethod.istore(iVar4);
                    str4 = "getNameHashCodeLCase";
                    label10 = new Label();
                    z6 = z2;
                    length2 = iArrBuildHashCode32Map.length;
                    label4 = label19;
                    labelArr = new Label[length2];
                    methodWriterContext4 = methodWriterContext3;
                    for (i11 = 0; i11 < length2; i11++) {
                        methodWriterContext3 = methodWriterContext;
                        labelArr[i11] = new Label();
                    }
                    methodWriterContext3 = methodWriterContext;
                    methodWriterVisitMethod.iload(iVar4);
                    methodWriterVisitMethod.visitLookupSwitchInsn(label10, iArrBuildHashCode32Map, labelArr);
                    i12 = 0;
                    while (i12 < length2) {
                        methodWriterVisitMethod.visitLabel(labelArr[i12]);
                        list = (List) treeMap.get(Integer.valueOf(iArrBuildHashCode32Map[i12]));
                        label12 = label10;
                        size = list.size();
                        Label[] labelArr2 = labelArr;
                        i13 = 0;
                        while (i13 < size) {
                            int i16 = i12;
                            List list2 = list;
                            long jLongValue = ((Long) list.get(i13)).longValue();
                            TreeMap treeMap2 = treeMap;
                            if (size > 1) {
                                label13 = new Label();
                            } else {
                                label13 = label12;
                            }
                            methodWriterVisitMethod.lload(i7);
                            methodWriterVisitMethod.visitLdcInsn(jLongValue);
                            methodWriterVisitMethod.lcmp();
                            methodWriterVisitMethod.ifne(label13);
                            label14 = label13;
                            short s = objectReadContext2.objectReaderAdapter.mapping[Arrays.binarySearch(objectReadContext2.objectReaderAdapter.hashCodes, jLongValue)];
                            int i17 = i7;
                            int i18 = size;
                            boolean z9 = z7;
                            MethodWriterContext methodWriterContext6 = methodWriterContext4;
                            Label label29 = label23;
                            int i19 = i13;
                            String str10 = str4;
                            int i20 = length2;
                            Label label30 = label3;
                            Label label31 = label24;
                            label15 = label12;
                            int i21 = iVar2;
                            String str11 = str3;
                            int[] iArr = iArrBuildHashCode32Map;
                            genReadFieldValue(objectReadContext2, fieldReaderArr[s], z9, methodWriterContext6, i5, s, false);
                            methodWriterVisitMethod.goto_(label30);
                            if (label14 != label15) {
                                methodWriterVisitMethod.visitLabel(label14);
                            }
                            iArrBuildHashCode32Map = iArr;
                            size = i18;
                            label23 = label29;
                            i7 = i17;
                            z7 = z9;
                            methodWriterContext4 = methodWriterContext6;
                            str3 = str11;
                            iVar2 = i21;
                            i12 = i16;
                            list = list2;
                            label12 = label15;
                            label24 = label31;
                            label3 = label30;
                            length2 = i20;
                            str4 = str10;
                            i13 = i19 + 1;
                            treeMap = treeMap2;
                        }
                        String str12 = str4;
                        int i22 = length2;
                        Label label32 = label3;
                        methodWriterVisitMethod.goto_(label32);
                        label10 = label12;
                        label24 = label24;
                        i12++;
                        methodWriterContext4 = methodWriterContext4;
                        label3 = label32;
                        str3 = str3;
                        length2 = i22;
                        iVar2 = iVar2;
                        treeMap = treeMap;
                        str4 = str12;
                        labelArr = labelArr2;
                    }
                    i8 = iVar2;
                    str5 = str4;
                    str6 = str3;
                    label6 = label3;
                    methodWriterContext3 = methodWriterContext4;
                    label5 = label23;
                    label7 = label24;
                    methodWriterVisitMethod.visitLabel(label10);
                    if (!zDisableSmartMatch && !(objectReadContext2.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor)) {
                        label11 = new Label();
                        feature2 = JSONReader.Feature.SupportSmartMatch;
                        if ((j & feature2.mask) == 0) {
                            methodWriterVisitMethod.lload(4);
                            methodWriterVisitMethod.visitLdcInsn(feature2.mask);
                            methodWriterVisitMethod.land();
                            methodWriterVisitMethod.lconst_0();
                            methodWriterVisitMethod.lcmp();
                            methodWriterVisitMethod.ifeq(label11);
                        }
                        methodWriterVisitMethod.aload(0);
                        methodWriterVisitMethod.aload(1);
                        methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_READER, str5, str6);
                        methodWriterVisitMethod.invokeinterface(ASMUtils.TYPE_OBJECT_READER, "getFieldReaderLCase", METHOD_DESC_GET_FIELD_READER);
                        methodWriterVisitMethod.dup();
                        methodWriterVisitMethod.astore(iVar5);
                        methodWriterVisitMethod.ifnull(label11);
                        methodWriterVisitMethod.aload(iVar5);
                        methodWriterVisitMethod.aload(1);
                        methodWriterVisitMethod.aload(i5);
                        methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_FIELD_READE, "readFieldValue", METHOD_DESC_READ_FIELD_VALUE);
                        methodWriterVisitMethod.goto_(label6);
                        methodWriterVisitMethod.visitLabel(label11);
                    }
                } else {
                    methodWriterContext3 = methodWriterContext;
                    label4 = label19;
                    label5 = label23;
                    z6 = z2;
                    i8 = iVar2;
                    label6 = label3;
                    label7 = label24;
                    i9 = 0;
                    while (i9 < fieldReaderArr.length) {
                        Label label33 = new Label();
                        Label label34 = new Label();
                        FieldReader fieldReader = fieldReaderArr[i9];
                        String str13 = fieldReader.fieldName;
                        boolean z10 = z5;
                        long j4 = fieldReader.fieldNameHash;
                        methodWriterVisitMethod.lload(i7);
                        methodWriterVisitMethod.visitLdcInsn(j4);
                        methodWriterVisitMethod.lcmp();
                        methodWriterVisitMethod.ifne(label33);
                        methodWriterVisitMethod.visitLabel(label34);
                        methodWriterContext3 = methodWriterContext3;
                        z5 = z10;
                        genReadFieldValue(objectReadContext2, fieldReader, z5, methodWriterContext3, i5, i9, false);
                        methodWriterVisitMethod.goto_(label6);
                        methodWriterVisitMethod.visitLabel(label33);
                        i9++;
                        objectReadContext2 = objectReadContext;
                    }
                    label8 = new Label();
                    if (!zDisableSmartMatch) {
                        feature = JSONReader.Feature.SupportSmartMatch;
                        if ((j & feature.mask) == 0) {
                            methodWriterVisitMethod.lload(4);
                            methodWriterVisitMethod.visitLdcInsn(feature.mask);
                            methodWriterVisitMethod.land();
                            methodWriterVisitMethod.lconst_0();
                            methodWriterVisitMethod.lcmp();
                            methodWriterVisitMethod.ifeq(label8);
                        }
                        methodWriterVisitMethod.aload(1);
                        methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_READER, "getNameHashCodeLCase", str3);
                        methodWriterVisitMethod.lstore(i7);
                        for (i10 = 0; i10 < fieldReaderArr.length; i10++) {
                            label9 = new Label();
                            Label label35 = new Label();
                            FieldReader fieldReader2 = fieldReaderArr[i10];
                            String str14 = fieldReader2.fieldName;
                            j2 = fieldReader2.fieldNameHash;
                            boolean z11 = z5;
                            MethodWriterContext methodWriterContext7 = methodWriterContext3;
                            j3 = fieldReader2.fieldNameHashLCase;
                            methodWriterVisitMethod.lload(i7);
                            methodWriterVisitMethod.visitLdcInsn(j2);
                            methodWriterVisitMethod.lcmp();
                            methodWriterVisitMethod.ifeq(label35);
                            if (j3 != j2) {
                                methodWriterVisitMethod.lload(i7);
                                methodWriterVisitMethod.visitLdcInsn(j3);
                                methodWriterVisitMethod.lcmp();
                                methodWriterVisitMethod.ifne(label9);
                            } else {
                                methodWriterVisitMethod.goto_(label9);
                            }
                            methodWriterVisitMethod.visitLabel(label35);
                            methodWriterContext3 = methodWriterContext7;
                            z5 = z11;
                            genReadFieldValue(objectReadContext, fieldReader2, z5, methodWriterContext3, i5, i10, false);
                            methodWriterVisitMethod.goto_(label6);
                            methodWriterVisitMethod.visitLabel(label9);
                        }
                    }
                    objectReadContext2 = objectReadContext;
                    methodWriterVisitMethod.visitLabel(label8);
                }
                if (!z6) {
                    if (objectReadContext2.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor) {
                        methodWriterVisitMethod.aload(1);
                        methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_READER, "skipValue", "()V");
                    } else {
                        methodWriterVisitMethod.aload(0);
                        methodWriterVisitMethod.aload(1);
                        methodWriterVisitMethod.aload(i5);
                        methodWriterVisitMethod.lload(4);
                        methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_OBJECT_READER_ADAPTER, "processExtra", METHOD_DESC_PROCESS_EXTRA);
                    }
                    methodWriterVisitMethod.goto_(label6);
                }
                methodWriterVisitMethod.visitLabel(label6);
                if (!zDisableAutoType) {
                    methodWriterVisitMethod.visitIincInsn(i8, 1);
                }
                methodWriterVisitMethod.goto_(label5);
                methodWriterVisitMethod.visitLabel(label7);
                methodWriterVisitMethod.visitLabel(label4);
                if (objectReadContext2.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor) {
                    createObjectForNonConstructor(objectReadContext2, methodWriterContext3);
                } else {
                    methodWriterVisitMethod.aload(i5);
                }
                methodWriterVisitMethod.areturn();
                methodWriterVisitMethod.visitMaxs(5, 10);
            }
            if (objectReadContext2.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor) {
                MethodWriterContext methodWriterContext8 = methodWriterContext;
                genReadHashCode64ValueForNonDefaultConstructor(objectReadContext2, methodWriterContext8, i6, z4, i5, label2);
                methodWriterContext3 = methodWriterContext8;
            } else {
                methodWriterContext3 = methodWriterContext;
                methodWriterVisitMethod.aload(0);
                methodWriterVisitMethod.lload(i6);
                methodWriterVisitMethod.aload(1);
                methodWriterVisitMethod.lload(4);
                methodWriterVisitMethod.aload(i5);
                methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_OBJECT_READER_ADAPTER, "readFieldValue", READ_FIELD_READER_UL);
            }
            methodWriterVisitMethod.goto_(label2);
            label4 = label19;
            label5 = label23;
            label7 = label24;
            z6 = z2;
            i8 = iVar2;
            label6 = label2;
            if (!z6) {
                if (objectReadContext2.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor) {
                    methodWriterVisitMethod.aload(1);
                    methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_READER, "skipValue", "()V");
                } else {
                    methodWriterVisitMethod.aload(0);
                    methodWriterVisitMethod.aload(1);
                    methodWriterVisitMethod.aload(i5);
                    methodWriterVisitMethod.lload(4);
                    methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_OBJECT_READER_ADAPTER, "processExtra", METHOD_DESC_PROCESS_EXTRA);
                }
                methodWriterVisitMethod.goto_(label6);
            }
            methodWriterVisitMethod.visitLabel(label6);
            if (!zDisableAutoType) {
                methodWriterVisitMethod.visitIincInsn(i8, 1);
            }
            methodWriterVisitMethod.goto_(label5);
            methodWriterVisitMethod.visitLabel(label7);
            methodWriterVisitMethod.visitLabel(label4);
            if (objectReadContext2.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor) {
                createObjectForNonConstructor(objectReadContext2, methodWriterContext3);
            } else {
                methodWriterVisitMethod.aload(i5);
            }
            methodWriterVisitMethod.areturn();
            methodWriterVisitMethod.visitMaxs(5, 10);
        }
        methodWriterContext2 = methodWriterContext5;
        z3 = z8;
        genRead57(objectReadContext2, z3, methodWriterContext2, i14, label26, label27);
        label = label27;
        label2 = label26;
        i5 = i14;
        methodWriterContext = methodWriterContext2;
        z = z3;
        z2 = true;
        methodWriterVisitMethod.visitLabel(label);
        str = objectReadContext2.objectReaderAdapter.typeKey;
        if (str == null) {
            length = 5;
        } else {
            length = str.length();
        }
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.iconst_n(length);
        methodWriterVisitMethod.iconst_n(objectReadContext2.fieldNameCharLengthMin);
        methodWriterVisitMethod.iconst_n(objectReadContext2.fieldNameCharLengthMax);
        if (fieldReaderArr.length <= 2) {
            str2 = "readFieldNameHashCodeE";
        } else {
            str2 = "readFieldNameHashCode";
        }
        methodWriterVisitMethod.invokevirtual(str9, str2, "(III)J");
        methodWriterVisitMethod.dup2();
        i6 = iVar3;
        methodWriterVisitMethod.lstore(i6);
        z4 = z;
        methodWriterVisitMethod.visitLdcInsn(-1L);
        methodWriterVisitMethod.lcmp();
        methodWriterVisitMethod.ifeq(label24);
        if (zDisableAutoType) {
        }
        if (z2) {
            i7 = i6;
            z5 = z4;
            str3 = "()J";
            label3 = label2;
            if (fieldReaderArr.length > 6) {
                treeMap = new TreeMap();
                iArrBuildHashCode32Map = buildHashCode32Map(objectReadContext2.objectReaderAdapter.hashCodes, treeMap);
                methodWriterVisitMethod.lload(i7);
                methodWriterVisitMethod.lload(i7);
                z7 = z5;
                methodWriterVisitMethod.bipush(32);
                methodWriterVisitMethod.lushr();
                methodWriterVisitMethod.lxor();
                methodWriterVisitMethod.l2i();
                methodWriterVisitMethod.istore(iVar4);
                str4 = "getNameHashCodeLCase";
                label10 = new Label();
                z6 = z2;
                length2 = iArrBuildHashCode32Map.length;
                label4 = label19;
                labelArr = new Label[length2];
                methodWriterContext4 = methodWriterContext3;
                while (i11 < length2) {
                    methodWriterContext3 = methodWriterContext;
                    labelArr[i11] = new Label();
                }
                methodWriterContext3 = methodWriterContext;
                methodWriterVisitMethod.iload(iVar4);
                methodWriterVisitMethod.visitLookupSwitchInsn(label10, iArrBuildHashCode32Map, labelArr);
                i12 = 0;
                while (i12 < length2) {
                    methodWriterVisitMethod.visitLabel(labelArr[i12]);
                    list = (List) treeMap.get(Integer.valueOf(iArrBuildHashCode32Map[i12]));
                    label12 = label10;
                    size = list.size();
                    Label[] labelArr3 = labelArr;
                    i13 = 0;
                    while (i13 < size) {
                        int i110 = i12;
                        List list3 = list;
                        long jLongValue2 = ((Long) list.get(i13)).longValue();
                        TreeMap treeMap3 = treeMap;
                        if (size > 1) {
                            label13 = new Label();
                        } else {
                            label13 = label12;
                        }
                        methodWriterVisitMethod.lload(i7);
                        methodWriterVisitMethod.visitLdcInsn(jLongValue2);
                        methodWriterVisitMethod.lcmp();
                        methodWriterVisitMethod.ifne(label13);
                        label14 = label13;
                        short s2 = objectReadContext2.objectReaderAdapter.mapping[Arrays.binarySearch(objectReadContext2.objectReaderAdapter.hashCodes, jLongValue2)];
                        int i111 = i7;
                        int i112 = size;
                        boolean z12 = z7;
                        MethodWriterContext methodWriterContext9 = methodWriterContext4;
                        Label label210 = label23;
                        int i113 = i13;
                        String str15 = str4;
                        int i23 = length2;
                        Label label36 = label3;
                        Label label37 = label24;
                        label15 = label12;
                        int i24 = iVar2;
                        String str16 = str3;
                        int[] iArr2 = iArrBuildHashCode32Map;
                        genReadFieldValue(objectReadContext2, fieldReaderArr[s2], z12, methodWriterContext9, i5, s2, false);
                        methodWriterVisitMethod.goto_(label36);
                        if (label14 != label15) {
                            methodWriterVisitMethod.visitLabel(label14);
                        }
                        iArrBuildHashCode32Map = iArr2;
                        size = i112;
                        label23 = label210;
                        i7 = i111;
                        z7 = z12;
                        methodWriterContext4 = methodWriterContext9;
                        str3 = str16;
                        iVar2 = i24;
                        i12 = i110;
                        list = list3;
                        label12 = label15;
                        label24 = label37;
                        label3 = label36;
                        length2 = i23;
                        str4 = str15;
                        i13 = i113 + 1;
                        treeMap = treeMap3;
                    }
                    String str17 = str4;
                    int i25 = length2;
                    Label label38 = label3;
                    methodWriterVisitMethod.goto_(label38);
                    label10 = label12;
                    label24 = label24;
                    i12++;
                    methodWriterContext4 = methodWriterContext4;
                    label3 = label38;
                    str3 = str3;
                    length2 = i25;
                    iVar2 = iVar2;
                    treeMap = treeMap;
                    str4 = str17;
                    labelArr = labelArr3;
                }
                i8 = iVar2;
                str5 = str4;
                str6 = str3;
                label6 = label3;
                methodWriterContext3 = methodWriterContext4;
                label5 = label23;
                label7 = label24;
                methodWriterVisitMethod.visitLabel(label10);
                if (!zDisableSmartMatch) {
                    label11 = new Label();
                    feature2 = JSONReader.Feature.SupportSmartMatch;
                    if ((j & feature2.mask) == 0) {
                        methodWriterVisitMethod.lload(4);
                        methodWriterVisitMethod.visitLdcInsn(feature2.mask);
                        methodWriterVisitMethod.land();
                        methodWriterVisitMethod.lconst_0();
                        methodWriterVisitMethod.lcmp();
                        methodWriterVisitMethod.ifeq(label11);
                    }
                    methodWriterVisitMethod.aload(0);
                    methodWriterVisitMethod.aload(1);
                    methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_READER, str5, str6);
                    methodWriterVisitMethod.invokeinterface(ASMUtils.TYPE_OBJECT_READER, "getFieldReaderLCase", METHOD_DESC_GET_FIELD_READER);
                    methodWriterVisitMethod.dup();
                    methodWriterVisitMethod.astore(iVar5);
                    methodWriterVisitMethod.ifnull(label11);
                    methodWriterVisitMethod.aload(iVar5);
                    methodWriterVisitMethod.aload(1);
                    methodWriterVisitMethod.aload(i5);
                    methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_FIELD_READE, "readFieldValue", METHOD_DESC_READ_FIELD_VALUE);
                    methodWriterVisitMethod.goto_(label6);
                    methodWriterVisitMethod.visitLabel(label11);
                }
            } else {
                methodWriterContext3 = methodWriterContext;
                label4 = label19;
                label5 = label23;
                z6 = z2;
                i8 = iVar2;
                label6 = label3;
                label7 = label24;
                i9 = 0;
                while (i9 < fieldReaderArr.length) {
                    Label label39 = new Label();
                    Label label310 = new Label();
                    FieldReader fieldReader3 = fieldReaderArr[i9];
                    String str18 = fieldReader3.fieldName;
                    boolean z13 = z5;
                    long j5 = fieldReader3.fieldNameHash;
                    methodWriterVisitMethod.lload(i7);
                    methodWriterVisitMethod.visitLdcInsn(j5);
                    methodWriterVisitMethod.lcmp();
                    methodWriterVisitMethod.ifne(label39);
                    methodWriterVisitMethod.visitLabel(label310);
                    methodWriterContext3 = methodWriterContext3;
                    z5 = z13;
                    genReadFieldValue(objectReadContext2, fieldReader3, z5, methodWriterContext3, i5, i9, false);
                    methodWriterVisitMethod.goto_(label6);
                    methodWriterVisitMethod.visitLabel(label39);
                    i9++;
                    objectReadContext2 = objectReadContext;
                }
                label8 = new Label();
                if (!zDisableSmartMatch) {
                    feature = JSONReader.Feature.SupportSmartMatch;
                    if ((j & feature.mask) == 0) {
                        methodWriterVisitMethod.lload(4);
                        methodWriterVisitMethod.visitLdcInsn(feature.mask);
                        methodWriterVisitMethod.land();
                        methodWriterVisitMethod.lconst_0();
                        methodWriterVisitMethod.lcmp();
                        methodWriterVisitMethod.ifeq(label8);
                    }
                    methodWriterVisitMethod.aload(1);
                    methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_READER, "getNameHashCodeLCase", str3);
                    methodWriterVisitMethod.lstore(i7);
                    while (i10 < fieldReaderArr.length) {
                        label9 = new Label();
                        Label label311 = new Label();
                        FieldReader fieldReader4 = fieldReaderArr[i10];
                        String str19 = fieldReader4.fieldName;
                        j2 = fieldReader4.fieldNameHash;
                        boolean z14 = z5;
                        MethodWriterContext methodWriterContext10 = methodWriterContext3;
                        j3 = fieldReader4.fieldNameHashLCase;
                        methodWriterVisitMethod.lload(i7);
                        methodWriterVisitMethod.visitLdcInsn(j2);
                        methodWriterVisitMethod.lcmp();
                        methodWriterVisitMethod.ifeq(label311);
                        if (j3 != j2) {
                            methodWriterVisitMethod.lload(i7);
                            methodWriterVisitMethod.visitLdcInsn(j3);
                            methodWriterVisitMethod.lcmp();
                            methodWriterVisitMethod.ifne(label9);
                        } else {
                            methodWriterVisitMethod.goto_(label9);
                        }
                        methodWriterVisitMethod.visitLabel(label311);
                        methodWriterContext3 = methodWriterContext10;
                        z5 = z14;
                        genReadFieldValue(objectReadContext, fieldReader4, z5, methodWriterContext3, i5, i10, false);
                        methodWriterVisitMethod.goto_(label6);
                        methodWriterVisitMethod.visitLabel(label9);
                    }
                }
                objectReadContext2 = objectReadContext;
                methodWriterVisitMethod.visitLabel(label8);
            }
            if (!z6) {
                if (objectReadContext2.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor) {
                    methodWriterVisitMethod.aload(1);
                    methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_READER, "skipValue", "()V");
                } else {
                    methodWriterVisitMethod.aload(0);
                    methodWriterVisitMethod.aload(1);
                    methodWriterVisitMethod.aload(i5);
                    methodWriterVisitMethod.lload(4);
                    methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_OBJECT_READER_ADAPTER, "processExtra", METHOD_DESC_PROCESS_EXTRA);
                }
                methodWriterVisitMethod.goto_(label6);
            }
            methodWriterVisitMethod.visitLabel(label6);
            if (!zDisableAutoType) {
                methodWriterVisitMethod.visitIincInsn(i8, 1);
            }
            methodWriterVisitMethod.goto_(label5);
            methodWriterVisitMethod.visitLabel(label7);
            methodWriterVisitMethod.visitLabel(label4);
            if (objectReadContext2.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor) {
                createObjectForNonConstructor(objectReadContext2, methodWriterContext3);
            } else {
                methodWriterVisitMethod.aload(i5);
            }
            methodWriterVisitMethod.areturn();
            methodWriterVisitMethod.visitMaxs(5, 10);
        }
        if (objectReadContext2.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor) {
            MethodWriterContext methodWriterContext11 = methodWriterContext;
            genReadHashCode64ValueForNonDefaultConstructor(objectReadContext2, methodWriterContext11, i6, z4, i5, label2);
            methodWriterContext3 = methodWriterContext11;
        } else {
            methodWriterContext3 = methodWriterContext;
            methodWriterVisitMethod.aload(0);
            methodWriterVisitMethod.lload(i6);
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.lload(4);
            methodWriterVisitMethod.aload(i5);
            methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_OBJECT_READER_ADAPTER, "readFieldValue", READ_FIELD_READER_UL);
        }
        methodWriterVisitMethod.goto_(label2);
        label4 = label19;
        label5 = label23;
        label7 = label24;
        z6 = z2;
        i8 = iVar2;
        label6 = label2;
        if (!z6) {
            if (objectReadContext2.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor) {
                methodWriterVisitMethod.aload(1);
                methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_READER, "skipValue", "()V");
            } else {
                methodWriterVisitMethod.aload(0);
                methodWriterVisitMethod.aload(1);
                methodWriterVisitMethod.aload(i5);
                methodWriterVisitMethod.lload(4);
                methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_OBJECT_READER_ADAPTER, "processExtra", METHOD_DESC_PROCESS_EXTRA);
            }
            methodWriterVisitMethod.goto_(label6);
        }
        methodWriterVisitMethod.visitLabel(label6);
        if (!zDisableAutoType) {
            methodWriterVisitMethod.visitIincInsn(i8, 1);
        }
        methodWriterVisitMethod.goto_(label5);
        methodWriterVisitMethod.visitLabel(label7);
        methodWriterVisitMethod.visitLabel(label4);
        if (objectReadContext2.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor) {
            createObjectForNonConstructor(objectReadContext2, methodWriterContext3);
        } else {
            methodWriterVisitMethod.aload(i5);
        }
        methodWriterVisitMethod.areturn();
        methodWriterVisitMethod.visitMaxs(5, 10);
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0a8b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0a8e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0ab0  */
    /* JADX WARN: Code duplicated, block: B:157:0x0ab5 A[SYNTHETIC] */
    private void genRead243(ObjectReadContext objectReadContext, boolean z, MethodWriterContext methodWriterContext, int i, Label label, Label label2) {
        boolean z2;
        boolean z3;
        int i2;
        Label label3;
        String str = objectReadContext.classNameType;
        FieldReader[] fieldReaderArr = objectReadContext.fieldReaders;
        boolean z4 = methodWriterContext.jsonb;
        MethodWriter methodWriter = methodWriterContext.mw;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        TreeMap treeMap = new TreeMap();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            z2 = true;
            if (i4 >= fieldReaderArr.length) {
                break;
            }
            FieldReader fieldReader = fieldReaderArr[i4];
            identityHashMap.put(fieldReader, Integer.valueOf(i4));
            byte[] bArr = new byte[4];
            if (z4) {
                byte[] bytes = JSONB.toBytes(fieldReader.fieldName);
                System.arraycopy(bytes, 0, bArr, 0, Math.min(4, bytes.length));
            } else {
                byte[] bytes2 = fieldReader.fieldName.getBytes(StandardCharsets.UTF_8);
                bArr[0] = 34;
                if (bytes2.length == 2) {
                    System.arraycopy(bytes2, 0, bArr, 1, 2);
                    bArr[3] = 34;
                } else {
                    System.arraycopy(bytes2, 0, bArr, 1, 3);
                }
            }
            int i5 = JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
            List arrayList = (List) treeMap.get(Integer.valueOf(i5));
            if (arrayList == null) {
                arrayList = new ArrayList();
                treeMap.put(Integer.valueOf(i5), arrayList);
            }
            arrayList.add(fieldReader);
            i4++;
        }
        Label label4 = new Label();
        int[] iArr = new int[treeMap.size()];
        int size = treeMap.size();
        Label[] labelArr = new Label[size];
        Iterator it = treeMap.keySet().iterator();
        for (int i6 = 0; i6 < size; i6++) {
            labelArr[i6] = new Label();
            iArr[i6] = ((Integer) it.next()).intValue();
        }
        methodWriter.aload(1);
        int i7 = 3;
        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "getRawInt", "()I");
        methodWriter.visitLookupSwitchInsn(label4, iArr, labelArr);
        int i8 = 0;
        while (i8 < size) {
            methodWriter.visitLabel(labelArr[i8]);
            List list = (List) treeMap.get(Integer.valueOf(iArr[i8]));
            int i9 = i3;
            while (i9 < list.size()) {
                int i10 = i9 + 1;
                Label label5 = i10 != list.size() ? new Label() : null;
                FieldReader fieldReader2 = (FieldReader) list.get(i9);
                int iIntValue = ((Integer) identityHashMap.get(fieldReader2)).intValue();
                Label label6 = label4;
                byte[] bytes3 = fieldReader2.fieldName.getBytes(StandardCharsets.UTF_8);
                int length = bytes3.length;
                int[] iArr2 = iArr;
                int i11 = size;
                Label[] labelArr2 = labelArr;
                boolean z5 = z4;
                IdentityHashMap identityHashMap2 = identityHashMap;
                TreeMap treeMap2 = treeMap;
                int i12 = i8;
                List list2 = list;
                switch (length) {
                    case 2:
                        label5 = label5;
                        z3 = true;
                        i2 = 0;
                        methodWriter.aload(1);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match2", "()Z");
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z6 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z6;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 3:
                        label5 = label5;
                        z3 = true;
                        i2 = 0;
                        methodWriter.aload(1);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match3", "()Z");
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z7 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z7;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 4:
                        label5 = label5;
                        z3 = true;
                        i2 = 0;
                        methodWriter.aload(1);
                        i7 = 3;
                        methodWriter.iconst_n(bytes3[3]);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match4", "(B)Z");
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z8 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z8;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 5:
                        label5 = label5;
                        z3 = true;
                        byte b = bytes3[i7];
                        byte b2 = bytes3[4];
                        byte[] bArr2 = new byte[4];
                        i2 = 0;
                        bArr2[0] = b;
                        bArr2[1] = b2;
                        bArr2[2] = 34;
                        bArr2[i7] = 58;
                        int i13 = JDKUtils.UNSAFE.getInt(bArr2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                        if (z5) {
                            i13 &= Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                        }
                        methodWriter.aload(1);
                        methodWriter.iconst_n(i13);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match5", "(I)Z");
                        i7 = 3;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z9 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z9;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 6:
                        label5 = label5;
                        byte b3 = bytes3[i7];
                        byte b4 = bytes3[4];
                        byte b5 = bytes3[5];
                        byte[] bArr3 = new byte[4];
                        bArr3[0] = b3;
                        z3 = true;
                        bArr3[1] = b4;
                        bArr3[2] = b5;
                        bArr3[i7] = 34;
                        int i14 = JDKUtils.UNSAFE.getInt(bArr3, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                        if (z5) {
                            i14 &= 16777215;
                        }
                        methodWriter.aload(1);
                        methodWriter.iconst_n(i14);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match6", "(I)Z");
                        i7 = 3;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z10 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z10;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 7:
                        int i15 = JDKUtils.UNSAFE.getInt(bytes3, JDKUtils.ARRAY_BYTE_BASE_OFFSET + 3);
                        methodWriter.aload(1);
                        methodWriter.iconst_n(i15);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match7", "(I)Z");
                        z3 = true;
                        i7 = 3;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z11 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z11;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 8:
                        int i16 = JDKUtils.UNSAFE.getInt(bytes3, JDKUtils.ARRAY_BYTE_BASE_OFFSET + 3);
                        methodWriter.aload(1);
                        methodWriter.iconst_n(i16);
                        methodWriter.iconst_n(bytes3[7]);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match8", "(IB)Z");
                        z3 = true;
                        i7 = 3;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z12 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z12;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 9:
                        label5 = label5;
                        byte[] bArr4 = new byte[8];
                        System.arraycopy(bytes3, 3, bArr4, 0, 6);
                        bArr4[6] = 34;
                        bArr4[7] = 58;
                        long j = JDKUtils.UNSAFE.getLong(bArr4, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                        if (z5) {
                            j &= 281474976710655L;
                        }
                        z3 = true;
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match9", "(J)Z");
                        i7 = 3;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z13 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z13;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 10:
                        byte[] bArr5 = new byte[8];
                        System.arraycopy(bytes3, i7, bArr5, 0, 7);
                        bArr5[7] = 34;
                        long j2 = JDKUtils.UNSAFE.getLong(bArr5, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                        if (z5) {
                            j2 &= 72057594037927935L;
                        }
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j2);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match10", "(J)Z");
                        z3 = true;
                        i7 = 3;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z14 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z14;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 11:
                        long j3 = JDKUtils.UNSAFE.getLong(bytes3, JDKUtils.ARRAY_BYTE_BASE_OFFSET + 3);
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j3);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match11", "(J)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z15 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z15;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case Opcodes.FCONST_1 /* 12 */:
                        long j4 = JDKUtils.UNSAFE.getLong(bytes3, JDKUtils.ARRAY_BYTE_BASE_OFFSET + 3);
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j4);
                        methodWriter.iconst_n(bytes3[11]);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match12", "(JB)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z16 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z16;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 13:
                        label5 = label5;
                        Unsafe unsafe = JDKUtils.UNSAFE;
                        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j6 = unsafe.getLong(bytes3, j5 + 3);
                        byte b6 = bytes3[11];
                        byte b7 = bytes3[12];
                        byte[] bArr6 = new byte[4];
                        bArr6[0] = b6;
                        bArr6[1] = b7;
                        bArr6[2] = 34;
                        bArr6[i7] = 58;
                        int i17 = unsafe.getInt(bArr6, j5);
                        if (z5) {
                            i17 &= Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                        }
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j6);
                        methodWriter.iconst_n(i17);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match13", "(JI)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z17 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z17;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case Opcodes.DCONST_0 /* 14 */:
                        Unsafe unsafe2 = JDKUtils.UNSAFE;
                        long j7 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j8 = unsafe2.getLong(bytes3, j7 + 3);
                        byte b8 = bytes3[11];
                        byte b9 = bytes3[12];
                        byte b10 = bytes3[13];
                        byte[] bArr7 = new byte[4];
                        bArr7[0] = b8;
                        bArr7[1] = b9;
                        bArr7[2] = b10;
                        bArr7[i7] = 34;
                        int i18 = unsafe2.getInt(bArr7, j7);
                        if (z5) {
                            i18 &= 16777215;
                        }
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j8);
                        methodWriter.iconst_n(i18);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match14", "(JI)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z18 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z18;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 15:
                        Unsafe unsafe3 = JDKUtils.UNSAFE;
                        long j9 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j10 = unsafe3.getLong(bytes3, j9 + 3);
                        int i19 = unsafe3.getInt(bytes3, j9 + 11);
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j10);
                        methodWriter.iconst_n(i19);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match15", "(JI)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z19 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z19;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 16:
                        Unsafe unsafe4 = JDKUtils.UNSAFE;
                        long j11 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j12 = unsafe4.getLong(bytes3, j11 + 3);
                        int i20 = unsafe4.getInt(bytes3, j11 + 11);
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j12);
                        methodWriter.iconst_n(i20);
                        methodWriter.visitLdcInsn((int) bytes3[15]);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match16", "(JIB)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z110 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z110;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case Opcodes.SIPUSH /* 17 */:
                        Unsafe unsafe5 = JDKUtils.UNSAFE;
                        long j13 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j14 = unsafe5.getLong(bytes3, j13 + 3);
                        byte[] bArr8 = new byte[8];
                        System.arraycopy(bytes3, 11, bArr8, 0, 6);
                        bArr8[6] = 34;
                        bArr8[7] = 58;
                        long j15 = unsafe5.getLong(bArr8, j13);
                        if (z5) {
                            j15 &= 281474976710655L;
                        }
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j14);
                        methodWriter.visitLdcInsn(j15);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match17", "(JJ)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z111 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z111;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case Opcodes.LDC /* 18 */:
                        Unsafe unsafe6 = JDKUtils.UNSAFE;
                        long j16 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j17 = unsafe6.getLong(bytes3, j16 + 3);
                        byte[] bArr9 = new byte[8];
                        System.arraycopy(bytes3, 11, bArr9, 0, 7);
                        bArr9[7] = 34;
                        long j18 = unsafe6.getLong(bArr9, j16);
                        if (z5) {
                            j18 &= 72057594037927935L;
                        }
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j17);
                        methodWriter.visitLdcInsn(j18);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match18", "(JJ)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z112 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z112;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 19:
                        Unsafe unsafe7 = JDKUtils.UNSAFE;
                        long j19 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j20 = unsafe7.getLong(bytes3, j19 + 3);
                        long j21 = unsafe7.getLong(bytes3, j19 + 11);
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j20);
                        methodWriter.visitLdcInsn(j21);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match19", "(JJ)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z113 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z113;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 20:
                        Unsafe unsafe8 = JDKUtils.UNSAFE;
                        long j22 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j23 = unsafe8.getLong(bytes3, j22 + 3);
                        long j24 = unsafe8.getLong(bytes3, j22 + 11);
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j23);
                        methodWriter.visitLdcInsn(j24);
                        methodWriter.iconst_n(bytes3[19]);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match20", "(JJB)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z114 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z114;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case Opcodes.ILOAD /* 21 */:
                        Unsafe unsafe9 = JDKUtils.UNSAFE;
                        long j25 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j26 = unsafe9.getLong(bytes3, j25 + 3);
                        long j27 = unsafe9.getLong(bytes3, j25 + 11);
                        byte b11 = bytes3[19];
                        byte b12 = bytes3[20];
                        byte[] bArr10 = new byte[4];
                        bArr10[0] = b11;
                        bArr10[1] = b12;
                        bArr10[2] = 34;
                        bArr10[i7] = 58;
                        int i21 = unsafe9.getInt(bArr10, j25);
                        if (z5) {
                            i21 &= Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                        }
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j26);
                        methodWriter.visitLdcInsn(j27);
                        methodWriter.iconst_n(i21);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match21", "(JJI)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z115 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z115;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case Opcodes.LLOAD /* 22 */:
                        Unsafe unsafe10 = JDKUtils.UNSAFE;
                        long j28 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j29 = unsafe10.getLong(bytes3, j28 + 3);
                        long j30 = unsafe10.getLong(bytes3, j28 + 11);
                        byte b13 = bytes3[19];
                        byte b14 = bytes3[20];
                        byte b15 = bytes3[21];
                        byte[] bArr11 = new byte[4];
                        bArr11[0] = b13;
                        bArr11[1] = b14;
                        bArr11[2] = b15;
                        bArr11[i7] = 34;
                        int i22 = unsafe10.getInt(bArr11, j28);
                        if (z5) {
                            i22 &= 16777215;
                        }
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j29);
                        methodWriter.visitLdcInsn(j30);
                        methodWriter.iconst_n(i22);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match22", "(JJI)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z116 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z116;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case Opcodes.FLOAD /* 23 */:
                        Unsafe unsafe11 = JDKUtils.UNSAFE;
                        long j31 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j32 = unsafe11.getLong(bytes3, j31 + 3);
                        long j33 = unsafe11.getLong(bytes3, j31 + 11);
                        int i23 = unsafe11.getInt(bytes3, j31 + 19);
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j32);
                        methodWriter.visitLdcInsn(j33);
                        methodWriter.iconst_n(i23);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match23", "(JJI)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z117 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z117;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case Opcodes.DLOAD /* 24 */:
                        Unsafe unsafe12 = JDKUtils.UNSAFE;
                        long j34 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j35 = unsafe12.getLong(bytes3, j34 + 3);
                        long j36 = unsafe12.getLong(bytes3, j34 + 11);
                        int i24 = unsafe12.getInt(bytes3, j34 + 19);
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j35);
                        methodWriter.visitLdcInsn(j36);
                        methodWriter.iconst_n(i24);
                        methodWriter.visitLdcInsn((int) bytes3[23]);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match24", "(JJIB)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z118 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z118;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case Opcodes.ALOAD /* 25 */:
                        Unsafe unsafe13 = JDKUtils.UNSAFE;
                        long j37 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j38 = unsafe13.getLong(bytes3, j37 + 3);
                        long j39 = unsafe13.getLong(bytes3, j37 + 11);
                        byte[] bArr12 = new byte[8];
                        System.arraycopy(bytes3, 19, bArr12, 0, 6);
                        bArr12[6] = 34;
                        bArr12[7] = 58;
                        long j40 = unsafe13.getLong(bArr12, j37);
                        if (z5) {
                            j40 &= 281474976710655L;
                        }
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j38);
                        methodWriter.visitLdcInsn(j39);
                        methodWriter.visitLdcInsn(j40);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match25", "(JJJ)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z119 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z119;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 26:
                        Unsafe unsafe14 = JDKUtils.UNSAFE;
                        long j41 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j42 = unsafe14.getLong(bytes3, j41 + 3);
                        long j43 = unsafe14.getLong(bytes3, j41 + 11);
                        byte[] bArr13 = new byte[8];
                        System.arraycopy(bytes3, 19, bArr13, 0, 7);
                        bArr13[7] = 34;
                        long j44 = unsafe14.getLong(bArr13, j41);
                        if (z5) {
                            j44 &= 72057594037927935L;
                        }
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j42);
                        methodWriter.visitLdcInsn(j43);
                        methodWriter.visitLdcInsn(j44);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match26", "(JJJ)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z1110 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z1110;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 27:
                        Unsafe unsafe15 = JDKUtils.UNSAFE;
                        long j45 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j46 = unsafe15.getLong(bytes3, j45 + 3);
                        long j47 = unsafe15.getLong(bytes3, j45 + 11);
                        long j48 = unsafe15.getLong(bytes3, j45 + 19);
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j46);
                        methodWriter.visitLdcInsn(j47);
                        methodWriter.visitLdcInsn(j48);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match27", "(JJJ)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z1111 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z1111;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 28:
                        Unsafe unsafe16 = JDKUtils.UNSAFE;
                        long j49 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j50 = unsafe16.getLong(bytes3, j49 + 3);
                        long j51 = unsafe16.getLong(bytes3, j49 + 11);
                        long j52 = unsafe16.getLong(bytes3, j49 + 19);
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j50);
                        methodWriter.visitLdcInsn(j51);
                        methodWriter.visitLdcInsn(j52);
                        methodWriter.visitLdcInsn((int) bytes3[27]);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match28", "(JJJB)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z1112 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z1112;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 29:
                        Unsafe unsafe17 = JDKUtils.UNSAFE;
                        long j53 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j54 = unsafe17.getLong(bytes3, j53 + 3);
                        long j55 = unsafe17.getLong(bytes3, j53 + 11);
                        long j56 = unsafe17.getLong(bytes3, j53 + 19);
                        byte b16 = bytes3[27];
                        byte b17 = bytes3[28];
                        byte[] bArr14 = new byte[4];
                        bArr14[0] = b16;
                        bArr14[1] = b17;
                        bArr14[2] = 34;
                        bArr14[i7] = 58;
                        int i25 = unsafe17.getInt(bArr14, j53);
                        if (z5) {
                            i25 &= Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                        }
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j54);
                        methodWriter.visitLdcInsn(j55);
                        methodWriter.visitLdcInsn(j56);
                        methodWriter.iconst_n(i25);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match29", "(JJJI)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z1113 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z1113;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 30:
                        Unsafe unsafe18 = JDKUtils.UNSAFE;
                        long j57 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j58 = unsafe18.getLong(bytes3, j57 + 3);
                        long j59 = unsafe18.getLong(bytes3, j57 + 11);
                        long j60 = unsafe18.getLong(bytes3, j57 + 19);
                        byte b18 = bytes3[27];
                        byte b19 = bytes3[28];
                        byte b20 = bytes3[29];
                        byte[] bArr15 = new byte[4];
                        bArr15[0] = b18;
                        bArr15[1] = b19;
                        bArr15[2] = b20;
                        bArr15[i7] = 34;
                        int i26 = unsafe18.getInt(bArr15, j57);
                        if (z5) {
                            i26 &= 16777215;
                        }
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j58);
                        methodWriter.visitLdcInsn(j59);
                        methodWriter.visitLdcInsn(j60);
                        methodWriter.iconst_n(i26);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match30", "(JJJI)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z1114 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z1114;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 31:
                        Unsafe unsafe19 = JDKUtils.UNSAFE;
                        long j61 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j62 = unsafe19.getLong(bytes3, j61 + 3);
                        long j63 = unsafe19.getLong(bytes3, j61 + 11);
                        long j64 = unsafe19.getLong(bytes3, j61 + 19);
                        int i27 = unsafe19.getInt(bytes3, j61 + 27);
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j62);
                        methodWriter.visitLdcInsn(j63);
                        methodWriter.visitLdcInsn(j64);
                        methodWriter.iconst_n(i27);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match31", "(JJJI)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z1115 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z1115;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 32:
                        Unsafe unsafe20 = JDKUtils.UNSAFE;
                        long j65 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j66 = unsafe20.getLong(bytes3, j65 + 3);
                        long j67 = unsafe20.getLong(bytes3, j65 + 11);
                        long j68 = unsafe20.getLong(bytes3, j65 + 19);
                        int i28 = unsafe20.getInt(bytes3, j65 + 27);
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j66);
                        methodWriter.visitLdcInsn(j67);
                        methodWriter.visitLdcInsn(j68);
                        methodWriter.visitLdcInsn(i28);
                        methodWriter.iconst_n(bytes3[31]);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match32", "(JJJIB)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z1116 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z1116;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 33:
                        Unsafe unsafe21 = JDKUtils.UNSAFE;
                        long j69 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j70 = unsafe21.getLong(bytes3, j69 + 3);
                        long j71 = unsafe21.getLong(bytes3, j69 + 11);
                        long j72 = unsafe21.getLong(bytes3, j69 + 19);
                        byte[] bArr16 = new byte[8];
                        System.arraycopy(bytes3, 27, bArr16, 0, 6);
                        bArr16[6] = 34;
                        bArr16[7] = 58;
                        long j73 = unsafe21.getLong(bArr16, j69);
                        if (z5) {
                            j73 &= 281474976710655L;
                        }
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j70);
                        methodWriter.visitLdcInsn(j71);
                        methodWriter.visitLdcInsn(j72);
                        methodWriter.visitLdcInsn(j73);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match33", "(JJJJ)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z1117 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z1117;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 34:
                        Unsafe unsafe22 = JDKUtils.UNSAFE;
                        long j74 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j75 = unsafe22.getLong(bytes3, j74 + 3);
                        long j76 = unsafe22.getLong(bytes3, j74 + 11);
                        long j77 = unsafe22.getLong(bytes3, j74 + 19);
                        byte[] bArr17 = new byte[8];
                        System.arraycopy(bytes3, 27, bArr17, 0, 7);
                        bArr17[7] = 34;
                        long j78 = unsafe22.getLong(bArr17, j74);
                        if (z5) {
                            j78 &= 72057594037927935L;
                        }
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j75);
                        methodWriter.visitLdcInsn(j76);
                        methodWriter.visitLdcInsn(j77);
                        methodWriter.visitLdcInsn(j78);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match34", "(JJJJ)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z1118 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z1118;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 35:
                        Unsafe unsafe23 = JDKUtils.UNSAFE;
                        long j79 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j80 = unsafe23.getLong(bytes3, j79 + 3);
                        long j81 = unsafe23.getLong(bytes3, j79 + 11);
                        long j82 = unsafe23.getLong(bytes3, j79 + 19);
                        long j83 = unsafe23.getLong(bytes3, j79 + 27);
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j80);
                        methodWriter.visitLdcInsn(j81);
                        methodWriter.visitLdcInsn(j82);
                        methodWriter.visitLdcInsn(j83);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match35", "(JJJJ)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z1119 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z1119;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 36:
                        Unsafe unsafe24 = JDKUtils.UNSAFE;
                        long j84 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j85 = unsafe24.getLong(bytes3, j84 + 3);
                        long j86 = unsafe24.getLong(bytes3, j84 + 11);
                        long j87 = unsafe24.getLong(bytes3, j84 + 19);
                        long j88 = unsafe24.getLong(bytes3, j84 + 27);
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j85);
                        methodWriter.visitLdcInsn(j86);
                        methodWriter.visitLdcInsn(j87);
                        methodWriter.visitLdcInsn(j88);
                        methodWriter.iconst_n(bytes3[35]);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match36", "(JJJJB)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z11110 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z11110;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 37:
                        Unsafe unsafe25 = JDKUtils.UNSAFE;
                        long j89 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j90 = unsafe25.getLong(bytes3, j89 + 3);
                        long j91 = unsafe25.getLong(bytes3, j89 + 11);
                        long j92 = unsafe25.getLong(bytes3, j89 + 19);
                        long j93 = unsafe25.getLong(bytes3, j89 + 27);
                        byte b21 = bytes3[35];
                        byte b22 = bytes3[36];
                        byte[] bArr18 = new byte[4];
                        bArr18[0] = b21;
                        bArr18[1] = b22;
                        bArr18[2] = 34;
                        bArr18[i7] = 58;
                        int i29 = unsafe25.getInt(bArr18, j89);
                        if (z5) {
                            i29 &= Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                        }
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j90);
                        methodWriter.visitLdcInsn(j91);
                        methodWriter.visitLdcInsn(j92);
                        methodWriter.visitLdcInsn(j93);
                        methodWriter.iconst_n(i29);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match37", "(JJJJI)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z11111 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z11111;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 38:
                        Unsafe unsafe26 = JDKUtils.UNSAFE;
                        long j94 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j95 = unsafe26.getLong(bytes3, j94 + 3);
                        long j96 = unsafe26.getLong(bytes3, j94 + 11);
                        long j97 = unsafe26.getLong(bytes3, j94 + 19);
                        long j98 = unsafe26.getLong(bytes3, j94 + 27);
                        byte b23 = bytes3[35];
                        byte b24 = bytes3[36];
                        byte b25 = bytes3[37];
                        byte[] bArr19 = new byte[4];
                        bArr19[0] = b23;
                        bArr19[1] = b24;
                        bArr19[2] = b25;
                        bArr19[i7] = 34;
                        int i30 = unsafe26.getInt(bArr19, j94);
                        if (z5) {
                            i30 &= 16777215;
                        }
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j95);
                        methodWriter.visitLdcInsn(j96);
                        methodWriter.visitLdcInsn(j97);
                        methodWriter.visitLdcInsn(j98);
                        methodWriter.iconst_n(i30);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match38", "(JJJJI)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z11112 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z11112;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 39:
                        Unsafe unsafe27 = JDKUtils.UNSAFE;
                        long j99 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j100 = unsafe27.getLong(bytes3, j99 + 3);
                        long j101 = unsafe27.getLong(bytes3, j99 + 11);
                        long j102 = unsafe27.getLong(bytes3, j99 + 19);
                        long j103 = unsafe27.getLong(bytes3, j99 + 27);
                        int i31 = unsafe27.getInt(bytes3, j99 + 35);
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j100);
                        methodWriter.visitLdcInsn(j101);
                        methodWriter.visitLdcInsn(j102);
                        methodWriter.visitLdcInsn(j103);
                        methodWriter.iconst_n(i31);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match39", "(JJJJI)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z11113 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z11113;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 40:
                        Unsafe unsafe28 = JDKUtils.UNSAFE;
                        long j104 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j105 = unsafe28.getLong(bytes3, j104 + 3);
                        long j106 = unsafe28.getLong(bytes3, j104 + 11);
                        long j107 = unsafe28.getLong(bytes3, j104 + 19);
                        long j108 = unsafe28.getLong(bytes3, j104 + 27);
                        int i32 = unsafe28.getInt(bytes3, j104 + 35);
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j105);
                        methodWriter.visitLdcInsn(j106);
                        methodWriter.visitLdcInsn(j107);
                        methodWriter.visitLdcInsn(j108);
                        methodWriter.iconst_n(i32);
                        methodWriter.iconst_n(bytes3[39]);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match40", "(JJJJIB)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z11114 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z11114;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 41:
                        Unsafe unsafe29 = JDKUtils.UNSAFE;
                        long j109 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j110 = unsafe29.getLong(bytes3, j109 + 3);
                        long j111 = unsafe29.getLong(bytes3, j109 + 11);
                        long j112 = unsafe29.getLong(bytes3, j109 + 19);
                        long j113 = unsafe29.getLong(bytes3, j109 + 27);
                        byte[] bArr20 = new byte[8];
                        System.arraycopy(bytes3, 35, bArr20, 0, 6);
                        bArr20[6] = 34;
                        bArr20[7] = 58;
                        long j114 = unsafe29.getLong(bArr20, j109);
                        if (z5) {
                            j114 &= 281474976710655L;
                        }
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j110);
                        methodWriter.visitLdcInsn(j111);
                        methodWriter.visitLdcInsn(j112);
                        methodWriter.visitLdcInsn(j113);
                        methodWriter.visitLdcInsn(j114);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match41", "(JJJJJ)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z11115 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z11115;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 42:
                        Unsafe unsafe30 = JDKUtils.UNSAFE;
                        long j115 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j116 = unsafe30.getLong(bytes3, j115 + 3);
                        long j117 = unsafe30.getLong(bytes3, j115 + 11);
                        long j118 = unsafe30.getLong(bytes3, j115 + 19);
                        long j119 = unsafe30.getLong(bytes3, j115 + 27);
                        byte[] bArr21 = new byte[8];
                        System.arraycopy(bytes3, 35, bArr21, 0, 7);
                        bArr21[7] = 34;
                        long j120 = unsafe30.getLong(bArr21, j115);
                        if (z5) {
                            j120 &= 72057594037927935L;
                        }
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j116);
                        methodWriter.visitLdcInsn(j117);
                        methodWriter.visitLdcInsn(j118);
                        methodWriter.visitLdcInsn(j119);
                        methodWriter.visitLdcInsn(j120);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match42", "(JJJJJ)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z11116 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z11116;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 43:
                        Unsafe unsafe31 = JDKUtils.UNSAFE;
                        long j121 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                        long j122 = unsafe31.getLong(bytes3, j121 + 3);
                        long j123 = unsafe31.getLong(bytes3, j121 + 11);
                        long j124 = unsafe31.getLong(bytes3, j121 + 19);
                        long j125 = unsafe31.getLong(bytes3, j121 + 27);
                        long j126 = unsafe31.getLong(bytes3, j121 + 35);
                        methodWriter.aload(1);
                        methodWriter.visitLdcInsn(j122);
                        methodWriter.visitLdcInsn(j123);
                        methodWriter.visitLdcInsn(j124);
                        methodWriter.visitLdcInsn(j125);
                        methodWriter.visitLdcInsn(j126);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfName4Match43", "(JJJJJ)Z");
                        z3 = true;
                        i2 = 0;
                        if (label5 != null) {
                            label3 = label5;
                        } else {
                            label3 = label2;
                        }
                        methodWriter.ifeq(label3);
                        boolean z11117 = z3;
                        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i, iIntValue, false);
                        methodWriter.goto_(label);
                        if (label5 != null) {
                            methodWriter.visitLabel(label5);
                        }
                        label4 = label6;
                        i3 = i2;
                        z2 = z11117;
                        iArr = iArr2;
                        size = i11;
                        labelArr = labelArr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    default:
                        throw new IllegalStateException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(length, "fieldNameLength "));
                }
            }
            boolean z20 = z4;
            Label label7 = label4;
            methodWriter.goto_(label7);
            i8++;
            label4 = label7;
            z4 = z20;
        }
        methodWriter.visitLabel(label4);
    }

    private void genRead57(ObjectReadContext objectReadContext, boolean z, MethodWriterContext methodWriterContext, int i, Label label, Label label2) {
        String str;
        MethodWriterContext methodWriterContext2 = methodWriterContext;
        ObjectReadContext objectReadContext2 = objectReadContext;
        FieldReader[] fieldReaderArr = objectReadContext2.fieldReaders;
        int iVar2 = methodWriterContext2.var2("RAW_LONG");
        MethodWriter methodWriter = methodWriterContext2.mw;
        methodWriter.aload(1);
        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "getRawLong", "()J");
        methodWriter.dup2();
        methodWriter.lstore(iVar2);
        methodWriter.lconst_0();
        methodWriter.lcmp();
        methodWriter.ifeq(label2);
        int i2 = 0;
        int i3 = 0;
        while (i3 < fieldReaderArr.length) {
            Label label3 = new Label();
            FieldReader fieldReader = fieldReaderArr[i3];
            byte[] bytes = fieldReader.fieldName.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            byte[] bArr = new byte[8];
            if (length == 5) {
                bArr[i2] = 34;
                System.arraycopy(bytes, i2, bArr, 1, 5);
                bArr[6] = 34;
                bArr[7] = 58;
                str = "nextIfName8Match0";
            } else if (length == 6) {
                bArr[i2] = 34;
                System.arraycopy(bytes, i2, bArr, 1, 6);
                bArr[7] = 34;
                str = "nextIfName8Match1";
            } else {
                if (length != 7) {
                    throw new IllegalStateException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(length, "length "));
                }
                bArr[i2] = 34;
                System.arraycopy(bytes, i2, bArr, 1, 7);
                str = "nextIfName8Match2";
            }
            long j = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
            methodWriter.lload(iVar2);
            methodWriter.visitLdcInsn(j);
            methodWriter.lcmp();
            methodWriter.ifne(label3);
            methodWriter.aload(1);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, str, "()Z");
            methodWriter.ifeq(label2);
            genReadFieldValue(objectReadContext2, fieldReader, z, methodWriterContext2, i, i3, false);
            methodWriter.goto_(label);
            methodWriter.visitLabel(label3);
            i3++;
            objectReadContext2 = objectReadContext;
            methodWriterContext2 = methodWriterContext;
            i2 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:56:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:59:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:76:0x02e5 A[SYNTHETIC] */
    private void genReadEnumValueRaw(FieldReader fieldReader, String str, MethodWriterContext methodWriterContext, int i, Type type, Class cls, long j, String str2) {
        int iMin;
        int iMax;
        Label label;
        MethodWriter methodWriter = methodWriterContext.mw;
        boolean z = methodWriterContext.jsonb;
        Object[] enumConstants = cls.getEnumConstants();
        TreeMap treeMap = new TreeMap();
        int i2 = 2;
        int i3 = 4;
        int i4 = 0;
        if (enumConstants != null) {
            int i5 = 0;
            iMin = 0;
            iMax = 0;
            while (i5 < enumConstants.length) {
                Enum r15 = (Enum) enumConstants[i5];
                byte[] bytes = r15.name().getBytes(StandardCharsets.UTF_8);
                int length = bytes.length;
                if (i5 == 0) {
                    iMin = length;
                    iMax = iMin;
                } else {
                    iMin = Math.min(length, iMin);
                    iMax = Math.max(length, iMax);
                }
                byte[] bArr = new byte[i3];
                bArr[0] = 34;
                int i6 = i3;
                if (bytes.length == i2) {
                    System.arraycopy(bytes, 0, bArr, 1, i2);
                    bArr[3] = 34;
                } else if (bytes.length >= 3) {
                    System.arraycopy(bytes, 0, bArr, 1, 3);
                }
                int i7 = JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                List arrayList = (List) treeMap.get(Integer.valueOf(i7));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    treeMap.put(Integer.valueOf(i7), arrayList);
                }
                arrayList.add(r15);
                i5++;
                i3 = i6;
                i2 = 2;
            }
        } else {
            iMin = 0;
            iMax = 0;
        }
        int i8 = i3;
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();
        methodWriter.aload(0);
        String str3 = ASMUtils.DESC_OBJECT_READER;
        methodWriter.getfield(str, str2, str3);
        methodWriter.ifnonnull(label4);
        methodWriter.aload(0);
        methodWriter.aload(0);
        methodWriter.getfield(str, CodeGenUtils.fieldReader(i), ASMUtils.DESC_FIELD_READER);
        methodWriter.aload(1);
        methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_READE, "getObjectReader", METHOD_DESC_GET_OBJECT_READER_1);
        methodWriter.putfield(str, str2, str3);
        methodWriter.visitLabel(label4);
        methodWriter.aload(0);
        methodWriter.getfield(str, str2, str3);
        Class<ObjectReaderImplEnum> cls2 = ObjectReaderImplEnum.class;
        methodWriter.instanceOf(ASMUtils.type(cls2));
        methodWriter.ifeq(label2);
        if (iMin >= 2 && iMax <= 11) {
            int[] iArr = new int[treeMap.size()];
            int size = treeMap.size();
            Label[] labelArr = new Label[size];
            Iterator it = treeMap.keySet().iterator();
            for (int i9 = 0; i9 < size; i9++) {
                labelArr[i9] = new Label();
                iArr[i9] = ((Integer) it.next()).intValue();
            }
            methodWriter.aload(1);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "getRawInt", "()I");
            methodWriter.visitLookupSwitchInsn(label2, iArr, labelArr);
            int i10 = 0;
            while (i10 < size) {
                methodWriter.visitLabel(labelArr[i10]);
                List list = (List) treeMap.get(Integer.valueOf(iArr[i10]));
                int i11 = i4;
                while (i11 < list.size()) {
                    Label label5 = i11 > 0 ? new Label() : null;
                    Enum r18 = (Enum) list.get(i11);
                    boolean z2 = z;
                    byte[] bytes2 = r18.name().getBytes(StandardCharsets.UTF_8);
                    int length2 = bytes2.length;
                    TreeMap treeMap2 = treeMap;
                    Class<ObjectReaderImplEnum> cls3 = cls2;
                    int[] iArr2 = iArr;
                    int i12 = size;
                    switch (length2) {
                        case 2:
                            labelArr = labelArr;
                            methodWriter.aload(1);
                            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfValue4Match2", "()Z");
                            if (label5 != null) {
                                label = label5;
                            } else {
                                label = label2;
                            }
                            methodWriter.ifeq(label);
                            methodWriter.aload(0);
                            methodWriter.getfield(str, str2, ASMUtils.DESC_OBJECT_READER);
                            methodWriter.checkcast(ASMUtils.type(cls3));
                            methodWriter.visitLdcInsn(r18.ordinal());
                            methodWriter.invokevirtual(ASMUtils.type(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            methodWriter.goto_(label3);
                            if (label5 != null) {
                                methodWriter.visitLabel(label5);
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            labelArr = labelArr;
                            break;
                        case 3:
                            labelArr = labelArr;
                            methodWriter.aload(1);
                            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfValue4Match3", "()Z");
                            if (label5 != null) {
                                label = label5;
                            } else {
                                label = label2;
                            }
                            methodWriter.ifeq(label);
                            methodWriter.aload(0);
                            methodWriter.getfield(str, str2, ASMUtils.DESC_OBJECT_READER);
                            methodWriter.checkcast(ASMUtils.type(cls3));
                            methodWriter.visitLdcInsn(r18.ordinal());
                            methodWriter.invokevirtual(ASMUtils.type(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            methodWriter.goto_(label3);
                            if (label5 != null) {
                                methodWriter.visitLabel(label5);
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            labelArr = labelArr;
                            break;
                        case 4:
                            labelArr = labelArr;
                            methodWriter.aload(1);
                            methodWriter.visitLdcInsn((int) bytes2[3]);
                            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfValue4Match4", "(B)Z");
                            if (label5 != null) {
                                label = label5;
                            } else {
                                label = label2;
                            }
                            methodWriter.ifeq(label);
                            methodWriter.aload(0);
                            methodWriter.getfield(str, str2, ASMUtils.DESC_OBJECT_READER);
                            methodWriter.checkcast(ASMUtils.type(cls3));
                            methodWriter.visitLdcInsn(r18.ordinal());
                            methodWriter.invokevirtual(ASMUtils.type(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            methodWriter.goto_(label3);
                            if (label5 != null) {
                                methodWriter.visitLabel(label5);
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            labelArr = labelArr;
                            break;
                        case 5:
                            labelArr = labelArr;
                            methodWriter.aload(1);
                            methodWriter.visitLdcInsn((int) bytes2[3]);
                            i8 = 4;
                            methodWriter.visitLdcInsn((int) bytes2[4]);
                            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfValue4Match5", "(BB)Z");
                            if (label5 != null) {
                                label = label5;
                            } else {
                                label = label2;
                            }
                            methodWriter.ifeq(label);
                            methodWriter.aload(0);
                            methodWriter.getfield(str, str2, ASMUtils.DESC_OBJECT_READER);
                            methodWriter.checkcast(ASMUtils.type(cls3));
                            methodWriter.visitLdcInsn(r18.ordinal());
                            methodWriter.invokevirtual(ASMUtils.type(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            methodWriter.goto_(label3);
                            if (label5 != null) {
                                methodWriter.visitLabel(label5);
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            labelArr = labelArr;
                            break;
                        case 6:
                            labelArr = labelArr;
                            byte b = bytes2[3];
                            byte b2 = bytes2[i8];
                            byte b3 = bytes2[5];
                            byte[] bArr2 = new byte[i8];
                            bArr2[0] = b;
                            bArr2[1] = b2;
                            bArr2[2] = b3;
                            bArr2[3] = 34;
                            int i13 = JDKUtils.UNSAFE.getInt(bArr2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                            methodWriter.aload(1);
                            methodWriter.visitLdcInsn(i13);
                            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfValue4Match6", "(I)Z");
                            i8 = 4;
                            if (label5 != null) {
                                label = label5;
                            } else {
                                label = label2;
                            }
                            methodWriter.ifeq(label);
                            methodWriter.aload(0);
                            methodWriter.getfield(str, str2, ASMUtils.DESC_OBJECT_READER);
                            methodWriter.checkcast(ASMUtils.type(cls3));
                            methodWriter.visitLdcInsn(r18.ordinal());
                            methodWriter.invokevirtual(ASMUtils.type(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            methodWriter.goto_(label3);
                            if (label5 != null) {
                                methodWriter.visitLabel(label5);
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            labelArr = labelArr;
                            break;
                        case 7:
                            int i14 = JDKUtils.UNSAFE.getInt(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET + 3);
                            methodWriter.aload(1);
                            methodWriter.visitLdcInsn(i14);
                            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfValue4Match7", "(I)Z");
                            if (label5 != null) {
                                label = label5;
                            } else {
                                label = label2;
                            }
                            methodWriter.ifeq(label);
                            methodWriter.aload(0);
                            methodWriter.getfield(str, str2, ASMUtils.DESC_OBJECT_READER);
                            methodWriter.checkcast(ASMUtils.type(cls3));
                            methodWriter.visitLdcInsn(r18.ordinal());
                            methodWriter.invokevirtual(ASMUtils.type(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            methodWriter.goto_(label3);
                            if (label5 != null) {
                                methodWriter.visitLabel(label5);
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            labelArr = labelArr;
                            break;
                        case 8:
                            int i15 = JDKUtils.UNSAFE.getInt(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET + 3);
                            methodWriter.aload(1);
                            methodWriter.visitLdcInsn(i15);
                            methodWriter.visitLdcInsn((int) bytes2[7]);
                            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfValue4Match8", "(IB)Z");
                            if (label5 != null) {
                                label = label5;
                            } else {
                                label = label2;
                            }
                            methodWriter.ifeq(label);
                            methodWriter.aload(0);
                            methodWriter.getfield(str, str2, ASMUtils.DESC_OBJECT_READER);
                            methodWriter.checkcast(ASMUtils.type(cls3));
                            methodWriter.visitLdcInsn(r18.ordinal());
                            methodWriter.invokevirtual(ASMUtils.type(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            methodWriter.goto_(label3);
                            if (label5 != null) {
                                methodWriter.visitLabel(label5);
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            labelArr = labelArr;
                            break;
                        case 9:
                            int i16 = JDKUtils.UNSAFE.getInt(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET + 3);
                            methodWriter.aload(1);
                            methodWriter.visitLdcInsn(i16);
                            methodWriter.visitLdcInsn((int) bytes2[7]);
                            methodWriter.visitLdcInsn((int) bytes2[8]);
                            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfValue4Match9", "(IBB)Z");
                            if (label5 != null) {
                                label = label5;
                            } else {
                                label = label2;
                            }
                            methodWriter.ifeq(label);
                            methodWriter.aload(0);
                            methodWriter.getfield(str, str2, ASMUtils.DESC_OBJECT_READER);
                            methodWriter.checkcast(ASMUtils.type(cls3));
                            methodWriter.visitLdcInsn(r18.ordinal());
                            methodWriter.invokevirtual(ASMUtils.type(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            methodWriter.goto_(label3);
                            if (label5 != null) {
                                methodWriter.visitLabel(label5);
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            labelArr = labelArr;
                            break;
                        case 10:
                            byte[] bArr3 = new byte[8];
                            System.arraycopy(bytes2, 3, bArr3, 0, 7);
                            bArr3[7] = 34;
                            long j2 = JDKUtils.UNSAFE.getLong(bArr3, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                            methodWriter.aload(1);
                            methodWriter.visitLdcInsn(j2);
                            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfValue4Match10", "(J)Z");
                            if (label5 != null) {
                                label = label5;
                            } else {
                                label = label2;
                            }
                            methodWriter.ifeq(label);
                            methodWriter.aload(0);
                            methodWriter.getfield(str, str2, ASMUtils.DESC_OBJECT_READER);
                            methodWriter.checkcast(ASMUtils.type(cls3));
                            methodWriter.visitLdcInsn(r18.ordinal());
                            methodWriter.invokevirtual(ASMUtils.type(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            methodWriter.goto_(label3);
                            if (label5 != null) {
                                methodWriter.visitLabel(label5);
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            labelArr = labelArr;
                            break;
                        case 11:
                            byte[] bArr4 = new byte[8];
                            System.arraycopy(bytes2, 3, bArr4, 0, 8);
                            labelArr = labelArr;
                            long j3 = JDKUtils.UNSAFE.getLong(bArr4, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                            methodWriter.aload(1);
                            methodWriter.visitLdcInsn(j3);
                            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfValue4Match11", "(J)Z");
                            if (label5 != null) {
                                label = label5;
                            } else {
                                label = label2;
                            }
                            methodWriter.ifeq(label);
                            methodWriter.aload(0);
                            methodWriter.getfield(str, str2, ASMUtils.DESC_OBJECT_READER);
                            methodWriter.checkcast(ASMUtils.type(cls3));
                            methodWriter.visitLdcInsn(r18.ordinal());
                            methodWriter.invokevirtual(ASMUtils.type(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            methodWriter.goto_(label3);
                            if (label5 != null) {
                                methodWriter.visitLabel(label5);
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            labelArr = labelArr;
                            break;
                        default:
                            throw new IllegalStateException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(length2, "fieldNameLength "));
                    }
                }
                methodWriter.goto_(label2);
                i10++;
                i4 = 0;
            }
        }
        boolean z3 = z;
        methodWriter.visitLabel(label2);
        methodWriter.aload(0);
        methodWriter.getfield(str, str2, ASMUtils.DESC_OBJECT_READER);
        methodWriter.aload(1);
        gwGetFieldType(str, methodWriter, i, type);
        methodWriter.visitLdcInsn(fieldReader.fieldName);
        methodWriter.visitLdcInsn(j);
        methodWriter.invokeinterface(ASMUtils.TYPE_OBJECT_READER, z3 ? "readJSONBObject" : "readObject", METHOD_DESC_READ_OBJECT);
        methodWriter.visitLabel(label3);
    }

    /* JADX WARN: Code duplicated, block: B:210:0x064d  */
    /* JADX WARN: Code duplicated, block: B:227:0x0688  */
    /* JADX WARN: Code duplicated, block: B:229:0x068b  */
    /* JADX WARN: Code duplicated, block: B:230:0x0698  */
    /* JADX WARN: Code duplicated, block: B:232:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:234:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:236:0x06af  */
    /* JADX WARN: Code duplicated, block: B:237:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:239:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:240:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:242:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:243:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:245:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:246:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:248:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:249:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:251:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:252:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:254:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:255:0x0705  */
    /* JADX WARN: Code duplicated, block: B:258:0x072f  */
    /* JADX WARN: Code duplicated, block: B:260:0x0747  */
    /* JADX WARN: Code duplicated, block: B:262:0x074d  */
    /* JADX WARN: Code duplicated, block: B:264:0x075c  */
    /* JADX WARN: Code duplicated, block: B:272:0x076b  */
    /* JADX WARN: Code duplicated, block: B:274:0x0771  */
    /* JADX WARN: Code duplicated, block: B:277:0x077a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:278:0x077c  */
    /* JADX WARN: Code duplicated, block: B:279:0x0782 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:280:0x0784  */
    /* JADX WARN: Code duplicated, block: B:281:0x078a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:282:0x078c  */
    /* JADX WARN: Code duplicated, block: B:283:0x0792 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:284:0x0794  */
    /* JADX WARN: Code duplicated, block: B:285:0x079c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:286:0x079e  */
    /* JADX WARN: Code duplicated, block: B:287:0x07a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:288:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:289:0x07ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:290:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:291:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:294:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:295:0x0813  */
    /* JADX WARN: Code duplicated, block: B:296:0x0822  */
    /* JADX WARN: Code duplicated, block: B:298:0x082e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:299:0x0830  */
    /* JADX WARN: Code duplicated, block: B:300:0x0834 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:301:0x0836  */
    /* JADX WARN: Code duplicated, block: B:302:0x083a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:303:0x083c  */
    /* JADX WARN: Code duplicated, block: B:304:0x0840 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:305:0x0842  */
    /* JADX WARN: Code duplicated, block: B:306:0x0846 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:307:0x0848  */
    /* JADX WARN: Code duplicated, block: B:308:0x084c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:309:0x084e  */
    /* JADX WARN: Code duplicated, block: B:310:0x0851 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:311:0x0853  */
    /* JADX WARN: Code duplicated, block: B:312:0x0856 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:313:0x0858  */
    /* JADX WARN: Code duplicated, block: B:314:0x085b  */
    /* JADX WARN: Code duplicated, block: B:316:0x085f  */
    /* JADX WARN: Code duplicated, block: B:317:0x0862  */
    /* JADX WARN: Code duplicated, block: B:319:0x0866  */
    /* JADX WARN: Code duplicated, block: B:320:0x0869  */
    /* JADX WARN: Code duplicated, block: B:322:0x086d  */
    /* JADX WARN: Code duplicated, block: B:323:0x0870  */
    /* JADX WARN: Code duplicated, block: B:325:0x0874  */
    /* JADX WARN: Code duplicated, block: B:326:0x0877  */
    /* JADX WARN: Code duplicated, block: B:328:0x087b  */
    /* JADX WARN: Code duplicated, block: B:329:0x087e  */
    /* JADX WARN: Code duplicated, block: B:331:0x0882  */
    /* JADX WARN: Code duplicated, block: B:332:0x0885  */
    /* JADX WARN: Code duplicated, block: B:334:0x0889  */
    /* JADX WARN: Code duplicated, block: B:335:0x088c  */
    /* JADX WARN: Code duplicated, block: B:337:0x0890  */
    /* JADX WARN: Code duplicated, block: B:338:0x0893  */
    /* JADX WARN: Code duplicated, block: B:340:0x0897  */
    /* JADX WARN: Code duplicated, block: B:341:0x089a  */
    /* JADX WARN: Code duplicated, block: B:343:0x089e  */
    /* JADX WARN: Code duplicated, block: B:344:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:346:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:349:0x08be  */
    private <T> void genReadFieldValue(ObjectReadContext objectReadContext, FieldReader fieldReader, boolean z, MethodWriterContext methodWriterContext, int i, int i2, boolean z2) {
        Class<Long> cls;
        boolean z3;
        Class<Long> cls2;
        Class<Long> cls3;
        boolean z4;
        FieldReader fieldReader2;
        int i3;
        Label label;
        String str;
        ObjectReadContext objectReadContext2;
        Class<Long> cls4;
        Class<Long> cls5;
        Class<Long> cls6;
        Class<Long> cls7;
        boolean z5;
        Label label2;
        Class<Long> cls8;
        Class<?> mapping;
        Class<?> cls9;
        Field field;
        String str2;
        Class<Long> cls10;
        Class<Long> cls11;
        Class<Long> cls12;
        Class<Long> cls13;
        Class<Long> cls14;
        Class<Long> cls15;
        Class<Long> cls16;
        Class<Long> cls17;
        Class<?> returnType;
        Class<?> cls18;
        String string;
        int iVar;
        String str3;
        int i4;
        BiConsumer function;
        boolean z6;
        int iVar2;
        String str4;
        String str5;
        int i5;
        String str6 = objectReadContext.classNameType;
        boolean z7 = methodWriterContext.jsonb;
        Class<?> cls19 = objectReadContext.objectClass;
        Class<Long> cls20 = fieldReader.fieldClass;
        Type type = fieldReader.fieldType;
        long j = fieldReader.features;
        String str7 = fieldReader.format;
        Type type2 = fieldReader.itemType;
        MethodWriter methodWriter = methodWriterContext.mw;
        if ((j & JSONReader.Feature.NullOnError.mask) != 0) {
            methodWriter.aload(0);
            methodWriter.getfield(str6, CodeGenUtils.fieldReader(i2), ASMUtils.DESC_FIELD_READER);
            methodWriter.aload(1);
            methodWriter.aload(i);
            methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_READE, "readFieldValue", METHOD_DESC_READ_FIELD_VALUE);
            return;
        }
        Field field2 = fieldReader.field;
        Method method = fieldReader.method;
        Label label3 = new Label();
        String strType = ASMUtils.type(cls20);
        String strDesc = ASMUtils.desc(cls20);
        if (!(objectReadContext.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor)) {
            methodWriter.aload(i);
        }
        int modifiers = ((z || method == null) && field2 != null) ? field2.getModifiers() : 0;
        if (z && Modifier.isPublic(cls19.getModifiers()) && Modifier.isPublic(modifiers) && !Modifier.isFinal(modifiers) && !this.classLoader.isExternalClass(cls19)) {
            methodWriter.checkcast(objectReadContext.objectType);
        }
        Class<Long> cls21 = Long.class;
        Class<Integer> cls22 = Integer.class;
        Field field3 = field2;
        Class<Boolean> cls23 = Boolean.class;
        String str8 = strDesc;
        Class<String> cls24 = String.class;
        Class<Long> cls25 = Character.TYPE;
        Label label4 = label3;
        Class<Long> cls26 = Double.TYPE;
        String str9 = str6;
        Class<Long> cls27 = Float.TYPE;
        Class<Long> cls28 = Long.TYPE;
        Class<?> cls29 = cls19;
        Class<Long> cls30 = Integer.TYPE;
        Class<Long> cls31 = Short.TYPE;
        Class<Long> cls32 = Byte.TYPE;
        Class<Long> cls33 = Boolean.TYPE;
        if (cls20 == cls33) {
            methodWriter.aload(1);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readBoolValue", "()Z");
            cls6 = cls27;
            cls5 = cls32;
            cls7 = cls28;
            cls4 = cls33;
            z5 = true;
        } else {
            if (cls20 == cls32) {
                cls = cls32;
                z3 = true;
                methodWriter.aload(1);
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readInt32Value", "()I");
            } else {
                cls = cls32;
                z3 = true;
                if (cls20 == cls31 || cls20 == cls30) {
                    methodWriter.aload(1);
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readInt32Value", "()I");
                } else if (cls20 == cls28) {
                    methodWriter.aload(1);
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readInt64Value", "()J");
                } else if (cls20 == cls27) {
                    methodWriter.aload(1);
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readFloatValue", "()F");
                } else {
                    if (cls20 != cls26) {
                        if (cls20 == cls25) {
                            methodWriter.aload(1);
                            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readCharValue", "()C");
                        } else {
                            if (cls20 == cls24) {
                                methodWriter.aload(1);
                                Label label5 = new Label();
                                cls2 = cls27;
                                cls3 = cls28;
                                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readString", "()Ljava/lang/String;");
                                methodWriter.dup();
                                methodWriter.ifnull(label5);
                                if ("trim".equals(str7)) {
                                    methodWriter.invokevirtual("java/lang/String", "trim", "()Ljava/lang/String;");
                                } else if ("upper".equals(str7)) {
                                    methodWriter.invokevirtual("java/lang/String", "toUpperCase", "()Ljava/lang/String;");
                                }
                                methodWriter.visitLabel(label5);
                                fieldReader = fieldReader;
                            } else {
                                cls2 = cls27;
                                cls3 = cls28;
                                if (cls20 == cls23) {
                                    z4 = true;
                                    methodWriter.aload(1);
                                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readBool", "()Ljava/lang/Boolean;");
                                } else {
                                    z4 = true;
                                    if (cls20 == Byte.class) {
                                        methodWriter.aload(1);
                                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readInt8", "()Ljava/lang/Byte;");
                                    } else if (cls20 == Short.class) {
                                        methodWriter.aload(1);
                                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readInt16", "()Ljava/lang/Short;");
                                    } else if (cls20 == cls22) {
                                        methodWriter.aload(1);
                                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readInt32", "()Ljava/lang/Integer;");
                                    } else if (cls20 == cls21) {
                                        methodWriter.aload(1);
                                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readInt64", "()Ljava/lang/Long;");
                                    } else if (cls20 == Float.class) {
                                        methodWriter.aload(1);
                                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readFloat", "()Ljava/lang/Float;");
                                    } else if (cls20 == Double.class) {
                                        methodWriter.aload(1);
                                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readDouble", "()Ljava/lang/Double;");
                                    } else if (cls20 == BigDecimal.class) {
                                        methodWriter.aload(1);
                                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readBigDecimal", "()Ljava/math/BigDecimal;");
                                    } else if (cls20 == BigInteger.class) {
                                        methodWriter.aload(1);
                                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readBigInteger", "()Ljava/math/BigInteger;");
                                    } else if (cls20 == Number.class) {
                                        methodWriter.aload(1);
                                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readNumber", "()Ljava/lang/Number;");
                                    } else if (cls20 == UUID.class) {
                                        methodWriter.aload(1);
                                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readUUID", "()Ljava/util/UUID;");
                                    } else {
                                        if (cls20 == LocalDate.class) {
                                            fieldReader2 = fieldReader;
                                            if (fieldReader2.format == null) {
                                                methodWriter.aload(1);
                                                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readLocalDate", "()Ljava/time/LocalDate;");
                                            }
                                            fieldReader = fieldReader2;
                                        } else {
                                            fieldReader2 = fieldReader;
                                        }
                                        if (cls20 == OffsetDateTime.class && fieldReader2.format == null) {
                                            methodWriter.aload(1);
                                            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readOffsetDateTime", "()Ljava/time/OffsetDateTime;");
                                        } else if (cls20 == Date.class && fieldReader2.format == null) {
                                            methodWriter.aload(1);
                                            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readDate", "()Ljava/util/Date;");
                                        } else if (cls20 == Calendar.class && fieldReader2.format == null) {
                                            methodWriter.aload(1);
                                            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readCalendar", "()Ljava/util/Calendar;");
                                        } else {
                                            Label label6 = new Label();
                                            boolean zDisableReferenceDetect = objectReadContext.disableReferenceDetect();
                                            Integer numValueOf = !zDisableReferenceDetect ? Integer.valueOf(methodWriterContext.var("REFERENCE")) : null;
                                            if (zDisableReferenceDetect || ObjectWriterProvider.isPrimitiveOrEnum(cls20)) {
                                                i3 = i;
                                                label = label4;
                                                str = "()Z";
                                                objectReadContext2 = objectReadContext;
                                            } else {
                                                Label label7 = new Label();
                                                Label label8 = new Label();
                                                methodWriter.aload(1);
                                                String str10 = ASMUtils.TYPE_JSON_READER;
                                                Integer num = numValueOf;
                                                str = "()Z";
                                                methodWriter.invokevirtual(str10, "isReference", str);
                                                methodWriter.ifeq(label7);
                                                methodWriter.aload(1);
                                                methodWriter.invokevirtual(str10, "readReference", "()Ljava/lang/String;");
                                                objectReadContext2 = objectReadContext;
                                                Class<?> cls34 = objectReadContext2.objectClass;
                                                if (cls34 == null || cls20.isAssignableFrom(cls34)) {
                                                    methodWriter.dup();
                                                    methodWriter.astore(num.intValue());
                                                    methodWriter.visitLdcInsn("..");
                                                    methodWriter.invokevirtual("java/lang/String", "equals", "(Ljava/lang/Object;)Z");
                                                    methodWriter.ifeq(label8);
                                                    if (cls29 != null) {
                                                        cls9 = cls29;
                                                        if (cls20.isAssignableFrom(cls9)) {
                                                            i3 = i;
                                                            methodWriter.aload(i3);
                                                            methodWriter.goto_(label6);
                                                        } else {
                                                            i3 = i;
                                                        }
                                                    } else {
                                                        i3 = i;
                                                        cls9 = cls29;
                                                    }
                                                    methodWriter.visitLabel(label8);
                                                } else {
                                                    methodWriter.astore(num.intValue());
                                                    i3 = i;
                                                    cls9 = cls29;
                                                }
                                                methodWriter.aload(0);
                                                cls29 = cls9;
                                                methodWriter.getfield(str9, CodeGenUtils.fieldReader(i2), ASMUtils.DESC_FIELD_READER);
                                                methodWriter.aload(1);
                                                methodWriter.aload(i3);
                                                methodWriter.aload(num.intValue());
                                                methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_READE, "addResolveTask", METHOD_DESC_ADD_RESOLVE_TASK);
                                                methodWriter.pop();
                                                label = label4;
                                                methodWriter.goto_(label);
                                                methodWriter.visitLabel(label7);
                                            }
                                            if (!fieldReader2.fieldClassSerializable) {
                                                Label label9 = new Label();
                                                methodWriter.lload(4);
                                                methodWriter.visitLdcInsn(JSONReader.Feature.IgnoreNoneSerializable.mask);
                                                methodWriter.land();
                                                methodWriter.lconst_0();
                                                methodWriter.lcmp();
                                                methodWriter.ifeq(label9);
                                                methodWriter.aload(1);
                                                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "skipValue", "()V");
                                                if (!(objectReadContext2.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor)) {
                                                    methodWriter.pop();
                                                }
                                                methodWriter.goto_(label);
                                                methodWriter.visitLabel(label9);
                                            }
                                            boolean z8 = List.class.isAssignableFrom(cls20) && fieldReader.getInitReader() == null && !cls20.getName().startsWith("com.google.common.collect.Immutable");
                                            if (z8 && (mapping = TypeUtils.getMapping(type2)) != null && (Collection.class.isAssignableFrom(mapping) || !Modifier.isPublic(mapping.getModifiers()))) {
                                                z8 = false;
                                            }
                                            if (z8 && !cls20.isInterface() && !BeanUtils.hasPublicDefaultConstructor(cls20)) {
                                                z8 = false;
                                            }
                                            if (z8) {
                                                fieldReader = fieldReader;
                                                methodWriterContext = methodWriterContext;
                                                label4 = label;
                                                cls23 = cls23;
                                                cls26 = cls26;
                                                cls24 = cls24;
                                                cls31 = cls31;
                                                cls25 = cls25;
                                                field3 = field3;
                                                str8 = str8;
                                                str9 = str9;
                                                Class<?> cls35 = cls29;
                                                cls4 = cls33;
                                                cls5 = cls;
                                                cls6 = cls2;
                                                cls7 = cls3;
                                                cls22 = cls22;
                                                cls21 = cls21;
                                                cls30 = cls30;
                                                this = this;
                                                objectReadContext = objectReadContext2;
                                                this.genReadFieldValueList(fieldReader, str9, methodWriterContext, i3, i2, z2, cls35, cls20, type, j, type2, strType, objectReadContext, z);
                                                cls29 = cls35;
                                                cls8 = cls20;
                                                methodWriter = methodWriter;
                                                label2 = label6;
                                                z5 = true;
                                            } else {
                                                label4 = label;
                                                cls23 = cls23;
                                                cls26 = cls26;
                                                cls24 = cls24;
                                                cls31 = cls31;
                                                cls25 = cls25;
                                                field3 = field3;
                                                str8 = str8;
                                                str9 = str9;
                                                cls29 = cls29;
                                                cls4 = cls33;
                                                cls5 = cls;
                                                cls6 = cls2;
                                                cls7 = cls3;
                                                cls22 = cls22;
                                                cls21 = cls21;
                                                cls30 = cls30;
                                                objectReadContext = objectReadContext2;
                                                int i6 = i3;
                                                String strFieldObjectReader = fieldObjectReader(i2);
                                                Label label10 = new Label();
                                                methodWriter = methodWriter;
                                                z5 = true;
                                                methodWriter.aload(1);
                                                String str11 = ASMUtils.TYPE_JSON_READER;
                                                methodWriter.invokevirtual(str11, "nextIfNull", str);
                                                methodWriter.ifeq(label10);
                                                if (cls20 == Optional.class) {
                                                    methodWriter.invokestatic("java/util/Optional", "empty", "()Ljava/util/Optional;");
                                                } else if (cls20 == OptionalInt.class) {
                                                    methodWriter.invokestatic("java/util/OptionalInt", "empty", "()Ljava/util/OptionalInt;");
                                                } else if (cls20 == OptionalLong.class) {
                                                    methodWriter.invokestatic("java/util/OptionalLong", "empty", "()Ljava/util/OptionalLong;");
                                                } else if (cls20 == OptionalDouble.class) {
                                                    methodWriter.invokestatic("java/util/OptionalDouble", "empty", "()Ljava/util/OptionalDouble;");
                                                } else {
                                                    methodWriter.aconst_null();
                                                }
                                                label2 = label6;
                                                methodWriter.goto_(label2);
                                                methodWriter.visitLabel(label10);
                                                if (cls20 == String[].class) {
                                                    methodWriter.aload(1);
                                                    methodWriter.invokevirtual(str11, "readStringArray", "()[Ljava/lang/String;");
                                                } else if (cls20 == int[].class) {
                                                    methodWriter.aload(1);
                                                    methodWriter.invokevirtual(str11, "readInt32ValueArray", "()[I");
                                                } else if (cls20 == long[].class) {
                                                    methodWriter.aload(1);
                                                    methodWriter.invokevirtual(str11, "readInt64ValueArray", "()[J");
                                                } else {
                                                    if (Enum.class.isAssignableFrom(cls20) && (!z7)) {
                                                        this = this;
                                                        fieldReader = fieldReader;
                                                        methodWriterContext = methodWriterContext;
                                                        this.genReadEnumValueRaw(fieldReader, str9, methodWriterContext, i2, type, cls20, j, strFieldObjectReader);
                                                        cls8 = cls20;
                                                    } else {
                                                        cls8 = cls20;
                                                        this = this;
                                                        fieldReader = fieldReader;
                                                        methodWriterContext = methodWriterContext;
                                                        this.genReadObject(fieldReader, str9, methodWriterContext, i2, type, j, strFieldObjectReader);
                                                    }
                                                    if (method != null || ((cls29 == null || Modifier.isPublic(cls29.getModifiers())) && Modifier.isPublic(modifiers) && !Modifier.isFinal(modifiers) && !this.classLoader.isExternalClass(cls29))) {
                                                        methodWriter.checkcast(strType);
                                                    }
                                                    if (fieldReader.noneStaticMemberClass) {
                                                        try {
                                                            long jObjectFieldOffset = JDKUtils.UNSAFE.objectFieldOffset(cls8.getDeclaredField("this$0"));
                                                            Label label11 = new Label();
                                                            methodWriter.dup();
                                                            methodWriter.ifnull(label11);
                                                            methodWriter.dup();
                                                            methodWriter.getstatic(ASMUtils.TYPE_UNSAFE_UTILS, "UNSAFE", "Lsun/misc/Unsafe;");
                                                            methodWriter.swap();
                                                            methodWriter.visitLdcInsn(jObjectFieldOffset);
                                                            methodWriter.aload(i6);
                                                            methodWriter.invokevirtual("sun/misc/Unsafe", "putObject", "(Ljava/lang/Object;JLjava/lang/Object;)V");
                                                            methodWriter.visitLabel(label11);
                                                        } catch (NoSuchFieldException unused) {
                                                        }
                                                    }
                                                }
                                                this = this;
                                                fieldReader = fieldReader;
                                                cls8 = cls20;
                                                z5 = true;
                                                label2 = label2;
                                                methodWriterContext = methodWriterContext;
                                            }
                                            methodWriter.visitLabel(label2);
                                        }
                                        fieldReader = fieldReader2;
                                    }
                                }
                                z5 = z4;
                                cls4 = cls33;
                                cls5 = cls;
                                cls6 = cls2;
                                cls7 = cls3;
                            }
                            cls21 = cls21;
                            cls30 = cls30;
                            cls23 = cls23;
                            cls26 = cls26;
                            cls24 = cls24;
                            methodWriter = methodWriter;
                            cls31 = cls31;
                            cls25 = cls25;
                            field3 = field3;
                            str8 = str8;
                            label4 = label4;
                            str9 = str9;
                            cls29 = cls29;
                            cls4 = cls33;
                            cls5 = cls;
                            cls6 = cls2;
                            cls7 = cls3;
                            z5 = true;
                            cls8 = cls20;
                        }
                        field = field3;
                        if (field != null) {
                            String name = cls8.getName();
                            if ((cls29.getModifiers() & 1) == 0 && (modifiers & 1) != 0 && (modifiers & 16) == 0 && ((ObjectWriterProvider.isPrimitiveOrEnum(cls8) || name.startsWith("java.") || cls8.getClassLoader() == ObjectReaderProvider.FASTJSON2_CLASS_LOADER) && !this.classLoader.isExternalClass(cls29) && field.getDeclaringClass() == cls29)) {
                                z6 = z5;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                methodWriter.putfield(objectReadContext.objectType, field.getName(), str8);
                            } else {
                                iVar2 = methodWriterContext.var(cls8);
                                if (cls8 == cls30) {
                                    methodWriter.istore(iVar2);
                                    str4 = "putInt";
                                    str5 = "(Ljava/lang/Object;JI)V";
                                } else {
                                    if (cls8 == cls7) {
                                        methodWriter.lstore(iVar2);
                                        str4 = "putLong";
                                        str5 = "(Ljava/lang/Object;JJ)V";
                                        i5 = 22;
                                    } else if (cls8 == cls6) {
                                        methodWriter.fstore(iVar2);
                                        str4 = "putFloat";
                                        str5 = "(Ljava/lang/Object;JF)V";
                                        i5 = 23;
                                    } else if (cls8 == cls26) {
                                        methodWriter.dstore(iVar2);
                                        str4 = "putDouble";
                                        str5 = "(Ljava/lang/Object;JD)V";
                                        i5 = 24;
                                    } else if (cls8 == cls25) {
                                        methodWriter.istore(iVar2);
                                        str4 = "putChar";
                                        str5 = "(Ljava/lang/Object;JC)V";
                                    } else if (cls8 == cls5) {
                                        methodWriter.istore(iVar2);
                                        str4 = "putByte";
                                        str5 = "(Ljava/lang/Object;JB)V";
                                    } else if (cls8 == cls31) {
                                        methodWriter.istore(iVar2);
                                        str4 = "putShort";
                                        str5 = "(Ljava/lang/Object;JS)V";
                                    } else if (cls8 == cls4) {
                                        methodWriter.istore(iVar2);
                                        str4 = "putBoolean";
                                        str5 = "(Ljava/lang/Object;JZ)V";
                                    } else {
                                        methodWriter.astore(iVar2);
                                        str4 = "putObject";
                                        str5 = "(Ljava/lang/Object;JLjava/lang/Object;)V";
                                        i5 = 25;
                                    }
                                    methodWriter.getstatic(ASMUtils.TYPE_UNSAFE_UTILS, "UNSAFE", "Lsun/misc/Unsafe;");
                                    methodWriter.swap();
                                    methodWriter.visitLdcInsn(JDKUtils.UNSAFE.objectFieldOffset(field));
                                    methodWriter.visitVarInsn(i5, iVar2);
                                    methodWriter.invokevirtual("sun/misc/Unsafe", str4, str5);
                                }
                                i5 = 21;
                                methodWriter.getstatic(ASMUtils.TYPE_UNSAFE_UTILS, "UNSAFE", "Lsun/misc/Unsafe;");
                                methodWriter.swap();
                                methodWriter.visitLdcInsn(JDKUtils.UNSAFE.objectFieldOffset(field));
                                methodWriter.visitVarInsn(i5, iVar2);
                                methodWriter.invokevirtual("sun/misc/Unsafe", str4, str5);
                            }
                        } else {
                            str2 = str8;
                            cls10 = cls25;
                            cls11 = cls26;
                            cls12 = cls6;
                            cls13 = cls7;
                            cls14 = cls30;
                            cls15 = cls31;
                            cls16 = cls5;
                            cls17 = cls4;
                            if (objectReadContext.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor) {
                                if (!cls8.isPrimitive()) {
                                    methodWriter.checkcast(ASMUtils.type(cls8));
                                }
                                methodWriter.storeLocal(cls8, methodWriterContext.var(fieldReader));
                            } else {
                                if (!objectReadContext.externalClass && method != null && objectReadContext.publicClass) {
                                    z5 = false;
                                }
                                if (z5) {
                                    iVar = methodWriterContext.var(cls8);
                                    if (cls8 == cls17) {
                                        methodWriter.istore(iVar);
                                        str3 = "(Ljava/lang/Object;Z)V";
                                    } else if (cls8 == cls16) {
                                        methodWriter.istore(iVar);
                                        str3 = "(Ljava/lang/Object;B)V";
                                    } else if (cls8 == cls15) {
                                        methodWriter.istore(iVar);
                                        str3 = "(Ljava/lang/Object;S)V";
                                    } else if (cls8 == cls14) {
                                        methodWriter.istore(iVar);
                                        str3 = "(Ljava/lang/Object;I)V";
                                    } else {
                                        if (cls8 == cls13) {
                                            methodWriter.lstore(iVar);
                                            str3 = "(Ljava/lang/Object;J)V";
                                            i4 = 22;
                                        } else if (cls8 == cls10) {
                                            methodWriter.istore(iVar);
                                            str3 = "(Ljava/lang/Object;C)V";
                                        } else if (cls8 == cls12) {
                                            methodWriter.fstore(iVar);
                                            str3 = "(Ljava/lang/Object;F)V";
                                            i4 = 23;
                                        } else if (cls8 == cls11) {
                                            methodWriter.dstore(iVar);
                                            str3 = "(Ljava/lang/Object;D)V";
                                            i4 = 24;
                                        } else {
                                            methodWriter.astore(iVar);
                                            str3 = "(Ljava/lang/Object;Ljava/lang/Object;)V";
                                            i4 = 25;
                                        }
                                        methodWriter.aload(0);
                                        methodWriter.getfield(str9, CodeGenUtils.fieldReader(i2), ASMUtils.DESC_FIELD_READER);
                                        function = fieldReader.getFunction();
                                        if (function instanceof FieldBiConsumer) {
                                            methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_READE, "getFunction", "()Ljava/util/function/BiConsumer;");
                                            methodWriter.checkcast(ASMUtils.type(FieldBiConsumer.class));
                                            methodWriter.getfield(ASMUtils.type(FieldBiConsumer.class), "consumer", ASMUtils.desc(FieldConsumer.class));
                                            methodWriter.swap();
                                            methodWriter.visitLdcInsn(((FieldBiConsumer) function).fieldIndex);
                                            methodWriter.visitVarInsn(i4, iVar);
                                            methodWriter.invokeinterface(ASMUtils.type(FieldConsumer.class), "accept", "(Ljava/lang/Object;ILjava/lang/Object;)V");
                                        } else {
                                            methodWriter.swap();
                                            methodWriter.visitVarInsn(i4, iVar);
                                            methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_READE, "accept", str3);
                                        }
                                    }
                                    i4 = 21;
                                    methodWriter.aload(0);
                                    methodWriter.getfield(str9, CodeGenUtils.fieldReader(i2), ASMUtils.DESC_FIELD_READER);
                                    function = fieldReader.getFunction();
                                    if (function instanceof FieldBiConsumer) {
                                        methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_READE, "getFunction", "()Ljava/util/function/BiConsumer;");
                                        methodWriter.checkcast(ASMUtils.type(FieldBiConsumer.class));
                                        methodWriter.getfield(ASMUtils.type(FieldBiConsumer.class), "consumer", ASMUtils.desc(FieldConsumer.class));
                                        methodWriter.swap();
                                        methodWriter.visitLdcInsn(((FieldBiConsumer) function).fieldIndex);
                                        methodWriter.visitVarInsn(i4, iVar);
                                        methodWriter.invokeinterface(ASMUtils.type(FieldConsumer.class), "accept", "(Ljava/lang/Object;ILjava/lang/Object;)V");
                                    } else {
                                        methodWriter.swap();
                                        methodWriter.visitVarInsn(i4, iVar);
                                        methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_READE, "accept", str3);
                                    }
                                } else {
                                    returnType = method.getReturnType();
                                    String name2 = method.getName();
                                    cls18 = Void.TYPE;
                                    if (returnType != cls18) {
                                        string = null;
                                    } else if (cls8 == cls17) {
                                        string = "(Z)V";
                                    } else if (cls8 == cls16) {
                                        string = "(B)V";
                                    } else if (cls8 == cls15) {
                                        string = "(S)V";
                                    } else if (cls8 == cls14) {
                                        string = "(I)V";
                                    } else if (cls8 == cls13) {
                                        string = "(J)V";
                                    } else if (cls8 == cls10) {
                                        string = "(C)V";
                                    } else if (cls8 == cls12) {
                                        string = "(F)V";
                                    } else if (cls8 == cls11) {
                                        string = "(D)V";
                                    } else if (cls8 == cls23) {
                                        string = "(Ljava/lang/Boolean;)V";
                                    } else if (cls8 == cls22) {
                                        string = "(Ljava/lang/Integer;)V";
                                    } else if (cls8 == cls21) {
                                        string = "(Ljava/lang/Long;)V";
                                    } else if (cls8 == Float.class) {
                                        string = "(Ljava/lang/Float;)V";
                                    } else if (cls8 == Double.class) {
                                        string = "(Ljava/lang/Double;)V";
                                    } else if (cls8 == BigDecimal.class) {
                                        string = "(Ljava/math/BigDecimal;)V";
                                    } else if (cls8 == cls24) {
                                        string = "(Ljava/lang/String;)V";
                                    } else if (cls8 == UUID.class) {
                                        string = "(Ljava/util/UUID;)V";
                                    } else if (cls8 == List.class) {
                                        string = "(Ljava/util/List;)V";
                                    } else if (cls8 == Map.class) {
                                        string = "(Ljava/util/Map;)V";
                                    } else {
                                        string = null;
                                    }
                                    if (string == null) {
                                        StringBuilder sbM2419Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2419Ujhhgtgfeyxiexzf("(", str2, ")");
                                        sbM2419Ujhhgtgfeyxiexzf.append(ASMUtils.desc(returnType));
                                        string = sbM2419Ujhhgtgfeyxiexzf.toString();
                                    }
                                    methodWriter.invokevirtual(objectReadContext.objectType, name2, string);
                                    if (returnType != cls18) {
                                        methodWriter.pop();
                                    }
                                }
                            }
                        }
                        methodWriter.visitLabel(label4);
                    }
                    methodWriter.aload(1);
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readDoubleValue", "()D");
                }
            }
            cls6 = cls27;
            z5 = z3;
            cls7 = cls28;
            cls4 = cls33;
            cls5 = cls;
        }
        methodWriterContext = methodWriterContext;
        cls8 = cls20;
        field = field3;
        if (field != null) {
            String name3 = cls8.getName();
            if ((cls29.getModifiers() & 1) == 0) {
                z6 = false;
            } else {
                z6 = false;
            }
            if (z6) {
                methodWriter.putfield(objectReadContext.objectType, field.getName(), str8);
            } else {
                iVar2 = methodWriterContext.var(cls8);
                if (cls8 == cls30) {
                    methodWriter.istore(iVar2);
                    str4 = "putInt";
                    str5 = "(Ljava/lang/Object;JI)V";
                } else {
                    if (cls8 == cls7) {
                        methodWriter.lstore(iVar2);
                        str4 = "putLong";
                        str5 = "(Ljava/lang/Object;JJ)V";
                        i5 = 22;
                    } else if (cls8 == cls6) {
                        methodWriter.fstore(iVar2);
                        str4 = "putFloat";
                        str5 = "(Ljava/lang/Object;JF)V";
                        i5 = 23;
                    } else if (cls8 == cls26) {
                        methodWriter.dstore(iVar2);
                        str4 = "putDouble";
                        str5 = "(Ljava/lang/Object;JD)V";
                        i5 = 24;
                    } else if (cls8 == cls25) {
                        methodWriter.istore(iVar2);
                        str4 = "putChar";
                        str5 = "(Ljava/lang/Object;JC)V";
                    } else if (cls8 == cls5) {
                        methodWriter.istore(iVar2);
                        str4 = "putByte";
                        str5 = "(Ljava/lang/Object;JB)V";
                    } else if (cls8 == cls31) {
                        methodWriter.istore(iVar2);
                        str4 = "putShort";
                        str5 = "(Ljava/lang/Object;JS)V";
                    } else if (cls8 == cls4) {
                        methodWriter.istore(iVar2);
                        str4 = "putBoolean";
                        str5 = "(Ljava/lang/Object;JZ)V";
                    } else {
                        methodWriter.astore(iVar2);
                        str4 = "putObject";
                        str5 = "(Ljava/lang/Object;JLjava/lang/Object;)V";
                        i5 = 25;
                    }
                    methodWriter.getstatic(ASMUtils.TYPE_UNSAFE_UTILS, "UNSAFE", "Lsun/misc/Unsafe;");
                    methodWriter.swap();
                    methodWriter.visitLdcInsn(JDKUtils.UNSAFE.objectFieldOffset(field));
                    methodWriter.visitVarInsn(i5, iVar2);
                    methodWriter.invokevirtual("sun/misc/Unsafe", str4, str5);
                }
                i5 = 21;
                methodWriter.getstatic(ASMUtils.TYPE_UNSAFE_UTILS, "UNSAFE", "Lsun/misc/Unsafe;");
                methodWriter.swap();
                methodWriter.visitLdcInsn(JDKUtils.UNSAFE.objectFieldOffset(field));
                methodWriter.visitVarInsn(i5, iVar2);
                methodWriter.invokevirtual("sun/misc/Unsafe", str4, str5);
            }
        } else {
            str2 = str8;
            cls10 = cls25;
            cls11 = cls26;
            cls12 = cls6;
            cls13 = cls7;
            cls14 = cls30;
            cls15 = cls31;
            cls16 = cls5;
            cls17 = cls4;
            if (objectReadContext.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor) {
                if (!cls8.isPrimitive()) {
                    methodWriter.checkcast(ASMUtils.type(cls8));
                }
                methodWriter.storeLocal(cls8, methodWriterContext.var(fieldReader));
            } else {
                if (!objectReadContext.externalClass) {
                    z5 = false;
                }
                if (z5) {
                    iVar = methodWriterContext.var(cls8);
                    if (cls8 == cls17) {
                        methodWriter.istore(iVar);
                        str3 = "(Ljava/lang/Object;Z)V";
                    } else if (cls8 == cls16) {
                        methodWriter.istore(iVar);
                        str3 = "(Ljava/lang/Object;B)V";
                    } else if (cls8 == cls15) {
                        methodWriter.istore(iVar);
                        str3 = "(Ljava/lang/Object;S)V";
                    } else if (cls8 == cls14) {
                        methodWriter.istore(iVar);
                        str3 = "(Ljava/lang/Object;I)V";
                    } else {
                        if (cls8 == cls13) {
                            methodWriter.lstore(iVar);
                            str3 = "(Ljava/lang/Object;J)V";
                            i4 = 22;
                        } else if (cls8 == cls10) {
                            methodWriter.istore(iVar);
                            str3 = "(Ljava/lang/Object;C)V";
                        } else if (cls8 == cls12) {
                            methodWriter.fstore(iVar);
                            str3 = "(Ljava/lang/Object;F)V";
                            i4 = 23;
                        } else if (cls8 == cls11) {
                            methodWriter.dstore(iVar);
                            str3 = "(Ljava/lang/Object;D)V";
                            i4 = 24;
                        } else {
                            methodWriter.astore(iVar);
                            str3 = "(Ljava/lang/Object;Ljava/lang/Object;)V";
                            i4 = 25;
                        }
                        methodWriter.aload(0);
                        methodWriter.getfield(str9, CodeGenUtils.fieldReader(i2), ASMUtils.DESC_FIELD_READER);
                        function = fieldReader.getFunction();
                        if (function instanceof FieldBiConsumer) {
                            methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_READE, "getFunction", "()Ljava/util/function/BiConsumer;");
                            methodWriter.checkcast(ASMUtils.type(FieldBiConsumer.class));
                            methodWriter.getfield(ASMUtils.type(FieldBiConsumer.class), "consumer", ASMUtils.desc(FieldConsumer.class));
                            methodWriter.swap();
                            methodWriter.visitLdcInsn(((FieldBiConsumer) function).fieldIndex);
                            methodWriter.visitVarInsn(i4, iVar);
                            methodWriter.invokeinterface(ASMUtils.type(FieldConsumer.class), "accept", "(Ljava/lang/Object;ILjava/lang/Object;)V");
                        } else {
                            methodWriter.swap();
                            methodWriter.visitVarInsn(i4, iVar);
                            methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_READE, "accept", str3);
                        }
                    }
                    i4 = 21;
                    methodWriter.aload(0);
                    methodWriter.getfield(str9, CodeGenUtils.fieldReader(i2), ASMUtils.DESC_FIELD_READER);
                    function = fieldReader.getFunction();
                    if (function instanceof FieldBiConsumer) {
                        methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_READE, "getFunction", "()Ljava/util/function/BiConsumer;");
                        methodWriter.checkcast(ASMUtils.type(FieldBiConsumer.class));
                        methodWriter.getfield(ASMUtils.type(FieldBiConsumer.class), "consumer", ASMUtils.desc(FieldConsumer.class));
                        methodWriter.swap();
                        methodWriter.visitLdcInsn(((FieldBiConsumer) function).fieldIndex);
                        methodWriter.visitVarInsn(i4, iVar);
                        methodWriter.invokeinterface(ASMUtils.type(FieldConsumer.class), "accept", "(Ljava/lang/Object;ILjava/lang/Object;)V");
                    } else {
                        methodWriter.swap();
                        methodWriter.visitVarInsn(i4, iVar);
                        methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_READE, "accept", str3);
                    }
                } else {
                    returnType = method.getReturnType();
                    String name4 = method.getName();
                    cls18 = Void.TYPE;
                    if (returnType != cls18) {
                        string = null;
                    } else if (cls8 == cls17) {
                        string = "(Z)V";
                    } else if (cls8 == cls16) {
                        string = "(B)V";
                    } else if (cls8 == cls15) {
                        string = "(S)V";
                    } else if (cls8 == cls14) {
                        string = "(I)V";
                    } else if (cls8 == cls13) {
                        string = "(J)V";
                    } else if (cls8 == cls10) {
                        string = "(C)V";
                    } else if (cls8 == cls12) {
                        string = "(F)V";
                    } else if (cls8 == cls11) {
                        string = "(D)V";
                    } else if (cls8 == cls23) {
                        string = "(Ljava/lang/Boolean;)V";
                    } else if (cls8 == cls22) {
                        string = "(Ljava/lang/Integer;)V";
                    } else if (cls8 == cls21) {
                        string = "(Ljava/lang/Long;)V";
                    } else if (cls8 == Float.class) {
                        string = "(Ljava/lang/Float;)V";
                    } else if (cls8 == Double.class) {
                        string = "(Ljava/lang/Double;)V";
                    } else if (cls8 == BigDecimal.class) {
                        string = "(Ljava/math/BigDecimal;)V";
                    } else if (cls8 == cls24) {
                        string = "(Ljava/lang/String;)V";
                    } else if (cls8 == UUID.class) {
                        string = "(Ljava/util/UUID;)V";
                    } else if (cls8 == List.class) {
                        string = "(Ljava/util/List;)V";
                    } else if (cls8 == Map.class) {
                        string = "(Ljava/util/Map;)V";
                    } else {
                        string = null;
                    }
                    if (string == null) {
                        StringBuilder sbM2419Ujhhgtgfeyxiexzf2 = AbstractC0924feyxiexzfUjhhgtg.m2419Ujhhgtgfeyxiexzf("(", str2, ")");
                        sbM2419Ujhhgtgfeyxiexzf2.append(ASMUtils.desc(returnType));
                        string = sbM2419Ujhhgtgfeyxiexzf2.toString();
                    }
                    methodWriter.invokevirtual(objectReadContext.objectType, name4, string);
                    if (returnType != cls18) {
                        methodWriter.pop();
                    }
                }
            }
        }
        methodWriter.visitLabel(label4);
    }

    private void genReadFieldValueList(FieldReader fieldReader, String str, MethodWriterContext methodWriterContext, int i, int i2, boolean z, Class cls, Class cls2, Type type, long j, Type type2, String str2, ObjectReadContext objectReadContext, boolean z2) {
        Class cls3;
        int iVar;
        String str3;
        int i3;
        String str4;
        Type type3;
        String str5;
        int i4;
        ObjectReaderCreatorASM objectReaderCreatorASM;
        FieldReader fieldReader2;
        int i5;
        Type type4;
        Label label;
        Field field;
        boolean z3 = methodWriterContext.jsonb;
        Type type5 = type2 == null ? Object.class : type2;
        Class<?> mapping = TypeUtils.getMapping(type5);
        String strFieldItemObjectReader = fieldItemObjectReader(i2);
        MethodWriter methodWriter = methodWriterContext.mw;
        if (objectReadContext.objectReaderAdapter instanceof ObjectReaderNoneDefaultConstructor) {
            iVar = methodWriterContext.var(fieldReader);
            cls3 = cls2;
        } else {
            cls3 = cls2;
            iVar = methodWriterContext.var(cls3);
        }
        int iVar2 = methodWriterContext.var(ObjectReader.class);
        String str6 = cls3.isInterface() ? "java/util/ArrayList" : str2;
        Label label2 = new Label();
        Label label3 = new Label();
        Type type6 = type5;
        Label label4 = new Label();
        boolean z4 = JDKUtils.JVM_VERSION == 8 && "java/util/ArrayList".equals(str6);
        int iVar3 = methodWriterContext.var("ITEM_CNT");
        boolean z5 = z4;
        String str7 = "java/util/List";
        String str8 = "(Ljava/lang/Object;)Z";
        String str9 = "add";
        Class<?> cls4 = String.class;
        if (z3) {
            if (!objectReadContext.disableAutoType()) {
                Label label5 = new Label();
                methodWriter.aload(0);
                methodWriter.getfield(str, CodeGenUtils.fieldReader(i2), ASMUtils.DESC_FIELD_READER);
                methodWriter.aload(1);
                methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_READE, "checkObjectAutoType", METHOD_DESC_CHECK_ARRAY_AUTO_TYPE);
                methodWriter.dup();
                methodWriter.astore(iVar2);
                methodWriter.ifnull(label5);
                methodWriter.aload(iVar2);
                methodWriter.aload(1);
                gwGetFieldType(str, methodWriter, i2, type);
                methodWriter.visitLdcInsn(fieldReader.fieldName);
                methodWriter.visitLdcInsn(j);
                methodWriter.invokeinterface(ASMUtils.TYPE_OBJECT_READER, "readJSONBObject", METHOD_DESC_READ_OBJECT);
                methodWriter.checkcast(str2);
                methodWriter.astore(iVar);
                methodWriter.goto_(label2);
                methodWriter.visitLabel(label5);
            }
            methodWriter.aload(1);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "startArray", "()I");
            methodWriter.dup();
            methodWriter.istore(iVar3);
            methodWriter.visitLdcInsn(-1);
            methodWriter.if_icmpne(label3);
            methodWriter.aconst_null();
            methodWriter.astore(iVar);
            methodWriter.goto_(label2);
            methodWriter.visitLabel(label3);
            if (fieldReader.method != null || (field = fieldReader.field) == null) {
                label = label4;
            } else {
                long jObjectFieldOffset = JDKUtils.UNSAFE.objectFieldOffset(field);
                methodWriter.getstatic(ASMUtils.TYPE_UNSAFE_UTILS, "UNSAFE", "Lsun/misc/Unsafe;");
                methodWriter.aload(i);
                methodWriter.visitLdcInsn(jObjectFieldOffset);
                methodWriter.invokevirtual("sun/misc/Unsafe", "getObject", "(Ljava/lang/Object;J)Ljava/lang/Object;");
                methodWriter.dup();
                methodWriter.checkcast(str2);
                methodWriter.astore(iVar);
                Label label6 = new Label();
                methodWriter.ifnull(label6);
                methodWriter.aload(iVar);
                methodWriter.invokevirtual(ASMUtils.TYPE_OBJECT, "getClass", "()Ljava/lang/Class;");
                methodWriter.getstatic("java/util/Collections", "EMPTY_LIST", "Ljava/util/List;");
                methodWriter.invokevirtual(ASMUtils.TYPE_OBJECT, "getClass", "()Ljava/lang/Class;");
                label = label4;
                methodWriter.if_acmpne(label);
                methodWriter.visitLabel(label6);
            }
            String str10 = str6;
            methodWriter.new_(str10);
            methodWriter.dup();
            if (z5) {
                methodWriter.iload(iVar3);
                methodWriter.invokespecial(str10, "<init>", "(I)V");
            } else {
                methodWriter.invokespecial(str10, "<init>", "()V");
            }
            methodWriter.astore(iVar);
            methodWriter.visitLabel(label);
            type3 = type6;
            i3 = iVar3;
            str4 = "readString";
            str3 = "()Z";
        } else {
            String str11 = str6;
            Label label7 = new Label();
            Label label8 = new Label();
            Label label9 = new Label();
            methodWriter.aload(1);
            String str12 = ASMUtils.TYPE_JSON_READER;
            str3 = "()Z";
            methodWriter.invokevirtual(str12, "nextIfNull", str3);
            methodWriter.ifne(label9);
            methodWriter.aload(1);
            methodWriter.invokevirtual(str12, "nextIfArrayStart", str3);
            methodWriter.ifne(label7);
            if (mapping == cls4) {
                i3 = iVar3;
                methodWriter.aload(1);
                methodWriter.invokevirtual(str12, "isString", str3);
                methodWriter.ifeq(label8);
                methodWriter.new_(str11);
                methodWriter.dup();
                if (z5) {
                    methodWriter.visitLdcInsn(10);
                    methodWriter.invokespecial(str11, "<init>", "(I)V");
                } else {
                    methodWriter.invokespecial(str11, "<init>", "()V");
                }
                methodWriter.astore(iVar);
                methodWriter.aload(1);
                methodWriter.invokevirtual(str12, "nextIfNullOrEmptyString", str3);
                methodWriter.ifne(label2);
                methodWriter.aload(iVar);
                methodWriter.aload(1);
                if (mapping == cls4) {
                    str5 = "readString";
                    methodWriter.invokevirtual(str12, str5, "()Ljava/lang/String;");
                } else {
                    str5 = "readString";
                }
                cls4 = cls4;
                methodWriter.invokeinterface(str7, str9, str8);
                methodWriter.pop();
                methodWriter.goto_(label2);
                str7 = str7;
                str9 = str9;
                str8 = str8;
                type3 = type6;
                str4 = str5;
            } else {
                i3 = iVar3;
                str4 = "readString";
                type3 = type6;
                if (type3 instanceof Class) {
                    methodWriter.aload(1);
                    methodWriter.invokevirtual(str12, "nextIfNullOrEmptyString", str3);
                    methodWriter.ifne(label9);
                    methodWriter.new_(str11);
                    methodWriter.dup();
                    if (z5) {
                        cls4 = cls4;
                        methodWriter.visitLdcInsn(10);
                        methodWriter.invokespecial(str11, "<init>", "(I)V");
                    } else {
                        cls4 = cls4;
                        methodWriter.invokespecial(str11, "<init>", "()V");
                    }
                    methodWriter.astore(iVar);
                    methodWriter.aload(1);
                    methodWriter.aload(iVar);
                    methodWriter.visitLdcInsn((Class) type3);
                    methodWriter.invokevirtual(str12, "readArray", "(Ljava/util/List;Ljava/lang/reflect/Type;)V");
                    methodWriter.goto_(label2);
                }
            }
            cls4 = cls4;
            methodWriter.visitLabel(label8);
            methodWriter.aload(1);
            methodWriter.invokevirtual(str12, "skipValue", "()V");
            methodWriter.visitLabel(label9);
            methodWriter.aconst_null();
            methodWriter.astore(iVar);
            methodWriter.goto_(label2);
            methodWriter.visitLabel(label7);
            methodWriter.new_(str11);
            methodWriter.dup();
            if (z5) {
                methodWriter.visitLdcInsn(10);
                methodWriter.invokespecial(str11, "<init>", "(I)V");
            } else {
                methodWriter.invokespecial(str11, "<init>", "()V");
            }
            methodWriter.astore(iVar);
        }
        int iVar4 = methodWriterContext.var("J");
        Label label10 = new Label();
        Label label11 = new Label();
        Label label12 = new Label();
        methodWriter.iconst_0();
        methodWriter.istore(iVar4);
        methodWriter.visitLabel(label10);
        if (z3) {
            methodWriter.iload(iVar4);
            methodWriter.iload(i3);
            methodWriter.if_icmpge(label11);
            i4 = 1;
        } else {
            i4 = 1;
            methodWriter.aload(1);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "nextIfArrayEnd", str3);
            methodWriter.ifne(label11);
        }
        if (type3 == cls4) {
            methodWriter.aload(iVar);
            methodWriter.aload(i4);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, str4, "()Ljava/lang/String;");
        } else {
            if (type3 != Integer.class) {
                if (type3 == Long.class) {
                    methodWriter.aload(iVar);
                    methodWriter.aload(i4);
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readInt64", "()Ljava/lang/Long;");
                } else {
                    Label label13 = new Label();
                    methodWriter.aload(0);
                    String str13 = ASMUtils.DESC_OBJECT_READER;
                    methodWriter.getfield(str, strFieldItemObjectReader, str13);
                    methodWriter.ifnonnull(label13);
                    methodWriter.aload(0);
                    methodWriter.aload(0);
                    methodWriter.getfield(str, CodeGenUtils.fieldReader(i2), ASMUtils.DESC_FIELD_READER);
                    methodWriter.aload(1);
                    methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_READE, "getItemObjectReader", METHOD_DESC_GET_ITEM_OBJECT_READER);
                    methodWriter.putfield(str, strFieldItemObjectReader, str13);
                    methodWriter.visitLabel(label13);
                    if (!objectReadContext.disableReferenceDetect()) {
                        methodWriter.aload(1);
                        methodWriter.aload(iVar);
                        methodWriter.iload(iVar4);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readReference", "(Ljava/util/List;I)Z");
                        methodWriter.ifne(label12);
                    }
                    methodWriter.aload(iVar);
                    Label label14 = new Label();
                    Label label15 = new Label();
                    if (z) {
                        methodWriter.aload(1);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "isArray", str3);
                        methodWriter.ifeq(label14);
                        methodWriter.aload(0);
                        methodWriter.getfield(str, strFieldItemObjectReader, str13);
                        methodWriter.aload(1);
                        objectReaderCreatorASM = this;
                        i5 = i2;
                        type4 = type;
                        objectReaderCreatorASM.gwGetFieldType(str, methodWriter, i5, type4);
                        fieldReader2 = fieldReader;
                        methodWriter.visitLdcInsn(fieldReader2.fieldName);
                        methodWriter.lload(4);
                        methodWriter.invokeinterface(ASMUtils.TYPE_OBJECT_READER, z3 ? "readArrayMappingJSONBObject" : "readArrayMappingObject", METHOD_DESC_READ_OBJECT);
                        methodWriter.goto_(label15);
                        methodWriter.visitLabel(label14);
                    } else {
                        objectReaderCreatorASM = this;
                        fieldReader2 = fieldReader;
                        i5 = i2;
                        type4 = type;
                    }
                    methodWriter.aload(0);
                    methodWriter.getfield(str, strFieldItemObjectReader, str13);
                    methodWriter.aload(1);
                    objectReaderCreatorASM.gwGetFieldType(str, methodWriter, i5, type4);
                    methodWriter.visitLdcInsn(fieldReader2.fieldName);
                    methodWriter.lload(4);
                    methodWriter.invokeinterface(ASMUtils.TYPE_OBJECT_READER, z3 ? "readJSONBObject" : "readObject", METHOD_DESC_READ_OBJECT);
                    if (z) {
                        methodWriter.visitLabel(label15);
                    }
                }
                methodWriter.invokeinterface(str7, str9, str8);
                methodWriter.pop();
                methodWriter.visitLabel(label12);
                methodWriter.visitIincInsn(iVar4, 1);
                methodWriter.goto_(label10);
                methodWriter.visitLabel(label11);
                methodWriter.visitLabel(label2);
                methodWriter.aload(iVar);
            }
            methodWriter.aload(iVar);
            methodWriter.aload(i4);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "readInt32", "()Ljava/lang/Integer;");
        }
        label11 = label11;
        label2 = label2;
        iVar = iVar;
        methodWriter.invokeinterface(str7, str9, str8);
        methodWriter.pop();
        methodWriter.visitLabel(label12);
        methodWriter.visitIincInsn(iVar4, 1);
        methodWriter.goto_(label10);
        methodWriter.visitLabel(label11);
        methodWriter.visitLabel(label2);
        methodWriter.aload(iVar);
    }

    private void genReadHashCode64ValueForNonDefaultConstructor(ObjectReadContext objectReadContext, MethodWriterContext methodWriterContext, int i, boolean z, int i2, Label label) {
        FieldReader[] fieldReaderArr = objectReadContext.fieldReaders;
        MethodWriter methodWriter = methodWriterContext.mw;
        if (fieldReaderArr.length == 1) {
            Label label2 = new Label();
            Label label3 = new Label();
            methodWriter.lload(i);
            FieldReader fieldReader = fieldReaderArr[0];
            methodWriter.visitLdcInsn(fieldReader.fieldNameHash);
            methodWriter.lcmp();
            methodWriter.ifne(label2);
            genReadFieldValue(objectReadContext, fieldReader, z, methodWriterContext, i2, 0, false);
            methodWriter.goto_(label3);
            methodWriter.visitLabel(label2);
            methodWriter.aload(1);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "skipValue", "()V");
            methodWriter.visitLabel(label3);
            return;
        }
        if (fieldReaderArr.length != 2) {
            methodWriter.aload(0);
            methodWriter.lload(i);
            methodWriter.invokevirtual(ASMUtils.TYPE_OBJECT_READER_ADAPTER, "getFieldOrdinal", "(J)I");
            Label label4 = new Label();
            Label[] labelArr = new Label[fieldReaderArr.length];
            int[] iArr = new int[fieldReaderArr.length];
            for (int i3 = 0; i3 < fieldReaderArr.length; i3++) {
                labelArr[i3] = new Label();
                iArr[i3] = i3;
            }
            methodWriter.visitLookupSwitchInsn(label4, iArr, labelArr);
            for (int i4 = 0; i4 < fieldReaderArr.length; i4++) {
                methodWriter.visitLabel(labelArr[i4]);
                genReadFieldValue(objectReadContext, fieldReaderArr[i4], z, methodWriterContext, i2, i4, false);
                methodWriter.goto_(label);
            }
            methodWriter.visitLabel(label4);
            methodWriter.aload(1);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "skipValue", "()V");
            return;
        }
        FieldReader fieldReader2 = fieldReaderArr[0];
        FieldReader fieldReader3 = fieldReaderArr[1];
        Label label5 = new Label();
        Label label6 = new Label();
        Label label7 = new Label();
        methodWriter.lload(i);
        methodWriter.visitLdcInsn(fieldReader2.fieldNameHash);
        methodWriter.lcmp();
        methodWriter.ifne(label5);
        genReadFieldValue(objectReadContext, fieldReader2, z, methodWriterContext, i2, 0, false);
        methodWriter.goto_(label7);
        methodWriter.visitLabel(label5);
        methodWriter.lload(i);
        methodWriter.visitLdcInsn(fieldReader3.fieldNameHash);
        methodWriter.lcmp();
        methodWriter.ifne(label6);
        genReadFieldValue(objectReadContext, fieldReader3, z, methodWriterContext, i2, 1, false);
        methodWriter.goto_(label7);
        methodWriter.visitLabel(label6);
        methodWriter.aload(1);
        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_READER, "skipValue", "()V");
        methodWriter.visitLabel(label7);
    }

    private void genReadObject(FieldReader fieldReader, String str, MethodWriterContext methodWriterContext, int i, Type type, long j, String str2) {
        Label label = new Label();
        MethodWriter methodWriter = methodWriterContext.mw;
        boolean z = methodWriterContext.jsonb;
        methodWriter.aload(0);
        String str3 = ASMUtils.DESC_OBJECT_READER;
        methodWriter.getfield(str, str2, str3);
        methodWriter.ifnonnull(label);
        methodWriter.aload(0);
        methodWriter.aload(0);
        methodWriter.getfield(str, CodeGenUtils.fieldReader(i), ASMUtils.DESC_FIELD_READER);
        methodWriter.aload(1);
        methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_READE, "getObjectReader", METHOD_DESC_GET_OBJECT_READER_1);
        methodWriter.putfield(str, str2, str3);
        methodWriter.visitLabel(label);
        methodWriter.aload(0);
        methodWriter.getfield(str, str2, str3);
        methodWriter.aload(1);
        gwGetFieldType(str, methodWriter, i, type);
        methodWriter.visitLdcInsn(fieldReader.fieldName);
        methodWriter.visitLdcInsn(j);
        methodWriter.invokeinterface(ASMUtils.TYPE_OBJECT_READER, z ? "readJSONBObject" : "readObject", METHOD_DESC_READ_OBJECT);
    }

    private void gwGetFieldType(String str, MethodWriter methodWriter, int i, Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            String name = cls.getName();
            boolean zIsPublic = Modifier.isPublic(cls.getModifiers());
            boolean z = name.startsWith("java.") || cls == JSONArray.class || cls == JSONObject.class;
            if (zIsPublic && z) {
                methodWriter.visitLdcInsn(cls);
                return;
            }
        }
        methodWriter.aload(0);
        methodWriter.getfield(str, CodeGenUtils.fieldReader(i), ASMUtils.DESC_FIELD_READER);
        methodWriter.getfield(ASMUtils.TYPE_FIELD_READE, "fieldType", "Ljava/lang/reflect/Type;");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0127  */
    /* JADX WARN: Code duplicated, block: B:56:0x0142  */
    /* JADX WARN: Code duplicated, block: B:58:0x0149  */
    /* JADX WARN: Code duplicated, block: B:60:0x014d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0151  */
    /* JADX WARN: Code duplicated, block: B:65:0x017a  */
    /* JADX WARN: Code duplicated, block: B:67:0x017f  */
    /* JADX WARN: Code duplicated, block: B:69:0x018c  */
    private <T> ObjectReaderBean jitObjectReader(Class<T> cls, Type type, boolean z, boolean z2, int i, BeanInfo beanInfo, Supplier<T> supplier, FieldReader[] fieldReaderArr, Constructor constructor) {
        boolean z3;
        Supplier<T> supplierCreateSupplier;
        FieldReader[] fieldReaderArr2;
        Class<T> cls2;
        ObjectReaderCreatorASM objectReaderCreatorASM;
        String str;
        String str2;
        long j;
        long j2;
        boolean zDisableSupportArrayMapping;
        boolean zDisableJSONB;
        boolean z4;
        ClassWriter classWriter = new ClassWriter(new C1300feyxiexzfUjhhgtg(1, cls));
        ObjectReadContext objectReadContext = new ObjectReadContext(beanInfo, cls, classWriter, z2, fieldReaderArr, constructor);
        boolean z5 = fieldReaderArr.length <= 96;
        int length = fieldReaderArr.length;
        String str3 = (length < 1 || length > 12) ? ASMUtils.TYPE_OBJECT_READER_ADAPTER : TYPE_OBJECT_READERS[length];
        if (z5) {
            genFields(fieldReaderArr, classWriter, str3);
        }
        classWriter.visit(52, 49, objectReadContext.classNameType, str3, new String[0]);
        MethodWriter methodWriterVisitMethod = classWriter.visitMethod(1, "<init>", METHOD_DESC_INIT, fieldReaderArr.length <= 12 ? 32 : 128);
        methodWriterVisitMethod.aload(0);
        methodWriterVisitMethod.aload(1);
        String str4 = beanInfo.typeKey;
        if (str4 != null) {
            methodWriterVisitMethod.visitLdcInsn(str4);
        } else {
            methodWriterVisitMethod.aconst_null();
        }
        methodWriterVisitMethod.aconst_null();
        boolean z6 = z5;
        methodWriterVisitMethod.visitLdcInsn(beanInfo.readerFeatures);
        methodWriterVisitMethod.aconst_null();
        methodWriterVisitMethod.aload(2);
        methodWriterVisitMethod.aconst_null();
        methodWriterVisitMethod.aload(3);
        methodWriterVisitMethod.invokespecial(str3, "<init>", METHOD_DESC_ADAPTER_INIT);
        genInitFields(fieldReaderArr, objectReadContext.classNameType, z6, 3, methodWriterVisitMethod, str3);
        methodWriterVisitMethod.return_();
        methodWriterVisitMethod.visitMaxs(3, 3);
        String str5 = (z && constructor == null) ? "createInstance0" : "createInstance";
        try {
            if ((!z2 || constructor == null) && (!z || (constructor != null && Modifier.isPublic(constructor.getModifiers()) && Modifier.isPublic(cls.getModifiers())))) {
                if (constructor != null && Modifier.isPublic(constructor.getModifiers()) && Modifier.isPublic(cls.getModifiers())) {
                    z3 = true;
                    MethodWriter methodWriterVisitMethod2 = classWriter.visitMethod(1, str5, "(J)Ljava/lang/Object;", 32);
                    newObject(methodWriterVisitMethod2, objectReadContext.objectType, constructor);
                    methodWriterVisitMethod2.areturn();
                    methodWriterVisitMethod2.visitMaxs(3, 3);
                }
                if (constructor != null) {
                    if (Modifier.isPublic(i) || this.classLoader.isExternalClass(cls) || !Modifier.isPublic(constructor.getModifiers())) {
                        z4 = z3;
                    } else {
                        z4 = false;
                    }
                    supplierCreateSupplier = createSupplier(constructor, z4);
                } else {
                    supplierCreateSupplier = supplier;
                }
                if (z6) {
                    j = beanInfo.readerFeatures;
                    if (z) {
                        j |= JSONReader.Feature.FieldBased.mask;
                    }
                    j2 = j;
                    zDisableSupportArrayMapping = objectReadContext.disableSupportArrayMapping();
                    zDisableJSONB = objectReadContext.disableJSONB();
                    objectReaderCreatorASM = this;
                    str = str3;
                    fieldReaderArr2 = fieldReaderArr;
                    ObjectReaderAdapter objectReaderAdapter = new ObjectReaderAdapter(cls, beanInfo.typeKey, beanInfo.typeName, j2, null, supplierCreateSupplier, null, fieldReaderArr2);
                    cls2 = cls;
                    objectReadContext.objectReaderAdapter = objectReaderAdapter;
                    if (!zDisableJSONB) {
                        objectReaderCreatorASM.genMethodReadJSONBObject(objectReadContext, j2);
                        if (!zDisableSupportArrayMapping) {
                            objectReaderCreatorASM.genMethodReadJSONBObjectArrayMapping(objectReadContext, j2);
                        }
                    }
                    objectReaderCreatorASM.genMethodReadObject(objectReadContext, j2);
                    objectReaderCreatorASM.genMethodGetFieldReader(objectReadContext);
                    objectReaderCreatorASM.genMethodGetFieldReaderLCase(objectReadContext);
                } else {
                    fieldReaderArr2 = fieldReaderArr;
                    cls2 = cls;
                    objectReaderCreatorASM = this;
                    str = str3;
                }
                byte[] byteArray = classWriter.toByteArray();
                return (ObjectReaderBean) objectReaderCreatorASM.classLoader.defineClassPublic(objectReadContext.classNameFull, byteArray, 0, byteArray.length).getConstructors()[0].newInstance(cls2, supplierCreateSupplier, fieldReaderArr2);
            }
            MethodWriter methodWriterVisitMethod3 = classWriter.visitMethod(1, str5, "(J)Ljava/lang/Object;", 32);
            methodWriterVisitMethod3.getstatic(ASMUtils.TYPE_UNSAFE_UTILS, "UNSAFE", "Lsun/misc/Unsafe;");
            methodWriterVisitMethod3.aload(0);
            methodWriterVisitMethod3.getfield(ASMUtils.TYPE_OBJECT_READER_ADAPTER, "objectClass", "Ljava/lang/Class;");
            methodWriterVisitMethod3.invokevirtual("sun/misc/Unsafe", "allocateInstance", "(Ljava/lang/Class;)Ljava/lang/Object;");
            methodWriterVisitMethod3.areturn();
            methodWriterVisitMethod3.visitMaxs(3, 3);
            return (ObjectReaderBean) objectReaderCreatorASM.classLoader.defineClassPublic(objectReadContext.classNameFull, byteArray, 0, byteArray.length).getConstructors()[0].newInstance(cls2, supplierCreateSupplier, fieldReaderArr2);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("create objectReader error");
            if (type == null) {
                str2 = "";
            } else {
                str2 = ", objectType " + type.getTypeName();
            }
            sb.append(str2);
            sb.append(", fields ");
            sb.append(fieldReaderArr2.length);
            sb.append(", super ");
            sb.append(str);
            sb.append(", external ");
            sb.append(z2);
            throw new JSONException(sb.toString(), th);
        }
        z3 = true;
        if (constructor != null) {
            if (Modifier.isPublic(i)) {
                z4 = z3;
            } else {
                z4 = z3;
            }
            supplierCreateSupplier = createSupplier(constructor, z4);
        } else {
            supplierCreateSupplier = supplier;
        }
        if (z6) {
            j = beanInfo.readerFeatures;
            if (z) {
                j |= JSONReader.Feature.FieldBased.mask;
            }
            j2 = j;
            zDisableSupportArrayMapping = objectReadContext.disableSupportArrayMapping();
            zDisableJSONB = objectReadContext.disableJSONB();
            objectReaderCreatorASM = this;
            str = str3;
            fieldReaderArr2 = fieldReaderArr;
            ObjectReaderAdapter objectReaderAdapter2 = new ObjectReaderAdapter(cls, beanInfo.typeKey, beanInfo.typeName, j2, null, supplierCreateSupplier, null, fieldReaderArr2);
            cls2 = cls;
            objectReadContext.objectReaderAdapter = objectReaderAdapter2;
            if (!zDisableJSONB) {
                objectReaderCreatorASM.genMethodReadJSONBObject(objectReadContext, j2);
                if (!zDisableSupportArrayMapping) {
                    objectReaderCreatorASM.genMethodReadJSONBObjectArrayMapping(objectReadContext, j2);
                }
            }
            objectReaderCreatorASM.genMethodReadObject(objectReadContext, j2);
            objectReaderCreatorASM.genMethodGetFieldReader(objectReadContext);
            objectReaderCreatorASM.genMethodGetFieldReaderLCase(objectReadContext);
        } else {
            fieldReaderArr2 = fieldReaderArr;
            cls2 = cls;
            objectReaderCreatorASM = this;
            str = str3;
        }
        byte[] byteArray2 = classWriter.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$buildHashCode32Map$0(Integer num) {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Class lambda$createNoneDefaultConstructorObjectReader$1(Class cls, String str) {
        if (cls.getName().equals(str)) {
            return cls;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Class lambda$createValueConsumer0$5(Class cls, String str) {
        if (cls.getName().equals(str)) {
            return cls;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$createValueConsumer0$6(Constructor constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new JSONException("create ByteArrayValueConsumer error", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Class lambda$jitObjectReader$2(Class cls, String str) {
        if (cls.getName().equals(str)) {
            return cls;
        }
        return null;
    }

    private static void newObject(MethodWriter methodWriter, String str, Constructor constructor) {
        methodWriter.new_(str);
        methodWriter.dup();
        if (constructor.getParameterCount() == 0) {
            methodWriter.invokespecial(str, "<init>", "()V");
            return;
        }
        Class<?> cls = constructor.getParameterTypes()[0];
        methodWriter.aconst_null();
        methodWriter.invokespecial(str, "<init>", "(" + ASMUtils.desc(cls) + ")V");
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderCreator
    public Function<Consumer, ByteArrayValueConsumer> createByteArrayValueConsumerCreator(Class cls, FieldReader[] fieldReaderArr) {
        return createValueConsumer0(cls, fieldReaderArr, true);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderCreator
    public Function<Consumer, CharArrayValueConsumer> createCharArrayValueConsumerCreator(Class cls, FieldReader[] fieldReaderArr) {
        return createValueConsumer0(cls, fieldReaderArr, false);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderCreator
    public <T> ObjectReaderNoneDefaultConstructor createNoneDefaultConstructorObjectReader(Class cls, BeanInfo beanInfo, Function<Map<Long, Object>, T> function, List<Constructor> list, String[] strArr, FieldReader[] fieldReaderArr, FieldReader[] fieldReaderArr2) {
        Class<?> cls2;
        Constructor constructor;
        ObjectReaderNoneDefaultConstructor objectReaderNoneDefaultConstructor = new ObjectReaderNoneDefaultConstructor(cls, beanInfo.typeKey, beanInfo.typeName, beanInfo.readerFeatures, function, list, strArr, fieldReaderArr, fieldReaderArr2, beanInfo.seeAlso, beanInfo.seeAlsoNames);
        boolean z = beanInfo.autoTypeBeforeHandler == null && fieldReaderArr2.length == 0 && ((function instanceof ConstructorFunction) || (function instanceof FactoryFunction)) && ((list == null || list.isEmpty()) && !this.classLoader.isExternalClass(cls) && (beanInfo.readerFeatures & JSONReader.Feature.SupportAutoType.mask) == 0 && (((constructor = objectReaderNoneDefaultConstructor.noneDefaultConstructor) == null || constructor.getParameterCount() == fieldReaderArr.length) && ((!(function instanceof FactoryFunction) || ((FactoryFunction) function).paramNames.length == fieldReaderArr.length) && fieldReaderArr.length <= 64)));
        if (z) {
            for (FieldReader fieldReader : fieldReaderArr) {
                if (fieldReader.getInitReader() != null || fieldReader.defaultValue != null || fieldReader.schema != null || (((cls2 = fieldReader.fieldClass) != null && (!Modifier.isPublic(cls2.getModifiers()) || this.classLoader.isExternalClass(cls2))) || ((fieldReader instanceof FieldReaderMap) && ((FieldReaderMap) fieldReader).arrayToMapKey != null))) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            return objectReaderNoneDefaultConstructor;
        }
        boolean z2 = cls != null && this.classLoader.isExternalClass(cls);
        ClassWriter classWriter = new ClassWriter(new C1300feyxiexzfUjhhgtg(2, cls));
        beanInfo.readerFeatures |= FieldInfo.DISABLE_REFERENCE_DETECT;
        ObjectReadContext objectReadContext = new ObjectReadContext(beanInfo, cls, classWriter, z2, fieldReaderArr, null);
        objectReadContext.objectReaderAdapter = objectReaderNoneDefaultConstructor;
        String str = ASMUtils.TYPE_OBJECT_READER_NONE_DEFAULT_CONSTRUCTOR;
        genFields(fieldReaderArr, classWriter, str);
        classWriter.visit(52, 49, objectReadContext.classNameType, str, new String[0]);
        MethodWriter methodWriterVisitMethod = classWriter.visitMethod(1, "<init>", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Function;Ljava/util/List;[Ljava/lang/String;[Lcom/alibaba/fastjson2/reader/FieldReader;[Lcom/alibaba/fastjson2/reader/FieldReader;[Ljava/lang/Class;[Ljava/lang/String;)V", fieldReaderArr2.length <= 12 ? 32 : 128);
        methodWriterVisitMethod.aload(0);
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.aload(2);
        methodWriterVisitMethod.aload(3);
        methodWriterVisitMethod.lload(4);
        methodWriterVisitMethod.aload(6);
        methodWriterVisitMethod.aload(7);
        methodWriterVisitMethod.aload(8);
        methodWriterVisitMethod.aload(9);
        methodWriterVisitMethod.aload(10);
        methodWriterVisitMethod.aload(11);
        methodWriterVisitMethod.aload(12);
        methodWriterVisitMethod.invokespecial(str, "<init>", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Function;Ljava/util/List;[Ljava/lang/String;[Lcom/alibaba/fastjson2/reader/FieldReader;[Lcom/alibaba/fastjson2/reader/FieldReader;[Ljava/lang/Class;[Ljava/lang/String;)V");
        genInitFields(fieldReaderArr, objectReadContext.classNameType, true, 9, methodWriterVisitMethod, str);
        methodWriterVisitMethod.return_();
        methodWriterVisitMethod.visitMaxs(3, 3);
        genMethodReadObject(objectReadContext, beanInfo.readerFeatures);
        if (!objectReadContext.disableJSONB()) {
            genMethodReadJSONBObject(objectReadContext, beanInfo.readerFeatures);
        }
        byte[] byteArray = classWriter.toByteArray();
        try {
            return (ObjectReaderNoneDefaultConstructor) this.classLoader.defineClassPublic(objectReadContext.classNameFull, byteArray, 0, byteArray.length).getConstructors()[0].newInstance(cls, beanInfo.typeKey, beanInfo.typeName, Long.valueOf(beanInfo.readerFeatures), function, list, strArr, fieldReaderArr, fieldReaderArr2, null, null);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("create objectReader error");
            sb.append(cls == null ? "" : ", objectType " + cls.getTypeName());
            throw new JSONException(sb.toString(), th);
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderCreator
    public <T> ObjectReader<T> createObjectReader(Class<T> cls, Type type, boolean z, ObjectReaderProvider objectReaderProvider) {
        Constructor defaultConstructor;
        String str;
        Class cls2;
        Method method;
        boolean z2 = cls != null && this.classLoader.isExternalClass(cls);
        int modifiers = cls.getModifiers();
        if (Modifier.isAbstract(modifiers) || Modifier.isInterface(modifiers)) {
            return super.createObjectReader(cls, type, z, objectReaderProvider);
        }
        BeanInfo beanInfo = new BeanInfo(objectReaderProvider);
        objectReaderProvider.getBeanInfo(beanInfo, cls);
        if (z2 || !Modifier.isPublic(modifiers)) {
            beanInfo.readerFeatures |= FieldInfo.JIT;
        }
        Class cls3 = beanInfo.deserializer;
        if (cls3 != null && ObjectReader.class.isAssignableFrom(cls3)) {
            try {
                Constructor<T> declaredConstructor = beanInfo.deserializer.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return (ObjectReader) declaredConstructor.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new JSONException("create deserializer error", e);
            }
        }
        boolean z3 = (z && (cls.isInterface() || BeanUtils.isRecord(cls))) ? false : z;
        if (Enum.class.isAssignableFrom(cls) && ((method = beanInfo.createMethod) == null || method.getParameterCount() == 1)) {
            return createEnumReader(cls, beanInfo.createMethod, objectReaderProvider);
        }
        if (beanInfo.creatorConstructor != null || beanInfo.createMethod != null) {
            return createObjectReaderWithCreator(cls, type, objectReaderProvider, beanInfo);
        }
        if (beanInfo.builder != null) {
            return createObjectReaderWithBuilder(cls, type, objectReaderProvider, beanInfo);
        }
        if (Throwable.class.isAssignableFrom(cls) || BeanUtils.isExtendedMap(cls)) {
            return super.createObjectReader(cls, type, z3, objectReaderProvider);
        }
        if (cls == Class.class) {
            return ObjectReaderImplClass.INSTANCE;
        }
        FieldReader[] fieldReaderArrCreateFieldReaders = createFieldReaders(cls, type, beanInfo, z3, objectReaderProvider);
        boolean z4 = fieldReaderArrCreateFieldReaders.length <= 96;
        if (!z3) {
            if (JDKUtils.JVM_VERSION >= 9 && cls == StackTraceElement.class) {
                try {
                    return createObjectReaderNoneDefaultConstructor(StackTraceElement.class.getConstructor(String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE), "", "classLoaderName", "moduleName", "moduleVersion", "declaringClass", "methodName", "fileName", "lineNumber");
                } catch (NoSuchMethodException | SecurityException unused) {
                }
            }
            for (FieldReader fieldReader : fieldReaderArrCreateFieldReaders) {
                if (fieldReader.isReadOnly() || fieldReader.isUnwrapped() || (fieldReader.features & FieldInfo.READ_USING_MASK) != 0) {
                    z4 = false;
                    break;
                }
            }
        }
        if (beanInfo.autoTypeBeforeHandler != null) {
            z4 = false;
        }
        if (z4) {
            for (FieldReader fieldReader2 : fieldReaderArrCreateFieldReaders) {
                if (fieldReader2.defaultValue != null || fieldReader2.schema != null || (((cls2 = fieldReader2.fieldClass) != null && !Modifier.isPublic(cls2.getModifiers())) || ((fieldReader2 instanceof FieldReaderMap) && ((FieldReaderMap) fieldReader2).arrayToMapKey != null))) {
                    z4 = false;
                    break;
                }
            }
        }
        if (z4 && (beanInfo.rootName != null || ((str = beanInfo.schema) != null && !str.isEmpty()))) {
            z4 = false;
        }
        if (!z4) {
            return super.createObjectReader(cls, type, z3, objectReaderProvider);
        }
        if (Modifier.isInterface(modifiers) || Modifier.isAbstract(modifiers) || (defaultConstructor = BeanUtils.getDefaultConstructor(cls, true)) == null) {
            defaultConstructor = null;
        } else {
            try {
                defaultConstructor.setAccessible(true);
            } catch (SecurityException unused2) {
            }
        }
        Class[] clsArr = beanInfo.seeAlso;
        if (clsArr == null || clsArr.length == 0) {
            return (z3 || defaultConstructor != null) ? jitObjectReader(cls, type, z3, z2, modifiers, beanInfo, null, fieldReaderArrCreateFieldReaders, defaultConstructor) : super.createObjectReader(cls, type, false, objectReaderProvider);
        }
        return createObjectReaderSeeAlso(cls, beanInfo.typeKey, clsArr, beanInfo.seeAlsoNames, beanInfo.seeAlsoDefault, fieldReaderArrCreateFieldReaders);
    }

    /* JADX INFO: compiled from: obf */
    public static class MethodWriterContext {
        static final int FEATURES = 4;
        static final int FIELD_NAME = 3;
        static final int FIELD_TYPE = 2;
        static final int JSON_READER = 1;
        final boolean jsonb;
        int maxVariant;
        final MethodWriter mw;
        final Map<Object, Integer> variants = new LinkedHashMap();

        public MethodWriterContext(MethodWriter methodWriter, int i, boolean z) {
            this.mw = methodWriter;
            this.maxVariant = i;
            this.jsonb = z;
        }

        public int var(Object obj) {
            Integer numValueOf = this.variants.get(obj);
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(this.maxVariant);
                this.variants.put(obj, numValueOf);
                if (obj == Long.TYPE || obj == Double.TYPE) {
                    this.maxVariant += 2;
                } else {
                    this.maxVariant++;
                }
            }
            return numValueOf.intValue();
        }

        public int var2(Object obj) {
            Integer numValueOf = this.variants.get(obj);
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(this.maxVariant);
                this.variants.put(obj, numValueOf);
                this.maxVariant += 2;
            }
            return numValueOf.intValue();
        }

        public int var(FieldReader fieldReader) {
            return var("_param_" + fieldReader.fieldName, fieldReader.fieldClass);
        }

        public int var(String str, Class cls) {
            Integer numValueOf = this.variants.get(str);
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(this.maxVariant);
                this.variants.put(str, numValueOf);
                if (cls != Long.TYPE && cls != Double.TYPE) {
                    this.maxVariant++;
                } else {
                    this.maxVariant += 2;
                }
            }
            return numValueOf.intValue();
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderCreator
    public <T> ObjectReader<T> createObjectReader(Class<T> cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        if (cls == null && supplier != null && function == null) {
            for (FieldReader fieldReader : fieldReaderArr) {
                if (fieldReader.getFunction() != null) {
                }
            }
            return jitObjectReader(cls, cls, false, false, 0, new BeanInfo(JSONFactory.getDefaultObjectReaderProvider()), supplier, fieldReaderArr, null);
        }
        return super.createObjectReader(cls, str, str2, j, jSONSchema, supplier, function, fieldReaderArr);
    }
}
