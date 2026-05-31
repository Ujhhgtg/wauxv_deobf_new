package com.alibaba.fastjson2.util;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class JDKUtils {
    public static final boolean ANDROID;
    public static final int ANDROID_SDK_INT;
    public static final long ARRAY_BYTE_BASE_OFFSET;
    public static final long ARRAY_CHAR_BASE_OFFSET;
    public static final boolean BIG_ENDIAN;
    static final Class<?> CLASS_SQL_DATASOURCE;
    static final Class<?> CLASS_SQL_ROW_SET;
    public static final Class CLASS_TRANSIENT;
    static volatile MethodHandle CONSTRUCTOR_LOOKUP;
    static volatile boolean CONSTRUCTOR_LOOKUP_ERROR;
    public static final long FIELD_BIGINTEGER_MAG_OFFSET;
    public static final long FIELD_DECIMAL_INT_COMPACT_OFFSET;
    public static final Field FIELD_STRING_CODER;
    public static volatile boolean FIELD_STRING_CODER_ERROR;
    public static final long FIELD_STRING_CODER_OFFSET;
    public static final Field FIELD_STRING_VALUE;
    public static volatile boolean FIELD_STRING_VALUE_ERROR;
    public static final long FIELD_STRING_VALUE_OFFSET;
    public static final boolean GRAAL;
    public static final boolean HAS_SQL;
    static final MethodHandles.Lookup IMPL_LOOKUP;
    public static final MethodHandle INDEX_OF_CHAR_LATIN1;
    public static final int JVM_VERSION;
    public static final Byte LATIN1;
    public static final MethodHandle METHOD_HANDLE_HAS_NEGATIVE;
    public static final boolean OPENJ9;
    public static final Predicate<byte[]> PREDICATE_IS_ASCII;
    public static final ToIntFunction<String> STRING_CODER;
    public static final BiFunction<byte[], Byte, String> STRING_CREATOR_JDK11;
    public static final BiFunction<char[], Boolean, String> STRING_CREATOR_JDK8;
    public static final Function<String, byte[]> STRING_VALUE;
    public static final Unsafe UNSAFE;
    public static final Byte UTF16;
    public static final int VECTOR_BIT_LENGTH;
    public static final boolean VECTOR_SUPPORT;
    static volatile Throwable initErrorLast;
    static final AtomicInteger reflectErrorCount;
    static volatile Throwable reflectErrorLast;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:214:0x00dd
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    static {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.JDKUtils.<clinit>():void");
    }

    public static String asciiStringJDK8(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = (char) bArr[i + i3];
        }
        return STRING_CREATOR_JDK8.apply(cArr, Boolean.TRUE);
    }

    public static char[] getCharArray(String str) {
        if (!FIELD_STRING_VALUE_ERROR) {
            try {
                return (char[]) UNSAFE.getObject(str, FIELD_STRING_VALUE_OFFSET);
            } catch (Exception unused) {
                FIELD_STRING_VALUE_ERROR = true;
            }
        }
        return str.toCharArray();
    }

    public static boolean isSQLDataSourceOrRowSet(Class<?> cls) {
        Class<?> cls2 = CLASS_SQL_DATASOURCE;
        if (cls2 != null && cls2.isAssignableFrom(cls)) {
            return true;
        }
        Class<?> cls3 = CLASS_SQL_ROW_SET;
        return cls3 != null && cls3.isAssignableFrom(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(String str) {
        return 1;
    }

    public static String latin1StringJDK8(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = (char) (bArr[i + i3] & 255);
        }
        return STRING_CREATOR_JDK8.apply(cArr, Boolean.TRUE);
    }

    public static void setReflectErrorLast(Throwable th) {
        reflectErrorCount.incrementAndGet();
        reflectErrorLast = th;
    }

    public static MethodHandles.Lookup trustedLookup(Class cls) {
        if (!CONSTRUCTOR_LOOKUP_ERROR) {
            try {
                MethodHandle methodHandleFindConstructor = CONSTRUCTOR_LOOKUP;
                int i = JVM_VERSION;
                Class cls2 = Integer.TYPE;
                Class cls3 = Void.TYPE;
                if (i < 15) {
                    if (methodHandleFindConstructor == null) {
                        methodHandleFindConstructor = IMPL_LOOKUP.findConstructor(MethodHandles.Lookup.class, MethodType.methodType(cls3, Class.class, cls2));
                        CONSTRUCTOR_LOOKUP = methodHandleFindConstructor;
                    }
                    return (MethodHandles.Lookup) methodHandleFindConstructor.invoke(cls, OPENJ9 ? 31 : -1);
                }
                if (methodHandleFindConstructor == null) {
                    methodHandleFindConstructor = IMPL_LOOKUP.findConstructor(MethodHandles.Lookup.class, MethodType.methodType(cls3, Class.class, Class.class, cls2));
                    CONSTRUCTOR_LOOKUP = methodHandleFindConstructor;
                }
                return (MethodHandles.Lookup) methodHandleFindConstructor.invoke(cls, null, -1);
            } catch (Throwable unused) {
                CONSTRUCTOR_LOOKUP_ERROR = true;
            }
        }
        return IMPL_LOOKUP.in(cls);
    }
}
