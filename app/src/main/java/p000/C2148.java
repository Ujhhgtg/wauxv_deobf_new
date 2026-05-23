package p000;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import okhttp3.Call;
import okhttp3.Interceptor;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᲁᛸᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2148 extends AbstractC1756 implements InterfaceC1414 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Interceptor.Chain f7099;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2148(Interceptor.Chain chain) {
        super(0);
        this.f7099 = chain;
    }

    @Override // p000.InterfaceC1414
    public final Object invoke() {
        Iterator it = AbstractC2140.f7083.iterator();
        while (it.hasNext()) {
            Call call = (Call) ((WeakReference) it.next()).get();
            if (call == null) {
                it.remove();
            } else if (call.equals(this.f7099.call())) {
                it.remove();
                break;
            }
        }
        return C3497.f10997;
    }
}
