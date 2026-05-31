package p000;

import bsh.BshMethod;
import bsh.C0002;
import bsh.Variable;
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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᲀᲁᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0278 implements Function {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1543;

    public /* synthetic */ C0278(int i) {
        this.f1543 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f1543) {
            case 0:
                return JSONSchema.of((JSONObject) obj);
            case 1:
                C0405 c0405 = (C0405) obj;
                return new C0002(c0405.f1958, c0405.f1959);
            case 2:
                return new C0457((Class) obj);
            case 3:
                return ((Path) obj).toString();
            case 4:
                return C0468.m1833((String) obj);
            case 5:
                return BshMethod.lambda$getParameterNames$0((Integer) obj);
            case 6:
                return AbstractC2240.m4270((Variable) obj);
            case 7:
                return "    ".concat((String) obj);
            case 8:
                return AbstractC2240.m4260((BshMethod) obj);
            case 9:
                Field field = (Field) obj;
                return Modifier.toString(field.getModifiers()) + " " + AbstractC2240.m4256(field.getType()) + " " + field.getName() + ";";
            case 10:
                Method method = (Method) obj;
                String string = Modifier.toString(method.getModifiers());
                StringBuilder sbM2803 = AbstractC1095.m2803(string, " ");
                sbM2803.append(AbstractC2240.m4256(method.getReturnType()));
                sbM2803.append(" ");
                sbM2803.append(AbstractC2240.m4261(method.getName(), method.getParameterTypes()));
                sbM2803.append(string.contains("abstract") ? ";" : " {}");
                return sbM2803.toString();
            case 11:
                return Character.toChars(((Integer) obj).intValue());
            case Opcodes.FCONST_1 /* 12 */:
                return String.valueOf((char[]) obj);
            case 13:
                Class cls = (Class) obj;
                return Integer.valueOf(cls == null ? 39 : cls.hashCode());
            case Opcodes.DCONST_0 /* 14 */:
                return JSONPath.lambda$of$0((JSONPath) obj);
            case 15:
                return ((List) obj).stream();
            case 16:
                return new AtomicIntegerArray((int[]) obj);
            case Opcodes.SIPUSH /* 17 */:
                return new AtomicLongArray((long[]) obj);
            case Opcodes.LDC /* 18 */:
                return ObjectReaderBaseModule.lambda$getObjectReader$10((String) obj);
            case 19:
                return Period.parse((String) obj);
            case 20:
                return new SimpleDateFormat((String) obj);
            case Opcodes.ILOAD /* 21 */:
                return ByteBuffer.wrap((byte[]) obj);
            case Opcodes.LLOAD /* 22 */:
                return new AtomicBoolean(((Boolean) obj).booleanValue());
            case Opcodes.FLOAD /* 23 */:
                return URI.create((String) obj);
            case Opcodes.DLOAD /* 24 */:
                return Charset.forName((String) obj);
            case Opcodes.ALOAD /* 25 */:
                return new File((String) obj);
            case 26:
                return ObjectReaderBaseModule.lambda$getObjectReader$8((String) obj);
            case 27:
                return ObjectReaderBaseModule.lambda$getObjectReader$9((String) obj);
            case 28:
                return Pattern.compile((String) obj);
            default:
                return ObjectReaderBaseModule.lambda$init$0(obj);
        }
    }
}
