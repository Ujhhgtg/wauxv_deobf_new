package p000;

import bsh.AbstractC0033Ujhhgtgfeyxiexzf;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.schema.StringSchema;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.FieldWriter;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱUjhhgtgᛱᛴ要点脸ᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2574Ujhhgtgfeyxiexzf implements Predicate {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8325Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2574Ujhhgtgfeyxiexzf(int i) {
        this.f8325Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f8325Ujhhgtgfeyxiexzf) {
            case 0:
                return ((AbstractC0695Ujhhgtgfeyxiexzf) obj).mo1972Ujhhgtgfeyxiexzf();
            case 1:
                return ((String) obj).toLowerCase().endsWith(".class");
            case 2:
                return AbstractC0033Ujhhgtgfeyxiexzf.m545feyxiexzfUjhhgtg((Class) obj);
            case 3:
                return Objects.nonNull((FieldWriter) obj);
            case 4:
                return Objects.nonNull((C1853Ujhhgtgfeyxiexzf) obj);
            case 5:
                return Objects.nonNull(obj);
            case 6:
                return !((String) obj).matches("_?bsh.*");
            case 7:
                return !((String) obj).isEmpty();
            case 8:
                return StringSchema.isEmail((String) obj);
            case 9:
                return TypeUtils.validateIPv4((String) obj);
            case 10:
                return TypeUtils.validateIPv6((String) obj);
            case 11:
                return StringSchema.lambda$new$0((String) obj);
            case Opcodes.FCONST_1 /* 12 */:
                return DateUtils.isDate((String) obj);
            case 13:
                return DateUtils.isLocalDate((String) obj);
            case Opcodes.DCONST_0 /* 14 */:
                return DateUtils.isLocalTime((String) obj);
            case 15:
                return StringSchema.lambda$new$1((String) obj);
            default:
                return TypeUtils.isUUID((String) obj);
        }
    }
}
