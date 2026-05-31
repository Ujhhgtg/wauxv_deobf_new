package p000;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import okhttp3.Call;
import okhttp3.Interceptor;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲁᲀᲇᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2182 extends AbstractC1778 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ Interceptor.Chain f7223;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2182(Interceptor.Chain chain) {
        super(0);
        this.f7223 = chain;
    }

    @Override // p000.InterfaceC1422
    public final Object invoke() {
        Iterator it = AbstractC2174.f7207.iterator();
        while (it.hasNext()) {
            Call call = (Call) ((WeakReference) it.next()).get();
            if (call == null) {
                it.remove();
            } else if (call.equals(this.f7223.call())) {
                it.remove();
                break;
            }
        }
        return C3554.UNIT;
    }
}
