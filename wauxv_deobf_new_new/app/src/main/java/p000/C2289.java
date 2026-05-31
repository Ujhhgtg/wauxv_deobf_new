package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.ObjectReaderImplListStr;
import com.alibaba.fastjson2.reader.ObjectReaderImplMap;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.ObjectWriterBaseModule;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.function.Function;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲇᤝᲁᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2289 implements Function {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7443;

    public /* synthetic */ C2289(int i) {
        this.f7443 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f7443) {
            case 0:
                return ObjectReaderImplListStr.lambda$readJSONBObject$0((Collection) obj);
            case 1:
                return ObjectReaderImplListStr.lambda$readJSONBObject$1((Collection) obj);
            case 2:
                return Collections.synchronizedMap((Map) obj);
            case 3:
                return Collections.synchronizedNavigableMap((NavigableMap) obj);
            case 4:
                return Collections.synchronizedSortedMap((SortedMap) obj);
            case 5:
                return Collections.unmodifiableMap((Map) obj);
            case 6:
                return Collections.unmodifiableSortedMap((SortedMap) obj);
            case 7:
                return Collections.unmodifiableNavigableMap((NavigableMap) obj);
            case 8:
                return ObjectReaderImplMap.lambda$of$1((Map) obj);
            case 9:
                return ObjectReaderImplMap.lambda$static$0(obj);
            case 10:
                return ObjectWriterBaseModule.lambda$getObjectWriter$0(obj);
            case 11:
                return ((Method) obj).getParameterTypes();
            case Opcodes.FCONST_1 /* 12 */:
                return ((Field) obj).getDeclaringClass();
            case 13:
                return ((Field) obj).getName();
            case Opcodes.DCONST_0 /* 14 */:
                return ((ParameterizedType) obj).getActualTypeArguments();
            case 15:
                return ((ParameterizedType) obj).getOwnerType();
            case 16:
                return ((ParameterizedType) obj).getRawType();
            case Opcodes.SIPUSH /* 17 */:
                return ((StackTraceElement) obj).getFileName();
            case Opcodes.LDC /* 18 */:
                return ((StackTraceElement) obj).getClassName();
            case 19:
                return ((StackTraceElement) obj).getMethodName();
            case 20:
                return ((Method) obj).getDeclaringClass();
            case Opcodes.ILOAD /* 21 */:
                return ((Method) obj).getName();
            case Opcodes.LLOAD /* 22 */:
                return obj.toString();
            case Opcodes.FLOAD /* 23 */:
                try {
                    return ((Field) obj).get(null);
                } catch (Exception unused) {
                    return null;
                }
            case Opcodes.DLOAD /* 24 */:
                return AbstractC2240.m4256((Class) obj);
            default:
                return TypeUtils.toAsciiCharArray((byte[]) obj);
        }
    }
}
