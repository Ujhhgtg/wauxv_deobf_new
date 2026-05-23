package p000;

import bsh.AbstractC0009;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.schema.StringSchema;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.FieldWriter;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᤝᤞᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0335 implements Predicate {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1596;

    public /* synthetic */ C0335(int i) {
        this.f1596 = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f1596) {
            case 0:
                C0501 c0501 = (C0501) obj;
                return c0501.m1753("final") && !c0501.m1753("private");
            case 1:
                return ((AbstractC1672) obj).mo2348();
            case 2:
                return ((String) obj).toLowerCase().endsWith(".class");
            case 3:
                return AbstractC0009.m401((Class) obj);
            case 4:
                return Objects.nonNull((FieldWriter) obj);
            case 5:
                return Objects.nonNull((C3532) obj);
            case 6:
                return Objects.nonNull(obj);
            case 7:
                return !((String) obj).matches("_?bsh.*");
            case 8:
                return !((String) obj).isEmpty();
            case 9:
                return StringSchema.isEmail((String) obj);
            case 10:
                return TypeUtils.validateIPv4((String) obj);
            case 11:
                return TypeUtils.validateIPv6((String) obj);
            case 12 /* 12 */:
                return StringSchema.lambda$new$0((String) obj);
            case 13:
                return DateUtils.isDate((String) obj);
            case 14 /* 14 */:
                return DateUtils.isLocalDate((String) obj);
            case 15:
                return DateUtils.isLocalTime((String) obj);
            case 16:
                return StringSchema.lambda$new$1((String) obj);
            default:
                return TypeUtils.isUUID((String) obj);
        }
    }
}
