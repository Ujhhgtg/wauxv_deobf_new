package p000;

import bsh.AbstractC0016;
import bsh.Variable;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.schema.StringSchema;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.FieldWriter;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤞᲈᤝᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0456 implements Predicate {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2062;

    public /* synthetic */ C0456(int i) {
        this.f2062 = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f2062) {
            case 0:
                return ((AbstractC1687) obj).mo2463();
            case 1:
                return ((String) obj).toLowerCase().endsWith(".class");
            case 2:
                return AbstractC0016.m546((Class) obj);
            case 3:
                return Objects.nonNull((FieldWriter) obj);
            case 4:
                return Objects.nonNull((Variable) obj);
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
