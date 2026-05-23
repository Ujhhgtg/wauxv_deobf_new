package p000;

import bsh.C0003;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.ObjectReaderBaseModule;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.function.Function;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᤝᲇᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0268 implements Function {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1469;

    public /* synthetic */ C0268(int i) {
        this.f1469 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f1469) {
            case 0:
                return JSONSchema.of((JSONObject) obj);
            case 1:
                C0430 c0430 = (C0430) obj;
                return new C0003(c0430.f1986, c0430.f1987);
            case 2:
                return new C0481((Class) obj);
            case 3:
                return ((Path) obj).toString();
            case 4:
                return C0492.m1727((String) obj);
            case 5:
                return String.valueOf((char) ((Integer) obj).intValue());
            case 6:
                return AbstractC2202.m4021((C3532) obj);
            case 7:
                return "    ".concat((String) obj);
            case 8:
                return AbstractC2202.m4010((C0501) obj);
            case 9:
                Field field = (Field) obj;
                return Modifier.toString(field.getModifiers()) + " " + AbstractC2202.m4007(field.getType()) + " " + field.getName() + ";";
            case 10:
                Method method = (Method) obj;
                String string = Modifier.toString(method.getModifiers());
                StringBuilder sbM2788 = AbstractC1194.m2788(string, " ");
                sbM2788.append(AbstractC2202.m4007(method.getReturnType()));
                sbM2788.append(" ");
                sbM2788.append(AbstractC2202.m4011(method.getName(), method.getParameterTypes()));
                sbM2788.append(string.contains("abstract") ? ";" : " {}");
                return sbM2788.toString();
            case 11:
                return Character.toChars(((Integer) obj).intValue());
            case Opcodes.FCONST_1 /* 12 */:
                return String.valueOf((char[]) obj);
            case 13:
                Class cls = (Class) obj;
                return Integer.valueOf(cls == null ? 39 : cls.hashCode());
            case Opcodes.DCONST_0 /* 14 */:
                return C0356.m1466((Class) obj);
            case 15:
                return JSONPath.lambda$of$0((JSONPath) obj);
            case 16:
                return ((List) obj).stream();
            case Opcodes.SIPUSH /* 17 */:
                return new AtomicIntegerArray((int[]) obj);
            case Opcodes.LDC /* 18 */:
                return new AtomicLongArray((long[]) obj);
            case 19:
                return ObjectReaderBaseModule.lambda$getObjectReader$2((String) obj);
            case 20:
                return Period.parse((String) obj);
            case Opcodes.ILOAD /* 21 */:
                return new SimpleDateFormat((String) obj);
            case Opcodes.LLOAD /* 22 */:
                return ByteBuffer.wrap((byte[]) obj);
            case Opcodes.FLOAD /* 23 */:
                return new AtomicBoolean(((Boolean) obj).booleanValue());
            case Opcodes.DLOAD /* 24 */:
                return URI.create((String) obj);
            case Opcodes.ALOAD /* 25 */:
                return Charset.forName((String) obj);
            case 26:
                return new File((String) obj);
            case 27:
                return ObjectReaderBaseModule.lambda$getObjectReader$0((String) obj);
            case 28:
                return ObjectReaderBaseModule.lambda$getObjectReader$1((String) obj);
            default:
                return Pattern.compile((String) obj);
        }
    }
}
