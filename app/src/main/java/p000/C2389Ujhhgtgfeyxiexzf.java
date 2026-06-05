package p000;

import bsh.C0019Ujhhgtgfeyxiexzf;
import bsh.C0021Ujhhgtgfeyxiexzf;
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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2389Ujhhgtgfeyxiexzf implements Function {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f7773Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2389Ujhhgtgfeyxiexzf(int i) {
        this.f7773Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f7773Ujhhgtgfeyxiexzf) {
            case 0:
                return JSONSchema.of((JSONObject) obj);
            case 1:
                C2518feyxiexzfUjhhgtg c2518feyxiexzfUjhhgtg = (C2518feyxiexzfUjhhgtg) obj;
                return new C0019Ujhhgtgfeyxiexzf(c2518feyxiexzfUjhhgtg.f8210Ujhhgtgfeyxiexzf, c2518feyxiexzfUjhhgtg.f8211Ujhhgtgfeyxiexzf);
            case 2:
                return new C2570Ujhhgtgfeyxiexzf((Class) obj);
            case 3:
                return ((Path) obj).toString();
            case 4:
                return C2585feyxiexzfUjhhgtg.m3833Ujhhgtgfeyxiexzf((String) obj);
            case 5:
                return String.valueOf((char) ((Integer) obj).intValue());
            case 6:
                return AbstractC3594Ujhhgtgfeyxiexzf.m5200feyxiexzfUjhhgtg((C1853Ujhhgtgfeyxiexzf) obj);
            case 7:
                return "    ".concat((String) obj);
            case 8:
                return AbstractC3594Ujhhgtgfeyxiexzf.m5186Ujhhgtgfeyxiexzf((C0021Ujhhgtgfeyxiexzf) obj);
            case 9:
                Field field = (Field) obj;
                return Modifier.toString(field.getModifiers()) + " " + AbstractC3594Ujhhgtgfeyxiexzf.m5179Ujhhgtgfeyxiexzf(field.getType()) + " " + field.getName() + ";";
            case 10:
                Method method = (Method) obj;
                String string = Modifier.toString(method.getModifiers());
                StringBuilder sbM4805Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(string, " ");
                sbM4805Ujhhgtgfeyxiexzf.append(AbstractC3594Ujhhgtgfeyxiexzf.m5179Ujhhgtgfeyxiexzf(method.getReturnType()));
                sbM4805Ujhhgtgfeyxiexzf.append(" ");
                sbM4805Ujhhgtgfeyxiexzf.append(AbstractC3594Ujhhgtgfeyxiexzf.m5187Ujhhgtgfeyxiexzf(method.getName(), method.getParameterTypes()));
                sbM4805Ujhhgtgfeyxiexzf.append(string.contains("abstract") ? ";" : " {}");
                return sbM4805Ujhhgtgfeyxiexzf.toString();
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
