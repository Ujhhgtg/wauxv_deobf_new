package p000;

import com.alibaba.fastjson2.util.JDKUtils;
import java.util.List;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᲈᛸᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1704 implements ToIntFunction {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5784;

    public /* synthetic */ C1704(int i) {
        this.f5784 = i;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.f5784) {
            case 0:
                return JDKUtils.lambda$static$0((String) obj);
            case 1:
                return ((List) obj).size();
            default:
                return ((StackTraceElement) obj).getLineNumber();
        }
    }
}
