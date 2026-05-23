package p000;

import com.alibaba.fastjson2.util.JDKUtils;
import java.util.List;
import java.util.function.ToIntFunction;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1686 implements ToIntFunction {

    public final /* synthetic */ int f5741;

    public /* synthetic */ C1686(int i) {
        this.f5741 = i;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.f5741) {
            case 0:
                return JDKUtils.lambda$static$0((String) obj);
            case 1:
                return ((List) obj).size();
            default:
                return ((StackTraceElement) obj).getLineNumber();
        }
    }
}
