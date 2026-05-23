package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.ObjectReaderImplList;
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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᤝᲇᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2257 implements Function {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7322;

    public /* synthetic */ C2257(int i) {
        this.f7322 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f7322) {
            case 0:
                return ObjectReaderImplList.lambda$of$2(obj);
            case 1:
                return ObjectReaderImplList.lambda$of$3(obj);
            case 2:
                return ObjectReaderImplList.lambda$of$4(obj);
            case 3:
                return ObjectReaderImplList.lambda$of$5(obj);
            case 4:
                return ObjectReaderImplListStr.lambda$readJSONBObject$0((Collection) obj);
            case 5:
                return ObjectReaderImplListStr.lambda$readJSONBObject$1((Collection) obj);
            case 6:
                return Collections.synchronizedMap((Map) obj);
            case 7:
                return Collections.synchronizedNavigableMap((NavigableMap) obj);
            case 8:
                return Collections.synchronizedSortedMap((SortedMap) obj);
            case 9:
                return Collections.unmodifiableMap((Map) obj);
            case 10:
                return Collections.unmodifiableSortedMap((SortedMap) obj);
            case 11:
                return Collections.unmodifiableNavigableMap((NavigableMap) obj);
            case Opcodes.FCONST_1 /* 12 */:
                return ObjectReaderImplMap.lambda$of$0((Map) obj);
            case 13:
                return ObjectReaderImplMap.lambda$static$0(obj);
            case Opcodes.DCONST_0 /* 14 */:
                return ObjectWriterBaseModule.lambda$getObjectWriter$0(obj);
            case 15:
                return ((Method) obj).getParameterTypes();
            case 16:
                return ((Field) obj).getDeclaringClass();
            case Opcodes.SIPUSH /* 17 */:
                return ((Field) obj).getName();
            case Opcodes.LDC /* 18 */:
                return ((ParameterizedType) obj).getActualTypeArguments();
            case 19:
                return ((ParameterizedType) obj).getOwnerType();
            case 20:
                return ((ParameterizedType) obj).getRawType();
            case Opcodes.ILOAD /* 21 */:
                return ((StackTraceElement) obj).getFileName();
            case Opcodes.LLOAD /* 22 */:
                return ((StackTraceElement) obj).getClassName();
            case Opcodes.FLOAD /* 23 */:
                return ((StackTraceElement) obj).getMethodName();
            case Opcodes.DLOAD /* 24 */:
                return ((Method) obj).getDeclaringClass();
            case Opcodes.ALOAD /* 25 */:
                return ((Method) obj).getName();
            case 26:
                return obj.toString();
            case 27:
                try {
                    return ((Field) obj).get(null);
                } catch (Exception unused) {
                    return null;
                }
            case 28:
                return AbstractC2202.m4007((Class) obj);
            default:
                return TypeUtils.toAsciiCharArray((byte[]) obj);
        }
    }
}
