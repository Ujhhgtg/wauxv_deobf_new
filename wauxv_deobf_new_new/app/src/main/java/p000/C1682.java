package p000;

import bsh.RunnableC0008;
import bsh.This;
import java.util.ArrayList;
import java.util.function.Supplier;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲁᲈᲀᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1682 implements Supplier {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5661;

    public /* synthetic */ C1682(int i) {
        this.f5661 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f5661) {
            case 0:
                ThreadLocal threadLocal = RunnableC0008.f500;
                return Boolean.FALSE;
            case 1:
                return new ArrayList();
            default:
                return This.lambda$static$1();
        }
    }
}
