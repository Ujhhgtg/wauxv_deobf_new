package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.SymbolTable;
import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.internal.asm.ASMUtils;
import com.alibaba.fastjson2.internal.asm.ClassWriter;
import com.alibaba.fastjson2.internal.asm.Label;
import com.alibaba.fastjson2.internal.asm.MethodWriter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.modules.ObjectWriterModule;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.DynamicClassLoader;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.ObjectWriterBaseModule;
import com.alibaba.fastjson2.writer.ObjectWriterCreatorASM;
import com.umeng.analytics.pro.g;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.function.Consumer;
import java.util.function.Function;
import p000.AbstractC1194;
import p000.AbstractC2668;
import p000.AbstractC2784;
import p000.C2263;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterCreatorASM extends ObjectWriterCreator {
    static final String CONTEXT_FEATURES = "CONTEXT_FEATURES";
    static final String DESC_SYMBOL;
    static final int JSON_WRITER = 1;
    static final String METHOD_DESC_FIELD_WRITE_OBJECT;
    static final String METHOD_DESC_GET_ITEM_WRITER;
    static final String METHOD_DESC_GET_OBJECT_WRITER;
    static final String METHOD_DESC_HAS_FILTER;
    static final String METHOD_DESC_IO_WRITE_REFERENCE;
    static final String METHOD_DESC_SET_PATH2;
    static final String METHOD_DESC_WRITE;
    static final String METHOD_DESC_WRITE_BArray;
    static final String METHOD_DESC_WRITE_CArray;
    static final String METHOD_DESC_WRITE_CLASS_INFO;
    static final String METHOD_DESC_WRITE_D;
    static final String METHOD_DESC_WRITE_DARRAY;
    static final String METHOD_DESC_WRITE_DATE_WITH_FIELD_NAME;
    static final String METHOD_DESC_WRITE_ENUM;
    static final String METHOD_DESC_WRITE_F;
    static final String METHOD_DESC_WRITE_FARRAY;
    static final String METHOD_DESC_WRITE_FIELD_NAME;
    static final String METHOD_DESC_WRITE_FIELD_NAME_JSONB;
    static final String METHOD_DESC_WRITE_I;
    static final String METHOD_DESC_WRITE_J;
    static final String METHOD_DESC_WRITE_LIST;
    static final String METHOD_DESC_WRITE_LIST_VALUE_JSONB;
    static final String METHOD_DESC_WRITE_NAME_SYMBOL;
    static final String METHOD_DESC_WRITE_OBJECT;
    static final String METHOD_DESC_WRITE_REFERENCE = "(Ljava/lang/String;)V";
    static final String METHOD_DESC_WRITE_SArray;
    static final String METHOD_DESC_WRITE_TYPE_INFO;
    static final String METHOD_DESC_WRITE_VALUE;
    static final String METHOD_DESC_WRITE_Z;
    static final String METHOD_DESC_WRITE_ZARRAY;
    static final String NAME_DIRECT = "NAME_DIRECT";
    static final String NOT_WRITE_DEFAULT_VALUE = "WRITE_DEFAULT_VALUE";
    static final int THIS = 0;
    static final String WRITE_NULLS = "WRITE_NULLS";
    protected final DynamicClassLoader classLoader;
    public static final ObjectWriterCreatorASM INSTANCE = new ObjectWriterCreatorASM(DynamicClassLoader.getInstance());
    protected static final AtomicLong seed = new AtomicLong();
    static final String[] INTERFACES = {ASMUtils.TYPE_OBJECT_WRITER};

    /* JADX INFO: compiled from: obf */
    public static class FieldWriterGroup {
        final boolean direct;
        boolean end;
        final List<FieldWriterRecord> fieldWriters = new ArrayList();
        final boolean start;

        public FieldWriterGroup(boolean z, boolean z2) {
            this.start = z;
            this.direct = z2;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldWriterRecord {
        final FieldWriter fieldWriter;
        final int ordinal;

        public FieldWriterRecord(FieldWriter fieldWriter, int i) {
            this.fieldWriter = fieldWriter;
            this.ordinal = i;
        }

        public static List<FieldWriterRecord> of(List<FieldWriter> list) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(new FieldWriterRecord(list.get(i), i));
            }
            return arrayList;
        }
    }

    static {
        String strDesc = ASMUtils.desc(SymbolTable.class);
        DESC_SYMBOL = strDesc;
        StringBuilder sb = new StringBuilder("(");
        String str = ASMUtils.DESC_JSON_WRITER;
        METHOD_DESC_WRITE_VALUE = AbstractC2784.m4752(sb, str, "Ljava/lang/Object;)V");
        METHOD_DESC_WRITE = AbstractC1194.m2785("(", str, "Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V");
        METHOD_DESC_WRITE_FIELD_NAME = AbstractC1194.m2785("(", str, ")V");
        METHOD_DESC_WRITE_OBJECT = AbstractC1194.m2785("(", str, "Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V");
        METHOD_DESC_WRITE_J = AbstractC1194.m2785("(", str, "J)V");
        METHOD_DESC_WRITE_D = AbstractC1194.m2785("(", str, "D)V");
        METHOD_DESC_WRITE_F = AbstractC1194.m2785("(", str, "F)V");
        METHOD_DESC_WRITE_DATE_WITH_FIELD_NAME = AbstractC1194.m2785("(", str, "ZLjava/util/Date;)V");
        METHOD_DESC_WRITE_Z = AbstractC1194.m2785("(", str, "Z)V");
        METHOD_DESC_WRITE_ZARRAY = AbstractC1194.m2785("(", str, "[Z)V");
        METHOD_DESC_WRITE_FARRAY = AbstractC1194.m2785("(", str, "[F)V");
        METHOD_DESC_WRITE_DARRAY = AbstractC1194.m2785("(", str, "[D)V");
        METHOD_DESC_WRITE_I = AbstractC1194.m2785("(", str, "I)V");
        METHOD_DESC_WRITE_SArray = AbstractC1194.m2785("(", str, "[S)V");
        METHOD_DESC_WRITE_BArray = AbstractC1194.m2785("(", str, "[B)V");
        METHOD_DESC_WRITE_CArray = AbstractC1194.m2785("(", str, "[C)V");
        METHOD_DESC_WRITE_ENUM = AbstractC1194.m2785("(", str, "Ljava/lang/Enum;)V");
        METHOD_DESC_WRITE_LIST = AbstractC1194.m2785("(", str, "Ljava/util/List;)V");
        METHOD_DESC_FIELD_WRITE_OBJECT = AbstractC1194.m2785("(", str, "Ljava/lang/Object;)Z");
        StringBuilder sbM4679 = AbstractC2668.m4679("(", str, "Ljava/lang/Class;)");
        String str2 = ASMUtils.DESC_OBJECT_WRITER;
        sbM4679.append(str2);
        METHOD_DESC_GET_OBJECT_WRITER = sbM4679.toString();
        METHOD_DESC_GET_ITEM_WRITER = "(" + str + "Ljava/lang/reflect/Type;)" + str2;
        METHOD_DESC_WRITE_TYPE_INFO = AbstractC1194.m2785("(", str, ")Z");
        METHOD_DESC_HAS_FILTER = AbstractC1194.m2785("(", str, ")Z");
        METHOD_DESC_SET_PATH2 = AbstractC2784.m4752(new StringBuilder("("), ASMUtils.DESC_FIELD_WRITER, "Ljava/lang/Object;)Ljava/lang/String;");
        METHOD_DESC_IO_WRITE_REFERENCE = AbstractC1194.m2785("([BILjava/lang/String;", str, ")I");
        METHOD_DESC_WRITE_CLASS_INFO = AbstractC1194.m2785("(", str, ")V");
        METHOD_DESC_WRITE_FIELD_NAME_JSONB = AbstractC1194.m2785("([BI", str, ")I");
        METHOD_DESC_WRITE_NAME_SYMBOL = AbstractC1194.m2785("(", strDesc, ")I");
        METHOD_DESC_WRITE_LIST_VALUE_JSONB = AbstractC1194.m2785("(", str, "Ljava/util/List;)V");
    }

    public ObjectWriterCreatorASM() {
        this.classLoader = new DynamicClassLoader();
    }

    public static List<FieldWriterGroup> buildGroups(long j, List<FieldWriter> list) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            FieldWriterGroup fieldWriterGroup = new FieldWriterGroup(true, false);
            fieldWriterGroup.end = true;
            arrayList.add(fieldWriterGroup);
            return arrayList;
        }
        FieldWriterGroup fieldWriterGroup2 = null;
        int i = 0;
        while (i < list.size()) {
            FieldWriter fieldWriter = list.get(i);
            boolean zSupportDirectWrite = supportDirectWrite(j, fieldWriter);
            if (fieldWriterGroup2 == null || fieldWriterGroup2.direct != zSupportDirectWrite) {
                fieldWriterGroup2 = new FieldWriterGroup(i == 0, zSupportDirectWrite);
                arrayList.add(fieldWriterGroup2);
            }
            fieldWriterGroup2.fieldWriters.add(new FieldWriterRecord(fieldWriter, i));
            if (i == list.size() - 1) {
                fieldWriterGroup2.end = true;
            }
            i++;
        }
        return arrayList;
    }

    private FieldWriter createFieldWriterList(ObjectWriterProvider objectWriterProvider, String str, int i, long j, String str2, Locale locale, String str3, Field field, Class<?> cls, Type type, Type type2, Class<?> cls2) {
        FieldWriter fieldWriterJitFieldWriterList = jitFieldWriterList(objectWriterProvider, str, i, j, str2, locale, str3, field, cls, type, type2, cls2);
        return fieldWriterJitFieldWriterList == null ? new FieldWriterList(str, type, i, j, str2, locale, str3, type2, cls2, field, null, null, cls) : fieldWriterJitFieldWriterList;
    }

    private int fieldCapacity(Class<?> cls) {
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return 1;
        }
        if (cls == Byte.TYPE || cls == Byte.class) {
            return 2;
        }
        if (cls == Short.TYPE || cls == Short.class) {
            return 3;
        }
        if (cls == Integer.TYPE || cls == Integer.class || cls == Float.TYPE || cls == Float.class || cls == LocalDate.class) {
            return 5;
        }
        if (cls == Long.TYPE || cls == Long.class || cls == Double.TYPE || cls == Double.class || cls == LocalTime.class) {
            return 9;
        }
        if (cls == LocalDateTime.class) {
            return 13;
        }
        if (cls == Instant.class) {
            return 15;
        }
        if (cls == UUID.class) {
            return 18;
        }
        if (cls == OffsetDateTime.class || cls == OffsetTime.class) {
            return 21;
        }
        throw new JSONException("assert error ".concat(cls.getName()));
    }

    private static void fieldValueCapacity(long j, List<FieldWriterRecord> list, MethodWriterContext methodWriterContext, MethodWriter methodWriter, int i) {
        for (FieldWriterRecord fieldWriterRecord : list) {
            FieldWriter fieldWriter = fieldWriterRecord.fieldWriter;
            Class cls = fieldWriter.fieldClass;
            if (cls == String.class) {
                methodWriter.aload(methodWriterContext.var("field_" + fieldWriterRecord.ordinal));
                methodWriter.invokestatic(ASMUtils.TYPE_JSONB_IO, "stringCapacity", "(Ljava/lang/String;)I", true);
                methodWriter.iadd();
            } else if (cls == String[].class) {
                methodWriter.aload(methodWriterContext.var("field_" + fieldWriterRecord.ordinal));
                methodWriter.invokestatic(ASMUtils.TYPE_JSONB_IO, "stringCapacity", "([Ljava/lang/String;)I", true);
                methodWriter.iadd();
            } else if (fieldWriter instanceof FieldWriterEnum) {
                methodWriter.aload(methodWriterContext.var("field_" + fieldWriterRecord.ordinal));
                methodWriter.lload(i);
                long j2 = fieldWriter.features | j;
                if (j2 != 0) {
                    methodWriter.visitLdcInsn(j2);
                    methodWriter.lor();
                }
                methodWriter.invokestatic(ASMUtils.TYPE_JSONB_IO, "enumCapacity", "(Ljava/lang/Enum;J)I", true);
                methodWriter.iadd();
            } else if (Collection.class.isAssignableFrom(cls)) {
                methodWriter.aload(methodWriterContext.var("field_" + fieldWriterRecord.ordinal));
                Class itemClass = fieldWriter.getItemClass();
                if (itemClass == String.class) {
                    methodWriter.invokestatic(ASMUtils.TYPE_JSONB_IO, "stringCapacity", "(Ljava/util/Collection;)I", true);
                    methodWriter.iadd();
                } else {
                    if (itemClass != Long.class) {
                        throw new JSONException("assert error itemClass ".concat(itemClass.getName()));
                    }
                    methodWriter.invokestatic(ASMUtils.TYPE_JSONB_IO, "int64Capacity", "(Ljava/util/Collection;)I", true);
                    methodWriter.iadd();
                }
            } else {
                continue;
            }
        }
    }

    public static String fieldWriter(int i) {
        switch (i) {
            case 0:
                return "fieldWriter0";
            case 1:
                return "fieldWriter1";
            case 2:
                return "fieldWriter2";
            case 3:
                return "fieldWriter3";
            case 4:
                return "fieldWriter4";
            case 5:
                return "fieldWriter5";
            case 6:
                return "fieldWriter6";
            case 7:
                return "fieldWriter7";
            case 8:
                return "fieldWriter8";
            case 9:
                return "fieldWriter9";
            case 10:
                return "fieldWriter10";
            case 11:
                return "fieldWriter11";
            case Opcodes.FCONST_1 /* 12 */:
                return "fieldWriter12";
            case 13:
                return "fieldWriter13";
            case Opcodes.DCONST_0 /* 14 */:
                return "fieldWriter14";
            case 15:
                return "fieldWriter15";
            default:
                int iStringSize = IOUtils.stringSize(i) + 11;
                char[] cArr = new char[iStringSize];
                "fieldWriter".getChars(0, 11, cArr, 0);
                IOUtils.getChars(i, iStringSize, cArr);
                return new String(cArr);
        }
    }

    private void genFields(List<FieldWriter> list, ClassWriter classWriter, String str) {
        if (str != ASMUtils.TYPE_OBJECT_WRITER_ADAPTER) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            classWriter.visitField(1, fieldWriter(i), ASMUtils.DESC_FIELD_WRITER);
        }
    }

    private void genMethodInit(List<FieldWriter> list, ClassWriter classWriter, String str, String str2) {
        MethodWriter methodWriterVisitMethod = classWriter.visitMethod(1, "<init>", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V", 64);
        methodWriterVisitMethod.aload(0);
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.aload(2);
        methodWriterVisitMethod.aload(3);
        methodWriterVisitMethod.lload(4);
        methodWriterVisitMethod.aload(6);
        methodWriterVisitMethod.invokespecial(str2, "<init>", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V");
        if (str2 == ASMUtils.TYPE_OBJECT_WRITER_ADAPTER) {
            for (int i = 0; i < list.size(); i++) {
                methodWriterVisitMethod.aload(0);
                methodWriterVisitMethod.dup();
                methodWriterVisitMethod.getfield(ASMUtils.TYPE_OBJECT_WRITER_ADAPTER, "fieldWriterArray", ASMUtils.DESC_FIELD_WRITER_ARRAY);
                methodWriterVisitMethod.iconst_n(i);
                methodWriterVisitMethod.aaload();
                methodWriterVisitMethod.checkcast(ASMUtils.TYPE_FIELD_WRITER);
                methodWriterVisitMethod.putfield(str, fieldWriter(i), ASMUtils.DESC_FIELD_WRITER);
            }
        }
        methodWriterVisitMethod.return_();
        methodWriterVisitMethod.visitMaxs(7, 7);
    }

    private void genMethodWrite(ObjectWriterProvider objectWriterProvider, Class cls, List<FieldWriter> list, ClassWriter classWriter, String str, long j) {
        String str2;
        boolean z = (j & FieldInfo.DISABLE_JSONB) != 0;
        boolean z2 = (j & FieldInfo.DISABLE_ARRAY_MAPPING) != 0;
        boolean z3 = (j & FieldInfo.DISABLE_AUTO_TYPE) != 0;
        MethodWriter methodWriterVisitMethod = classWriter.visitMethod(1, "write", METHOD_DESC_WRITE, list.size() < 6 ? 512 : 1024);
        Label label = new Label();
        MethodWriterContext methodWriterContext = new MethodWriterContext(objectWriterProvider, cls, j, str, methodWriterVisitMethod, 8, false);
        methodWriterContext.genVariantsMethodBefore(false);
        methodWriterContext.genIsEnabled(JSONWriter.Feature.IgnoreErrorGetter.mask | JSONWriter.Feature.UnquoteFieldName.mask, label);
        methodWriterVisitMethod.aload(0);
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.aload(2);
        methodWriterVisitMethod.aload(3);
        methodWriterVisitMethod.aload(4);
        methodWriterVisitMethod.lload(5);
        String str3 = ASMUtils.TYPE_OBJECT_WRITER_ADAPTER;
        String str4 = METHOD_DESC_WRITE_OBJECT;
        methodWriterVisitMethod.invokespecial(str3, "write", str4);
        methodWriterVisitMethod.return_();
        methodWriterVisitMethod.visitLabel(label);
        if (z) {
            str2 = str4;
        } else {
            Label label2 = new Label();
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.getfield(ASMUtils.TYPE_JSON_WRITER, "jsonb", "Z");
            methodWriterVisitMethod.ifeq(label2);
            if (z2) {
                str2 = str4;
            } else {
                Label label3 = new Label();
                str2 = str4;
                methodWriterContext.genIsEnabled(JSONWriter.Feature.BeanToArray.mask, label3);
                methodWriterVisitMethod.aload(0);
                methodWriterVisitMethod.aload(1);
                methodWriterVisitMethod.aload(2);
                methodWriterVisitMethod.aload(3);
                methodWriterVisitMethod.aload(4);
                methodWriterVisitMethod.lload(5);
                methodWriterVisitMethod.invokevirtual(str, "writeArrayMappingJSONB", str2);
                methodWriterVisitMethod.return_();
                methodWriterVisitMethod.visitLabel(label3);
            }
            methodWriterVisitMethod.aload(0);
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.aload(2);
            methodWriterVisitMethod.aload(3);
            methodWriterVisitMethod.aload(4);
            methodWriterVisitMethod.lload(5);
            methodWriterVisitMethod.invokevirtual(str, "writeJSONB", str2);
            methodWriterVisitMethod.return_();
            methodWriterVisitMethod.visitLabel(label2);
        }
        if (!z2) {
            Label label4 = new Label();
            methodWriterContext.genIsEnabled(JSONWriter.Feature.BeanToArray.mask, label4);
            methodWriterVisitMethod.aload(0);
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.aload(2);
            methodWriterVisitMethod.aload(3);
            methodWriterVisitMethod.aload(4);
            methodWriterVisitMethod.lload(5);
            methodWriterVisitMethod.invokevirtual(str, "writeArrayMapping", str2);
            methodWriterVisitMethod.return_();
            methodWriterVisitMethod.visitLabel(label4);
        }
        Label label5 = new Label();
        hashFilter(methodWriterVisitMethod, list, label5);
        methodWriterVisitMethod.aload(0);
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.aload(2);
        methodWriterVisitMethod.aload(3);
        methodWriterVisitMethod.aload(4);
        methodWriterVisitMethod.lload(5);
        methodWriterVisitMethod.invokevirtual(str, "writeWithFilter", str2);
        methodWriterVisitMethod.return_();
        methodWriterVisitMethod.visitLabel(label5);
        Label label6 = new Label();
        if (cls == null || !Serializable.class.isAssignableFrom(cls)) {
            Label label7 = new Label();
            methodWriterContext.genIsEnabled(JSONWriter.Feature.IgnoreNoneSerializable.mask, label7);
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeNull", "()V");
            methodWriterVisitMethod.goto_(label6);
            methodWriterVisitMethod.visitLabel(label7);
            Label label8 = new Label();
            methodWriterContext.genIsEnabled(JSONWriter.Feature.ErrorOnNoneSerializable.mask, label8);
            methodWriterVisitMethod.aload(0);
            methodWriterVisitMethod.invokevirtual(methodWriterContext.classNameType, "errorOnNoneSerializable", "()V");
            methodWriterVisitMethod.goto_(label6);
            methodWriterVisitMethod.visitLabel(label8);
        }
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "startObject", "()V");
        if (!z3) {
            methodWriterVisitMethod.iconst_1();
            methodWriterVisitMethod.istore(7);
            Label label9 = new Label();
            isWriteTypeInfo(j, methodWriterVisitMethod, 2, 4, 5, label9);
            methodWriterVisitMethod.aload(0);
            methodWriterVisitMethod.aload(1);
            methodWriterVisitMethod.invokeinterface(ASMUtils.TYPE_OBJECT_WRITER, "writeTypeInfo", METHOD_DESC_WRITE_TYPE_INFO);
            methodWriterVisitMethod.iconst_1();
            methodWriterVisitMethod.ixor();
            methodWriterVisitMethod.istore(7);
            methodWriterVisitMethod.visitLabel(label9);
        }
        for (int i = 0; i < list.size(); i++) {
            gwFieldValue(methodWriterContext, list.get(i), 2, i);
        }
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "endObject", "()V");
        methodWriterVisitMethod.visitLabel(label6);
        methodWriterVisitMethod.return_();
        int i2 = methodWriterContext.maxVariant;
        methodWriterVisitMethod.visitMaxs(i2 + 1, i2 + 1);
    }

    private void genMethodWriteArrayMapping(ObjectWriterProvider objectWriterProvider, String str, Class cls, long j, List<FieldWriter> list, ClassWriter classWriter, String str2) {
        String str3 = METHOD_DESC_WRITE;
        MethodWriter methodWriterVisitMethod = classWriter.visitMethod(1, str, str3, 512);
        Label label = new Label();
        methodWriterVisitMethod.aload(1);
        String str4 = ASMUtils.TYPE_JSON_WRITER;
        methodWriterVisitMethod.getfield(str4, "jsonb", "Z");
        methodWriterVisitMethod.ifeq(label);
        methodWriterVisitMethod.aload(0);
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.aload(2);
        methodWriterVisitMethod.aload(3);
        methodWriterVisitMethod.aload(4);
        methodWriterVisitMethod.lload(5);
        methodWriterVisitMethod.invokevirtual(str2, "writeArrayMappingJSONB", METHOD_DESC_WRITE_OBJECT);
        methodWriterVisitMethod.return_();
        methodWriterVisitMethod.visitLabel(label);
        Label label2 = new Label();
        hashFilter(methodWriterVisitMethod, list, label2);
        methodWriterVisitMethod.aload(0);
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.aload(2);
        methodWriterVisitMethod.aload(3);
        methodWriterVisitMethod.aload(4);
        methodWriterVisitMethod.lload(5);
        methodWriterVisitMethod.invokespecial(ASMUtils.TYPE_OBJECT_WRITER_ADAPTER, str, str3);
        methodWriterVisitMethod.return_();
        methodWriterVisitMethod.visitLabel(label2);
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.invokevirtual(str4, "startArray", "()V");
        MethodWriterContext methodWriterContext = new MethodWriterContext(objectWriterProvider, cls, j, str2, methodWriterVisitMethod, 7, false);
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                methodWriterVisitMethod.aload(1);
                methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeComma", "()V");
            }
            gwFieldValueArrayMapping(list.get(i), methodWriterContext, 2, i);
        }
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "endArray", "()V");
        methodWriterVisitMethod.return_();
        int i2 = methodWriterContext.maxVariant;
        methodWriterVisitMethod.visitMaxs(i2 + 1, i2 + 1);
    }

    private void genMethodWriteArrayMappingJSONB(ObjectWriterProvider objectWriterProvider, Class cls, long j, List<FieldWriterGroup> list, List<FieldWriter> list2, ClassWriter classWriter, String str, long j2) {
        int i;
        int i2;
        int i3;
        int i4;
        int iFieldCapacity;
        int i5 = 1;
        MethodWriter methodWriterVisitMethod = classWriter.visitMethod(1, "writeArrayMappingJSONB", METHOD_DESC_WRITE, 512);
        MethodWriterContext methodWriterContext = new MethodWriterContext(objectWriterProvider, cls, j, str, methodWriterVisitMethod, 7, true);
        MethodWriter methodWriter = methodWriterVisitMethod;
        int iVar = methodWriterContext.var("offset");
        int iVar2 = methodWriterContext.var("bytes");
        int iVar3 = methodWriterContext.var2(CONTEXT_FEATURES);
        if ((j2 & FieldInfo.DISABLE_AUTO_TYPE) == 0) {
            Label label = new Label();
            isWriteTypeInfo(j, methodWriter, 2, 4, 5, label);
            methodWriter.aload(0);
            methodWriter.aload(1);
            methodWriter.invokevirtual(str, "writeClassInfo", METHOD_DESC_WRITE_CLASS_INFO);
            methodWriter.visitLabel(label);
        }
        int size = list2.size();
        methodWriterContext.genVariantsMethodBefore(true);
        for (FieldWriterGroup fieldWriterGroup : list) {
            if (fieldWriterGroup.direct) {
                methodWriter.aload(i5);
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "getOffset", "()I");
                methodWriter.istore(iVar);
                int i6 = 6;
                for (FieldWriterRecord fieldWriterRecord : fieldWriterGroup.fieldWriters) {
                    FieldWriter fieldWriter = fieldWriterRecord.fieldWriter;
                    Class<?> cls2 = fieldWriter.fieldClass;
                    if (isFieldVarIndex(methodWriterContext, fieldWriter)) {
                        iFieldCapacity = i6;
                        sotreFieldValueToLocalVar(methodWriterContext, fieldWriterRecord.ordinal, fieldWriter, 2, methodWriter);
                    } else {
                        iFieldCapacity = fieldCapacity(cls2) + i6;
                    }
                    i6 = iFieldCapacity;
                    i5 = 1;
                }
                methodWriter.aload(i5);
                methodWriter.iload(iVar);
                methodWriter.visitLdcInsn(i6);
                methodWriter.iadd();
                MethodWriter methodWriter2 = methodWriter;
                int i7 = iVar3;
                fieldValueCapacity(j, fieldWriterGroup.fieldWriters, methodWriterContext, methodWriter2, i7);
                methodWriter = methodWriter2;
                String str2 = ASMUtils.TYPE_JSON_WRITER;
                methodWriter.invokevirtual(str2, "ensureCapacity", "(I)Ljava/lang/Object;");
                methodWriter.checkcast("[B");
                methodWriter.astore(iVar2);
                if (fieldWriterGroup.start) {
                    methodWriter.aload(iVar2);
                    methodWriter.iload(iVar);
                    methodWriter.visitLdcInsn(list2.size());
                    i4 = 1;
                    methodWriter.invokestatic(ASMUtils.TYPE_JSONB_IO, "startArray", "([BII)I", true);
                    methodWriter.istore(iVar);
                } else {
                    i4 = 1;
                }
                int iVar4 = methodWriterContext.var("symbolTable");
                methodWriter.aload(i4);
                methodWriter.getfield(str2, "symbolTable", DESC_SYMBOL);
                methodWriter.astore(iVar4);
                for (FieldWriterRecord fieldWriterRecord2 : fieldWriterGroup.fieldWriters) {
                    MethodWriter methodWriter3 = methodWriter;
                    FieldWriter fieldWriter2 = fieldWriterRecord2.fieldWriter;
                    int i8 = fieldWriterRecord2.ordinal;
                    int i9 = iVar;
                    int i10 = iVar2;
                    int i11 = i7;
                    MethodWriterContext methodWriterContext2 = methodWriterContext;
                    writeFieldValueDirectJSONB(j, str, methodWriterContext2, fieldWriter2, i8, methodWriter3, i10, i9, 2, i11, iVar4, false);
                    iVar2 = i10;
                    i7 = i11;
                    methodWriterContext = methodWriterContext2;
                    methodWriter = methodWriter3;
                    iVar = i9;
                }
                int i12 = iVar2;
                i3 = i7;
                i2 = i12;
                i = iVar;
                methodWriter.aload(1);
                methodWriter.iload(i);
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "setOffset", "(I)V");
            } else {
                i = iVar;
                i2 = iVar2;
                i3 = iVar3;
                int i13 = i5;
                if (fieldWriterGroup.start) {
                    methodWriter.aload(i13);
                    if (size <= 15) {
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "startArray" + size, "()V");
                    } else {
                        methodWriter.iconst_n(size);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "startArray", "(I)V");
                    }
                }
                for (FieldWriterRecord fieldWriterRecord3 : fieldWriterGroup.fieldWriters) {
                    gwValueJSONB(methodWriterContext, fieldWriterRecord3.fieldWriter, 2, fieldWriterRecord3.ordinal);
                }
            }
            iVar = i;
            iVar3 = i3;
            i5 = 1;
            iVar2 = i2;
        }
        methodWriter.return_();
        int i14 = methodWriterContext.maxVariant;
        methodWriter.visitMaxs(i14 + 1, i14 + 1);
    }

    private void genMethodWriteJSONB(ObjectWriterProvider objectWriterProvider, Class cls, List<FieldWriterGroup> list, List<FieldWriter> list2, ClassWriter classWriter, String str, long j) {
        MethodWriterContext methodWriterContext;
        Label label;
        String str2;
        Integer num;
        MethodWriterContext methodWriterContext2;
        int i = 1;
        MethodWriter methodWriterVisitMethod = classWriter.visitMethod(1, "writeJSONB", METHOD_DESC_WRITE, list2.size() < 6 ? 512 : 1024);
        MethodWriterContext methodWriterContext3 = new MethodWriterContext(objectWriterProvider, cls, j, str, methodWriterVisitMethod, 7, true);
        MethodWriter methodWriter = methodWriterVisitMethod;
        methodWriterContext3.genVariantsMethodBefore(true);
        Label label2 = new Label();
        String str3 = "()V";
        if (cls == null || !Serializable.class.isAssignableFrom(cls)) {
            Label label3 = new Label();
            methodWriterContext3.genIsEnabled(JSONWriter.Feature.IgnoreNoneSerializable.mask, label3);
            methodWriter.aload(1);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeNull", "()V");
            methodWriter.goto_(label2);
            methodWriter.visitLabel(label3);
            Label label4 = new Label();
            methodWriterContext3.genIsEnabled(JSONWriter.Feature.ErrorOnNoneSerializable.mask, label4);
            methodWriter.aload(0);
            methodWriter.invokevirtual(methodWriterContext3.classNameType, "errorOnNoneSerializable", "()V");
            methodWriter.goto_(label2);
            methodWriter.visitLabel(label4);
        }
        if ((j & FieldInfo.DISABLE_AUTO_TYPE) == 0) {
            Label label5 = new Label();
            isWriteTypeInfo(j, methodWriter, 2, 4, 5, label5);
            methodWriter.aload(0);
            methodWriter.aload(1);
            methodWriter.invokevirtual(str, "writeClassInfo", METHOD_DESC_WRITE_CLASS_INFO);
            methodWriter.visitLabel(label5);
        }
        Iterator<FieldWriterGroup> it = list.iterator();
        Integer num2 = null;
        while (it.hasNext()) {
            FieldWriterGroup next = it.next();
            if (next.direct) {
                int iVar = methodWriterContext3.var("offset");
                int iVar2 = methodWriterContext3.var("bytes");
                int iVar3 = methodWriterContext3.var2(CONTEXT_FEATURES);
                methodWriter.aload(i);
                String str4 = ASMUtils.TYPE_JSON_WRITER;
                methodWriter.invokevirtual(str4, "getOffset", "()I");
                methodWriter.istore(iVar);
                if (num2 == null) {
                    int iVar4 = methodWriterContext3.var("symbolTable");
                    Integer numValueOf = Integer.valueOf(iVar4);
                    methodWriter.aload(i);
                    methodWriter.getfield(str4, "symbolTable", DESC_SYMBOL);
                    methodWriter.astore(iVar4);
                    num = numValueOf;
                } else {
                    num = num2;
                }
                int i2 = ((next.start ? 1 : 0) ^ i) + ((next.end ? 1 : 0) ^ i);
                for (FieldWriterRecord fieldWriterRecord : next.fieldWriters) {
                    FieldWriter fieldWriter = fieldWriterRecord.fieldWriter;
                    int length = i2 + fieldWriter.nameJSONB.length;
                    Class<?> cls2 = fieldWriter.fieldClass;
                    if (isFieldVarIndex(methodWriterContext3, fieldWriter)) {
                        MethodWriterContext methodWriterContext4 = methodWriterContext3;
                        sotreFieldValueToLocalVar(methodWriterContext4, fieldWriterRecord.ordinal, fieldWriter, 2, methodWriter);
                        methodWriterContext2 = methodWriterContext4;
                    } else {
                        methodWriterContext2 = methodWriterContext3;
                        length += fieldCapacity(cls2);
                    }
                    i2 = length;
                    methodWriterContext3 = methodWriterContext2;
                }
                MethodWriterContext methodWriterContext5 = methodWriterContext3;
                methodWriter.aload(i);
                methodWriter.iload(iVar);
                methodWriter.visitLdcInsn(i2);
                methodWriter.iadd();
                MethodWriter methodWriter2 = methodWriter;
                fieldValueCapacity(j, next.fieldWriters, methodWriterContext5, methodWriter2, iVar3);
                methodWriterContext = methodWriterContext5;
                methodWriter = methodWriter2;
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "ensureCapacity", "(I)Ljava/lang/Object;");
                methodWriter.checkcast("[B");
                methodWriter.astore(iVar2);
                if (next.start) {
                    gwWriteByte(methodWriter, iVar2, iVar, JSONB.Constants.BC_OBJECT);
                    methodWriter.visitIincInsn(iVar, i);
                }
                for (FieldWriterRecord fieldWriterRecord2 : next.fieldWriters) {
                    MethodWriter methodWriter3 = methodWriter;
                    FieldWriterGroup fieldWriterGroup = next;
                    int i3 = iVar;
                    int i4 = iVar3;
                    int i5 = iVar2;
                    writeFieldValueDirectJSONB(j, str, methodWriterContext, fieldWriterRecord2.fieldWriter, fieldWriterRecord2.ordinal, methodWriter3, i5, i3, 2, i4, num.intValue(), true);
                    methodWriter = methodWriter3;
                    iVar2 = i5;
                    iVar = i3;
                    iVar3 = i4;
                    next = fieldWriterGroup;
                    str3 = str3;
                    label2 = label2;
                }
                FieldWriterGroup fieldWriterGroup2 = next;
                int i6 = iVar;
                int i7 = iVar2;
                label = label2;
                str2 = str3;
                if (fieldWriterGroup2.end) {
                    gwWriteByte(methodWriter, i7, i6, JSONB.Constants.BC_OBJECT_END);
                }
                methodWriter.aload(1);
                methodWriter.iload(i6);
                if (fieldWriterGroup2.end) {
                    methodWriter.iconst_1();
                    methodWriter.iadd();
                }
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "setOffset", "(I)V");
                num2 = num;
            } else {
                methodWriterContext = methodWriterContext3;
                label = label2;
                str2 = str3;
                if (next.start) {
                    methodWriter.aload(1);
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "startObject", str2);
                }
                for (FieldWriterRecord fieldWriterRecord3 : next.fieldWriters) {
                    gwFieldValueJSONB(methodWriterContext, fieldWriterRecord3.fieldWriter, 2, fieldWriterRecord3.ordinal);
                }
                if (next.end) {
                    methodWriter.aload(1);
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "endObject", str2);
                }
            }
            methodWriterContext3 = methodWriterContext;
            str3 = str2;
            i = 1;
            label2 = label;
        }
        methodWriter.visitLabel(label2);
        methodWriter.return_();
        int i8 = methodWriterContext3.maxVariant;
        methodWriter.visitMaxs(i8 + 1, i8 + 1);
    }

    private void gwDate(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2) {
        MethodWriter methodWriter = methodWriterContext.mw;
        methodWriter.aload(0);
        methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
        methodWriter.aload(1);
        methodWriter.iconst_0();
        genGetObject(methodWriterContext, fieldWriter, i2, i);
        methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "writeDate", METHOD_DESC_WRITE_DATE_WITH_FIELD_NAME);
    }

    private void gwDouble(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2) {
        int i3;
        String str;
        boolean z = methodWriterContext.jsonb;
        MethodWriter methodWriter = methodWriterContext.mw;
        Class cls = fieldWriter.fieldClass;
        String str2 = methodWriterContext.classNameType;
        int iVar = methodWriterContext.var(cls);
        Label label = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        genGetObject(methodWriterContext, fieldWriter, i2, i);
        methodWriter.dup();
        methodWriter.astore(iVar);
        methodWriter.ifnonnull(label2);
        long j = fieldWriter.features;
        long j2 = JSONWriter.Feature.WriteNulls.mask;
        JSONWriter.Feature feature = JSONWriter.Feature.NullAsDefaultValue;
        long j3 = feature.mask;
        long j4 = j2 | j3;
        JSONWriter.Feature feature2 = JSONWriter.Feature.WriteNullNumberAsZero;
        long j5 = feature2.mask;
        if ((j & (j4 | j5)) == 0) {
            methodWriterContext.genIsEnabled(j2 | j3 | j5, label3, label);
            methodWriter.visitLabel(label3);
            gwFieldName(methodWriterContext, fieldWriter, i2);
            methodWriter.aload(1);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeDecimalNull", "()V");
            i3 = iVar;
            str = str2;
        } else {
            gwFieldName(methodWriterContext, fieldWriter, i2);
            methodWriter.aload(1);
            i3 = iVar;
            str = str2;
            if ((fieldWriter.features & (feature2.mask | feature.mask)) != 0) {
                methodWriter.visitLdcInsn(0);
                methodWriter.i2d();
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeDouble", "(D)V");
            } else {
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeNull", "()V");
            }
        }
        methodWriter.goto_(label);
        methodWriter.visitLabel(label2);
        String str3 = str;
        if (z && (fieldWriter.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) == 0) {
            gwFieldName(methodWriterContext, fieldWriter, i2);
            methodWriter.aload(1);
            methodWriter.aload(i3);
            methodWriter.invokevirtual("java/lang/Double", "doubleValue", "()D");
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeDouble", "(D)V");
        } else {
            methodWriter.aload(0);
            methodWriter.getfield(str3, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
            methodWriter.aload(1);
            methodWriter.aload(i3);
            methodWriter.invokevirtual("java/lang/Double", "doubleValue", "()D");
            methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "writeDouble", METHOD_DESC_WRITE_D);
        }
        methodWriter.visitLabel(label);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x0270  */
    /* JADX WARN: Code duplicated, block: B:46:0x0274  */
    /* JADX WARN: Code duplicated, block: B:50:0x0298  */
    /* JADX WARN: Code duplicated, block: B:52:0x029e  */
    /* JADX WARN: Code duplicated, block: B:83:0x032a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0344  */
    /* JADX WARN: Code duplicated, block: B:87:0x0347  */
    /* JADX WARN: Code duplicated, block: B:90:0x0350  */
    /* JADX WARN: Code duplicated, block: B:96:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    private void gwFieldName(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        Number numberValueOf;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        int i2;
        MethodWriter methodWriter = methodWriterContext.mw;
        String str3 = methodWriterContext.classNameType;
        Label label = new Label();
        Label label2 = new Label();
        Number numberValueOf2 = 0;
        String str4 = "writeName16Raw";
        String str5 = "(J)V";
        if (methodWriterContext.jsonb) {
            byte[] bytes = JSONB.toBytes(fieldWriter.fieldName);
            int length = bytes.length;
            byte[] bArrCopyOf = Arrays.copyOf(bytes, 16);
            switch (length) {
                case 2:
                    str4 = "writeName2Raw";
                    break;
                case 3:
                    str4 = "writeName3Raw";
                    break;
                case 4:
                    str4 = "writeName4Raw";
                    break;
                case 5:
                    str4 = "writeName5Raw";
                    break;
                case 6:
                    str4 = "writeName6Raw";
                    break;
                case 7:
                    str4 = "writeName7Raw";
                    break;
                case 8:
                    str4 = "writeName8Raw";
                    break;
                case 9:
                    str4 = "writeName9Raw";
                    str5 = "(JI)V";
                    break;
                case 10:
                    str4 = "writeName10Raw";
                    str5 = "(JJ)V";
                    break;
                case 11:
                    str4 = "writeName11Raw";
                    str5 = "(JJ)V";
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    str4 = "writeName12Raw";
                    str5 = "(JJ)V";
                    break;
                case 13:
                    str4 = "writeName13Raw";
                    str5 = "(JJ)V";
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    str4 = "writeName14Raw";
                    str5 = "(JJ)V";
                    break;
                case 15:
                    str4 = "writeName15Raw";
                    str5 = "(JJ)V";
                    break;
                case 16:
                    str5 = "(JJ)V";
                    break;
                default:
                    str4 = null;
                    break;
            }
            if (str4 != null) {
                methodWriter.iload(methodWriterContext.var(NAME_DIRECT));
                methodWriter.ifeq(label);
                Unsafe unsafe = JDKUtils.UNSAFE;
                long j = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                long j2 = unsafe.getLong(bArrCopyOf, j);
                methodWriter.aload(1);
                methodWriter.visitLdcInsn(j2);
                if ("(JI)V".equals(str5)) {
                    methodWriter.visitLdcInsn(unsafe.getInt(bArrCopyOf, j + 8));
                } else if ("(JJ)V".equals(str5)) {
                    methodWriter.visitLdcInsn(unsafe.getLong(bArrCopyOf, j + 8));
                }
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str5);
                methodWriter.goto_(label2);
                z = true;
            }
            if (z) {
                methodWriter.visitLabel(label);
            }
            methodWriter.aload(0);
            methodWriter.getfield(str3, fieldWriter(i), ASMUtils.DESC_FIELD_WRITER);
            methodWriter.aload(1);
            String str6 = ASMUtils.TYPE_FIELD_WRITER;
            if (methodWriterContext.jsonb) {
                str = "writeFieldNameJSONB";
            } else {
                str = "writeFieldName";
            }
            methodWriter.invokevirtual(str6, str, METHOD_DESC_WRITE_FIELD_NAME);
            if (z) {
                methodWriter.visitLabel(label2);
            }
        }
        byte[] bytes2 = fieldWriter.fieldName.getBytes(StandardCharsets.UTF_8);
        int i3 = 0;
        while (true) {
            if (i3 >= bytes2.length) {
                z2 = true;
                break;
            } else {
                if (bytes2[i3] < 0) {
                    z2 = false;
                    break;
                }
                i3++;
            }
        }
        int length2 = bytes2.length;
        if (length2 >= 2 && length2 <= 16 && z2) {
            byte[] bArr = new byte[8];
            switch (length2) {
                case 2:
                    bArr[0] = 34;
                    System.arraycopy(bytes2, 0, bArr, 1, 2);
                    bArr[3] = 34;
                    bArr[4] = 58;
                    str4 = "writeName2Raw";
                    bytes2 = bArr;
                    numberValueOf = numberValueOf2;
                    long j3 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    for (i2 = 0; i2 < bytes2.length; i2++) {
                        if (bytes2[i2] == 34) {
                            bytes2[i2] = 39;
                        }
                    }
                    long j4 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    methodWriter.aload(1);
                    methodWriterContext.ldcIFEQ(NAME_DIRECT, Long.valueOf(j3), Long.valueOf(j4));
                    if ("(JI)V".equals(str5) || "(JJ)V".equals(str5)) {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    }
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str5);
                    return;
                case 3:
                    bArr[0] = 34;
                    System.arraycopy(bytes2, 0, bArr, 1, 3);
                    bArr[4] = 34;
                    bArr[5] = 58;
                    str2 = "writeName3Raw";
                    str4 = str2;
                    bytes2 = bArr;
                    numberValueOf = numberValueOf2;
                    long j5 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    while (i2 < bytes2.length) {
                        if (bytes2[i2] == 34) {
                            bytes2[i2] = 39;
                        }
                    }
                    long j6 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    methodWriter.aload(1);
                    methodWriterContext.ldcIFEQ(NAME_DIRECT, Long.valueOf(j5), Long.valueOf(j6));
                    if ("(JI)V".equals(str5)) {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    } else {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    }
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str5);
                    return;
                case 4:
                    bArr[0] = 34;
                    System.arraycopy(bytes2, 0, bArr, 1, 4);
                    bArr[5] = 34;
                    bArr[6] = 58;
                    str2 = "writeName4Raw";
                    str4 = str2;
                    bytes2 = bArr;
                    numberValueOf = numberValueOf2;
                    long j7 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    while (i2 < bytes2.length) {
                        if (bytes2[i2] == 34) {
                            bytes2[i2] = 39;
                        }
                    }
                    long j8 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    methodWriter.aload(1);
                    methodWriterContext.ldcIFEQ(NAME_DIRECT, Long.valueOf(j7), Long.valueOf(j8));
                    if ("(JI)V".equals(str5)) {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    } else {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    }
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str5);
                    return;
                case 5:
                    bArr[0] = 34;
                    System.arraycopy(bytes2, 0, bArr, 1, 5);
                    bArr[6] = 34;
                    bArr[7] = 58;
                    str2 = "writeName5Raw";
                    str4 = str2;
                    bytes2 = bArr;
                    numberValueOf = numberValueOf2;
                    long j9 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    while (i2 < bytes2.length) {
                        if (bytes2[i2] == 34) {
                            bytes2[i2] = 39;
                        }
                    }
                    long j10 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    methodWriter.aload(1);
                    methodWriterContext.ldcIFEQ(NAME_DIRECT, Long.valueOf(j9), Long.valueOf(j10));
                    if ("(JI)V".equals(str5)) {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    } else {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    }
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str5);
                    return;
                case 6:
                    bArr[0] = 34;
                    System.arraycopy(bytes2, 0, bArr, 1, 6);
                    bArr[7] = 34;
                    str2 = "writeName6Raw";
                    str4 = str2;
                    bytes2 = bArr;
                    numberValueOf = numberValueOf2;
                    long j11 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    while (i2 < bytes2.length) {
                        if (bytes2[i2] == 34) {
                            bytes2[i2] = 39;
                        }
                    }
                    long j12 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    methodWriter.aload(1);
                    methodWriterContext.ldcIFEQ(NAME_DIRECT, Long.valueOf(j11), Long.valueOf(j12));
                    if ("(JI)V".equals(str5)) {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    } else {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    }
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str5);
                    return;
                case 7:
                    bArr[0] = 34;
                    System.arraycopy(bytes2, 0, bArr, 1, 7);
                    str2 = "writeName7Raw";
                    str4 = str2;
                    bytes2 = bArr;
                    numberValueOf = numberValueOf2;
                    long j13 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    while (i2 < bytes2.length) {
                        if (bytes2[i2] == 34) {
                            bytes2[i2] = 39;
                        }
                    }
                    long j14 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    methodWriter.aload(1);
                    methodWriterContext.ldcIFEQ(NAME_DIRECT, Long.valueOf(j13), Long.valueOf(j14));
                    if ("(JI)V".equals(str5)) {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    } else {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    }
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str5);
                    return;
                case 8:
                    str4 = "writeName8Raw";
                    numberValueOf = numberValueOf2;
                    long j15 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    while (i2 < bytes2.length) {
                        if (bytes2[i2] == 34) {
                            bytes2[i2] = 39;
                        }
                    }
                    long j16 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    methodWriter.aload(1);
                    methodWriterContext.ldcIFEQ(NAME_DIRECT, Long.valueOf(j15), Long.valueOf(j16));
                    if ("(JI)V".equals(str5)) {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    } else {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    }
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str5);
                    return;
                case 9:
                    bArr[0] = 34;
                    System.arraycopy(bytes2, 0, bArr, 1, 7);
                    byte[] bArr2 = {bytes2[7], bytes2[8], 34, 58};
                    Unsafe unsafe2 = JDKUtils.UNSAFE;
                    long j17 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                    Integer numValueOf = Integer.valueOf(unsafe2.getInt(bArr2, j17));
                    bArr2[2] = 39;
                    str4 = "writeName9Raw";
                    numberValueOf2 = numValueOf;
                    numberValueOf = Integer.valueOf(unsafe2.getInt(bArr2, j17));
                    bytes2 = bArr;
                    str5 = "(JI)V";
                    long j18 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    while (i2 < bytes2.length) {
                        if (bytes2[i2] == 34) {
                            bytes2[i2] = 39;
                        }
                    }
                    long j19 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    methodWriter.aload(1);
                    methodWriterContext.ldcIFEQ(NAME_DIRECT, Long.valueOf(j18), Long.valueOf(j19));
                    if ("(JI)V".equals(str5)) {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    } else {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    }
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str5);
                    return;
                case 10:
                    bArr[0] = 34;
                    System.arraycopy(bytes2, 0, bArr, 1, 7);
                    byte[] bArr3 = {bytes2[7], bytes2[8], bytes2[9], 34, 58, 0, 0, 0};
                    Unsafe unsafe3 = JDKUtils.UNSAFE;
                    long j20 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                    lValueOf = Long.valueOf(unsafe3.getLong(bArr3, j20));
                    bArr3[3] = 39;
                    lValueOf2 = Long.valueOf(unsafe3.getLong(bArr3, j20));
                    str4 = "writeName10Raw";
                    lValueOf3 = lValueOf2;
                    numberValueOf2 = lValueOf;
                    numberValueOf = lValueOf3;
                    bytes2 = bArr;
                    str5 = "(JJ)V";
                    long j110 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    while (i2 < bytes2.length) {
                        if (bytes2[i2] == 34) {
                            bytes2[i2] = 39;
                        }
                    }
                    long j111 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    methodWriter.aload(1);
                    methodWriterContext.ldcIFEQ(NAME_DIRECT, Long.valueOf(j110), Long.valueOf(j111));
                    if ("(JI)V".equals(str5)) {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    } else {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    }
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str5);
                    return;
                case 11:
                    bArr[0] = 34;
                    System.arraycopy(bytes2, 0, bArr, 1, 7);
                    byte[] bArr4 = {bytes2[7], bytes2[8], bytes2[9], bytes2[10], 34, 58, 0, 0};
                    Unsafe unsafe4 = JDKUtils.UNSAFE;
                    long j21 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                    numberValueOf2 = Long.valueOf(unsafe4.getLong(bArr4, j21));
                    bArr4[4] = 39;
                    lValueOf3 = Long.valueOf(unsafe4.getLong(bArr4, j21));
                    str4 = "writeName11Raw";
                    numberValueOf = lValueOf3;
                    bytes2 = bArr;
                    str5 = "(JJ)V";
                    long j112 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    while (i2 < bytes2.length) {
                        if (bytes2[i2] == 34) {
                            bytes2[i2] = 39;
                        }
                    }
                    long j113 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    methodWriter.aload(1);
                    methodWriterContext.ldcIFEQ(NAME_DIRECT, Long.valueOf(j112), Long.valueOf(j113));
                    if ("(JI)V".equals(str5)) {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    } else {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    }
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str5);
                    return;
                case Opcodes.FCONST_1 /* 12 */:
                    bArr[0] = 34;
                    System.arraycopy(bytes2, 0, bArr, 1, 7);
                    byte[] bArr5 = {bytes2[7], bytes2[8], bytes2[9], bytes2[10], bytes2[11], 34, 58, 0};
                    Unsafe unsafe5 = JDKUtils.UNSAFE;
                    long j22 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                    numberValueOf2 = Long.valueOf(unsafe5.getLong(bArr5, j22));
                    bArr5[5] = 39;
                    lValueOf3 = Long.valueOf(unsafe5.getLong(bArr5, j22));
                    str4 = "writeName12Raw";
                    numberValueOf = lValueOf3;
                    bytes2 = bArr;
                    str5 = "(JJ)V";
                    long j114 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    while (i2 < bytes2.length) {
                        if (bytes2[i2] == 34) {
                            bytes2[i2] = 39;
                        }
                    }
                    long j115 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    methodWriter.aload(1);
                    methodWriterContext.ldcIFEQ(NAME_DIRECT, Long.valueOf(j114), Long.valueOf(j115));
                    if ("(JI)V".equals(str5)) {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    } else {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    }
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str5);
                    return;
                case 13:
                    bArr[0] = 34;
                    System.arraycopy(bytes2, 0, bArr, 1, 7);
                    byte[] bArr6 = {bytes2[7], bytes2[8], bytes2[9], bytes2[10], bytes2[11], bytes2[12], 34, 58};
                    Unsafe unsafe6 = JDKUtils.UNSAFE;
                    long j23 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                    lValueOf = Long.valueOf(unsafe6.getLong(bArr6, j23));
                    bArr6[6] = 39;
                    lValueOf2 = Long.valueOf(unsafe6.getLong(bArr6, j23));
                    str4 = "writeName13Raw";
                    lValueOf3 = lValueOf2;
                    numberValueOf2 = lValueOf;
                    numberValueOf = lValueOf3;
                    bytes2 = bArr;
                    str5 = "(JJ)V";
                    long j116 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    while (i2 < bytes2.length) {
                        if (bytes2[i2] == 34) {
                            bytes2[i2] = 39;
                        }
                    }
                    long j117 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    methodWriter.aload(1);
                    methodWriterContext.ldcIFEQ(NAME_DIRECT, Long.valueOf(j116), Long.valueOf(j117));
                    if ("(JI)V".equals(str5)) {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    } else {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    }
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str5);
                    return;
                case Opcodes.DCONST_0 /* 14 */:
                    bArr[0] = 34;
                    System.arraycopy(bytes2, 0, bArr, 1, 7);
                    byte[] bArr7 = {bytes2[7], bytes2[8], bytes2[9], bytes2[10], bytes2[11], bytes2[12], bytes2[13], 34};
                    Unsafe unsafe7 = JDKUtils.UNSAFE;
                    long j24 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                    numberValueOf2 = Long.valueOf(unsafe7.getLong(bArr7, j24));
                    bArr7[7] = 39;
                    lValueOf3 = Long.valueOf(unsafe7.getLong(bArr7, j24));
                    str4 = "writeName14Raw";
                    numberValueOf = lValueOf3;
                    bytes2 = bArr;
                    str5 = "(JJ)V";
                    long j118 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    while (i2 < bytes2.length) {
                        if (bytes2[i2] == 34) {
                            bytes2[i2] = 39;
                        }
                    }
                    long j119 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    methodWriter.aload(1);
                    methodWriterContext.ldcIFEQ(NAME_DIRECT, Long.valueOf(j118), Long.valueOf(j119));
                    if ("(JI)V".equals(str5)) {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    } else {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    }
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str5);
                    return;
                case 15:
                    bArr[0] = 34;
                    System.arraycopy(bytes2, 0, bArr, 1, 7);
                    numberValueOf2 = Long.valueOf(JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET + 7));
                    str4 = "writeName15Raw";
                    str5 = "(JJ)V";
                    numberValueOf = numberValueOf2;
                    bytes2 = bArr;
                    long j1110 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    while (i2 < bytes2.length) {
                        if (bytes2[i2] == 34) {
                            bytes2[i2] = 39;
                        }
                    }
                    long j1111 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    methodWriter.aload(1);
                    methodWriterContext.ldcIFEQ(NAME_DIRECT, Long.valueOf(j1110), Long.valueOf(j1111));
                    if ("(JI)V".equals(str5)) {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    } else {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    }
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str5);
                    return;
                case 16:
                    System.arraycopy(bytes2, 0, bArr, 0, 8);
                    numberValueOf = Long.valueOf(JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET + 8));
                    numberValueOf2 = numberValueOf;
                    bytes2 = bArr;
                    str5 = "(JJ)V";
                    long j1112 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    while (i2 < bytes2.length) {
                        if (bytes2[i2] == 34) {
                            bytes2[i2] = 39;
                        }
                    }
                    long j1113 = JDKUtils.UNSAFE.getLong(bytes2, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                    methodWriter.aload(1);
                    methodWriterContext.ldcIFEQ(NAME_DIRECT, Long.valueOf(j1112), Long.valueOf(j1113));
                    if ("(JI)V".equals(str5)) {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    } else {
                        methodWriterContext.ldcIFEQ(NAME_DIRECT, numberValueOf2, numberValueOf);
                    }
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str5);
                    return;
                default:
                    throw new IllegalStateException(AbstractC1194.m2779(length2, "length : "));
            }
        }
        z = false;
        if (z) {
            methodWriter.visitLabel(label);
        }
        methodWriter.aload(0);
        methodWriter.getfield(str3, fieldWriter(i), ASMUtils.DESC_FIELD_WRITER);
        methodWriter.aload(1);
        String str7 = ASMUtils.TYPE_FIELD_WRITER;
        if (methodWriterContext.jsonb) {
            str = "writeFieldNameJSONB";
        } else {
            str = "writeFieldName";
        }
        methodWriter.invokevirtual(str7, str, METHOD_DESC_WRITE_FIELD_NAME);
        if (z) {
            methodWriter.visitLabel(label2);
        }
    }

    private static void gwFieldNameDirectJSONB(String str, FieldWriter fieldWriter, int i, MethodWriterContext methodWriterContext, int i2, int i3) {
        Label label = new Label();
        Label label2 = new Label();
        MethodWriter methodWriter = methodWriterContext.mw;
        methodWriterContext.genIsDisabled(JSONWriter.Feature.WriteNameAsSymbol.mask, label);
        int iVar = methodWriterContext.var("symbolTable");
        Label label3 = new Label();
        methodWriter.aload(iVar);
        methodWriter.ifnull(label3);
        int iVar2 = methodWriterContext.var("symbol");
        methodWriter.aload(0);
        methodWriter.getfield(str, fieldWriter(i), ASMUtils.DESC_FIELD_WRITER);
        methodWriter.aload(iVar);
        methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "writeFieldNameSymbol", METHOD_DESC_WRITE_NAME_SYMBOL);
        methodWriter.istore(iVar2);
        methodWriter.iload(iVar2);
        methodWriter.visitLdcInsn(-1);
        methodWriter.if_icmpeq(label3);
        methodWriter.aload(i2);
        methodWriter.iload(i3);
        methodWriter.iload(iVar2);
        methodWriter.ineg();
        methodWriter.invokestatic(ASMUtils.TYPE_JSONB_IO, "writeSymbol", "([BII)I", true);
        methodWriter.istore(i3);
        methodWriter.goto_(label2);
        methodWriter.visitLabel(label3);
        byte[] bArr = fieldWriter.nameJSONB;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 8;
            if (i5 > bArr.length) {
                break;
            }
            gwWriteLong(methodWriter, i2, i3, bArr, i4);
            i4 = i5;
        }
        int i6 = i4 + 4;
        if (i6 <= bArr.length) {
            gwWriteInt(methodWriter, i2, i3, bArr, i4);
            i4 = i6;
        }
        int i7 = i4 + 2;
        if (i7 <= bArr.length) {
            gwWriteShort(methodWriter, i2, i3, bArr, i4);
            i4 = i7;
        }
        if (i4 + 1 <= bArr.length) {
            gwWriteByte(methodWriter, i2, i3, bArr, i4);
        }
        methodWriter.visitIincInsn(i3, bArr.length);
        methodWriter.goto_(label2);
        methodWriter.visitLabel(label);
        methodWriter.aload(0);
        methodWriter.getfield(str, fieldWriter(i), ASMUtils.DESC_FIELD_WRITER);
        methodWriter.aload(i2);
        methodWriter.iload(i3);
        methodWriter.aload(1);
        methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "writeFieldNameJSONB", METHOD_DESC_WRITE_FIELD_NAME_JSONB);
        methodWriter.istore(i3);
        methodWriter.visitLabel(label2);
    }

    private void gwFieldValue(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2) {
        Class cls = fieldWriter.fieldClass;
        if (cls == Boolean.TYPE) {
            gwFieldValueBooleanV(methodWriterContext, fieldWriter, i, i2, false);
            return;
        }
        if (cls == boolean[].class || cls == byte[].class || cls == char[].class || cls == short[].class || cls == float[].class || cls == double[].class) {
            gwFieldValueArray(methodWriterContext, fieldWriter, i, i2);
            return;
        }
        if (cls == Character.TYPE || cls == Byte.TYPE || cls == Integer.TYPE || cls == Short.TYPE || cls == Float.TYPE) {
            gwFieldValueInt32V(methodWriterContext, fieldWriter, i, i2, false);
            return;
        }
        if (cls == int[].class) {
            gwFieldValueIntVA(methodWriterContext, fieldWriter, i, i2, false);
            return;
        }
        if (cls == Long.TYPE || cls == Double.TYPE) {
            gwFieldValueInt64V(methodWriterContext, fieldWriter, i, i2, true);
            return;
        }
        if (cls == long[].class && methodWriterContext.provider.getObjectWriter(Long.class) == ObjectWriterImplInt64.INSTANCE) {
            gwFieldValueInt64VA(methodWriterContext, fieldWriter, i, i2, false);
            return;
        }
        if (cls == Integer.class) {
            gwInt32(methodWriterContext, fieldWriter, i, i2);
            return;
        }
        if (cls == Long.class) {
            gwInt64(methodWriterContext, fieldWriter, i, i2);
            return;
        }
        if (cls == Float.class) {
            gwFloat(methodWriterContext, fieldWriter, i, i2);
            return;
        }
        if (cls == Double.class) {
            gwDouble(methodWriterContext, fieldWriter, i, i2);
            return;
        }
        if (cls == String.class) {
            gwFieldValueString(methodWriterContext, fieldWriter, i, i2);
            return;
        }
        if (cls.isEnum() && BeanUtils.getEnumValueField(cls, methodWriterContext.provider) == null && !(fieldWriter instanceof FieldWriterObject)) {
            gwFieldValueEnum(methodWriterContext, fieldWriter, i, i2);
            return;
        }
        if (cls == Date.class) {
            gwFieldValueDate(methodWriterContext, fieldWriter, i, i2);
        } else if (cls == List.class) {
            gwFieldValueList(methodWriterContext, fieldWriter, i, i2);
        } else {
            gwFieldValueObject(methodWriterContext, fieldWriter, i, i2, false);
        }
    }

    private void gwFieldValueArray(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2) {
        String str;
        String str2;
        MethodWriter methodWriter = methodWriterContext.mw;
        Class cls = fieldWriter.fieldClass;
        if (cls == char[].class) {
            str = METHOD_DESC_WRITE_CArray;
            str2 = "writeString";
        } else if (cls == boolean[].class) {
            str = METHOD_DESC_WRITE_ZARRAY;
            str2 = "writeBool";
        } else if (cls == byte[].class) {
            str = METHOD_DESC_WRITE_BArray;
            str2 = "writeBinary";
        } else if (cls == short[].class) {
            str = METHOD_DESC_WRITE_SArray;
            str2 = "writeInt16";
        } else if (cls == float[].class) {
            str = METHOD_DESC_WRITE_FARRAY;
            str2 = "writeFloat";
        } else if (cls == double[].class) {
            str = METHOD_DESC_WRITE_DARRAY;
            str2 = "writeDouble";
        } else {
            if (!cls.isEnum()) {
                throw new UnsupportedOperationException();
            }
            str = METHOD_DESC_WRITE_ENUM;
            str2 = "writeEnumJSONB";
        }
        methodWriter.aload(0);
        methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
        methodWriter.aload(1);
        genGetObject(methodWriterContext, fieldWriter, i2, i);
        methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, str2, str);
    }

    private void gwFieldValueArrayMapping(FieldWriter fieldWriter, MethodWriterContext methodWriterContext, int i, int i2) {
        Class cls = methodWriterContext.objectClass;
        Class cls2 = fieldWriter.fieldClass;
        String strType = cls == null ? ASMUtils.TYPE_OBJECT : ASMUtils.type(cls);
        boolean z = false;
        Class cls3 = Long.TYPE;
        if ((cls2 == cls3 || cls2 == Long.class || cls2 == long[].class) && (methodWriterContext.provider.userDefineMask & 4) != 0 && methodWriterContext.provider.getObjectWriter(Long.class) != ObjectWriterImplInt64.INSTANCE) {
            z = true;
        }
        if (cls2 == Boolean.TYPE || cls2 == boolean[].class || cls2 == Character.TYPE || cls2 == char[].class || cls2 == Byte.TYPE || cls2 == byte[].class || cls2 == Short.TYPE || cls2 == short[].class || cls2 == Integer.TYPE || cls2 == int[].class || cls2 == cls3 || ((cls2 == long[].class && !z) || cls2 == Float.TYPE || cls2 == float[].class || cls2 == Double.TYPE || cls2 == double[].class || cls2 == String.class || cls2 == Integer.class || cls2 == Long.class || cls2 == BigDecimal.class || cls2.isEnum())) {
            gwValue(methodWriterContext, fieldWriter, i, i2, null);
            return;
        }
        if (cls2 == Date.class) {
            gwDate(methodWriterContext, fieldWriter, i, i2);
        } else if (fieldWriter instanceof FieldWriterList) {
            gwList(methodWriterContext, i, i2, fieldWriter);
        } else {
            gwObject(methodWriterContext, i, i2, fieldWriter, strType);
        }
    }

    private void gwFieldValueBooleanV(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2, boolean z) {
        MethodWriter methodWriter = methodWriterContext.mw;
        String str = methodWriterContext.classNameType;
        int iVar = methodWriterContext.var(Boolean.TYPE);
        int iVar2 = methodWriterContext.var(NOT_WRITE_DEFAULT_VALUE);
        Label label = new Label();
        Label label2 = new Label();
        genGetObject(methodWriterContext, fieldWriter, i2, i);
        methodWriter.dup();
        methodWriter.istore(iVar);
        methodWriter.ifne(label);
        if (fieldWriter.defaultValue == null) {
            methodWriter.iload(iVar2);
            methodWriter.ifeq(label);
            methodWriter.goto_(label2);
        }
        methodWriter.visitLabel(label);
        methodWriter.aload(0);
        methodWriter.getfield(str, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
        methodWriter.aload(1);
        methodWriter.iload(iVar);
        methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "writeBool", METHOD_DESC_WRITE_Z);
        methodWriter.visitLabel(label2);
    }

    private void gwFieldValueDate(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2) {
        MethodWriter methodWriter = methodWriterContext.mw;
        Class cls = fieldWriter.fieldClass;
        Label label = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        int iVar = methodWriterContext.var(cls);
        genGetObject(methodWriterContext, fieldWriter, i2, i);
        methodWriter.dup();
        methodWriter.astore(iVar);
        methodWriter.ifnull(label);
        methodWriter.aload(0);
        methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
        methodWriter.aload(1);
        methodWriter.aload(iVar);
        methodWriter.invokevirtual("java/util/Date", "getTime", "()J");
        methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "writeDate", METHOD_DESC_WRITE_J);
        methodWriter.goto_(label3);
        methodWriter.visitLabel(label);
        if ((fieldWriter.features & JSONWriter.Feature.WriteNulls.mask) == 0) {
            methodWriter.iload(methodWriterContext.var(WRITE_NULLS));
            methodWriter.ifne(label2);
            methodWriter.goto_(label3);
        }
        methodWriter.visitLabel(label2);
        gwFieldName(methodWriterContext, fieldWriter, i2);
        methodWriter.aload(1);
        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeNull", "()V");
        methodWriter.visitLabel(label3);
    }

    private void gwFieldValueEnum(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2) {
        Class cls = fieldWriter.fieldClass;
        MethodWriter methodWriter = methodWriterContext.mw;
        int iVar = methodWriterContext.var(cls);
        genGetObject(methodWriterContext, fieldWriter, i2, i);
        methodWriter.dup();
        methodWriter.astore(iVar);
        Label label = new Label();
        Label label2 = new Label();
        methodWriter.ifnull(label);
        methodWriter.aload(0);
        methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
        methodWriter.aload(1);
        methodWriter.aload(iVar);
        methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "writeEnum", METHOD_DESC_WRITE_ENUM);
        methodWriter.goto_(label2);
        methodWriter.visitLabel(label);
        methodWriter.iload(methodWriterContext.var(WRITE_NULLS));
        methodWriter.ifeq(label2);
        gwFieldName(methodWriterContext, fieldWriter, i2);
        methodWriter.aload(1);
        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeNull", "()V");
        methodWriter.visitLabel(label2);
    }

    private void gwFieldValueInt32V(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2, boolean z) {
        MethodWriter methodWriter = methodWriterContext.mw;
        String str = fieldWriter.format;
        Class<?> cls = fieldWriter.fieldClass;
        int iVar = methodWriterContext.var(cls);
        int iVar2 = methodWriterContext.var(NOT_WRITE_DEFAULT_VALUE);
        Label label = new Label();
        Label label2 = new Label();
        genGetObject(methodWriterContext, fieldWriter, i2, i);
        methodWriter.dup(cls);
        methodWriter.storeLocal(cls, iVar);
        methodWriter.cmpWithZero(cls);
        methodWriter.ifne(label);
        if (fieldWriter.defaultValue == null) {
            methodWriter.iload(iVar2);
            methodWriter.ifeq(label);
            methodWriter.goto_(label2);
        }
        methodWriter.visitLabel(label);
        gwFieldName(methodWriterContext, fieldWriter, i2);
        gwValue(methodWriterContext, fieldWriter, i, i2, Integer.valueOf(iVar));
        methodWriter.visitLabel(label2);
    }

    private void gwFieldValueInt64V(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2, boolean z) {
        String str;
        MethodWriter methodWriter = methodWriterContext.mw;
        String str2 = fieldWriter.format;
        String str3 = methodWriterContext.classNameType;
        Class<?> cls = fieldWriter.fieldClass;
        int iVar = methodWriterContext.var(cls);
        int iVar2 = methodWriterContext.var(NOT_WRITE_DEFAULT_VALUE);
        Label label = new Label();
        Label label2 = new Label();
        genGetObject(methodWriterContext, fieldWriter, i2, i);
        methodWriter.dup2();
        methodWriter.storeLocal(cls, iVar);
        methodWriter.cmpWithZero(cls);
        methodWriter.ifne(label);
        if (fieldWriter.defaultValue == null) {
            methodWriter.iload(iVar2);
            methodWriter.ifeq(label);
            methodWriter.goto_(label2);
        }
        methodWriter.visitLabel(label);
        if (cls == Long.TYPE) {
            boolean z2 = "iso8601".equals(str2) || (fieldWriter instanceof FieldWriterDate);
            if (z2) {
                str = "writeInt64";
            } else {
                if (((JSONWriter.Feature.WriteLongAsString.mask | JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.BrowserCompatible.mask) & fieldWriter.features) != 0) {
                    str = "writeInt64";
                } else {
                    gwFieldName(methodWriterContext, fieldWriter, i2);
                    methodWriter.aload(1);
                    methodWriter.lload(iVar);
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeInt64", "(J)V");
                }
            }
            methodWriter.aload(0);
            methodWriter.getfield(str3, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
            methodWriter.aload(1);
            methodWriter.lload(iVar);
            methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, z2 ? "writeDate" : str, METHOD_DESC_WRITE_J);
        } else {
            if (cls != Double.TYPE) {
                throw new UnsupportedOperationException();
            }
            gwFieldName(methodWriterContext, fieldWriter, i2);
            gwValue(methodWriterContext, fieldWriter, i, i2, Integer.valueOf(iVar));
        }
        methodWriter.visitLabel(label2);
    }

    private void gwFieldValueInt64VA(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2, boolean z) {
        MethodWriter methodWriter = methodWriterContext.mw;
        int iVar = methodWriterContext.var(fieldWriter.fieldClass);
        Label label = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        genGetObject(methodWriterContext, fieldWriter, i2, i);
        methodWriter.dup();
        methodWriter.astore(iVar);
        methodWriter.ifnonnull(label2);
        methodWriter.iload(methodWriterContext.var(WRITE_NULLS));
        methodWriter.ifne(label3);
        methodWriter.goto_(label);
        methodWriter.visitLabel(label3);
        gwFieldName(methodWriterContext, fieldWriter, i2);
        methodWriter.aload(1);
        String str = ASMUtils.TYPE_JSON_WRITER;
        methodWriter.invokevirtual(str, "writeArrayNull", "()V");
        methodWriter.goto_(label);
        methodWriter.visitLabel(label2);
        gwFieldName(methodWriterContext, fieldWriter, i2);
        boolean z2 = (fieldWriter.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        methodWriter.aload(1);
        methodWriter.aload(iVar);
        methodWriter.invokevirtual(str, z2 ? "writeString" : "writeInt64", "([J)V");
        methodWriter.visitLabel(label);
    }

    private void gwFieldValueJSONB(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2) {
        Class cls = fieldWriter.fieldClass;
        long j = JSONWriter.Feature.WriteNonStringValueAsString.mask;
        if (cls == Boolean.TYPE) {
            gwFieldValueBooleanV(methodWriterContext, fieldWriter, i, i2, true);
            return;
        }
        if (cls == boolean[].class || cls == byte[].class || cls == char[].class || cls == short[].class || cls == float[].class || cls == double[].class) {
            gwFieldValueArray(methodWriterContext, fieldWriter, i, i2);
            return;
        }
        if (cls == Character.TYPE || cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Float.TYPE) {
            gwFieldValueInt32V(methodWriterContext, fieldWriter, i, i2, true);
            return;
        }
        if (cls == int[].class) {
            gwFieldValueIntVA(methodWriterContext, fieldWriter, i, i2, true);
            return;
        }
        if (cls == Long.TYPE || cls == Double.TYPE) {
            gwFieldValueInt64V(methodWriterContext, fieldWriter, i, i2, true);
            return;
        }
        if (cls == long[].class && methodWriterContext.provider.getObjectWriter(Long.class) == ObjectWriterImplInt64.INSTANCE) {
            gwFieldValueInt64VA(methodWriterContext, fieldWriter, i, i2, true);
            return;
        }
        if (cls == Integer.class) {
            gwInt32(methodWriterContext, fieldWriter, i, i2);
            return;
        }
        if (cls == Long.class) {
            gwInt64(methodWriterContext, fieldWriter, i, i2);
            return;
        }
        if (cls == String.class) {
            gwFieldValueString(methodWriterContext, fieldWriter, i, i2);
            return;
        }
        if (cls.isEnum()) {
            gwFieldValueArray(methodWriterContext, fieldWriter, i, i2);
        } else if (cls == Date.class) {
            gwFieldValueDate(methodWriterContext, fieldWriter, i, i2);
        } else {
            gwFieldValueObject(methodWriterContext, fieldWriter, i, i2, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    private void gwFieldValueList(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2) {
        long j;
        boolean z;
        Class<?> cls;
        Label label;
        int i3;
        MethodWriter methodWriter;
        FieldWriter fieldWriter2 = fieldWriter;
        boolean zDisableReferenceDetect = methodWriterContext.disableReferenceDetect();
        Type type = fieldWriter2.fieldType;
        Class cls2 = fieldWriter2.fieldClass;
        MethodWriter methodWriter2 = methodWriterContext.mw;
        int iVar = methodWriterContext.var(cls2);
        int iVar2 = !zDisableReferenceDetect ? methodWriterContext.var("REF_PATH") : -1;
        if ((fieldWriter2.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) == 0 && (type instanceof ParameterizedType)) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                Type type2 = actualTypeArguments[0];
                cls = TypeUtils.getClass(type2);
                j = 0;
                z = type2 == String.class || type2 == Integer.class || type2 == Long.class;
            } else {
                j = 0;
                z = false;
                cls = null;
            }
        } else {
            j = 0;
            z = false;
            cls = null;
        }
        int iVar3 = methodWriterContext.var(cls2);
        genGetObject(methodWriterContext, fieldWriter2, i2, i);
        methodWriter2.dup();
        methodWriter2.astore(iVar3);
        Label label2 = new Label();
        Label label3 = new Label();
        methodWriter2.ifnull(label2);
        long j2 = fieldWriter2.features;
        boolean z2 = z;
        JSONWriter.Feature feature = JSONWriter.Feature.IgnoreEmpty;
        Class<?> cls3 = cls;
        if ((j2 & feature.mask) == j) {
            label = new Label();
            methodWriterContext.genIsEnabled(feature.mask, label);
        } else {
            label = null;
        }
        methodWriter2.aload(iVar3);
        methodWriter2.invokeinterface("java/util/Collection", "isEmpty", "()Z");
        methodWriter2.ifne(label3);
        if (label != null) {
            methodWriter2.visitLabel(label);
        }
        String str = "popPath0";
        if (!zDisableReferenceDetect) {
            Label label4 = new Label();
            Label label5 = new Label();
            methodWriterContext.genIsEnabled(JSONWriter.Feature.ReferenceDetection.mask, label4);
            if (cls2.isAssignableFrom(methodWriterContext.objectClass)) {
                methodWriter2.aload(i);
                methodWriter2.aload(iVar);
                methodWriter2.if_acmpne(label5);
                methodWriter2.aload(1);
                methodWriter2.visitLdcInsn("..");
                methodWriter2.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeReference", METHOD_DESC_WRITE_REFERENCE);
                methodWriter2.goto_(label3);
                methodWriter2.visitLabel(label5);
            }
            methodWriter2.aload(0);
            String str2 = methodWriterContext.classNameType;
            String strFieldWriter = fieldWriter(i2);
            String str3 = ASMUtils.DESC_FIELD_WRITER;
            methodWriter2.getfield(str2, strFieldWriter, str3);
            methodWriter2.aload(iVar);
            methodWriter2.lload(methodWriterContext.var(CONTEXT_FEATURES));
            methodWriter2.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "isRefDetect", "(Ljava/lang/Object;J)Z");
            methodWriter2.ifeq(label4);
            methodWriter2.aload(1);
            methodWriter2.aload(0);
            methodWriter2.getfield(methodWriterContext.classNameType, fieldWriter(i2), str3);
            methodWriter2.aload(iVar);
            String str4 = ASMUtils.TYPE_JSON_WRITER;
            methodWriter2.invokevirtual(str4, "setPath0", METHOD_DESC_SET_PATH2);
            methodWriter2.dup();
            methodWriter2.astore(iVar2);
            methodWriter2.ifnull(label4);
            fieldWriter2 = fieldWriter;
            gwFieldName(methodWriterContext, fieldWriter2, i2);
            methodWriter2.aload(1);
            methodWriter2.aload(iVar2);
            methodWriter2.invokevirtual(str4, "writeReference", METHOD_DESC_WRITE_REFERENCE);
            methodWriter2.aload(1);
            methodWriter2.aload(iVar);
            str = "popPath0";
            methodWriter2.invokevirtual(str4, str, "(Ljava/lang/Object;)V");
            methodWriter2.goto_(label3);
            methodWriter2.visitLabel(label4);
        }
        Label label6 = new Label();
        methodWriterContext.genIsEnabled(JSONWriter.Feature.NotWriteEmptyArray.mask, label6);
        methodWriter2.aload(iVar);
        methodWriter2.invokeinterface("java/util/Collection", "isEmpty", "()Z");
        methodWriter2.ifeq(label6);
        methodWriter2.goto_(label3);
        methodWriter2.visitLabel(label6);
        if (z2) {
            gwFieldName(methodWriterContext, fieldWriter2, i2);
            gwListSimpleType(methodWriterContext, i2, methodWriter2, cls2, cls3, iVar3);
            i3 = i2;
            methodWriter = methodWriter2;
        } else {
            i3 = i2;
            methodWriter = methodWriter2;
            gwFieldName(methodWriterContext, fieldWriter2, i3);
            methodWriter.aload(0);
            methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i3), ASMUtils.DESC_FIELD_WRITER);
            methodWriter.aload(1);
            methodWriter.aload(iVar3);
            methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, methodWriterContext.jsonb ? "writeListValueJSONB" : "writeListValue", METHOD_DESC_WRITE_LIST);
        }
        if (!zDisableReferenceDetect) {
            methodWriter.aload(1);
            methodWriter.aload(iVar);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str, "(Ljava/lang/Object;)V");
        }
        methodWriter.goto_(label3);
        methodWriter.visitLabel(label2);
        methodWriterContext.genIsEnabled(fieldWriter2.features, JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask, label3);
        gwFieldName(methodWriterContext, fieldWriter2, i3);
        methodWriter.aload(1);
        methodWriter.lload(methodWriterContext.var2(CONTEXT_FEATURES));
        methodWriter.visitLdcInsn(fieldWriter2.features);
        methodWriter.lor();
        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeArrayNull", "(J)V");
        methodWriter.visitLabel(label3);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0367  */
    /* JADX WARN: Code duplicated, block: B:106:0x036b  */
    /* JADX WARN: Code duplicated, block: B:107:0x037d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0381  */
    /* JADX WARN: Code duplicated, block: B:110:0x0383  */
    /* JADX WARN: Code duplicated, block: B:117:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:120:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:122:0x0405  */
    /* JADX WARN: Code duplicated, block: B:123:0x0408  */
    /* JADX WARN: Code duplicated, block: B:124:0x040b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0417  */
    /* JADX WARN: Code duplicated, block: B:130:0x0426  */
    /* JADX WARN: Code duplicated, block: B:133:0x0456  */
    /* JADX WARN: Code duplicated, block: B:135:0x045a  */
    /* JADX WARN: Code duplicated, block: B:152:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:155:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:158:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:192:0x0555  */
    /* JADX WARN: Code duplicated, block: B:22:0x0091  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:38:0x0106  */
    /* JADX WARN: Code duplicated, block: B:39:0x010c  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0137  */
    /* JADX WARN: Code duplicated, block: B:46:0x0149  */
    /* JADX WARN: Code duplicated, block: B:53:0x0197  */
    /* JADX WARN: Code duplicated, block: B:62:0x020b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0214  */
    /* JADX WARN: Code duplicated, block: B:66:0x0233  */
    /* JADX WARN: Code duplicated, block: B:67:0x0257  */
    /* JADX WARN: Code duplicated, block: B:69:0x0260  */
    /* JADX WARN: Code duplicated, block: B:71:0x026f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0297  */
    /* JADX WARN: Code duplicated, block: B:77:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:78:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:81:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:86:0x0300  */
    /* JADX WARN: Code duplicated, block: B:87:0x030b  */
    /* JADX WARN: Code duplicated, block: B:89:0x030f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0320  */
    /* JADX WARN: Code duplicated, block: B:97:0x0343  */
    /* JADX WARN: Code duplicated, block: B:99:0x0347  */
    private void gwFieldValueObject(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2, boolean z) {
        boolean z2;
        long j;
        int i3;
        String str;
        String str2;
        Type type;
        String str3;
        String str4;
        Class cls;
        Object obj;
        String str5;
        Label label;
        String str6;
        FieldWriter fieldWriter2;
        int i4;
        Class cls2;
        String str7;
        String str8;
        Label label2;
        long j2;
        Class itemClass;
        Class cls3;
        long j3;
        int i5;
        long j4;
        String str9;
        long j5;
        FieldWriter fieldWriter3;
        int i6;
        Class cls4;
        Label label3;
        String str10;
        long j6;
        int iVar;
        Class<?> cls5;
        long j7;
        JSONWriter.Feature feature;
        Label label4;
        Class cls6 = fieldWriter.fieldClass;
        Type type2 = fieldWriter.fieldType;
        String str11 = fieldWriter.fieldName;
        boolean z3 = (methodWriterContext.disableReferenceDetect() || ObjectWriterProvider.isNotReferenceDetect(cls6)) ? false : true;
        int iVar2 = methodWriterContext.var(cls6);
        Integer numValueOf = z3 ? Integer.valueOf(methodWriterContext.var("REF_PATH")) : null;
        long j8 = methodWriterContext.objectFeatures | fieldWriter.features;
        MethodWriter methodWriter = methodWriterContext.mw;
        Label label5 = new Label();
        Label label6 = new Label();
        if (!fieldWriter.unwrapped()) {
            j = j8;
            z2 = z3;
            if ((fieldWriter.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) == 0) {
                i3 = 1;
            }
            if (fieldWriter.backReference) {
                methodWriter.aload(i3);
                methodWriter.aload(i);
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "containsReference", "(Ljava/lang/Object;)Z");
                methodWriter.ifne(label6);
            }
            genGetObject(methodWriterContext, fieldWriter, i2, i);
            methodWriter.dup();
            methodWriter.astore(iVar2);
            methodWriter.ifnull(label5);
            str = "isEmpty";
            str2 = "()Z";
            if (Map.class.isAssignableFrom(cls6)) {
                type = type2;
                str3 = str11;
                j7 = fieldWriter.features;
                feature = JSONWriter.Feature.IgnoreEmpty;
                if ((j7 & feature.mask) == 0) {
                    label4 = new Label();
                    methodWriterContext.genIsEnabled(feature.mask, label4);
                } else {
                    label4 = null;
                }
                methodWriter.aload(iVar2);
                methodWriter.invokeinterface("java/util/Map", "isEmpty", "()Z");
                methodWriter.ifne(label6);
                if (label4 != null) {
                    methodWriter.visitLabel(label4);
                }
            } else {
                type = type2;
                str3 = str11;
            }
            if (!Serializable.class.isAssignableFrom(cls6) && cls6 != List.class) {
                methodWriter.aload(1);
                if (fieldWriter.isFieldClassSerializable()) {
                    methodWriter.aload(iVar2);
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "isIgnoreNoneSerializable", "(Ljava/lang/Object;)Z");
                } else {
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "isIgnoreNoneSerializable", "()Z");
                }
                methodWriter.ifne(label6);
            }
            str4 = "popPath0";
            if (z2) {
                Label label7 = new Label();
                str5 = "write";
                Label label8 = new Label();
                cls = List.class;
                iVar = methodWriterContext.var("REF_DETECT");
                obj = "REF_DETECT";
                if (cls6 == Object.class) {
                    methodWriter.aload(1);
                    methodWriter.aload(iVar2);
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "isRefDetect", "(Ljava/lang/Object;)Z");
                } else {
                    methodWriterContext.genIsEnabled(JSONWriter.Feature.ReferenceDetection.mask, null);
                }
                methodWriter.dup();
                methodWriter.istore(iVar);
                methodWriter.ifeq(label7);
                cls5 = methodWriterContext.objectClass;
                if (cls5 == null && cls6.isAssignableFrom(cls5)) {
                    methodWriter.aload(i);
                    methodWriter.aload(iVar2);
                    methodWriter.if_acmpne(label8);
                    fieldWriter2 = fieldWriter;
                    i4 = i2;
                    gwFieldName(methodWriterContext, fieldWriter2, i4);
                    methodWriter.aload(1);
                    methodWriter.visitLdcInsn("..");
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeReference", METHOD_DESC_WRITE_REFERENCE);
                    methodWriter.goto_(label6);
                    methodWriter.visitLabel(label8);
                } else {
                    fieldWriter2 = fieldWriter;
                    i4 = i2;
                }
                methodWriter.aload(1);
                methodWriter.aload(0);
                methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i4), ASMUtils.DESC_FIELD_WRITER);
                methodWriter.aload(iVar2);
                String str12 = ASMUtils.TYPE_JSON_WRITER;
                methodWriter.invokevirtual(str12, "setPath0", METHOD_DESC_SET_PATH2);
                methodWriter.dup();
                methodWriter.astore(numValueOf.intValue());
                methodWriter.ifnull(label7);
                gwFieldName(methodWriterContext, fieldWriter2, i4);
                methodWriter.aload(1);
                methodWriter.aload(numValueOf.intValue());
                methodWriter.invokevirtual(str12, "writeReference", METHOD_DESC_WRITE_REFERENCE);
                methodWriter.aload(1);
                methodWriter.aload(iVar2);
                methodWriter.invokevirtual(str12, "popPath0", "(Ljava/lang/Object;)V");
                methodWriter.goto_(label6);
                methodWriter.visitLabel(label7);
                str6 = str3;
                if (!"this$0".equals(str6) || "this$1".equals(str6) || "this$2".equals(str6)) {
                    methodWriter.iload(iVar);
                    label = label5;
                    methodWriter.ifeq(label);
                } else {
                    label = label5;
                }
            } else {
                cls = List.class;
                cls6 = cls6;
                obj = "REF_DETECT";
                str2 = "()Z";
                str5 = "write";
                str = "isEmpty";
                label = label5;
                str6 = str3;
                fieldWriter2 = fieldWriter;
                i4 = i2;
            }
            cls2 = cls6;
            if (Object[].class.isAssignableFrom(cls2)) {
                Label label9 = new Label();
                str7 = str6;
                str8 = "(Ljava/lang/Object;)V";
                methodWriterContext.genIsEnabled(JSONWriter.Feature.NotWriteEmptyArray.mask, label9);
                methodWriter.aload(iVar2);
                methodWriter.checkcast("[Ljava/lang/Object;");
                methodWriter.arraylength();
                methodWriter.ifne(label9);
                methodWriter.goto_(label6);
                methodWriter.visitLabel(label9);
            } else {
                str7 = str6;
                str8 = "(Ljava/lang/Object;)V";
                if (Collection.class.isAssignableFrom(cls2)) {
                    label2 = new Label();
                    j2 = JSONWriter.Feature.NotWriteEmptyArray.mask;
                    if ((j & j2) == 0) {
                        methodWriterContext.genIsEnabled(j2, label2);
                    }
                    methodWriter.aload(iVar2);
                    methodWriter.checkcast("java/util/Collection");
                    methodWriter.invokeinterface("java/util/Collection", str, str2);
                    methodWriter.ifeq(label2);
                    methodWriter.goto_(label6);
                    methodWriter.visitLabel(label2);
                }
            }
            gwFieldName(methodWriterContext, fieldWriter2, i4);
            itemClass = fieldWriter2.getItemClass();
            if (cls2 == BigDecimal.class) {
                methodWriter.aload(1);
                methodWriter.aload(iVar2);
                cls3 = BigDecimal.class;
                j3 = j;
                methodWriter.visitLdcInsn(j3);
                if (fieldWriter2.decimalFormat != null) {
                    methodWriter.aload(0);
                    methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
                    methodWriter.getfield(ASMUtils.TYPE_FIELD_WRITER, "decimalFormat", "Ljava/text/DecimalFormat;");
                } else {
                    methodWriter.aconst_null();
                }
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeDecimal", "(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V");
            } else {
                str4 = "popPath0";
                cls3 = BigDecimal.class;
                j3 = j;
                if (cls2 == BigInteger.class) {
                    methodWriter.aload(1);
                    methodWriter.aload(iVar2);
                    if (j3 == 0) {
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeBigInt", "(Ljava/math/BigInteger;)V");
                    } else {
                        methodWriter.visitLdcInsn(j3);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeBigInt", "(Ljava/math/BigInteger;J)V");
                    }
                } else if (cls2 != UUID.class) {
                    methodWriter.aload(1);
                    methodWriter.aload(iVar2);
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeUUID", "(Ljava/util/UUID;)V");
                } else if (cls2 != LocalDate.class && fieldWriter2.format == null && methodWriterContext.provider.getObjectWriter(LocalDate.class) == ObjectWriterImplLocalDate.INSTANCE) {
                    methodWriter.aload(1);
                    methodWriter.aload(iVar2);
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeLocalDate", "(Ljava/time/LocalDate;)V");
                } else {
                    if (cls2 == OffsetDateTime.class || fieldWriter2.format != null || methodWriterContext.provider.getObjectWriter(OffsetDateTime.class) != ObjectWriterImplOffsetDateTime.INSTANCE) {
                        if (cls2 == String[].class) {
                            methodWriter.aload(1);
                            methodWriter.aload(iVar2);
                            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeString", "([Ljava/lang/String;)V");
                        } else {
                            if (cls2 != cls) {
                                i5 = 0;
                            } else if (itemClass != String.class || itemClass == Integer.class || itemClass == Long.class) {
                                i2 = i2;
                                iVar2 = iVar2;
                                str4 = str4;
                                str8 = str8;
                                obj = obj;
                                gwListSimpleType(methodWriterContext, i2, methodWriter, cls2, itemClass, iVar2);
                                methodWriter = methodWriter;
                                cls2 = cls2;
                                j4 = j3;
                            } else {
                                i5 = 0;
                            }
                            methodWriter.aload(i5);
                            methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
                            methodWriter.aload(1);
                            methodWriter.aload(iVar2);
                            methodWriter.invokevirtual(ASMUtils.TYPE_OBJECT, "getClass", "()Ljava/lang/Class;");
                            methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "getObjectWriter", METHOD_DESC_GET_OBJECT_WRITER);
                            methodWriter.aload(1);
                            methodWriter.aload(iVar2);
                            methodWriter.visitLdcInsn(str7);
                            methodWriterContext.loadFieldType(i2, type);
                            methodWriter.visitLdcInsn(j3);
                            if (z) {
                                j4 = j3;
                                if ((j4 & JSONWriter.Feature.BeanToArray.mask) != 0) {
                                    str9 = "writeArrayMappingJSONB";
                                } else {
                                    str9 = "writeJSONB";
                                }
                            } else {
                                j4 = j3;
                                if ((j4 & JSONWriter.Feature.BeanToArray.mask) != 0) {
                                    str5 = "writeArrayMapping";
                                }
                                str9 = str5;
                            }
                            methodWriter.invokeinterface(ASMUtils.TYPE_OBJECT_WRITER, str9, METHOD_DESC_WRITE_OBJECT);
                        }
                        if (z2) {
                            int iVar3 = methodWriterContext.var(obj);
                            Label label10 = new Label();
                            methodWriter.iload(iVar3);
                            methodWriter.ifeq(label10);
                            methodWriter.aload(1);
                            methodWriter.aload(iVar2);
                            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str8);
                            methodWriter.visitLabel(label10);
                        }
                        methodWriter.goto_(label6);
                        methodWriter.visitLabel(label);
                        j5 = JSONWriter.Feature.WriteNulls.mask;
                        if ((j4 & j5) == 0) {
                            if (cls2 != AtomicLongArray.class || cls2 == AtomicIntegerArray.class || Collection.class.isAssignableFrom(cls2) || cls2.isArray()) {
                                j5 |= JSONWriter.Feature.WriteNullListAsEmpty.mask;
                                j6 = JSONWriter.Feature.NullAsDefaultValue.mask;
                            } else if (Number.class.isAssignableFrom(cls2)) {
                                j5 |= JSONWriter.Feature.WriteNullNumberAsZero.mask;
                                j6 = JSONWriter.Feature.NullAsDefaultValue.mask;
                            } else if (cls2 == Boolean.class) {
                                j5 |= JSONWriter.Feature.WriteNullBooleanAsFalse.mask;
                                j6 = JSONWriter.Feature.NullAsDefaultValue.mask;
                            } else if (cls2 == String.class) {
                                j5 |= JSONWriter.Feature.WriteNullStringAsEmpty.mask;
                                j6 = JSONWriter.Feature.NullAsDefaultValue.mask;
                            } else {
                                j6 = JSONWriter.Feature.NullAsDefaultValue.mask;
                            }
                            fieldWriter3 = fieldWriter;
                            i6 = i2;
                            label3 = label6;
                            cls4 = cls2;
                            methodWriterContext.genIsEnabled(fieldWriter3.features, j5 | j6, label3);
                        } else {
                            fieldWriter3 = fieldWriter;
                            i6 = i2;
                            cls4 = cls2;
                            label3 = label6;
                        }
                        gwFieldName(methodWriterContext, fieldWriter3, i6);
                        methodWriter.aload(1);
                        String str13 = "()V";
                        if (cls4 != AtomicLongArray.class || cls4 == AtomicIntegerArray.class || Collection.class.isAssignableFrom(cls4) || cls4.isArray()) {
                            str10 = "writeArrayNull";
                        } else if (cls4 == Float.class || cls4 == Double.class || cls4 == cls3) {
                            methodWriter.lload(methodWriterContext.var2(CONTEXT_FEATURES));
                            methodWriter.visitLdcInsn(fieldWriter3.features);
                            methodWriter.lor();
                            str10 = "writeDecimalNull";
                            str13 = "(J)V";
                        } else if (Number.class.isAssignableFrom(cls4)) {
                            methodWriter.lload(methodWriterContext.var2(CONTEXT_FEATURES));
                            methodWriter.visitLdcInsn(fieldWriter3.features);
                            methodWriter.lor();
                            str10 = "writeNumberNull";
                            str13 = "(J)V";
                        } else if (cls4 == Boolean.class) {
                            if ((fieldWriter3.features & JSONWriter.Feature.WriteNullBooleanAsFalse.mask) != 0) {
                                methodWriter.iconst_0();
                                str10 = "writeBool";
                                str13 = "(Z)V";
                            } else {
                                str10 = "writeBooleanNull";
                            }
                        } else if (cls4 == String.class || cls4 == Appendable.class || cls4 == StringBuffer.class || cls4 == StringBuilder.class) {
                            str10 = "writeStringNull";
                        } else {
                            methodWriterContext.loadFieldClass(i6, cls4);
                            str10 = "writeObjectNull";
                            str13 = "(Ljava/lang/Class;)V";
                        }
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str10, str13);
                        methodWriter.visitLabel(label3);
                    }
                    methodWriter.aload(1);
                    methodWriter.aload(iVar2);
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeOffsetDateTime", "(Ljava/time/OffsetDateTime;)V");
                }
            }
            i2 = i2;
            cls2 = cls2;
            j4 = j3;
            iVar2 = iVar2;
            methodWriter = methodWriter;
            str4 = str4;
            str8 = str8;
            obj = obj;
            if (z2) {
                int iVar4 = methodWriterContext.var(obj);
                Label label11 = new Label();
                methodWriter.iload(iVar4);
                methodWriter.ifeq(label11);
                methodWriter.aload(1);
                methodWriter.aload(iVar2);
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str8);
                methodWriter.visitLabel(label11);
            }
            methodWriter.goto_(label6);
            methodWriter.visitLabel(label);
            j5 = JSONWriter.Feature.WriteNulls.mask;
            if ((j4 & j5) == 0) {
                if (cls2 != AtomicLongArray.class) {
                    j5 |= JSONWriter.Feature.WriteNullListAsEmpty.mask;
                    j6 = JSONWriter.Feature.NullAsDefaultValue.mask;
                } else {
                    j5 |= JSONWriter.Feature.WriteNullListAsEmpty.mask;
                    j6 = JSONWriter.Feature.NullAsDefaultValue.mask;
                }
                fieldWriter3 = fieldWriter;
                i6 = i2;
                label3 = label6;
                cls4 = cls2;
                methodWriterContext.genIsEnabled(fieldWriter3.features, j5 | j6, label3);
            } else {
                fieldWriter3 = fieldWriter;
                i6 = i2;
                cls4 = cls2;
                label3 = label6;
            }
            gwFieldName(methodWriterContext, fieldWriter3, i6);
            methodWriter.aload(1);
            String str14 = "()V";
            if (cls4 != AtomicLongArray.class) {
                str10 = "writeArrayNull";
            } else {
                str10 = "writeArrayNull";
            }
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str10, str14);
            methodWriter.visitLabel(label3);
        }
        z2 = z3;
        j = j8;
        methodWriter.aload(0);
        methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
        i3 = 1;
        methodWriter.aload(1);
        methodWriter.aload(i);
        methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "write", METHOD_DESC_FIELD_WRITE_OBJECT);
        methodWriter.pop();
        methodWriter.goto_(label6);
        if (fieldWriter.backReference) {
            methodWriter.aload(i3);
            methodWriter.aload(i);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "containsReference", "(Ljava/lang/Object;)Z");
            methodWriter.ifne(label6);
        }
        genGetObject(methodWriterContext, fieldWriter, i2, i);
        methodWriter.dup();
        methodWriter.astore(iVar2);
        methodWriter.ifnull(label5);
        str = "isEmpty";
        str2 = "()Z";
        if (Map.class.isAssignableFrom(cls6)) {
            type = type2;
            str3 = str11;
            j7 = fieldWriter.features;
            feature = JSONWriter.Feature.IgnoreEmpty;
            if ((j7 & feature.mask) == 0) {
                label4 = new Label();
                methodWriterContext.genIsEnabled(feature.mask, label4);
            } else {
                label4 = null;
            }
            methodWriter.aload(iVar2);
            methodWriter.invokeinterface("java/util/Map", "isEmpty", "()Z");
            methodWriter.ifne(label6);
            if (label4 != null) {
                methodWriter.visitLabel(label4);
            }
        } else {
            type = type2;
            str3 = str11;
        }
        if (!Serializable.class.isAssignableFrom(cls6)) {
            methodWriter.aload(1);
            if (fieldWriter.isFieldClassSerializable()) {
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "isIgnoreNoneSerializable", "()Z");
            } else {
                methodWriter.aload(iVar2);
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "isIgnoreNoneSerializable", "(Ljava/lang/Object;)Z");
            }
            methodWriter.ifne(label6);
        }
        str4 = "popPath0";
        if (z2) {
            Label label12 = new Label();
            str5 = "write";
            Label label13 = new Label();
            cls = List.class;
            iVar = methodWriterContext.var("REF_DETECT");
            obj = "REF_DETECT";
            if (cls6 == Object.class) {
                methodWriter.aload(1);
                methodWriter.aload(iVar2);
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "isRefDetect", "(Ljava/lang/Object;)Z");
            } else {
                methodWriterContext.genIsEnabled(JSONWriter.Feature.ReferenceDetection.mask, null);
            }
            methodWriter.dup();
            methodWriter.istore(iVar);
            methodWriter.ifeq(label12);
            cls5 = methodWriterContext.objectClass;
            if (cls5 == null) {
                fieldWriter2 = fieldWriter;
                i4 = i2;
            } else {
                fieldWriter2 = fieldWriter;
                i4 = i2;
            }
            methodWriter.aload(1);
            methodWriter.aload(0);
            methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i4), ASMUtils.DESC_FIELD_WRITER);
            methodWriter.aload(iVar2);
            String str15 = ASMUtils.TYPE_JSON_WRITER;
            methodWriter.invokevirtual(str15, "setPath0", METHOD_DESC_SET_PATH2);
            methodWriter.dup();
            methodWriter.astore(numValueOf.intValue());
            methodWriter.ifnull(label12);
            gwFieldName(methodWriterContext, fieldWriter2, i4);
            methodWriter.aload(1);
            methodWriter.aload(numValueOf.intValue());
            methodWriter.invokevirtual(str15, "writeReference", METHOD_DESC_WRITE_REFERENCE);
            methodWriter.aload(1);
            methodWriter.aload(iVar2);
            methodWriter.invokevirtual(str15, "popPath0", "(Ljava/lang/Object;)V");
            methodWriter.goto_(label6);
            methodWriter.visitLabel(label12);
            str6 = str3;
            if ("this$0".equals(str6)) {
                methodWriter.iload(iVar);
                label = label5;
                methodWriter.ifeq(label);
            } else {
                methodWriter.iload(iVar);
                label = label5;
                methodWriter.ifeq(label);
            }
        } else {
            cls = List.class;
            cls6 = cls6;
            obj = "REF_DETECT";
            str2 = "()Z";
            str5 = "write";
            str = "isEmpty";
            label = label5;
            str6 = str3;
            fieldWriter2 = fieldWriter;
            i4 = i2;
        }
        cls2 = cls6;
        if (Object[].class.isAssignableFrom(cls2)) {
            Label label14 = new Label();
            str7 = str6;
            str8 = "(Ljava/lang/Object;)V";
            methodWriterContext.genIsEnabled(JSONWriter.Feature.NotWriteEmptyArray.mask, label14);
            methodWriter.aload(iVar2);
            methodWriter.checkcast("[Ljava/lang/Object;");
            methodWriter.arraylength();
            methodWriter.ifne(label14);
            methodWriter.goto_(label6);
            methodWriter.visitLabel(label14);
        } else {
            str7 = str6;
            str8 = "(Ljava/lang/Object;)V";
            if (Collection.class.isAssignableFrom(cls2)) {
                label2 = new Label();
                j2 = JSONWriter.Feature.NotWriteEmptyArray.mask;
                if ((j & j2) == 0) {
                    methodWriterContext.genIsEnabled(j2, label2);
                }
                methodWriter.aload(iVar2);
                methodWriter.checkcast("java/util/Collection");
                methodWriter.invokeinterface("java/util/Collection", str, str2);
                methodWriter.ifeq(label2);
                methodWriter.goto_(label6);
                methodWriter.visitLabel(label2);
            }
        }
        gwFieldName(methodWriterContext, fieldWriter2, i4);
        itemClass = fieldWriter2.getItemClass();
        if (cls2 == BigDecimal.class) {
            methodWriter.aload(1);
            methodWriter.aload(iVar2);
            cls3 = BigDecimal.class;
            j3 = j;
            methodWriter.visitLdcInsn(j3);
            if (fieldWriter2.decimalFormat != null) {
                methodWriter.aload(0);
                methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
                methodWriter.getfield(ASMUtils.TYPE_FIELD_WRITER, "decimalFormat", "Ljava/text/DecimalFormat;");
            } else {
                methodWriter.aconst_null();
            }
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeDecimal", "(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V");
        } else {
            str4 = "popPath0";
            cls3 = BigDecimal.class;
            j3 = j;
            if (cls2 == BigInteger.class) {
                methodWriter.aload(1);
                methodWriter.aload(iVar2);
                if (j3 == 0) {
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeBigInt", "(Ljava/math/BigInteger;)V");
                } else {
                    methodWriter.visitLdcInsn(j3);
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeBigInt", "(Ljava/math/BigInteger;J)V");
                }
            } else {
                if (cls2 != UUID.class) {
                    if (cls2 != LocalDate.class) {
                        if (cls2 == OffsetDateTime.class) {
                            if (cls2 == String[].class) {
                                methodWriter.aload(1);
                                methodWriter.aload(iVar2);
                                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeString", "([Ljava/lang/String;)V");
                            } else {
                                if (cls2 != cls) {
                                    if (itemClass != String.class) {
                                    }
                                    i2 = i2;
                                    iVar2 = iVar2;
                                    str4 = str4;
                                    str8 = str8;
                                    obj = obj;
                                    gwListSimpleType(methodWriterContext, i2, methodWriter, cls2, itemClass, iVar2);
                                    methodWriter = methodWriter;
                                    cls2 = cls2;
                                    j4 = j3;
                                } else {
                                    i5 = 0;
                                }
                                methodWriter.aload(i5);
                                methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
                                methodWriter.aload(1);
                                methodWriter.aload(iVar2);
                                methodWriter.invokevirtual(ASMUtils.TYPE_OBJECT, "getClass", "()Ljava/lang/Class;");
                                methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "getObjectWriter", METHOD_DESC_GET_OBJECT_WRITER);
                                methodWriter.aload(1);
                                methodWriter.aload(iVar2);
                                methodWriter.visitLdcInsn(str7);
                                methodWriterContext.loadFieldType(i2, type);
                                methodWriter.visitLdcInsn(j3);
                                if (z) {
                                    j4 = j3;
                                    if ((j4 & JSONWriter.Feature.BeanToArray.mask) != 0) {
                                        str9 = "writeArrayMappingJSONB";
                                    } else {
                                        str9 = "writeJSONB";
                                    }
                                } else {
                                    j4 = j3;
                                    if ((j4 & JSONWriter.Feature.BeanToArray.mask) != 0) {
                                        str5 = "writeArrayMapping";
                                    }
                                    str9 = str5;
                                }
                                methodWriter.invokeinterface(ASMUtils.TYPE_OBJECT_WRITER, str9, METHOD_DESC_WRITE_OBJECT);
                            }
                        } else if (cls2 == String[].class) {
                            methodWriter.aload(1);
                            methodWriter.aload(iVar2);
                            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeString", "([Ljava/lang/String;)V");
                        } else {
                            if (cls2 != cls) {
                                if (itemClass != String.class) {
                                }
                                i2 = i2;
                                iVar2 = iVar2;
                                str4 = str4;
                                str8 = str8;
                                obj = obj;
                                gwListSimpleType(methodWriterContext, i2, methodWriter, cls2, itemClass, iVar2);
                                methodWriter = methodWriter;
                                cls2 = cls2;
                                j4 = j3;
                            } else {
                                i5 = 0;
                            }
                            methodWriter.aload(i5);
                            methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
                            methodWriter.aload(1);
                            methodWriter.aload(iVar2);
                            methodWriter.invokevirtual(ASMUtils.TYPE_OBJECT, "getClass", "()Ljava/lang/Class;");
                            methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "getObjectWriter", METHOD_DESC_GET_OBJECT_WRITER);
                            methodWriter.aload(1);
                            methodWriter.aload(iVar2);
                            methodWriter.visitLdcInsn(str7);
                            methodWriterContext.loadFieldType(i2, type);
                            methodWriter.visitLdcInsn(j3);
                            if (z) {
                                j4 = j3;
                                if ((j4 & JSONWriter.Feature.BeanToArray.mask) != 0) {
                                    str9 = "writeArrayMappingJSONB";
                                } else {
                                    str9 = "writeJSONB";
                                }
                            } else {
                                j4 = j3;
                                if ((j4 & JSONWriter.Feature.BeanToArray.mask) != 0) {
                                    str5 = "writeArrayMapping";
                                }
                                str9 = str5;
                            }
                            methodWriter.invokeinterface(ASMUtils.TYPE_OBJECT_WRITER, str9, METHOD_DESC_WRITE_OBJECT);
                        }
                    } else if (cls2 == OffsetDateTime.class) {
                        if (cls2 == String[].class) {
                            methodWriter.aload(1);
                            methodWriter.aload(iVar2);
                            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeString", "([Ljava/lang/String;)V");
                        } else {
                            if (cls2 != cls) {
                                if (itemClass != String.class) {
                                }
                                i2 = i2;
                                iVar2 = iVar2;
                                str4 = str4;
                                str8 = str8;
                                obj = obj;
                                gwListSimpleType(methodWriterContext, i2, methodWriter, cls2, itemClass, iVar2);
                                methodWriter = methodWriter;
                                cls2 = cls2;
                                j4 = j3;
                            } else {
                                i5 = 0;
                            }
                            methodWriter.aload(i5);
                            methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
                            methodWriter.aload(1);
                            methodWriter.aload(iVar2);
                            methodWriter.invokevirtual(ASMUtils.TYPE_OBJECT, "getClass", "()Ljava/lang/Class;");
                            methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "getObjectWriter", METHOD_DESC_GET_OBJECT_WRITER);
                            methodWriter.aload(1);
                            methodWriter.aload(iVar2);
                            methodWriter.visitLdcInsn(str7);
                            methodWriterContext.loadFieldType(i2, type);
                            methodWriter.visitLdcInsn(j3);
                            if (z) {
                                j4 = j3;
                                if ((j4 & JSONWriter.Feature.BeanToArray.mask) != 0) {
                                    str9 = "writeArrayMappingJSONB";
                                } else {
                                    str9 = "writeJSONB";
                                }
                            } else {
                                j4 = j3;
                                if ((j4 & JSONWriter.Feature.BeanToArray.mask) != 0) {
                                    str5 = "writeArrayMapping";
                                }
                                str9 = str5;
                            }
                            methodWriter.invokeinterface(ASMUtils.TYPE_OBJECT_WRITER, str9, METHOD_DESC_WRITE_OBJECT);
                        }
                    } else if (cls2 == String[].class) {
                        methodWriter.aload(1);
                        methodWriter.aload(iVar2);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeString", "([Ljava/lang/String;)V");
                    } else {
                        if (cls2 != cls) {
                            if (itemClass != String.class) {
                            }
                            i2 = i2;
                            iVar2 = iVar2;
                            str4 = str4;
                            str8 = str8;
                            obj = obj;
                            gwListSimpleType(methodWriterContext, i2, methodWriter, cls2, itemClass, iVar2);
                            methodWriter = methodWriter;
                            cls2 = cls2;
                            j4 = j3;
                        } else {
                            i5 = 0;
                        }
                        methodWriter.aload(i5);
                        methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
                        methodWriter.aload(1);
                        methodWriter.aload(iVar2);
                        methodWriter.invokevirtual(ASMUtils.TYPE_OBJECT, "getClass", "()Ljava/lang/Class;");
                        methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "getObjectWriter", METHOD_DESC_GET_OBJECT_WRITER);
                        methodWriter.aload(1);
                        methodWriter.aload(iVar2);
                        methodWriter.visitLdcInsn(str7);
                        methodWriterContext.loadFieldType(i2, type);
                        methodWriter.visitLdcInsn(j3);
                        if (z) {
                            j4 = j3;
                            if ((j4 & JSONWriter.Feature.BeanToArray.mask) != 0) {
                                str9 = "writeArrayMappingJSONB";
                            } else {
                                str9 = "writeJSONB";
                            }
                        } else {
                            j4 = j3;
                            if ((j4 & JSONWriter.Feature.BeanToArray.mask) != 0) {
                                str5 = "writeArrayMapping";
                            }
                            str9 = str5;
                        }
                        methodWriter.invokeinterface(ASMUtils.TYPE_OBJECT_WRITER, str9, METHOD_DESC_WRITE_OBJECT);
                    }
                    if (z2) {
                        int iVar5 = methodWriterContext.var(obj);
                        Label label15 = new Label();
                        methodWriter.iload(iVar5);
                        methodWriter.ifeq(label15);
                        methodWriter.aload(1);
                        methodWriter.aload(iVar2);
                        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str8);
                        methodWriter.visitLabel(label15);
                    }
                    methodWriter.goto_(label6);
                    methodWriter.visitLabel(label);
                    j5 = JSONWriter.Feature.WriteNulls.mask;
                    if ((j4 & j5) == 0) {
                        if (cls2 != AtomicLongArray.class) {
                            j5 |= JSONWriter.Feature.WriteNullListAsEmpty.mask;
                            j6 = JSONWriter.Feature.NullAsDefaultValue.mask;
                        } else {
                            j5 |= JSONWriter.Feature.WriteNullListAsEmpty.mask;
                            j6 = JSONWriter.Feature.NullAsDefaultValue.mask;
                        }
                        fieldWriter3 = fieldWriter;
                        i6 = i2;
                        label3 = label6;
                        cls4 = cls2;
                        methodWriterContext.genIsEnabled(fieldWriter3.features, j5 | j6, label3);
                    } else {
                        fieldWriter3 = fieldWriter;
                        i6 = i2;
                        cls4 = cls2;
                        label3 = label6;
                    }
                    gwFieldName(methodWriterContext, fieldWriter3, i6);
                    methodWriter.aload(1);
                    String str16 = "()V";
                    if (cls4 != AtomicLongArray.class) {
                        str10 = "writeArrayNull";
                    } else {
                        str10 = "writeArrayNull";
                    }
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str10, str16);
                    methodWriter.visitLabel(label3);
                }
                methodWriter.aload(1);
                methodWriter.aload(iVar2);
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeUUID", "(Ljava/util/UUID;)V");
            }
        }
        i2 = i2;
        cls2 = cls2;
        j4 = j3;
        iVar2 = iVar2;
        methodWriter = methodWriter;
        str4 = str4;
        str8 = str8;
        obj = obj;
        if (z2) {
            int iVar6 = methodWriterContext.var(obj);
            Label label16 = new Label();
            methodWriter.iload(iVar6);
            methodWriter.ifeq(label16);
            methodWriter.aload(1);
            methodWriter.aload(iVar2);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str8);
            methodWriter.visitLabel(label16);
        }
        methodWriter.goto_(label6);
        methodWriter.visitLabel(label);
        j5 = JSONWriter.Feature.WriteNulls.mask;
        if ((j4 & j5) == 0) {
            if (cls2 != AtomicLongArray.class) {
                j5 |= JSONWriter.Feature.WriteNullListAsEmpty.mask;
                j6 = JSONWriter.Feature.NullAsDefaultValue.mask;
            } else {
                j5 |= JSONWriter.Feature.WriteNullListAsEmpty.mask;
                j6 = JSONWriter.Feature.NullAsDefaultValue.mask;
            }
            fieldWriter3 = fieldWriter;
            i6 = i2;
            label3 = label6;
            cls4 = cls2;
            methodWriterContext.genIsEnabled(fieldWriter3.features, j5 | j6, label3);
        } else {
            fieldWriter3 = fieldWriter;
            i6 = i2;
            cls4 = cls2;
            label3 = label6;
        }
        gwFieldName(methodWriterContext, fieldWriter3, i6);
        methodWriter.aload(1);
        String str17 = "()V";
        if (cls4 != AtomicLongArray.class) {
            str10 = "writeArrayNull";
        } else {
            str10 = "writeArrayNull";
        }
        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str10, str17);
        methodWriter.visitLabel(label3);
    }

    private void gwFieldValueString(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2) {
        Label label;
        int i3;
        long j;
        boolean z = methodWriterContext.jsonb;
        long j2 = fieldWriter.features | methodWriterContext.objectFeatures;
        MethodWriter methodWriter = methodWriterContext.mw;
        Class cls = fieldWriter.fieldClass;
        String str = fieldWriter.format;
        int iVar = methodWriterContext.var(cls);
        Label label2 = new Label();
        Label label3 = new Label();
        genGetObject(methodWriterContext, fieldWriter, i2, i);
        methodWriter.dup();
        methodWriter.astore(iVar);
        methodWriter.ifnull(label2);
        if ("trim".equals(str)) {
            methodWriter.aload(iVar);
            methodWriter.invokevirtual("java/lang/String", "trim", "()Ljava/lang/String;");
            methodWriter.astore(iVar);
        }
        JSONWriter.Feature feature = JSONWriter.Feature.IgnoreEmpty;
        if ((j2 & feature.mask) == 0) {
            label = new Label();
            methodWriterContext.genIsEnabled(feature.mask, label);
        } else {
            label = null;
        }
        methodWriter.aload(iVar);
        methodWriter.invokevirtual("java/lang/String", "isEmpty", "()Z");
        methodWriter.ifne(label3);
        if (label != null) {
            methodWriter.visitLabel(label);
        }
        gwFieldName(methodWriterContext, fieldWriter, i2);
        gwString(methodWriterContext, z && "symbol".equals(str), false, iVar);
        methodWriter.goto_(label3);
        methodWriter.visitLabel(label2);
        Label label4 = new Label();
        Label label5 = new Label();
        JSONWriter.Feature feature2 = JSONWriter.Feature.NullAsDefaultValue;
        long j3 = feature2.mask;
        JSONWriter.Feature feature3 = JSONWriter.Feature.WriteNullNumberAsZero;
        long j4 = feature3.mask | j3;
        JSONWriter.Feature feature4 = JSONWriter.Feature.WriteNullBooleanAsFalse;
        long j5 = feature4.mask | j4;
        JSONWriter.Feature feature5 = JSONWriter.Feature.WriteNullListAsEmpty;
        long j6 = j5 | feature5.mask;
        JSONWriter.Feature feature6 = JSONWriter.Feature.WriteNullStringAsEmpty;
        long j7 = feature6.mask;
        long j8 = j6 | j7;
        long j9 = JSONWriter.Feature.WriteNulls.mask;
        if ((j2 & (j9 | j8)) == 0) {
            methodWriterContext.genIsEnabled(j9 | j3 | j7, label5, label3);
        }
        methodWriter.visitLabel(label5);
        if (fieldWriter.defaultValue == null) {
            methodWriterContext.genIsDisabled(JSONWriter.Feature.NotWriteDefaultValue.mask, label3);
        }
        gwFieldName(methodWriterContext, fieldWriter, i2);
        if ((j2 & j8) == 0) {
            long j10 = feature2.mask;
            if (cls == String.class) {
                j = feature6.mask;
            } else if (cls == Boolean.class) {
                j = feature4.mask;
            } else if (Number.class.isAssignableFrom(cls)) {
                j = feature3.mask;
            } else {
                if (Collection.class.isAssignableFrom(cls)) {
                    j = feature5.mask;
                }
                i3 = 1;
                methodWriter.aload(1);
                methodWriter.visitLdcInsn(j10);
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "isEnabled", "(J)Z");
                methodWriter.ifeq(label4);
            }
            j10 |= j;
            i3 = 1;
            methodWriter.aload(1);
            methodWriter.visitLdcInsn(j10);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "isEnabled", "(J)Z");
            methodWriter.ifeq(label4);
        } else {
            i3 = 1;
        }
        methodWriter.aload(i3);
        methodWriter.visitLdcInsn("");
        String str2 = ASMUtils.TYPE_JSON_WRITER;
        methodWriter.invokevirtual(str2, "writeString", METHOD_DESC_WRITE_REFERENCE);
        methodWriter.goto_(label3);
        methodWriter.visitLabel(label4);
        methodWriter.aload(i3);
        methodWriter.invokevirtual(str2, "writeStringNull", "()V");
        methodWriter.visitLabel(label3);
    }

    private void gwFloat(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2) {
        boolean z = methodWriterContext.jsonb;
        MethodWriter methodWriter = methodWriterContext.mw;
        Class cls = fieldWriter.fieldClass;
        String str = methodWriterContext.classNameType;
        int iVar = methodWriterContext.var(cls);
        Label label = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        genGetObject(methodWriterContext, fieldWriter, i2, i);
        methodWriter.dup();
        methodWriter.astore(iVar);
        methodWriter.ifnonnull(label2);
        long j = fieldWriter.features;
        long j2 = JSONWriter.Feature.WriteNulls.mask;
        JSONWriter.Feature feature = JSONWriter.Feature.NullAsDefaultValue;
        long j3 = feature.mask;
        long j4 = j2 | j3;
        JSONWriter.Feature feature2 = JSONWriter.Feature.WriteNullNumberAsZero;
        long j5 = feature2.mask;
        long j6 = j & (j4 | j5);
        String str2 = "writeFloat";
        if (j6 == 0) {
            methodWriterContext.genIsEnabled(j2 | j3 | j5, label3, label);
            methodWriter.visitLabel(label3);
            gwFieldName(methodWriterContext, fieldWriter, i2);
            methodWriter.aload(1);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeDecimalNull", "()V");
        } else {
            gwFieldName(methodWriterContext, fieldWriter, i2);
            methodWriter.aload(1);
            if (((feature2.mask | feature.mask) & fieldWriter.features) != 0) {
                methodWriter.visitLdcInsn(0);
                methodWriter.i2f();
                str2 = "writeFloat";
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str2, "(F)V");
            } else {
                str2 = "writeFloat";
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeNull", "()V");
            }
        }
        methodWriter.goto_(label);
        methodWriter.visitLabel(label2);
        if (z) {
            gwFieldName(methodWriterContext, fieldWriter, i2);
            methodWriter.aload(1);
            methodWriter.aload(iVar);
            methodWriter.invokevirtual("java/lang/Float", "floatValue", "()F");
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str2, "(D)V");
        } else {
            methodWriter.aload(0);
            methodWriter.getfield(str, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
            methodWriter.aload(1);
            methodWriter.aload(iVar);
            methodWriter.invokevirtual("java/lang/Float", "floatValue", "()F");
            methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, str2, METHOD_DESC_WRITE_F);
        }
        methodWriter.visitLabel(label);
    }

    private void gwInt32(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2) {
        String str = methodWriterContext.classNameType;
        MethodWriter methodWriter = methodWriterContext.mw;
        int iVar = methodWriterContext.var(fieldWriter.fieldClass);
        Label label = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        genGetObject(methodWriterContext, fieldWriter, i2, i);
        methodWriter.dup();
        methodWriter.astore(iVar);
        methodWriter.ifnonnull(label2);
        long j = fieldWriter.features;
        boolean z = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0;
        long j2 = JSONWriter.Feature.WriteNulls.mask;
        JSONWriter.Feature feature = JSONWriter.Feature.NullAsDefaultValue;
        long j3 = feature.mask;
        long j4 = j2 | j3;
        JSONWriter.Feature feature2 = JSONWriter.Feature.WriteNullNumberAsZero;
        boolean z2 = z;
        long j5 = feature2.mask;
        if ((j & (j4 | j5)) == 0) {
            methodWriterContext.genIsEnabled(j2 | j3 | j5, label3, label);
            methodWriter.visitLabel(label3);
            gwFieldName(methodWriterContext, fieldWriter, i2);
            methodWriter.aload(1);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeNumberNull", "()V");
        } else {
            gwFieldName(methodWriterContext, fieldWriter, i2);
            methodWriter.aload(1);
            if ((fieldWriter.features & (feature2.mask | feature.mask)) != 0) {
                methodWriter.visitLdcInsn(0);
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeInt32", "(I)V");
            } else {
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeNull", "()V");
            }
        }
        methodWriter.goto_(label);
        methodWriter.visitLabel(label2);
        if (z2) {
            methodWriter.aload(0);
            methodWriter.getfield(str, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
            methodWriter.aload(1);
            methodWriter.aload(iVar);
            methodWriter.invokevirtual("java/lang/Integer", "intValue", "()I");
            methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "writeInt32", METHOD_DESC_WRITE_I);
        } else {
            gwFieldName(methodWriterContext, fieldWriter, i2);
            methodWriter.aload(1);
            methodWriter.aload(iVar);
            methodWriter.invokevirtual("java/lang/Integer", "intValue", "()I");
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeInt32", "(I)V");
        }
        methodWriter.visitLabel(label);
    }

    private void gwInt64(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2) {
        int i3;
        String str;
        MethodWriter methodWriter = methodWriterContext.mw;
        Class cls = fieldWriter.fieldClass;
        String str2 = methodWriterContext.classNameType;
        int iVar = methodWriterContext.var(cls);
        Label label = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        genGetObject(methodWriterContext, fieldWriter, i2, i);
        methodWriter.dup();
        methodWriter.astore(iVar);
        methodWriter.ifnonnull(label2);
        long j = fieldWriter.features;
        long j2 = JSONWriter.Feature.WriteNulls.mask;
        JSONWriter.Feature feature = JSONWriter.Feature.NullAsDefaultValue;
        long j3 = feature.mask;
        long j4 = j2 | j3;
        JSONWriter.Feature feature2 = JSONWriter.Feature.WriteNullNumberAsZero;
        long j5 = feature2.mask;
        if ((j & (j4 | j5)) == 0) {
            methodWriterContext.genIsEnabled(j2 | j3 | j5, label3, label);
            methodWriter.visitLabel(label3);
            gwFieldName(methodWriterContext, fieldWriter, i2);
            methodWriter.aload(1);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeInt64Null", "()V");
            i3 = iVar;
            str = str2;
        } else {
            gwFieldName(methodWriterContext, fieldWriter, i2);
            methodWriter.aload(1);
            i3 = iVar;
            str = str2;
            if ((fieldWriter.features & (feature2.mask | feature.mask)) != 0) {
                methodWriter.lconst_0();
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeInt64", "(J)V");
            } else {
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeNull", "()V");
            }
        }
        methodWriter.goto_(label);
        methodWriter.visitLabel(label2);
        if ((fieldWriter.features & (JSONWriter.Feature.WriteLongAsString.mask | JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.BrowserCompatible.mask)) == 0) {
            gwFieldName(methodWriterContext, fieldWriter, i2);
            methodWriter.aload(1);
            methodWriter.aload(i3);
            methodWriter.invokevirtual("java/lang/Long", "longValue", "()J");
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeInt64", "(J)V");
        } else {
            methodWriter.aload(0);
            methodWriter.getfield(str, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
            methodWriter.aload(1);
            methodWriter.aload(i3);
            methodWriter.invokevirtual("java/lang/Long", "longValue", "()J");
            methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "writeInt64", METHOD_DESC_WRITE_J);
        }
        methodWriter.visitLabel(label);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    private void gwList(MethodWriterContext methodWriterContext, int i, int i2, FieldWriter fieldWriter) {
        Class<?> mapping;
        boolean z;
        MethodWriter methodWriter;
        Label label;
        Type type = fieldWriter.fieldType;
        Class cls = fieldWriter.fieldClass;
        int iVar = methodWriterContext.var(cls);
        MethodWriter methodWriter2 = methodWriterContext.mw;
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                Type type2 = actualTypeArguments[0];
                mapping = TypeUtils.getMapping(type2);
                if (type2 == String.class || type2 == Integer.class || type2 == Long.class) {
                    z = true;
                }
            } else {
                mapping = null;
            }
            z = false;
        } else {
            mapping = null;
            z = false;
        }
        Label label2 = new Label();
        Label label3 = new Label();
        genGetObject(methodWriterContext, fieldWriter, i2, i);
        methodWriter2.dup();
        methodWriter2.astore(iVar);
        methodWriter2.ifnonnull(label3);
        methodWriter2.aload(1);
        String str = ASMUtils.TYPE_JSON_WRITER;
        methodWriter2.invokevirtual(str, "writeNull", "()V");
        methodWriter2.goto_(label2);
        methodWriter2.visitLabel(label3);
        if (z) {
            genGetObject(methodWriterContext, fieldWriter, i2, i);
            methodWriter2.astore(iVar);
            methodWriter = methodWriter2;
            gwListSimpleType(methodWriterContext, i2, methodWriter, cls, mapping, iVar);
            label = label2;
        } else {
            methodWriter = methodWriter2;
            int iVar2 = methodWriterContext.var("LIST_SIZE");
            int iVar3 = methodWriterContext.var("J");
            int iVar4 = methodWriterContext.var(Class.class);
            int iVar5 = methodWriterContext.var("PREVIOUS_CLASS");
            int iVar6 = methodWriterContext.var("ITEM_OBJECT_WRITER");
            methodWriter.aconst_null();
            methodWriter.dup();
            methodWriter.astore(iVar5);
            methodWriter.astore(iVar6);
            methodWriter.aload(iVar);
            methodWriter.invokeinterface("java/util/List", "size", "()I");
            methodWriter.istore(iVar2);
            methodWriter.aload(1);
            methodWriter.invokevirtual(str, "startArray", "()V");
            Label label4 = new Label();
            Label label5 = new Label();
            Label label6 = new Label();
            Label label7 = new Label();
            methodWriter.iconst_0();
            methodWriter.istore(iVar3);
            methodWriter.visitLabel(label4);
            methodWriter.iload(iVar3);
            methodWriter.iload(iVar2);
            methodWriter.if_icmpge(label5);
            methodWriter.iload(iVar3);
            methodWriter.ifeq(label7);
            methodWriter.aload(1);
            methodWriter.invokevirtual(str, "writeComma", "()V");
            methodWriter.visitLabel(label7);
            int iVar7 = methodWriterContext.var(mapping);
            Label label8 = new Label();
            Label label9 = new Label();
            methodWriter.aload(iVar);
            methodWriter.iload(iVar3);
            methodWriter.invokeinterface("java/util/List", "get", "(I)Ljava/lang/Object;");
            methodWriter.dup();
            methodWriter.astore(iVar7);
            methodWriter.ifnonnull(label8);
            methodWriter.aload(1);
            methodWriter.invokevirtual(str, "writeNull", "()V");
            methodWriter.goto_(label6);
            methodWriter.visitLabel(label8);
            methodWriter.aload(iVar7);
            methodWriter.invokevirtual(ASMUtils.TYPE_OBJECT, "getClass", "()Ljava/lang/Class;");
            methodWriter.dup();
            methodWriter.astore(iVar4);
            methodWriter.aload(iVar5);
            methodWriter.if_acmpeq(label9);
            methodWriter.aload(0);
            methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
            methodWriter.aload(1);
            methodWriter.aload(iVar4);
            methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "getItemWriter", METHOD_DESC_GET_ITEM_WRITER);
            methodWriter.astore(iVar6);
            methodWriter.aload(iVar4);
            methodWriter.astore(iVar5);
            methodWriter.visitLabel(label9);
            methodWriter.aload(iVar6);
            methodWriter.aload(1);
            methodWriter.aload(iVar7);
            methodWriter.iload(iVar3);
            methodWriter.invokestatic("java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
            methodWriterContext.loadFieldType(i2, type);
            methodWriter.visitLdcInsn(fieldWriter.features);
            methodWriter.invokeinterface(ASMUtils.TYPE_OBJECT_WRITER, "write", METHOD_DESC_WRITE_OBJECT);
            methodWriter.visitLabel(label6);
            methodWriter.visitIincInsn(iVar3, 1);
            methodWriter.goto_(label4);
            methodWriter.visitLabel(label5);
            methodWriter.aload(1);
            methodWriter.invokevirtual(str, "endArray", "()V");
            label = label2;
        }
        methodWriter.visitLabel(label);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    private void gwListJSONB(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2) {
        Class<?> cls;
        boolean z;
        String str;
        MethodWriter methodWriter;
        int i3;
        int i4;
        boolean zDisableReferenceDetect = methodWriterContext.disableReferenceDetect();
        Type type = fieldWriter.fieldType;
        Class cls2 = fieldWriter.fieldClass;
        String str2 = methodWriterContext.classNameType;
        MethodWriter methodWriter2 = methodWriterContext.mw;
        int iVar = methodWriterContext.var(cls2);
        int iVar2 = methodWriterContext.var("REF_PATH");
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                Type type2 = actualTypeArguments[0];
                cls = TypeUtils.getClass(type2);
                if (type2 == String.class || type2 == Integer.class || type2 == Long.class) {
                    z = true;
                }
            } else {
                cls = null;
            }
            z = false;
        } else {
            cls = null;
            z = false;
        }
        Label label = new Label();
        Label label2 = new Label();
        genGetObject(methodWriterContext, fieldWriter, i2, i);
        methodWriter2.dup();
        methodWriter2.astore(iVar);
        methodWriter2.ifnonnull(label2);
        methodWriter2.aload(1);
        String str3 = ASMUtils.TYPE_JSON_WRITER;
        boolean z2 = z;
        methodWriter2.invokevirtual(str3, "writeNull", "()V");
        methodWriter2.goto_(label);
        methodWriter2.visitLabel(label2);
        if (zDisableReferenceDetect) {
            str = "(Ljava/lang/Object;)V";
        } else {
            Label label3 = new Label();
            Label label4 = new Label();
            methodWriterContext.genIsEnabled(JSONWriter.Feature.ReferenceDetection.mask, label3);
            if (cls2.isAssignableFrom(methodWriterContext.objectClass)) {
                methodWriter2.aload(i);
                methodWriter2.aload(iVar);
                methodWriter2.if_acmpne(label4);
                methodWriter2.aload(1);
                methodWriter2.visitLdcInsn("..");
                methodWriter2.invokevirtual(str3, "writeReference", METHOD_DESC_WRITE_REFERENCE);
                methodWriter2.goto_(label);
                methodWriter2.visitLabel(label4);
            }
            methodWriter2.aload(0);
            String strFieldWriter = fieldWriter(i2);
            String str4 = ASMUtils.DESC_FIELD_WRITER;
            methodWriter2.getfield(str2, strFieldWriter, str4);
            methodWriter2.aload(iVar);
            methodWriter2.lload(methodWriterContext.var(CONTEXT_FEATURES));
            methodWriter2.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "isRefDetect", "(Ljava/lang/Object;J)Z");
            methodWriter2.ifeq(label3);
            methodWriter2.aload(1);
            methodWriter2.aload(0);
            methodWriter2.getfield(str2, fieldWriter(i2), str4);
            methodWriter2.aload(iVar);
            methodWriter2.invokevirtual(str3, "setPath0", METHOD_DESC_SET_PATH2);
            methodWriter2.dup();
            methodWriter2.astore(iVar2);
            methodWriter2.ifnull(label3);
            methodWriter2.aload(1);
            methodWriter2.aload(iVar2);
            methodWriter2.invokevirtual(str3, "writeReference", METHOD_DESC_WRITE_REFERENCE);
            methodWriter2.aload(1);
            methodWriter2.aload(iVar);
            str = "(Ljava/lang/Object;)V";
            methodWriter2.invokevirtual(str3, "popPath0", str);
            methodWriter2.goto_(label);
            methodWriter2.visitLabel(label3);
        }
        if (z2) {
            methodWriter = methodWriter2;
            i3 = iVar;
            gwListSimpleType(methodWriterContext, i2, methodWriter, cls2, cls, i3);
            i4 = 1;
        } else {
            methodWriter = methodWriter2;
            i3 = iVar;
            int iVar3 = methodWriterContext.var("ITEM_CLASS");
            int iVar4 = methodWriterContext.var("ITEM_OBJECT_WRITER");
            methodWriter.aconst_null();
            methodWriter.dup();
            methodWriter.astore(iVar3);
            methodWriter.astore(iVar4);
            methodWriter.aload(0);
            methodWriter.getfield(str2, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
            i4 = 1;
            methodWriter.aload(1);
            methodWriter.aload(i3);
            methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "writeListValueJSONB", METHOD_DESC_WRITE_LIST);
        }
        if (!zDisableReferenceDetect) {
            methodWriter.aload(i4);
            methodWriter.aload(i3);
            methodWriter.invokevirtual(str3, "popPath0", str);
        }
        methodWriter.visitLabel(label);
    }

    private static void gwListSimpleType(MethodWriterContext methodWriterContext, int i, MethodWriter methodWriter, Class<?> cls, Class cls2, int i2) {
        if (methodWriterContext.jsonb) {
            methodWriter.aload(1);
            methodWriter.aload(i2);
            methodWriterContext.loadFieldClass(i, cls);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "checkAndWriteTypeName", "(Ljava/lang/Object;Ljava/lang/Class;)V");
        }
        if (cls2 == Integer.class) {
            methodWriter.aload(1);
            methodWriter.aload(i2);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeListInt32", "(Ljava/util/List;)V");
        } else if (cls2 == Long.class) {
            methodWriter.aload(1);
            methodWriter.aload(i2);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeListInt64", "(Ljava/util/List;)V");
        } else {
            if (cls2 != String.class) {
                throw new JSONException("TOOD ".concat(cls2.getName()));
            }
            methodWriter.aload(1);
            methodWriter.aload(i2);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeString", "(Ljava/util/List;)V");
        }
    }

    private void gwObject(MethodWriterContext methodWriterContext, int i, int i2, FieldWriter fieldWriter, String str) {
        Label label;
        int i3;
        int i4;
        Class cls = fieldWriter.fieldClass;
        MethodWriter methodWriter = methodWriterContext.mw;
        int iVar = methodWriterContext.var(cls);
        int iVar2 = methodWriterContext.var("REF_PATH");
        Label label2 = new Label();
        Label label3 = new Label();
        genGetObject(methodWriterContext, fieldWriter, i2, i);
        methodWriter.dup();
        methodWriter.astore(iVar);
        methodWriter.ifnonnull(label3);
        methodWriter.aload(1);
        String str2 = ASMUtils.TYPE_JSON_WRITER;
        methodWriter.invokevirtual(str2, "writeNull", "()V");
        methodWriter.goto_(label2);
        methodWriter.visitLabel(label3);
        if (cls == Double.class || cls == Float.class || cls == BigDecimal.class) {
            methodWriter.aload(1);
            if (fieldWriter.decimalFormat != null) {
                methodWriter.aload(iVar);
                if (cls == Double.class) {
                    methodWriter.invokevirtual("java/lang/Double", "doubleValue", "()D");
                    methodWriter.aload(0);
                    methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
                    methodWriter.getfield(ASMUtils.TYPE_FIELD_WRITER, "decimalFormat", "Ljava/text/DecimalFormat;");
                    methodWriter.invokevirtual(str2, "writeDouble", "(DLjava/text/DecimalFormat;)V");
                } else if (cls == Float.class) {
                    methodWriter.invokevirtual("java/lang/Float", "floatValue", "()F");
                    methodWriter.aload(0);
                    methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
                    methodWriter.getfield(ASMUtils.TYPE_FIELD_WRITER, "decimalFormat", "Ljava/text/DecimalFormat;");
                    methodWriter.invokevirtual(str2, "writeFloat", "(FLjava/text/DecimalFormat;)V");
                } else {
                    methodWriter.visitLdcInsn(fieldWriter.features);
                    methodWriter.aload(0);
                    methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
                    methodWriter.getfield(ASMUtils.TYPE_FIELD_WRITER, "decimalFormat", "Ljava/text/DecimalFormat;");
                    methodWriter.invokevirtual(str2, "writeDecimal", "(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V");
                }
            } else {
                methodWriter.aload(iVar);
                if (cls == Double.class) {
                    methodWriter.invokevirtual("java/lang/Double", "doubleValue", "()D");
                    methodWriter.invokevirtual(str2, "writeDouble", "(D)V");
                } else if (cls == Float.class) {
                    methodWriter.invokevirtual("java/lang/Float", "floatValue", "()F");
                    methodWriter.invokevirtual(str2, "writeFloat", "(F)V");
                } else {
                    methodWriter.visitLdcInsn(fieldWriter.features);
                    methodWriter.aconst_null();
                    methodWriter.invokevirtual(str2, "writeDecimal", "(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V");
                }
            }
            label = label2;
        } else {
            boolean zIsNotReferenceDetect = ObjectWriterProvider.isNotReferenceDetect(cls);
            if (zIsNotReferenceDetect) {
                i3 = 1;
            } else {
                Label label4 = new Label();
                Label label5 = new Label();
                methodWriter.aload(1);
                methodWriter.invokevirtual(str2, "isRefDetect", "()Z");
                methodWriter.ifeq(label4);
                Class<?> cls2 = methodWriterContext.objectClass;
                if (cls2 == null || !cls.isAssignableFrom(cls2)) {
                    i4 = 1;
                } else {
                    methodWriter.aload(i);
                    methodWriter.aload(iVar);
                    methodWriter.if_acmpne(label5);
                    i4 = 1;
                    methodWriter.aload(1);
                    methodWriter.visitLdcInsn("..");
                    methodWriter.invokevirtual(str2, "writeReference", METHOD_DESC_WRITE_REFERENCE);
                    methodWriter.goto_(label2);
                    methodWriter.visitLabel(label5);
                }
                methodWriter.aload(i4);
                methodWriter.aload(0);
                methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
                methodWriter.aload(iVar);
                methodWriter.invokevirtual(str2, "setPath0", METHOD_DESC_SET_PATH2);
                methodWriter.dup();
                methodWriter.astore(iVar2);
                methodWriter.ifnull(label4);
                i3 = 1;
                methodWriter.aload(1);
                methodWriter.aload(iVar2);
                methodWriter.invokevirtual(str2, "writeReference", METHOD_DESC_WRITE_REFERENCE);
                methodWriter.aload(1);
                methodWriter.aload(iVar);
                methodWriter.invokevirtual(str2, "popPath0", "(Ljava/lang/Object;)V");
                methodWriter.goto_(label2);
                methodWriter.visitLabel(label4);
            }
            if (cls == String[].class) {
                methodWriter.aload(i3);
                methodWriter.aload(iVar);
                methodWriter.invokevirtual(str2, "writeString", "([Ljava/lang/String;)V");
            } else {
                methodWriter.aload(0);
                methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
                methodWriter.aload(i3);
                methodWriter.aload(iVar);
                methodWriter.invokevirtual(ASMUtils.TYPE_OBJECT, "getClass", "()Ljava/lang/Class;");
                methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "getObjectWriter", METHOD_DESC_GET_OBJECT_WRITER);
                methodWriter.aload(i3);
                methodWriter.aload(iVar);
                methodWriter.visitLdcInsn(fieldWriter.fieldName);
                methodWriterContext.loadFieldType(i2, fieldWriter.fieldType);
                methodWriter.visitLdcInsn(fieldWriter.features);
                methodWriter.invokeinterface(ASMUtils.TYPE_OBJECT_WRITER, "write", METHOD_DESC_WRITE_OBJECT);
            }
            if (!zIsNotReferenceDetect) {
                methodWriter.aload(1);
                methodWriter.aload(iVar);
                methodWriter.invokevirtual(str2, "popPath0", "(Ljava/lang/Object;)V");
            }
            label = label2;
        }
        methodWriter.visitLabel(label);
    }

    private void gwObjectA(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2) {
        MethodWriter methodWriter = methodWriterContext.mw;
        if (fieldWriter.fieldClass == String[].class) {
            methodWriter.aload(1);
            genGetObject(methodWriterContext, fieldWriter, i2, i);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeString", "([Ljava/lang/String;)V");
        } else {
            methodWriter.aload(0);
            methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
            methodWriter.aload(1);
            methodWriter.aload(i);
            methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "writeValue", METHOD_DESC_WRITE_VALUE);
        }
    }

    private void gwObjectJSONB(FieldWriter fieldWriter, int i, MethodWriterContext methodWriterContext, int i2, boolean z) {
        int i3;
        String str;
        String str2;
        int i4;
        Class cls = fieldWriter.fieldClass;
        String str3 = fieldWriter.fieldName;
        String str4 = methodWriterContext.classNameType;
        MethodWriter methodWriter = methodWriterContext.mw;
        int iVar = methodWriterContext.var(cls);
        Label label = new Label();
        Label label2 = new Label();
        genGetObject(methodWriterContext, fieldWriter, i2, i);
        methodWriter.dup();
        methodWriter.astore(iVar);
        methodWriter.ifnonnull(label2);
        methodWriter.aload(1);
        String str5 = ASMUtils.TYPE_JSON_WRITER;
        methodWriter.invokevirtual(str5, "writeNull", "()V");
        methodWriter.goto_(label);
        methodWriter.visitLabel(label2);
        boolean z2 = (methodWriterContext.disableSupportArrayMapping() || ObjectWriterProvider.isNotReferenceDetect(cls)) ? false : true;
        if (z2) {
            int iVar2 = methodWriterContext.var("REF_PATH");
            Label label3 = new Label();
            Label label4 = new Label();
            methodWriterContext.genIsEnabled(JSONWriter.Feature.ReferenceDetection.mask, label3);
            Class<?> cls2 = methodWriterContext.objectClass;
            if (cls2 == null || !cls.isAssignableFrom(cls2)) {
                i4 = 1;
            } else {
                methodWriter.aload(i);
                methodWriter.aload(iVar);
                methodWriter.if_acmpne(label4);
                i4 = 1;
                methodWriter.aload(1);
                methodWriter.visitLdcInsn("..");
                methodWriter.invokevirtual(str5, "writeReference", METHOD_DESC_WRITE_REFERENCE);
                methodWriter.goto_(label);
                methodWriter.visitLabel(label4);
            }
            methodWriter.aload(i4);
            methodWriter.aload(0);
            methodWriter.getfield(str4, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
            methodWriter.aload(iVar);
            methodWriter.invokevirtual(str5, "setPath0", METHOD_DESC_SET_PATH2);
            methodWriter.dup();
            methodWriter.astore(iVar2);
            methodWriter.ifnull(label3);
            i3 = 1;
            methodWriter.aload(1);
            methodWriter.aload(iVar2);
            methodWriter.invokevirtual(str5, "writeReference", METHOD_DESC_WRITE_REFERENCE);
            methodWriter.aload(1);
            methodWriter.aload(iVar);
            str2 = "(Ljava/lang/Object;)V";
            str = "popPath0";
            methodWriter.invokevirtual(str5, str, str2);
            methodWriter.goto_(label);
            methodWriter.visitLabel(label3);
        } else {
            i3 = 1;
            str = "popPath0";
            str2 = "(Ljava/lang/Object;)V";
        }
        methodWriter.aload(0);
        methodWriter.getfield(str4, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
        methodWriter.aload(i3);
        methodWriter.aload(iVar);
        methodWriter.invokevirtual(ASMUtils.TYPE_OBJECT, "getClass", "()Ljava/lang/Class;");
        methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "getObjectWriter", METHOD_DESC_GET_OBJECT_WRITER);
        methodWriter.aload(i3);
        methodWriter.aload(iVar);
        methodWriter.visitLdcInsn(str3);
        methodWriterContext.loadFieldType(i2, fieldWriter.fieldType);
        methodWriter.visitLdcInsn(fieldWriter.features);
        methodWriter.invokeinterface(ASMUtils.TYPE_OBJECT_WRITER, z ? "writeJSONB" : "writeArrayMappingJSONB", METHOD_DESC_WRITE_OBJECT);
        if (z2) {
            methodWriter.aload(1);
            methodWriter.aload(iVar);
            methodWriter.invokevirtual(str5, str, str2);
        }
        methodWriter.visitLabel(label);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d5  */
    public static void gwString(MethodWriterContext methodWriterContext, boolean z, boolean z2, int i) {
        MethodWriter methodWriter = methodWriterContext.mw;
        Label label = new Label();
        Label label2 = new Label();
        if (z2) {
            methodWriter.aload(i);
            methodWriter.ifnonnull(label);
            methodWriter.aload(1);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeStringNull", "()V");
            methodWriter.goto_(label2);
            methodWriter.visitLabel(label);
        }
        int i2 = JDKUtils.JVM_VERSION;
        if (i2 == 8 && !JDKUtils.OPENJ9 && !JDKUtils.FIELD_STRING_VALUE_ERROR && !z) {
            methodWriter.aload(1);
            methodWriter.getstatic(ObjectWriterCreatorASMUtils.TYPE_UNSAFE_UTILS, "UNSAFE", "Lsun/misc/Unsafe;");
            methodWriter.aload(i);
            methodWriter.visitLdcInsn(JDKUtils.FIELD_STRING_VALUE_OFFSET);
            methodWriter.invokevirtual("sun/misc/Unsafe", "getObject", "(Ljava/lang/Object;J)Ljava/lang/Object;");
            methodWriter.checkcast("[C");
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeString", "([C)V");
        } else if (i2 <= 8 || JDKUtils.OPENJ9) {
            methodWriter.aload(1);
            methodWriter.aload(i);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, z ? "writeSymbol" : "writeString", METHOD_DESC_WRITE_REFERENCE);
        } else {
            long j = JDKUtils.FIELD_STRING_CODER_OFFSET;
            if (j != -1) {
                long j2 = JDKUtils.FIELD_STRING_VALUE_OFFSET;
                if (j2 == -1 || z) {
                    methodWriter.aload(1);
                    methodWriter.aload(i);
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, z ? "writeSymbol" : "writeString", METHOD_DESC_WRITE_REFERENCE);
                } else {
                    Label label3 = new Label();
                    Label label4 = new Label();
                    methodWriter.aload(1);
                    String str = ObjectWriterCreatorASMUtils.TYPE_UNSAFE_UTILS;
                    methodWriter.getstatic(str, "UNSAFE", "Lsun/misc/Unsafe;");
                    methodWriter.aload(i);
                    methodWriter.visitLdcInsn(j2);
                    methodWriter.invokevirtual("sun/misc/Unsafe", "getObject", "(Ljava/lang/Object;J)Ljava/lang/Object;");
                    methodWriter.checkcast("[B");
                    methodWriter.getstatic(str, "UNSAFE", "Lsun/misc/Unsafe;");
                    methodWriter.aload(i);
                    methodWriter.visitLdcInsn(j);
                    methodWriter.invokevirtual("sun/misc/Unsafe", "getByte", "(Ljava/lang/Object;J)B");
                    methodWriter.ifne(label3);
                    String str2 = ASMUtils.TYPE_JSON_WRITER;
                    methodWriter.invokevirtual(str2, "writeStringLatin1", "([B)V");
                    methodWriter.goto_(label4);
                    methodWriter.visitLabel(label3);
                    methodWriter.invokevirtual(str2, "writeStringUTF16", "([B)V");
                    methodWriter.visitLabel(label4);
                }
            } else {
                methodWriter.aload(1);
                methodWriter.aload(i);
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, z ? "writeSymbol" : "writeString", METHOD_DESC_WRITE_REFERENCE);
            }
        }
        if (z2) {
            methodWriter.visitLabel(label2);
        }
    }

    private void gwValue(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2, Integer num) {
        String str;
        MethodWriter methodWriter = methodWriterContext.mw;
        Class<?> cls = fieldWriter.fieldClass;
        if (cls == String.class) {
            genGetObject(methodWriterContext, fieldWriter, i2, i);
            methodWriter.checkcast("java/lang/String");
            int iVar = methodWriterContext.var("FIELD_VALUE_".concat(fieldWriter.fieldClass.getName()));
            methodWriter.astore(iVar);
            gwString(methodWriterContext, false, true, iVar);
            return;
        }
        methodWriter.aload(1);
        if (num != null) {
            methodWriter.loadLocal(cls, num.intValue());
        } else {
            genGetObject(methodWriterContext, fieldWriter, i2, i);
        }
        DecimalFormat decimalFormat = fieldWriter.decimalFormat;
        String str2 = "(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V";
        Class<?> cls2 = Float.TYPE;
        Class<?> cls3 = Double.TYPE;
        if (decimalFormat != null) {
            if (cls == cls3) {
                methodWriter.aload(0);
                methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
                methodWriter.getfield(ASMUtils.TYPE_FIELD_WRITER, "decimalFormat", "Ljava/text/DecimalFormat;");
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeDouble", "(DLjava/text/DecimalFormat;)V");
                return;
            }
            if (cls == cls2) {
                methodWriter.aload(0);
                methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
                methodWriter.getfield(ASMUtils.TYPE_FIELD_WRITER, "decimalFormat", "Ljava/text/DecimalFormat;");
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeFloat", "(FLjava/text/DecimalFormat;)V");
                return;
            }
            if (cls != BigDecimal.class) {
                throw new UnsupportedOperationException();
            }
            methodWriter.visitLdcInsn(fieldWriter.features);
            methodWriter.aload(0);
            methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i2), ASMUtils.DESC_FIELD_WRITER);
            methodWriter.getfield(ASMUtils.TYPE_FIELD_WRITER, "decimalFormat", "Ljava/text/DecimalFormat;");
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeDecimal", "(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V");
            return;
        }
        boolean z = (fieldWriter.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        Class<?> cls4 = Integer.TYPE;
        if (cls == cls4 && !z) {
            String str3 = fieldWriter.format;
            if ("string".equals(str3)) {
                methodWriter.invokestatic("java/lang/Integer", "toString", "(I)Ljava/lang/String;");
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeString", METHOD_DESC_WRITE_REFERENCE);
                return;
            } else if (str3 == null) {
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeInt32", "(I)V");
                return;
            } else {
                methodWriter.visitLdcInsn(str3);
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "writeInt32", "(ILjava/lang/String;)V");
                return;
            }
        }
        if (cls != Boolean.TYPE) {
            if (cls == Character.TYPE) {
                str = "writeChar";
                str2 = "(C)V";
            } else if (cls == Byte.TYPE) {
                str = z ? "writeString" : "writeInt8";
                str2 = "(B)V";
            } else if (cls == Short.TYPE) {
                str = z ? "writeString" : "writeInt16";
                str2 = "(S)V";
            } else if (cls == cls4) {
                str = z ? "writeString" : "writeInt32";
                str2 = "(I)V";
            } else {
                if (cls == Integer.class) {
                    str2 = "(Ljava/lang/Integer;)V";
                } else if (cls == Long.TYPE) {
                    str = z ? "writeString" : "writeInt64";
                    str2 = "(J)V";
                } else {
                    if (cls == Long.class) {
                        str2 = "(Ljava/lang/Long;)V";
                    } else if (cls == cls2) {
                        str = z ? "writeString" : "writeFloat";
                        str2 = "(F)V";
                    } else if (cls == cls3) {
                        str = z ? "writeString" : "writeDouble";
                        str2 = "(D)V";
                    } else if (cls == boolean[].class) {
                        str2 = "([Z)V";
                    } else if (cls == char[].class) {
                        str2 = "([C)V";
                        str = "writeString";
                    } else if (cls == byte[].class) {
                        str = "writeBinary";
                        str2 = "([B)V";
                    } else if (cls == short[].class) {
                        str2 = "([S)V";
                        str = "writeInt16";
                    } else if (cls == int[].class) {
                        str2 = "([I)V";
                    } else if (cls == long[].class && methodWriterContext.provider.getObjectWriter(Long.class) == ObjectWriterImplInt64.INSTANCE) {
                        str2 = "([J)V";
                    } else if (cls == float[].class) {
                        str2 = "([F)V";
                        str = "writeFloat";
                    } else if (cls == double[].class) {
                        str2 = "([D)V";
                        str = "writeDouble";
                    } else if (cls == BigDecimal.class) {
                        methodWriter.visitLdcInsn(fieldWriter.features);
                        methodWriter.aconst_null();
                        str = "writeDecimal";
                    } else {
                        if (!Enum.class.isAssignableFrom(cls)) {
                            throw new UnsupportedOperationException();
                        }
                        str = "writeEnum";
                        str2 = "(Ljava/lang/Enum;)V";
                    }
                    str = "writeInt64";
                }
                str = "writeInt32";
            }
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str, str2);
        }
        str2 = "(Z)V";
        str = "writeBool";
        methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str, str2);
    }

    private void gwValueJSONB(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2) {
        long j = fieldWriter.features | methodWriterContext.objectFeatures;
        Class cls = fieldWriter.fieldClass;
        boolean z = false;
        boolean z2 = (j & JSONWriter.Feature.BeanToArray.mask) != 0;
        Class cls2 = Long.TYPE;
        if ((cls == cls2 || cls == Long.class || cls == long[].class) && (methodWriterContext.provider.userDefineMask & 4) != 0) {
            z = methodWriterContext.provider.getObjectWriter(Long.class) != ObjectWriterImplInt64.INSTANCE;
        }
        if (cls == Boolean.TYPE || cls == boolean[].class || cls == Character.TYPE || cls == char[].class || cls == Byte.TYPE || cls == byte[].class || cls == Short.TYPE || cls == short[].class || cls == Integer.TYPE || cls == int[].class || cls == cls2 || ((cls == long[].class && !z) || cls == Float.TYPE || cls == float[].class || cls == Double.TYPE || cls == double[].class || cls == String.class || cls == Integer.class || cls == Long.class || cls == BigDecimal.class || cls.isEnum())) {
            gwValue(methodWriterContext, fieldWriter, i, i2, null);
            return;
        }
        if (cls == Date.class) {
            gwDate(methodWriterContext, fieldWriter, i, i2);
            return;
        }
        if (fieldWriter instanceof FieldWriterList) {
            gwListJSONB(methodWriterContext, fieldWriter, i, i2);
        } else if (cls.isArray()) {
            gwObjectA(methodWriterContext, fieldWriter, i, i2);
        } else {
            gwObjectJSONB(fieldWriter, i, methodWriterContext, i2, z2);
        }
    }

    private static void gwWriteByte(MethodWriter methodWriter, int i, int i2, byte b) {
        methodWriter.aload(i);
        methodWriter.iload(i2);
        methodWriter.iconst_n(b);
        methodWriter.bastore();
    }

    private static void gwWriteInt(MethodWriter methodWriter, int i, int i2, byte[] bArr, int i3) {
        int intUnaligned = IOUtils.getIntUnaligned(bArr, i3);
        methodWriter.aload(i);
        methodWriter.iload(i2);
        if (i3 != 0) {
            methodWriter.iconst_n(i3);
            methodWriter.iadd();
        }
        methodWriter.visitLdcInsn(intUnaligned);
        methodWriter.invokestatic(ASMUtils.TYPE_IO_UTILS, "putIntUnaligned", "([BII)V");
    }

    private static void gwWriteLong(MethodWriter methodWriter, int i, int i2, byte[] bArr, int i3) {
        long longUnaligned = IOUtils.getLongUnaligned(bArr, i3);
        methodWriter.aload(i);
        methodWriter.iload(i2);
        if (i3 != 0) {
            methodWriter.iconst_n(i3);
            methodWriter.iadd();
        }
        methodWriter.visitLdcInsn(longUnaligned);
        methodWriter.invokestatic(ASMUtils.TYPE_IO_UTILS, "putLongUnaligned", "([BIJ)V");
    }

    private static void gwWriteShort(MethodWriter methodWriter, int i, int i2, byte[] bArr, int i3) {
        short shortUnaligned = IOUtils.getShortUnaligned(bArr, i3);
        methodWriter.aload(i);
        methodWriter.iload(i2);
        if (i3 != 0) {
            methodWriter.iconst_n(i3);
            methodWriter.iadd();
        }
        methodWriter.visitLdcInsn((int) shortUnaligned);
        methodWriter.invokestatic(ASMUtils.TYPE_IO_UTILS, "putShortUnaligned", "([BIS)V");
    }

    private static void hashFilter(MethodWriter methodWriter, List<FieldWriter> list, Label label) {
        boolean z;
        Iterator<FieldWriter> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            FieldWriter next = it.next();
            if (next.method != null && (next.features & FieldInfo.FIELD_MASK) == 0) {
                z = true;
                break;
            }
        }
        methodWriter.aload(0);
        methodWriter.aload(1);
        methodWriter.invokevirtual(ASMUtils.TYPE_OBJECT_WRITER_ADAPTER, z ? "hasFilter" : "hasFilter0", METHOD_DESC_HAS_FILTER);
        methodWriter.ifeq(label);
    }

    private static boolean isFieldVarIndex(MethodWriterContext methodWriterContext, FieldWriter fieldWriter) {
        Class cls = fieldWriter.fieldClass;
        if (cls == String.class || Collection.class.isAssignableFrom(cls) || cls == String[].class || (fieldWriter instanceof FieldWriterEnum)) {
            return true;
        }
        return Collection.class.isAssignableFrom(cls) && !methodWriterContext.disableReferenceDetect();
    }

    private static void isWriteTypeInfo(long j, MethodWriter methodWriter, int i, int i2, int i3, Label label) {
        if ((JSONWriter.Feature.WriteClassName.mask & j) == 0 || (j & JSONWriter.Feature.NotWriteRootClassName.mask) != 0) {
            methodWriter.aload(i);
            methodWriter.ifnull(label);
            methodWriter.aload(i);
            methodWriter.invokevirtual(ASMUtils.TYPE_OBJECT, "getClass", "()Ljava/lang/Class;");
            methodWriter.aload(i2);
            methodWriter.if_acmpeq(label);
            methodWriter.aload(1);
            methodWriter.aload(i);
            methodWriter.aload(i2);
            methodWriter.lload(i3);
            methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "isWriteTypeInfo", "(Ljava/lang/Object;Ljava/lang/reflect/Type;J)Z");
            methodWriter.ifeq(label);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0428 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:157:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4 A[LOOP:1: B:74:0x00ce->B:76:0x00d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0118  */
    /* JADX WARN: Code duplicated, block: B:81:0x0148  */
    /* JADX WARN: Code duplicated, block: B:83:0x014e  */
    /* JADX WARN: Code duplicated, block: B:86:0x015e  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:93:0x022e  */
    /* JADX WARN: Code duplicated, block: B:95:0x024a  */
    /* JADX WARN: Code duplicated, block: B:99:0x033e A[LOOP:3: B:97:0x0338->B:99:0x033e, LOOP_END] */
    private FieldWriter jitFieldWriterList(ObjectWriterProvider objectWriterProvider, String str, int i, long j, String str2, Locale locale, String str3, Field field, Class<?> cls, Type type, Type type2, Class<?> cls2) {
        List<FieldWriter> list;
        boolean z;
        Iterator<FieldWriter> it;
        int iFieldCapacity;
        String str4;
        Package r9;
        String str5;
        String str6;
        int i2;
        MethodWriter methodWriterVisitMethod;
        MethodWriterContext methodWriterContext;
        ClassWriter classWriter;
        int iVar;
        int iVar2;
        int iVar3;
        int iVar4;
        Label label;
        Label label2;
        int iVar5;
        int iVar6;
        char c;
        int i3;
        int length;
        char[] cArr;
        char c2;
        int i4;
        char c3;
        Class cls3;
        Class<?> cls4 = TypeUtils.getClass(type);
        if (cls4 != null && field != null && field.getDeclaringClass() != cls4) {
            ObjectWriter objectWriterFromCache = objectWriterProvider.getObjectWriterFromCache(type, cls4, JSONWriter.Feature.FieldBased.isEnabled(j));
            if (objectWriterFromCache == null) {
                objectWriterFromCache = super.createObjectWriter(cls4, j, objectWriterProvider);
            }
            List<FieldWriter> fieldWriters = objectWriterFromCache.getFieldWriters();
            List<FieldWriterGroup> listBuildGroups = buildGroups(objectWriterFromCache.getFeatures(), fieldWriters);
            z = listBuildGroups.size() == 1 && listBuildGroups.get(0).direct;
            Iterator<FieldWriter> it2 = fieldWriters.iterator();
            while (true) {
                if (it2.hasNext()) {
                    FieldWriter next = it2.next();
                    if ((next.method == null && next.field == null && next.getFunction() == null) || ((cls3 = next.fieldClass) != Boolean.TYPE && cls3 != Boolean.class && cls3 != Byte.TYPE && cls3 != Byte.class && cls3 != Short.TYPE && cls3 != Short.class && cls3 != Integer.TYPE && cls3 != Integer.class && cls3 != Long.TYPE && cls3 != Long.class && cls3 != Float.TYPE && cls3 != Float.class && cls3 != Double.TYPE && cls3 != Double.class && cls3 != LocalDate.class && cls3 != LocalTime.class && cls3 != LocalDateTime.class && cls3 != OffsetDateTime.class && cls3 != OffsetTime.class && cls3 != Instant.class && cls3 != UUID.class)) {
                        list = fieldWriters;
                    }
                } else {
                    list = fieldWriters;
                }
                if (z) {
                    return null;
                }
                it = list.iterator();
                iFieldCapacity = 6;
                while (it.hasNext()) {
                    iFieldCapacity = fieldCapacity(it.next().fieldClass);
                }
                ClassWriter classWriter2 = new ClassWriter(null);
                str4 = "OWF_" + seed.incrementAndGet() + "_" + list.size() + "_" + cls4.getSimpleName();
                r9 = ObjectWriterCreatorASM.class.getPackage();
                if (r9 != null) {
                    String name = r9.getName();
                    length = name.length();
                    int i5 = length + 1;
                    cArr = new char[str4.length() + i5];
                    name.getChars(0, name.length(), cArr, 0);
                    cArr[length] = '.';
                    str4.getChars(0, str4.length(), cArr, i5);
                    String str7 = new String(cArr);
                    c2 = '/';
                    cArr[length] = '/';
                    i4 = 0;
                    while (i4 < length) {
                        c3 = c2;
                        if (cArr[i4] == '.') {
                            cArr[i4] = c3;
                        }
                        i4++;
                        c2 = c3;
                    }
                    str6 = new String(cArr);
                    str5 = str7;
                } else {
                    str5 = str4;
                    str6 = str5;
                }
                String strType = ASMUtils.type(FieldWriterList.class);
                classWriter2.visit(52, 49, str6, strType, INTERFACES);
                MethodWriter methodWriterVisitMethod2 = classWriter2.visitMethod(1, "<init>", "(Ljava/lang/String;Ljava/lang/reflect/Type;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/util/function/Function;Ljava/lang/Class;)V", 64);
                methodWriterVisitMethod2.aload(0);
                methodWriterVisitMethod2.aload(1);
                methodWriterVisitMethod2.aload(2);
                methodWriterVisitMethod2.iload(3);
                methodWriterVisitMethod2.lload(4);
                methodWriterVisitMethod2.aload(6);
                methodWriterVisitMethod2.aload(7);
                methodWriterVisitMethod2.aload(8);
                methodWriterVisitMethod2.aload(9);
                methodWriterVisitMethod2.aload(10);
                methodWriterVisitMethod2.aload(11);
                methodWriterVisitMethod2.aload(12);
                methodWriterVisitMethod2.aload(13);
                methodWriterVisitMethod2.aload(14);
                methodWriterVisitMethod2.invokespecial(strType, "<init>", "(Ljava/lang/String;Ljava/lang/reflect/Type;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/util/function/Function;Ljava/lang/Class;)V");
                methodWriterVisitMethod2.return_();
                methodWriterVisitMethod2.visitMaxs(14, 14);
                String str8 = METHOD_DESC_WRITE_LIST_VALUE_JSONB;
                if (list.size() < 6) {
                    i2 = 512;
                } else {
                    i2 = 1024;
                }
                methodWriterVisitMethod = classWriter2.visitMethod(1, "writeListValueJSONB", str8, i2);
                classWriter = classWriter2;
                methodWriterContext = new MethodWriterContext(objectWriterProvider, cls4, j, str6, methodWriterVisitMethod, 8, false);
                iVar = methodWriterContext.var("offset");
                iVar2 = methodWriterContext.var("bytes");
                iVar3 = methodWriterContext.var2(CONTEXT_FEATURES);
                iVar4 = methodWriterContext.var("symbolTable");
                methodWriterVisitMethod.aload(1);
                String str9 = ASMUtils.TYPE_JSON_WRITER;
                methodWriterVisitMethod.invokevirtual(str9, "getOffset", "()I");
                methodWriterVisitMethod.istore(iVar);
                methodWriterVisitMethod.aload(1);
                methodWriterVisitMethod.invokevirtual(str9, "getFeatures", "()J");
                methodWriterVisitMethod.lstore(iVar3);
                label = new Label();
                if (!objectWriterProvider.isDisableReferenceDetect()) {
                    methodWriterVisitMethod.lload(iVar3);
                    methodWriterVisitMethod.visitLdcInsn(JSONWriter.Feature.ReferenceDetection.mask);
                    methodWriterVisitMethod.land();
                    methodWriterVisitMethod.lconst_0();
                    methodWriterVisitMethod.lcmp();
                    methodWriterVisitMethod.ifne(label);
                }
                methodWriterVisitMethod.aload(1);
                methodWriterVisitMethod.getfield(str9, "symbolTable", DESC_SYMBOL);
                methodWriterVisitMethod.astore(iVar4);
                int iVar7 = methodWriterContext.var("size");
                methodWriterVisitMethod.aload(2);
                methodWriterVisitMethod.invokeinterface("java/util/List", "size", "()I");
                methodWriterVisitMethod.istore(iVar7);
                methodWriterVisitMethod.aload(1);
                methodWriterVisitMethod.iload(iVar);
                methodWriterVisitMethod.iconst_5();
                methodWriterVisitMethod.iadd();
                methodWriterVisitMethod.visitLdcInsn(iFieldCapacity);
                methodWriterVisitMethod.iload(iVar7);
                methodWriterVisitMethod.imul();
                methodWriterVisitMethod.iadd();
                methodWriterVisitMethod.invokevirtual(str9, "ensureCapacity", "(I)Ljava/lang/Object;");
                methodWriterVisitMethod.checkcast("[B");
                methodWriterVisitMethod.astore(iVar2);
                methodWriterVisitMethod.aload(iVar2);
                methodWriterVisitMethod.iload(iVar);
                methodWriterVisitMethod.iload(iVar7);
                String str10 = ASMUtils.TYPE_JSONB_IO;
                methodWriterVisitMethod.invokestatic(str10, "startArray", "([BII)I", true);
                methodWriterVisitMethod.istore(iVar);
                Label label3 = new Label();
                Label label4 = new Label();
                String str11 = str5;
                label2 = new Label();
                iVar5 = methodWriterContext.var("I");
                methodWriterVisitMethod.iconst_0();
                methodWriterVisitMethod.istore(iVar5);
                methodWriterVisitMethod.visitLabel(label3);
                methodWriterVisitMethod.iload(iVar5);
                methodWriterVisitMethod.iload(iVar7);
                methodWriterVisitMethod.if_icmpge(label2);
                methodWriterVisitMethod.aload(iVar2);
                methodWriterVisitMethod.iload(iVar);
                methodWriterVisitMethod.visitLdcInsn(list.size());
                methodWriterVisitMethod.invokestatic(str10, "startArray", "([BII)I", true);
                methodWriterVisitMethod.istore(iVar);
                iVar6 = methodWriterContext.var("ITEM");
                c = 2;
                methodWriterVisitMethod.aload(2);
                methodWriterVisitMethod.iload(iVar5);
                methodWriterVisitMethod.invokeinterface("java/util/List", "get", "(I)Ljava/lang/Object;");
                methodWriterVisitMethod.astore(iVar6);
                methodWriterVisitMethod.aload(iVar6);
                methodWriterVisitMethod.ifnonnull(label4);
                methodWriterVisitMethod.aload(iVar2);
                methodWriterVisitMethod.iload(iVar);
                methodWriterVisitMethod.bipush(-81);
                methodWriterVisitMethod.bastore();
                methodWriterVisitMethod.visitIincInsn(iVar, 1);
                methodWriterVisitMethod.goto_(label3);
                methodWriterVisitMethod.visitLabel(label4);
                methodWriterVisitMethod.aload(iVar6);
                methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_OBJECT, "getClass", "()Ljava/lang/Class;");
                methodWriterVisitMethod.aload(0);
                methodWriterVisitMethod.getfield(ASMUtils.TYPE_FIELD_WRITER, "fieldClass", "Ljava/lang/Class;");
                methodWriterVisitMethod.if_acmpeq(label);
                i3 = 0;
                while (i3 < list.size()) {
                    Label label5 = label2;
                    MethodWriterContext methodWriterContext2 = methodWriterContext;
                    int i6 = iVar5;
                    int i7 = iVar6;
                    writeFieldValueDirectJSONB(j, str6, methodWriterContext2, list.get(i3), i3, methodWriterVisitMethod, iVar2, iVar, i7, iVar3, iVar4, false);
                    methodWriterContext = methodWriterContext2;
                    i3++;
                    iVar6 = i7;
                    list = list;
                    classWriter = classWriter;
                    label = label;
                    c = 2;
                    iVar5 = i6;
                    label2 = label5;
                }
                methodWriterVisitMethod.visitIincInsn(iVar5, 1);
                methodWriterVisitMethod.goto_(label3);
                methodWriterVisitMethod.visitLabel(label2);
                methodWriterVisitMethod.aload(1);
                methodWriterVisitMethod.iload(iVar);
                methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "setOffset", "(I)V");
                methodWriterVisitMethod.return_();
                methodWriterVisitMethod.visitLabel(label);
                methodWriterVisitMethod.aload(0);
                methodWriterVisitMethod.aload(1);
                methodWriterVisitMethod.aload(2);
                methodWriterVisitMethod.invokespecial(ASMUtils.type(FieldWriterList.class), "writeListValueJSONB", METHOD_DESC_WRITE_LIST_VALUE_JSONB);
                methodWriterVisitMethod.return_();
                int i8 = methodWriterContext.maxVariant;
                methodWriterVisitMethod.visitMaxs(i8 + 1, i8 + 1);
                byte[] byteArray = classWriter.toByteArray();
                try {
                    return (FieldWriterList) this.classLoader.defineClassPublic(str11, byteArray, 0, byteArray.length).getConstructor(String.class, Type.class, Integer.TYPE, Long.TYPE, String.class, Locale.class, String.class, Type.class, Class.class, Field.class, Method.class, Function.class, Class.class).newInstance(str, type, Integer.valueOf(i), Long.valueOf(j), str2, locale, str3, type2, cls2, field, null, null, cls);
                } catch (Throwable th) {
                    throw new JSONException(AbstractC1194.m2782(cls4, "create objectWriter error, objectType "), th);
                }
            }
        }
        list = null;
        z = false;
        if (z) {
            return null;
        }
        it = list.iterator();
        iFieldCapacity = 6;
        while (it.hasNext()) {
            iFieldCapacity = fieldCapacity(it.next().fieldClass);
        }
        ClassWriter classWriter3 = new ClassWriter(null);
        str4 = "OWF_" + seed.incrementAndGet() + "_" + list.size() + "_" + cls4.getSimpleName();
        r9 = ObjectWriterCreatorASM.class.getPackage();
        if (r9 != null) {
            String name2 = r9.getName();
            length = name2.length();
            int i9 = length + 1;
            cArr = new char[str4.length() + i9];
            name2.getChars(0, name2.length(), cArr, 0);
            cArr[length] = '.';
            str4.getChars(0, str4.length(), cArr, i9);
            String str12 = new String(cArr);
            c2 = '/';
            cArr[length] = '/';
            i4 = 0;
            while (i4 < length) {
                c3 = c2;
                if (cArr[i4] == '.') {
                    cArr[i4] = c3;
                }
                i4++;
                c2 = c3;
            }
            str6 = new String(cArr);
            str5 = str12;
        } else {
            str5 = str4;
            str6 = str5;
        }
        String strType2 = ASMUtils.type(FieldWriterList.class);
        classWriter3.visit(52, 49, str6, strType2, INTERFACES);
        MethodWriter methodWriterVisitMethod3 = classWriter3.visitMethod(1, "<init>", "(Ljava/lang/String;Ljava/lang/reflect/Type;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/util/function/Function;Ljava/lang/Class;)V", 64);
        methodWriterVisitMethod3.aload(0);
        methodWriterVisitMethod3.aload(1);
        methodWriterVisitMethod3.aload(2);
        methodWriterVisitMethod3.iload(3);
        methodWriterVisitMethod3.lload(4);
        methodWriterVisitMethod3.aload(6);
        methodWriterVisitMethod3.aload(7);
        methodWriterVisitMethod3.aload(8);
        methodWriterVisitMethod3.aload(9);
        methodWriterVisitMethod3.aload(10);
        methodWriterVisitMethod3.aload(11);
        methodWriterVisitMethod3.aload(12);
        methodWriterVisitMethod3.aload(13);
        methodWriterVisitMethod3.aload(14);
        methodWriterVisitMethod3.invokespecial(strType2, "<init>", "(Ljava/lang/String;Ljava/lang/reflect/Type;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/util/function/Function;Ljava/lang/Class;)V");
        methodWriterVisitMethod3.return_();
        methodWriterVisitMethod3.visitMaxs(14, 14);
        String str13 = METHOD_DESC_WRITE_LIST_VALUE_JSONB;
        if (list.size() < 6) {
            i2 = 512;
        } else {
            i2 = 1024;
        }
        methodWriterVisitMethod = classWriter3.visitMethod(1, "writeListValueJSONB", str13, i2);
        classWriter = classWriter3;
        methodWriterContext = new MethodWriterContext(objectWriterProvider, cls4, j, str6, methodWriterVisitMethod, 8, false);
        iVar = methodWriterContext.var("offset");
        iVar2 = methodWriterContext.var("bytes");
        iVar3 = methodWriterContext.var2(CONTEXT_FEATURES);
        iVar4 = methodWriterContext.var("symbolTable");
        methodWriterVisitMethod.aload(1);
        String str14 = ASMUtils.TYPE_JSON_WRITER;
        methodWriterVisitMethod.invokevirtual(str14, "getOffset", "()I");
        methodWriterVisitMethod.istore(iVar);
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.invokevirtual(str14, "getFeatures", "()J");
        methodWriterVisitMethod.lstore(iVar3);
        label = new Label();
        if (!objectWriterProvider.isDisableReferenceDetect()) {
            methodWriterVisitMethod.lload(iVar3);
            methodWriterVisitMethod.visitLdcInsn(JSONWriter.Feature.ReferenceDetection.mask);
            methodWriterVisitMethod.land();
            methodWriterVisitMethod.lconst_0();
            methodWriterVisitMethod.lcmp();
            methodWriterVisitMethod.ifne(label);
        }
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.getfield(str14, "symbolTable", DESC_SYMBOL);
        methodWriterVisitMethod.astore(iVar4);
        int iVar8 = methodWriterContext.var("size");
        methodWriterVisitMethod.aload(2);
        methodWriterVisitMethod.invokeinterface("java/util/List", "size", "()I");
        methodWriterVisitMethod.istore(iVar8);
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.iload(iVar);
        methodWriterVisitMethod.iconst_5();
        methodWriterVisitMethod.iadd();
        methodWriterVisitMethod.visitLdcInsn(iFieldCapacity);
        methodWriterVisitMethod.iload(iVar8);
        methodWriterVisitMethod.imul();
        methodWriterVisitMethod.iadd();
        methodWriterVisitMethod.invokevirtual(str14, "ensureCapacity", "(I)Ljava/lang/Object;");
        methodWriterVisitMethod.checkcast("[B");
        methodWriterVisitMethod.astore(iVar2);
        methodWriterVisitMethod.aload(iVar2);
        methodWriterVisitMethod.iload(iVar);
        methodWriterVisitMethod.iload(iVar8);
        String str15 = ASMUtils.TYPE_JSONB_IO;
        methodWriterVisitMethod.invokestatic(str15, "startArray", "([BII)I", true);
        methodWriterVisitMethod.istore(iVar);
        Label label6 = new Label();
        Label label7 = new Label();
        String str16 = str5;
        label2 = new Label();
        iVar5 = methodWriterContext.var("I");
        methodWriterVisitMethod.iconst_0();
        methodWriterVisitMethod.istore(iVar5);
        methodWriterVisitMethod.visitLabel(label6);
        methodWriterVisitMethod.iload(iVar5);
        methodWriterVisitMethod.iload(iVar8);
        methodWriterVisitMethod.if_icmpge(label2);
        methodWriterVisitMethod.aload(iVar2);
        methodWriterVisitMethod.iload(iVar);
        methodWriterVisitMethod.visitLdcInsn(list.size());
        methodWriterVisitMethod.invokestatic(str15, "startArray", "([BII)I", true);
        methodWriterVisitMethod.istore(iVar);
        iVar6 = methodWriterContext.var("ITEM");
        c = 2;
        methodWriterVisitMethod.aload(2);
        methodWriterVisitMethod.iload(iVar5);
        methodWriterVisitMethod.invokeinterface("java/util/List", "get", "(I)Ljava/lang/Object;");
        methodWriterVisitMethod.astore(iVar6);
        methodWriterVisitMethod.aload(iVar6);
        methodWriterVisitMethod.ifnonnull(label7);
        methodWriterVisitMethod.aload(iVar2);
        methodWriterVisitMethod.iload(iVar);
        methodWriterVisitMethod.bipush(-81);
        methodWriterVisitMethod.bastore();
        methodWriterVisitMethod.visitIincInsn(iVar, 1);
        methodWriterVisitMethod.goto_(label6);
        methodWriterVisitMethod.visitLabel(label7);
        methodWriterVisitMethod.aload(iVar6);
        methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_OBJECT, "getClass", "()Ljava/lang/Class;");
        methodWriterVisitMethod.aload(0);
        methodWriterVisitMethod.getfield(ASMUtils.TYPE_FIELD_WRITER, "fieldClass", "Ljava/lang/Class;");
        methodWriterVisitMethod.if_acmpeq(label);
        i3 = 0;
        while (i3 < list.size()) {
            Label label8 = label2;
            MethodWriterContext methodWriterContext3 = methodWriterContext;
            int i10 = iVar5;
            int i11 = iVar6;
            writeFieldValueDirectJSONB(j, str6, methodWriterContext3, list.get(i3), i3, methodWriterVisitMethod, iVar2, iVar, i11, iVar3, iVar4, false);
            methodWriterContext = methodWriterContext3;
            i3++;
            iVar6 = i11;
            list = list;
            classWriter = classWriter;
            label = label;
            c = 2;
            iVar5 = i10;
            label2 = label8;
        }
        methodWriterVisitMethod.visitIincInsn(iVar5, 1);
        methodWriterVisitMethod.goto_(label6);
        methodWriterVisitMethod.visitLabel(label2);
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.iload(iVar);
        methodWriterVisitMethod.invokevirtual(ASMUtils.TYPE_JSON_WRITER, "setOffset", "(I)V");
        methodWriterVisitMethod.return_();
        methodWriterVisitMethod.visitLabel(label);
        methodWriterVisitMethod.aload(0);
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.aload(2);
        methodWriterVisitMethod.invokespecial(ASMUtils.type(FieldWriterList.class), "writeListValueJSONB", METHOD_DESC_WRITE_LIST_VALUE_JSONB);
        methodWriterVisitMethod.return_();
        int i12 = methodWriterContext.maxVariant;
        methodWriterVisitMethod.visitMaxs(i12 + 1, i12 + 1);
        byte[] byteArray2 = classWriter.toByteArray();
        return (FieldWriterList) this.classLoader.defineClassPublic(str16, byteArray2, 0, byteArray2.length).getConstructor(String.class, Type.class, Integer.TYPE, Long.TYPE, String.class, Locale.class, String.class, Type.class, Class.class, Field.class, Method.class, Function.class, Class.class).newInstance(str, type, Integer.valueOf(i), Long.valueOf(j), str2, locale, str3, type2, cls2, field, null, null, cls);
    }

    private ObjectWriterAdapter jitWriter(Class cls, ObjectWriterProvider objectWriterProvider, BeanInfo beanInfo, List<FieldWriter> list, long j) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        ObjectWriterCreatorASM objectWriterCreatorASM;
        Class cls2;
        List<FieldWriter> list2;
        List<FieldWriterGroup> listBuildGroups = buildGroups(beanInfo.writerFeatures, list);
        ClassWriter classWriter = new ClassWriter(null);
        StringBuilder sb = new StringBuilder("OWG_");
        sb.append(seed.incrementAndGet());
        sb.append("_");
        sb.append(list.size());
        sb.append(cls == null ? "" : "_".concat(cls.getSimpleName()));
        String string = sb.toString();
        Package r3 = ObjectWriterCreatorASM.class.getPackage();
        if (r3 != null) {
            String name = r3.getName();
            int length = name.length();
            int i2 = length + 1;
            char[] cArr = new char[string.length() + i2];
            name.getChars(0, name.length(), cArr, 0);
            cArr[length] = '.';
            string.getChars(0, string.length(), cArr, i2);
            String str5 = new String(cArr);
            cArr[length] = '/';
            for (int i3 = 0; i3 < length; i3++) {
                if (cArr[i3] == '.') {
                    cArr[i3] = '/';
                }
            }
            str2 = str5;
            str = new String(cArr);
        } else {
            str = string;
            str2 = str;
        }
        switch (list.size()) {
            case 1:
                str3 = ASMUtils.TYPE_OBJECT_WRITER_1;
                break;
            case 2:
                str3 = ASMUtils.TYPE_OBJECT_WRITER_2;
                break;
            case 3:
                str3 = ASMUtils.TYPE_OBJECT_WRITER_3;
                break;
            case 4:
                str3 = ASMUtils.TYPE_OBJECT_WRITER_4;
                break;
            case 5:
                str3 = ASMUtils.TYPE_OBJECT_WRITER_5;
                break;
            case 6:
                str3 = ASMUtils.TYPE_OBJECT_WRITER_6;
                break;
            case 7:
                str3 = ASMUtils.TYPE_OBJECT_WRITER_7;
                break;
            case 8:
                str3 = ASMUtils.TYPE_OBJECT_WRITER_8;
                break;
            case 9:
                str3 = ASMUtils.TYPE_OBJECT_WRITER_9;
                break;
            case 10:
                str3 = ASMUtils.TYPE_OBJECT_WRITER_10;
                break;
            case 11:
                str3 = ASMUtils.TYPE_OBJECT_WRITER_11;
                break;
            case Opcodes.FCONST_1 /* 12 */:
                str3 = ASMUtils.TYPE_OBJECT_WRITER_12;
                break;
            default:
                str3 = ASMUtils.TYPE_OBJECT_WRITER_ADAPTER;
                break;
        }
        String str6 = str3;
        classWriter.visit(52, 49, str, str6, INTERFACES);
        genFields(list, classWriter, str6);
        genMethodInit(list, classWriter, str, str6);
        boolean z = (j & FieldInfo.DISABLE_JSONB) != 0;
        boolean z2 = (j & FieldInfo.DISABLE_ARRAY_MAPPING) != 0;
        if (!z) {
            String str7 = str;
            genMethodWriteJSONB(objectWriterProvider, cls, listBuildGroups, list, classWriter, str7, j);
            classWriter = classWriter;
            str = str7;
        }
        if ((j & JSONWriter.Feature.BeanToArray.mask) == 0 || z) {
            ClassWriter classWriter2 = classWriter;
            String str8 = str;
            genMethodWrite(objectWriterProvider, cls, list, classWriter2, str8, j);
            classWriter = classWriter2;
            str = str8;
        } else {
            genMethodWriteArrayMapping(objectWriterProvider, "write", cls, j, list, classWriter, str);
        }
        if (z) {
            i = 0;
            str4 = str2;
        } else {
            i = 0;
            str4 = str2;
            genMethodWriteArrayMappingJSONB(objectWriterProvider, cls, j, listBuildGroups, list, classWriter, str, j);
        }
        if (z2) {
            objectWriterCreatorASM = this;
            cls2 = cls;
            list2 = list;
        } else {
            objectWriterCreatorASM = this;
            list2 = list;
            objectWriterCreatorASM.genMethodWriteArrayMapping(objectWriterProvider, "writeArrayMapping", cls, j, list2, classWriter, str);
            cls2 = cls;
        }
        byte[] byteArray = classWriter.toByteArray();
        try {
            ObjectWriterAdapter objectWriterAdapter = (ObjectWriterAdapter) objectWriterCreatorASM.classLoader.defineClassPublic(str4, byteArray, i, byteArray.length).getConstructor(Class.class, String.class, String.class, Long.TYPE, List.class).newInstance(cls2, beanInfo.typeKey, beanInfo.typeName, Long.valueOf(j), list2);
            if (beanInfo.serializeFilters == null) {
                return objectWriterAdapter;
            }
            ObjectWriterCreator.configSerializeFilters(beanInfo, objectWriterAdapter);
            return objectWriterAdapter;
        } catch (Throwable th) {
            throw new JSONException(AbstractC1194.m2782(cls2, "create objectWriter error, objectType "), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createObjectWriter$0(FieldInfo fieldInfo, Class cls, long j, ObjectWriterProvider objectWriterProvider, BeanInfo beanInfo, Map map, Field field) {
        fieldInfo.init();
        boolean z = (field.getModifiers() & 1) == 0;
        fieldInfo.isPrivate = z;
        fieldInfo.ignore = z;
        FieldWriter fieldWriterCreateFieldWriter = createFieldWriter(cls, j, objectWriterProvider, beanInfo, fieldInfo, field);
        if (fieldWriterCreateFieldWriter != null) {
            if (fieldInfo.writeUsing != null && (fieldWriterCreateFieldWriter instanceof FieldWriterObject)) {
                ((FieldWriterObject) fieldWriterCreateFieldWriter).writeUsing = true;
            }
            FieldWriter fieldWriter = (FieldWriter) map.putIfAbsent(fieldWriterCreateFieldWriter.fieldName, fieldWriterCreateFieldWriter);
            if (fieldWriter == null || fieldWriter.compareTo(fieldWriterCreateFieldWriter) <= 0) {
                return;
            }
            map.put(fieldWriterCreateFieldWriter.fieldName, fieldWriterCreateFieldWriter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x010c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0126  */
    /* JADX WARN: Code duplicated, block: B:77:0x014a  */
    /* JADX WARN: Code duplicated, block: B:82:0x016e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0172  */
    /* JADX WARN: Code duplicated, block: B:87:0x018d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.alibaba.fastjson2.writer.ObjectWriterCreator] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.alibaba.fastjson2.writer.ObjectWriterCreator] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.alibaba.fastjson2.writer.ObjectWriterCreator] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
    public /* synthetic */ void lambda$createObjectWriter$1(FieldInfo fieldInfo, long j, BeanInfo beanInfo, ObjectWriterProvider objectWriterProvider, Class cls, boolean z, Map map, Method method) {
        ObjectWriter objectWriter;
        boolean z2;
        FieldWriter fieldWriter;
        ?? r1;
        FieldWriter fieldWriterCreateFieldWriterLambda;
        ?? r14;
        ?? r2;
        Method method2;
        FieldWriter fieldWriter2;
        char cCharAt;
        Object obj;
        FieldWriter fieldWriter3;
        boolean z3;
        ?? r3;
        String[] strArr;
        fieldInfo.init();
        fieldInfo.features |= j;
        fieldInfo.format = beanInfo.format;
        objectWriterProvider.getFieldInfo(beanInfo, fieldInfo, cls, method);
        if (fieldInfo.ignore) {
            return;
        }
        ?? fieldName = ObjectWriterCreator.getFieldName(cls, objectWriterProvider, beanInfo, z, fieldInfo, method);
        if (beanInfo.orders != null) {
            int i = 0;
            boolean z4 = false;
            while (true) {
                strArr = beanInfo.orders;
                if (i >= strArr.length) {
                    break;
                }
                if (fieldName.equals(strArr[i])) {
                    fieldInfo.ordinal = i;
                    z4 = true;
                }
                i++;
            }
            if (!z4 && fieldInfo.ordinal == 0) {
                fieldInfo.ordinal = strArr.length;
            }
        }
        ?? r0 = beanInfo.includes;
        if (r0 != 0 && r0.length > 0) {
            for (?? r4 : r0) {
                if (!r4.equals(fieldName)) {
                }
            }
            return;
        }
        if ((beanInfo.writerFeatures & JSONWriter.Feature.WriteClassName.mask) == 0 || !fieldName.equals(beanInfo.typeKey)) {
            Class<?> returnType = method.getReturnType();
            if (TypeUtils.isFunction(returnType) || returnType == Void.TYPE) {
                return;
            }
            method.setAccessible(true);
            Class<?> cls2 = fieldInfo.writeUsing;
            if (cls2 != null) {
                try {
                    Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    objectWriter = (ObjectWriter) declaredConstructor.newInstance(null);
                } catch (Exception e) {
                    throw new JSONException("create writeUsing Writer error, method " + method.getName() + ", serializer " + fieldInfo.writeUsing.getName(), e);
                }
            } else {
                objectWriter = null;
            }
            if (objectWriter == null && fieldInfo.fieldClassMixIn) {
                objectWriter = ObjectWriterBaseModule.VoidObjectWriter.INSTANCE;
            }
            ObjectWriter objectWriter2 = objectWriter;
            long j2 = fieldInfo.features;
            if ((j2 & FieldInfo.JIT) != 0) {
                try {
                    z2 = true;
                    fieldWriter = null;
                    r1 = this;
                    try {
                        fieldWriterCreateFieldWriterLambda = r1.createFieldWriterLambda(objectWriterProvider, cls, fieldName, fieldInfo.ordinal, j2, fieldInfo.format, fieldInfo.label, method, objectWriter2, fieldInfo.contentAs);
                        r2 = r1;
                        r14 = z2;
                    } catch (Throwable th) {
                        th = th;
                        r1.jitErrorCount.incrementAndGet();
                        r1.jitErrorLast = th;
                        r3 = r1;
                        z3 = z2;
                        fieldWriterCreateFieldWriterLambda = fieldWriter;
                        r2 = r3;
                        r14 = z3;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z2 = true;
                    fieldWriter = null;
                    r1 = this;
                }
                if (fieldWriterCreateFieldWriterLambda == null) {
                    fieldWriterCreateFieldWriterLambda = r2.createFieldWriter(objectWriterProvider, cls, fieldName, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.label, method, objectWriter2, fieldInfo.contentAs);
                    method2 = method;
                } else {
                    method2 = method;
                }
                if (fieldInfo.writeUsing != null && (fieldWriterCreateFieldWriterLambda instanceof FieldWriterObject)) {
                    ((FieldWriterObject) fieldWriterCreateFieldWriterLambda).writeUsing = r14;
                }
                fieldWriter2 = (FieldWriter) map.putIfAbsent(fieldName, fieldWriterCreateFieldWriterLambda);
                if (fieldWriter2 != null && fieldWriter2.compareTo(fieldWriterCreateFieldWriterLambda) > 0) {
                    map.put(fieldName, fieldWriterCreateFieldWriterLambda);
                }
                if (fieldWriter2 == null) {
                    cCharAt = fieldName.charAt(0);
                    if (cCharAt < 'A' && cCharAt <= 'Z') {
                        obj = ((char) (cCharAt + ' ')) + fieldName.substring(r14);
                    } else if (cCharAt >= 'a' || cCharAt > 'z') {
                        obj = fieldWriter;
                    } else {
                        obj = ((char) (cCharAt - ' ')) + fieldName.substring(r14);
                    }
                    if (obj != null || (fieldWriter3 = (FieldWriter) map.get(obj)) == null) {
                    }
                    Method method3 = fieldWriter3.method;
                    if (method3 == null || method3.equals(method2)) {
                        map.remove(obj);
                        return;
                    }
                    return;
                }
            }
            z3 = true;
            fieldWriter = null;
            r3 = this;
            fieldWriterCreateFieldWriterLambda = fieldWriter;
            r2 = r3;
            r14 = z3;
            if (fieldWriterCreateFieldWriterLambda == null) {
                fieldWriterCreateFieldWriterLambda = r2.createFieldWriter(objectWriterProvider, cls, fieldName, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.label, method, objectWriter2, fieldInfo.contentAs);
                method2 = method;
            } else {
                method2 = method;
            }
            if (fieldInfo.writeUsing != null) {
                ((FieldWriterObject) fieldWriterCreateFieldWriterLambda).writeUsing = r14;
            }
            fieldWriter2 = (FieldWriter) map.putIfAbsent(fieldName, fieldWriterCreateFieldWriterLambda);
            if (fieldWriter2 != null) {
                map.put(fieldName, fieldWriterCreateFieldWriterLambda);
            }
            if (fieldWriter2 == null) {
                cCharAt = fieldName.charAt(0);
                if (cCharAt < 'A') {
                    if (cCharAt >= 'a') {
                        obj = fieldWriter;
                    } else {
                        obj = fieldWriter;
                    }
                } else if (cCharAt >= 'a') {
                    obj = fieldWriter;
                } else {
                    obj = fieldWriter;
                }
                if (obj != null) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createObjectWriter$2(FieldInfo fieldInfo, Class cls, long j, ObjectWriterProvider objectWriterProvider, BeanInfo beanInfo, Map map, Field field) {
        fieldInfo.init();
        FieldWriter fieldWriterCreateFieldWriter = createFieldWriter(cls, j, objectWriterProvider, beanInfo, fieldInfo, field);
        if (fieldWriterCreateFieldWriter != null) {
            if (fieldInfo.writeUsing != null && (fieldWriterCreateFieldWriter instanceof FieldWriterObject)) {
                ((FieldWriterObject) fieldWriterCreateFieldWriter).writeUsing = true;
            }
            map.put(fieldWriterCreateFieldWriter.fieldName, fieldWriterCreateFieldWriter);
        }
    }

    private void sotreFieldValueToLocalVar(MethodWriterContext methodWriterContext, int i, FieldWriter fieldWriter, int i2, MethodWriter methodWriter) {
        int iVar = methodWriterContext.var(AbstractC1194.m2779(i, "field_"));
        genGetObject(methodWriterContext, fieldWriter, i, i2);
        methodWriter.astore(iVar);
    }

    public static boolean supportDirectWrite(long j, FieldWriter fieldWriter) {
        long j2 = JSONWriter.Feature.WriteNonStringValueAsString.mask;
        if (j2 == (j & j2) || fieldWriter.format != null) {
            return false;
        }
        Class cls = fieldWriter.fieldClass;
        if (!Collection.class.isAssignableFrom(cls)) {
            return cls == Byte.TYPE || cls == Byte.class || cls == Short.TYPE || cls == Short.class || cls == Integer.TYPE || cls == Integer.class || cls == Long.TYPE || cls == Long.class || cls == Float.TYPE || cls == Float.class || cls == Double.TYPE || cls == Double.class || cls == Boolean.TYPE || cls == Boolean.class || cls == String.class || cls == String[].class || cls == UUID.class || cls == LocalDate.class || cls == LocalDateTime.class || cls == LocalTime.class || cls == OffsetDateTime.class || cls == OffsetTime.class || cls == Instant.class || (fieldWriter instanceof FieldWriterEnum);
        }
        Class itemClass = fieldWriter.getItemClass();
        return itemClass == String.class || itemClass == Long.class;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0393  */
    /* JADX WARN: Code duplicated, block: B:160:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:163:0x03b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    private void writeFieldValueDirectJSONB(long j, String str, MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, MethodWriter methodWriter, int i2, int i3, int i4, int i5, int i6, boolean z) {
        Integer numValueOf;
        Label label;
        int i7;
        boolean z2;
        int i8;
        boolean z3;
        Class cls;
        String str2;
        long j2;
        fieldWriter = fieldWriter;
        Class<?> cls2 = fieldWriter.fieldClass;
        boolean zIsFieldVarIndex = isFieldVarIndex(methodWriterContext, fieldWriter);
        if (!cls2.isPrimitive() || z) {
            Label label2 = new Label();
            if (zIsFieldVarIndex) {
                numValueOf = Integer.valueOf(methodWriterContext.var(AbstractC1194.m2779(i, "field_")));
            } else {
                int iVar = methodWriterContext.var(cls2);
                numValueOf = Integer.valueOf(iVar);
                genGetObject(methodWriterContext, fieldWriter, i, i4);
                methodWriter.storeLocal(cls2, iVar);
            }
            label = label2;
        } else {
            label = null;
            numValueOf = null;
        }
        String str3 = "(Ljava/lang/Object;)V";
        String str4 = "popPath0";
        Integer num = numValueOf;
        if ((Collection.class.isAssignableFrom(cls2) || cls2.isArray()) && !methodWriterContext.disableReferenceDetect()) {
            int iVar2 = methodWriterContext.var("REF_PATH");
            if (label == null) {
                label = new Label();
            }
            Label label3 = new Label();
            methodWriter.aload(num.intValue());
            methodWriter.ifnull(label3);
            methodWriterContext.genIsEnabled(JSONWriter.Feature.ReferenceDetection.mask, label3);
            methodWriter.aload(1);
            methodWriter.aload(0);
            methodWriter.getfield(str, fieldWriter(i), ASMUtils.DESC_FIELD_WRITER);
            methodWriter.aload(num.intValue());
            String str5 = ASMUtils.TYPE_JSON_WRITER;
            methodWriter.invokevirtual(str5, "setPath0", METHOD_DESC_SET_PATH2);
            methodWriter.dup();
            methodWriter.astore(iVar2);
            methodWriter.ifnull(label3);
            if (z) {
                fieldWriter = fieldWriter;
                i7 = i3;
                gwFieldNameDirectJSONB(str, fieldWriter, i, methodWriterContext, i2, i7);
            } else {
                fieldWriter = fieldWriter;
                i7 = i3;
            }
            methodWriter.aload(i2);
            methodWriter.iload(i7);
            methodWriter.aload(iVar2);
            methodWriter.aload(1);
            methodWriter.invokestatic(ASMUtils.TYPE_JSONB_IO, "writeReference", METHOD_DESC_IO_WRITE_REFERENCE, true);
            methodWriter.istore(i7);
            methodWriter.aload(1);
            methodWriter.aload(num.intValue());
            methodWriter.invokevirtual(str5, "popPath0", "(Ljava/lang/Object;)V");
            methodWriter.goto_(label);
            methodWriter.visitLabel(label3);
            z2 = true;
        } else {
            i7 = i3;
            label = label;
            z2 = false;
        }
        Class<?> cls3 = Long.TYPE;
        Class<?> cls4 = Boolean.TYPE;
        Class<?> cls5 = Integer.TYPE;
        Class<?> cls6 = Short.TYPE;
        Class<?> cls7 = Byte.TYPE;
        boolean z4 = z2;
        if (z) {
            if (fieldWriter.defaultValue == null) {
                if (cls2.isPrimitive()) {
                    int iVar3 = methodWriterContext.var(NOT_WRITE_DEFAULT_VALUE);
                    Label label4 = new Label();
                    if (cls2 == cls7 || cls2 == cls6 || cls2 == cls5 || cls2 == cls4) {
                        methodWriter.iload(num.intValue());
                        methodWriter.ifne(label4);
                        methodWriter.iload(iVar3);
                        methodWriter.ifne(label);
                        methodWriter.visitLabel(label4);
                    } else if (cls2 == cls3) {
                        methodWriter.lload(num.intValue());
                        methodWriter.lconst_0();
                        methodWriter.lcmp();
                        methodWriter.ifne(label4);
                        methodWriter.iload(iVar3);
                        methodWriter.ifne(label);
                        methodWriter.visitLabel(label4);
                    }
                } else {
                    Label label5 = new Label();
                    methodWriter.iload(methodWriterContext.var(WRITE_NULLS));
                    methodWriter.ifne(label5);
                    methodWriter.aload(num.intValue());
                    methodWriter.ifnull(label);
                    methodWriter.visitLabel(label5);
                }
            }
            gwFieldNameDirectJSONB(str, fieldWriter, i, methodWriterContext, i2, i7);
        } else {
            cls5 = cls5;
            str3 = "(Ljava/lang/Object;)V";
            str4 = "popPath0";
            str = str;
            cls6 = cls6;
            cls7 = cls7;
            i = i;
        }
        if (Collection.class.isAssignableFrom(cls2)) {
            methodWriter.aload(i2);
            methodWriter.iload(i7);
            methodWriter.aload(num.intValue());
            methodWriter.aload(0);
            methodWriter.getfield(str, fieldWriter(i), ASMUtils.DESC_FIELD_WRITER);
            methodWriter.getfield(ASMUtils.TYPE_FIELD_WRITER, "fieldClass", "Ljava/lang/Class;");
            methodWriter.aload(1);
            methodWriter.invokestatic(ASMUtils.TYPE_JSONB_IO, "checkAndWriteTypeName", AbstractC2784.m4752(new StringBuilder("([BILjava/lang/Object;Ljava/lang/Class;"), ASMUtils.DESC_JSON_WRITER, ")I"), true);
            methodWriter.istore(i7);
        }
        boolean z5 = fieldWriter instanceof FieldWriterEnum;
        if (z5) {
            Label label6 = new Label();
            methodWriter.aload(num.intValue());
            methodWriter.ifnull(label6);
            methodWriter.aload(i6);
            methodWriter.ifnull(label6);
            methodWriter.aload(0);
            methodWriter.getfield(str, fieldWriter(i), ASMUtils.DESC_FIELD_WRITER);
            methodWriter.aload(i2);
            methodWriter.iload(i7);
            methodWriter.aload(num.intValue());
            methodWriter.aload(i6);
            i8 = i5;
            methodWriter.lload(i8);
            methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "writeEnumValueJSONB", AbstractC2784.m4752(new StringBuilder("([BILjava/lang/Enum;"), DESC_SYMBOL, "J)I"));
            methodWriter.istore(i7);
            methodWriter.goto_(label);
            methodWriter.visitLabel(label6);
        } else {
            i8 = i5;
        }
        methodWriter.aload(i2);
        methodWriter.iload(i7);
        if (num != null) {
            methodWriter.loadLocal(cls2, num.intValue());
        } else {
            genGetObject(methodWriterContext, fieldWriter, i, i4);
        }
        String str6 = "writeBoolean";
        if (cls2 != cls4) {
            if (cls2 == cls7) {
                str2 = "([BIB)I";
                str6 = "writeInt8";
            } else {
                if (cls2 == cls6) {
                    str2 = "([BIS)I";
                    z3 = z5;
                } else {
                    if (cls2 == cls5) {
                        str2 = "([BII)I";
                        z3 = z5;
                    } else {
                        z3 = z5;
                        if (cls2 == cls3) {
                            str2 = "([BIJ)I";
                        } else {
                            if (cls2 == Float.TYPE) {
                                str2 = "([BIF)I";
                            } else {
                                if (cls2 == Double.TYPE) {
                                    str2 = "([BID)I";
                                } else {
                                    if (cls2 == Boolean.class) {
                                        str2 = "([BILjava/lang/Boolean;)I";
                                    } else if (cls2 == Byte.class) {
                                        str6 = "writeInt8";
                                        str2 = "([BILjava/lang/Byte;J)I";
                                    } else if (cls2 == Short.class) {
                                        str2 = "([BILjava/lang/Short;J)I";
                                    } else if (cls2 == Integer.class) {
                                        str2 = "([BILjava/lang/Integer;J)I";
                                    } else if (cls2 == Long.class) {
                                        str2 = "([BILjava/lang/Long;J)I";
                                    } else if (cls2 == Float.class) {
                                        str2 = "([BILjava/lang/Float;J)I";
                                    } else if (cls2 == Double.class) {
                                        str2 = "([BILjava/lang/Double;J)I";
                                    } else {
                                        str6 = "writeString";
                                        if (cls2 == String.class) {
                                            str2 = "([BILjava/lang/String;)I";
                                        } else if (z3) {
                                            str6 = "writeEnum";
                                            str2 = "([BILjava/lang/Enum;J)I";
                                        } else if (cls2 == UUID.class) {
                                            str6 = "writeUUID";
                                            str2 = "([BILjava/util/UUID;)I";
                                        } else if (cls2 == LocalDate.class) {
                                            str6 = "writeLocalDate";
                                            str2 = "([BILjava/time/LocalDate;)I";
                                        } else if (cls2 == LocalTime.class) {
                                            str6 = "writeLocalTime";
                                            str2 = "([BILjava/time/LocalTime;)I";
                                        } else if (cls2 == LocalDateTime.class) {
                                            str6 = "writeLocalDateTime";
                                            str2 = "([BILjava/time/LocalDateTime;)I";
                                        } else if (cls2 == OffsetDateTime.class) {
                                            str6 = "writeOffsetDateTime";
                                            str2 = "([BILjava/time/OffsetDateTime;)I";
                                        } else if (cls2 == OffsetTime.class) {
                                            str6 = "writeOffsetTime";
                                            str2 = "([BILjava/time/OffsetTime;)I";
                                        } else if (cls2 == Instant.class) {
                                            str6 = "writeInstant";
                                            str2 = "([BILjava/time/Instant;)I";
                                        } else if (cls2 == String[].class) {
                                            str2 = "([BI[Ljava/lang/String;J)I";
                                        } else {
                                            cls = r13;
                                            if (!cls.isAssignableFrom(cls2)) {
                                                throw new JSONException("assert error ".concat(cls2.getName()));
                                            }
                                            Class itemClass = fieldWriter.getItemClass();
                                            if (itemClass != String.class) {
                                                if (itemClass != Long.class) {
                                                    throw new JSONException("assert error ".concat(cls2.getName()));
                                                }
                                                str6 = "writeInt64";
                                            }
                                            str2 = "([BILjava/util/Collection;J)I";
                                        }
                                    }
                                    cls = Collection.class;
                                }
                                cls = r13;
                                str6 = "writeDouble";
                            }
                            cls = r13;
                            str6 = "writeFloat";
                        }
                        str6 = "writeInt64";
                        cls = Collection.class;
                    }
                    str6 = "writeInt32";
                    cls = Collection.class;
                }
                str6 = "writeInt16";
                cls = Collection.class;
            }
            if (cls2 != Float.class || cls2 == Double.class || cls2 == Byte.class || cls2 == Short.class || cls2 == Integer.class || cls2 == Long.class || cls2 == String[].class || cls.isAssignableFrom(cls2) || z3) {
                methodWriter.lload(i8);
                j2 = j | fieldWriter.features;
                if (j2 != 0) {
                    methodWriter.visitLdcInsn(j2);
                    methodWriter.lor();
                }
            }
            methodWriter.invokestatic(ASMUtils.TYPE_JSONB_IO, str6, str2, true);
            methodWriter.istore(i7);
            if (label != null) {
                if (z4) {
                    methodWriter.aload(1);
                    methodWriter.aload(num.intValue());
                    methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str3);
                }
                methodWriter.visitLabel(label);
            }
        }
        str2 = "([BIZ)I";
        z3 = z5;
        cls = Collection.class;
        if (cls2 != Float.class) {
            methodWriter.lload(i8);
            j2 = j | fieldWriter.features;
            if (j2 != 0) {
                methodWriter.visitLdcInsn(j2);
                methodWriter.lor();
            }
        } else {
            methodWriter.lload(i8);
            j2 = j | fieldWriter.features;
            if (j2 != 0) {
                methodWriter.visitLdcInsn(j2);
                methodWriter.lor();
            }
        }
        methodWriter.invokestatic(ASMUtils.TYPE_JSONB_IO, str6, str2, true);
        methodWriter.istore(i7);
        if (label != null) {
            if (z4) {
                methodWriter.aload(1);
                methodWriter.aload(num.intValue());
                methodWriter.invokevirtual(ASMUtils.TYPE_JSON_WRITER, str4, str3);
            }
            methodWriter.visitLabel(label);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9481. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.alibaba.fastjson2.writer.ObjectWriterCreator
    public <T> com.alibaba.fastjson2.writer.FieldWriter<T> createFieldWriter(com.alibaba.fastjson2.writer.ObjectWriterProvider r18, java.lang.String r19, int r20, long r21, java.lang.String r23, java.util.Locale r24, java.lang.String r25, java.lang.reflect.Field r26, com.alibaba.fastjson2.writer.ObjectWriter r27, java.lang.Class<?> r28) {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.ObjectWriterCreatorASM.createFieldWriter(com.alibaba.fastjson2.writer.ObjectWriterProvider, java.lang.String, int, long, java.lang.String, java.util.Locale, java.lang.String, java.lang.reflect.Field, com.alibaba.fastjson2.writer.ObjectWriter, java.lang.Class):com.alibaba.fastjson2.writer.FieldWriter");
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterCreator
    public ObjectWriter createObjectWriter(List<FieldWriter> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFunction() == null) {
                return super.createObjectWriter(list);
            }
        }
        ObjectWriterProvider defaultObjectWriterProvider = JSONFactory.getDefaultObjectWriterProvider();
        return jitWriter(null, defaultObjectWriterProvider, defaultObjectWriterProvider.createBeanInfo(), list, 0L);
    }

    public void genGetObject(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2) {
        String str;
        String str2;
        MethodWriter methodWriter = methodWriterContext.mw;
        Class<?> cls = methodWriterContext.objectClass;
        String strType = cls == null ? ASMUtils.TYPE_OBJECT : ASMUtils.type(cls);
        Class cls2 = fieldWriter.fieldClass;
        Member member = fieldWriter.method;
        if (member == null) {
            member = fieldWriter.field;
        }
        Function function = fieldWriter.getFunction();
        if (member == null && function != null) {
            methodWriter.aload(0);
            methodWriter.getfield(methodWriterContext.classNameType, fieldWriter(i), ASMUtils.DESC_FIELD_WRITER);
            methodWriter.invokevirtual(ASMUtils.TYPE_FIELD_WRITER, "getFunction", "()Ljava/util/function/Function;");
            methodWriter.aload(i2);
            methodWriter.invokeinterface(ASMUtils.type(Function.class), "apply", "(Ljava/lang/Object;)Ljava/lang/Object;");
            methodWriter.checkcast(ASMUtils.type(cls2));
            return;
        }
        if (member instanceof Method) {
            methodWriter.aload(i2);
            methodWriter.checkcast(strType);
            if (cls.isInterface()) {
                methodWriter.invokeinterface(strType, ((Method) member).getName(), "()" + ASMUtils.desc(cls2));
                return;
            }
            methodWriter.invokevirtual(strType, ((Method) member).getName(), "()" + ASMUtils.desc(cls2));
            return;
        }
        if (Modifier.isPublic(cls.getModifiers()) && Modifier.isPublic(member.getModifiers()) && !this.classLoader.isExternalClass(cls)) {
            methodWriter.aload(i2);
            methodWriter.checkcast(strType);
            methodWriter.getfield(strType, member.getName(), ASMUtils.desc(cls2));
            return;
        }
        Field field = (Field) member;
        String strType2 = null;
        if (cls2 == Integer.TYPE) {
            str = "getInt";
            str2 = "(Ljava/lang/Object;J)I";
        } else if (cls2 == Long.TYPE) {
            str = "getLong";
            str2 = "(Ljava/lang/Object;J)J";
        } else if (cls2 == Float.TYPE) {
            str = "getFloat";
            str2 = "(Ljava/lang/Object;J)F";
        } else if (cls2 == Double.TYPE) {
            str = "getDouble";
            str2 = "(Ljava/lang/Object;J)D";
        } else if (cls2 == Character.TYPE) {
            str = "getChar";
            str2 = "(Ljava/lang/Object;J)C";
        } else if (cls2 == Byte.TYPE) {
            str = "getByte";
            str2 = "(Ljava/lang/Object;J)B";
        } else if (cls2 == Short.TYPE) {
            str = "getShort";
            str2 = "(Ljava/lang/Object;J)S";
        } else if (cls2 == Boolean.TYPE) {
            str = "getBoolean";
            str2 = "(Ljava/lang/Object;J)Z";
        } else {
            if (cls2.isEnum()) {
                strType2 = "java/lang/Enum";
            } else if (ObjectWriterProvider.isPrimitiveOrEnum(cls2)) {
                strType2 = ASMUtils.type(cls2);
            } else if (cls2.isArray() && ObjectWriterProvider.isPrimitiveOrEnum(cls2.getComponentType())) {
                strType2 = ASMUtils.type(cls2);
            } else if (Map.class.isAssignableFrom(cls2)) {
                strType2 = "java/util/Map";
            } else if (List.class.isAssignableFrom(cls2)) {
                strType2 = "java/util/List";
            } else if (Collection.class.isAssignableFrom(cls2)) {
                strType2 = "java/util/Collection";
            }
            str = "getObject";
            str2 = "(Ljava/lang/Object;J)Ljava/lang/Object;";
        }
        methodWriter.getstatic(ObjectWriterCreatorASMUtils.TYPE_UNSAFE_UTILS, "UNSAFE", "Lsun/misc/Unsafe;");
        methodWriter.aload(i2);
        methodWriter.visitLdcInsn(JDKUtils.UNSAFE.objectFieldOffset(field));
        methodWriter.invokevirtual("sun/misc/Unsafe", str, str2);
        if (strType2 != null) {
            methodWriter.checkcast(strType2);
        }
    }

    public void gwFieldValueIntVA(MethodWriterContext methodWriterContext, FieldWriter fieldWriter, int i, int i2, boolean z) {
        MethodWriter methodWriter = methodWriterContext.mw;
        int iVar = methodWriterContext.var(fieldWriter.fieldClass);
        Label label = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        genGetObject(methodWriterContext, fieldWriter, i2, i);
        methodWriter.dup();
        methodWriter.astore(iVar);
        methodWriter.ifnonnull(label2);
        methodWriter.iload(methodWriterContext.var(WRITE_NULLS));
        methodWriter.ifne(label3);
        methodWriter.goto_(label);
        methodWriter.visitLabel(label3);
        gwFieldName(methodWriterContext, fieldWriter, i2);
        methodWriter.aload(1);
        String str = ASMUtils.TYPE_JSON_WRITER;
        methodWriter.invokevirtual(str, "writeArrayNull", "()V");
        methodWriter.goto_(label);
        methodWriter.visitLabel(label2);
        gwFieldName(methodWriterContext, fieldWriter, i2);
        boolean z2 = (fieldWriter.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        methodWriter.aload(1);
        methodWriter.aload(iVar);
        methodWriter.invokevirtual(str, z2 ? "writeString" : "writeInt32", "([I)V");
        methodWriter.visitLabel(label);
    }

    public ObjectWriterCreatorASM(ClassLoader classLoader) {
        DynamicClassLoader dynamicClassLoader;
        if (classLoader instanceof DynamicClassLoader) {
            dynamicClassLoader = (DynamicClassLoader) classLoader;
        } else {
            dynamicClassLoader = new DynamicClassLoader(classLoader);
        }
        this.classLoader = dynamicClassLoader;
    }

    private static void gwWriteByte(MethodWriter methodWriter, int i, int i2, byte[] bArr, int i3) {
        methodWriter.aload(i);
        methodWriter.iload(i2);
        if (i3 != 0) {
            methodWriter.iconst_n(i3);
            methodWriter.iadd();
        }
        methodWriter.iconst_n(bArr[i3]);
        methodWriter.bastore();
    }

    /* JADX INFO: compiled from: obf */
    public static class MethodWriterContext {
        final String classNameType;
        final boolean jsonb;
        int maxVariant;
        final MethodWriter mw;
        final Class objectClass;
        final long objectFeatures;
        final ObjectWriterProvider provider;
        final Map<Object, Integer> variants = new LinkedHashMap();

        public MethodWriterContext(ObjectWriterProvider objectWriterProvider, Class cls, long j, String str, MethodWriter methodWriter, int i, boolean z) {
            this.provider = objectWriterProvider;
            this.objectClass = cls;
            this.objectFeatures = j;
            this.classNameType = str;
            this.mw = methodWriter;
            this.jsonb = z;
            this.maxVariant = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ldcIFEQ(String str, Number number, Number number2) {
            if (number.longValue() == number2.longValue()) {
                this.mw.visitLdcInsn(number);
                return;
            }
            Label label = new Label();
            Label label2 = new Label();
            this.mw.iload(var(str));
            this.mw.ifeq(label);
            this.mw.visitLdcInsn(number);
            this.mw.goto_(label2);
            this.mw.visitLabel(label);
            this.mw.visitLdcInsn(number2);
            this.mw.visitLabel(label2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void loadFieldClass(int i, Class cls) {
            if (cls.getName().startsWith("java")) {
                this.mw.visitLdcInsn(cls);
                return;
            }
            this.mw.aload(0);
            this.mw.getfield(this.classNameType, ObjectWriterCreatorASM.fieldWriter(i), ASMUtils.DESC_FIELD_WRITER);
            this.mw.getfield(ASMUtils.TYPE_FIELD_WRITER, "fieldClass", "Ljava/lang/Class;");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void loadFieldType(int i, Type type) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.getTypeName().startsWith("java")) {
                    this.mw.visitLdcInsn(cls);
                    return;
                }
            }
            this.mw.aload(0);
            this.mw.getfield(this.classNameType, ObjectWriterCreatorASM.fieldWriter(i), ASMUtils.DESC_FIELD_WRITER);
            this.mw.getfield(ASMUtils.TYPE_FIELD_WRITER, "fieldType", "Ljava/lang/reflect/Type;");
        }

        public boolean disableAutoType() {
            return (this.objectFeatures & FieldInfo.DISABLE_AUTO_TYPE) != 0;
        }

        public boolean disableJSONB() {
            return (this.objectFeatures & FieldInfo.DISABLE_JSONB) != 0;
        }

        public boolean disableReferenceDetect() {
            return (this.objectFeatures & FieldInfo.DISABLE_REFERENCE_DETECT) != 0;
        }

        public boolean disableSmartMatch() {
            return (this.objectFeatures & FieldInfo.DISABLE_SMART_MATCH) != 0;
        }

        public boolean disableSupportArrayMapping() {
            return (this.objectFeatures & FieldInfo.DISABLE_ARRAY_MAPPING) != 0;
        }

        public void genIsDisabled(long j, Label label) {
            this.mw.lload(var2(ObjectWriterCreatorASM.CONTEXT_FEATURES));
            this.mw.visitLdcInsn(j);
            this.mw.land();
            this.mw.lconst_0();
            this.mw.lcmp();
            this.mw.ifne(label);
        }

        public void genIsEnabled(long j, Label label) {
            this.mw.lload(var2(ObjectWriterCreatorASM.CONTEXT_FEATURES));
            this.mw.visitLdcInsn(j);
            this.mw.land();
            this.mw.lconst_0();
            this.mw.lcmp();
            if (label != null) {
                this.mw.ifeq(label);
            }
        }

        public void genIsEnabledAndAssign(long j, int i) {
            this.mw.lload(var2(ObjectWriterCreatorASM.CONTEXT_FEATURES));
            this.mw.visitLdcInsn(j);
            this.mw.land();
            this.mw.lconst_0();
            this.mw.lcmp();
            this.mw.istore(i);
        }

        public void genVariantsMethodBefore(boolean z) {
            Label label = new Label();
            Label label2 = new Label();
            this.mw.aload(1);
            MethodWriter methodWriter = this.mw;
            String str = ASMUtils.TYPE_JSON_WRITER;
            methodWriter.invokevirtual(str, "getFeatures", "()J");
            this.mw.lstore(var2(ObjectWriterCreatorASM.CONTEXT_FEATURES));
            if (z) {
                Label label3 = new Label();
                Label label4 = new Label();
                this.mw.aload(1);
                this.mw.getfield(str, "symbolTable", ObjectWriterCreatorASM.DESC_SYMBOL);
                this.mw.ifnonnull(label3);
                this.mw.lload(var2(ObjectWriterCreatorASM.CONTEXT_FEATURES));
                this.mw.visitLdcInsn(JSONWriter.Feature.WriteNameAsSymbol.mask);
                this.mw.land();
                this.mw.lconst_0();
                this.mw.lcmp();
                this.mw.ifne(label3);
                this.mw.iconst_1();
                this.mw.goto_(label4);
                this.mw.visitLabel(label3);
                this.mw.iconst_0();
                this.mw.visitLabel(label4);
                this.mw.istore(var2(ObjectWriterCreatorASM.NAME_DIRECT));
            } else {
                Label label5 = new Label();
                Label label6 = new Label();
                this.mw.aload(1);
                this.mw.getfield(str, "useSingleQuote", "Z");
                this.mw.ifne(label5);
                this.mw.lload(var2(ObjectWriterCreatorASM.CONTEXT_FEATURES));
                this.mw.visitLdcInsn(JSONWriter.Feature.UnquoteFieldName.mask | JSONWriter.Feature.UseSingleQuotes.mask);
                this.mw.land();
                this.mw.lconst_0();
                this.mw.lcmp();
                this.mw.ifne(label5);
                this.mw.iconst_1();
                this.mw.goto_(label6);
                this.mw.visitLabel(label5);
                this.mw.iconst_0();
                this.mw.visitLabel(label6);
                this.mw.istore(var2(ObjectWriterCreatorASM.NAME_DIRECT));
            }
            genIsEnabledAndAssign(JSONWriter.Feature.NotWriteDefaultValue.mask, var(ObjectWriterCreatorASM.NOT_WRITE_DEFAULT_VALUE));
            this.mw.iload(var(ObjectWriterCreatorASM.NOT_WRITE_DEFAULT_VALUE));
            this.mw.ifeq(label);
            this.mw.iconst_0();
            this.mw.istore(var(ObjectWriterCreatorASM.WRITE_NULLS));
            this.mw.goto_(label2);
            this.mw.visitLabel(label);
            genIsEnabledAndAssign(JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask, var(ObjectWriterCreatorASM.WRITE_NULLS));
            this.mw.visitLabel(label2);
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

        public void genIsEnabled(long j, long j2, Label label) {
            this.mw.lload(var2(ObjectWriterCreatorASM.CONTEXT_FEATURES));
            this.mw.visitLdcInsn(j);
            this.mw.lor();
            this.mw.visitLdcInsn(j2);
            this.mw.land();
            this.mw.lconst_0();
            this.mw.lcmp();
            if (label != null) {
                this.mw.ifeq(label);
            }
        }

        public void genIsEnabled(long j, Label label, Label label2) {
            this.mw.lload(var2(ObjectWriterCreatorASM.CONTEXT_FEATURES));
            this.mw.visitLdcInsn(j);
            this.mw.land();
            this.mw.lconst_0();
            this.mw.lcmp();
            this.mw.ifeq(label2);
            this.mw.goto_(label);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:110:0x0211  */
    /* JADX WARN: Code duplicated, block: B:113:0x0219  */
    /* JADX WARN: Code duplicated, block: B:115:0x021e  */
    /* JADX WARN: Code duplicated, block: B:119:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:? A[LOOP:1: B:85:0x01af->B:130:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.writer.ObjectWriterCreator
    public ObjectWriter createObjectWriter(Class cls, long j, final ObjectWriterProvider objectWriterProvider) {
        Object obj;
        Object obj2;
        Class cls2;
        ArrayList<FieldWriter> arrayList;
        boolean z;
        Iterator it;
        boolean z2;
        long j2;
        String simpleName;
        long j3;
        final ObjectWriterCreatorASM objectWriterCreatorASM = this;
        final Class cls3 = cls;
        int modifiers = cls3.getModifiers();
        boolean zIsExternalClass = objectWriterCreatorASM.classLoader.isExternalClass(cls3);
        boolean zIsPublic = Modifier.isPublic(modifiers);
        final BeanInfo beanInfoCreateBeanInfo = objectWriterProvider.createBeanInfo();
        objectWriterProvider.getBeanInfo(beanInfoCreateBeanInfo, cls3);
        Class cls4 = beanInfoCreateBeanInfo.serializer;
        if (cls4 != null && ObjectWriter.class.isAssignableFrom(cls4)) {
            try {
                Constructor declaredConstructor = beanInfoCreateBeanInfo.serializer.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return (ObjectWriter) declaredConstructor.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new JSONException("create serializer error", e);
            }
        }
        long j4 = beanInfoCreateBeanInfo.writerFeatures;
        if (beanInfoCreateBeanInfo.seeAlso != null) {
            j4 &= ~JSONWriter.Feature.WriteClassName.mask;
        }
        boolean zIsRecord = BeanUtils.isRecord(cls3);
        final long j5 = j | j4 | (zIsRecord ? FieldInfo.RECORD : 0L);
        boolean z3 = (((JSONWriter.Feature.FieldBased.mask & j5) == 0 || cls3.isInterface()) && beanInfoCreateBeanInfo.alphabetic) ? false : true;
        if (!Throwable.class.isAssignableFrom(cls3) && !BeanUtils.isExtendedMap(cls3) && beanInfoCreateBeanInfo.rootName == null) {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (z3 && !zIsRecord) {
                final FieldInfo fieldInfo = new FieldInfo();
                final int i = 1;
                BeanUtils.declaredFields(cls3, new Consumer(objectWriterCreatorASM) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᤞᲇᲈᤝ

                    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
                    public final /* synthetic */ ObjectWriterCreatorASM f7351;

                    {
                        this.f7351 = objectWriterCreatorASM;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj3) {
                        switch (i) {
                            case 0:
                                this.f7351.lambda$createObjectWriter$0(fieldInfo, cls3, j5, objectWriterProvider, beanInfoCreateBeanInfo, linkedHashMap, (Field) obj3);
                                break;
                            default:
                                this.f7351.lambda$createObjectWriter$2(fieldInfo, cls3, j5, objectWriterProvider, beanInfoCreateBeanInfo, linkedHashMap, (Field) obj3);
                                break;
                        }
                    }
                });
                obj2 = Throwable.class;
            } else {
                ArrayList<FieldWriter> arrayList2 = new ArrayList();
                Iterator<ObjectWriterModule> it2 = objectWriterProvider.modules.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (it2.next().createFieldWriters(objectWriterCreatorASM, cls3, arrayList2)) {
                            for (FieldWriter fieldWriter : arrayList2) {
                                if (fieldWriter.method == null) {
                                    return super.createObjectWriter(cls3, j5, objectWriterProvider);
                                }
                                linkedHashMap.putIfAbsent(fieldWriter.fieldName, fieldWriter);
                            }
                            obj2 = Throwable.class;
                        }
                    } else {
                        final FieldInfo fieldInfo2 = new FieldInfo();
                        if (!zIsRecord) {
                            obj = Throwable.class;
                            final int i2 = 0;
                            BeanUtils.declaredFields(cls3, new Consumer(objectWriterCreatorASM) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᤞᲇᲈᤝ

                                /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
                                public final /* synthetic */ ObjectWriterCreatorASM f7351;

                                {
                                    this.f7351 = objectWriterCreatorASM;
                                }

                                @Override // java.util.function.Consumer
                                public final void accept(Object obj3) {
                                    switch (i2) {
                                        case 0:
                                            this.f7351.lambda$createObjectWriter$0(fieldInfo2, cls3, j5, objectWriterProvider, beanInfoCreateBeanInfo, linkedHashMap, (Field) obj3);
                                            break;
                                        default:
                                            this.f7351.lambda$createObjectWriter$2(fieldInfo2, cls3, j5, objectWriterProvider, beanInfoCreateBeanInfo, linkedHashMap, (Field) obj3);
                                            break;
                                    }
                                }
                            });
                        } else {
                            obj = Throwable.class;
                        }
                        Class mixIn = objectWriterProvider.getMixIn(cls3);
                        boolean z4 = beanInfoCreateBeanInfo.kotlin;
                        objectWriterCreatorASM = this;
                        C2263 c2263 = new C2263(objectWriterCreatorASM, fieldInfo2, j5, beanInfoCreateBeanInfo, objectWriterProvider, cls3, zIsRecord, linkedHashMap, 1);
                        cls3 = cls3;
                        linkedHashMap = linkedHashMap;
                        beanInfoCreateBeanInfo = beanInfoCreateBeanInfo;
                        BeanUtils.getters(cls3, mixIn, z4, c2263);
                        cls2 = obj;
                        break;
                    }
                }
                arrayList = new ArrayList(linkedHashMap.values());
                objectWriterCreatorASM.handleIgnores(beanInfoCreateBeanInfo, arrayList);
                if (beanInfoCreateBeanInfo.alphabetic) {
                    try {
                        Collections.sort(arrayList);
                    } catch (Exception e2) {
                        StringBuilder sb = new StringBuilder("fieldWriters sort error, objectClass ");
                        sb.append(cls3.getName());
                        sb.append(", fields ");
                        JSONArray jSONArray = new JSONArray();
                        for (FieldWriter fieldWriter2 : arrayList) {
                            jSONArray.add(JSONObject.of("name", (Object) fieldWriter2.fieldName, g.y, (Object) fieldWriter2.fieldClass, "ordinal", (Object) Integer.valueOf(fieldWriter2.ordinal), "field", (Object) fieldWriter2.field, "method", (Object) fieldWriter2.method));
                        }
                        sb.append(jSONArray);
                        throw new JSONException(sb.toString(), e2);
                    }
                }
                if (arrayList.size() < 100 || cls2.isAssignableFrom(cls3)) {
                    z = false;
                } else {
                    z = true;
                }
                if (zIsPublic || zIsExternalClass) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((FieldWriter) it.next()).method != null) {
                            z = false;
                            break;
                        }
                    }
                }
                for (FieldWriter fieldWriter3 : arrayList) {
                    if (fieldWriter3.getInitWriter() == null) {
                        j3 = fieldWriter3.features;
                        if ((FieldInfo.VALUE_MASK & j3) == r14 || (j3 & FieldInfo.RAW_VALUE_MASK) != 0) {
                        }
                    }
                    z = false;
                }
                if (cls3.getSuperclass() == Object.class) {
                    simpleName = cls3.getSimpleName();
                    if (simpleName.indexOf(36) != -1 && simpleName.contains("$$")) {
                        z = false;
                    }
                }
                z2 = arrayList.size() <= 64 ? z : false;
                j2 = j | beanInfoCreateBeanInfo.writerFeatures;
                if (!z2) {
                    return super.createObjectWriter(cls, j, objectWriterProvider);
                }
                objectWriterCreatorASM.setDefaultValue(arrayList, cls3);
                return objectWriterCreatorASM.jitWriter(cls3, objectWriterProvider, beanInfoCreateBeanInfo, arrayList, j2);
            }
            cls2 = obj2;
            arrayList = new ArrayList(linkedHashMap.values());
            objectWriterCreatorASM.handleIgnores(beanInfoCreateBeanInfo, arrayList);
            if (beanInfoCreateBeanInfo.alphabetic) {
                Collections.sort(arrayList);
            }
            if (arrayList.size() < 100) {
                z = false;
            } else {
                z = false;
            }
            if (zIsPublic) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((FieldWriter) it.next()).method != null) {
                        z = false;
                        break;
                    }
                }
            } else {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((FieldWriter) it.next()).method != null) {
                        z = false;
                        break;
                    }
                }
            }
            while (r0.hasNext()) {
                if (fieldWriter3.getInitWriter() == null) {
                    j3 = fieldWriter3.features;
                    if ((FieldInfo.VALUE_MASK & j3) == r14) {
                    }
                }
                z = false;
            }
            if (cls3.getSuperclass() == Object.class) {
                simpleName = cls3.getSimpleName();
                if (simpleName.indexOf(36) != -1) {
                    z = false;
                }
            }
            if (arrayList.size() <= 64) {
            }
            j2 = j | beanInfoCreateBeanInfo.writerFeatures;
            if (!z2) {
                return super.createObjectWriter(cls, j, objectWriterProvider);
            }
            objectWriterCreatorASM.setDefaultValue(arrayList, cls3);
            return objectWriterCreatorASM.jitWriter(cls3, objectWriterProvider, beanInfoCreateBeanInfo, arrayList, j2);
        }
        return super.createObjectWriter(cls, j, objectWriterProvider);
    }
}
