package p000;

import android.app.Application;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0250 extends AbstractC0567 {

    public final /* synthetic */ String f1414;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0250(C0251 c0251, String str) {
        super(1);
        this.f1414 = str;
    }

    @Override // p000.AbstractC0567
    public final void mo1332(C1676 c1676) {
        Object c2585;
        try {
            Object[] objArrM3406 = c1676.m3406();
            c2585 = null;
            Object obj = objArrM3406 != null ? objArrM3406[0] : null;
            Application application = obj instanceof Application ? (Application) obj : null;
            if (application != null) {
                Iterator it = C0251.f1418.entrySet().iterator();
                if (it.hasNext()) {
                    if (((Map.Entry) it.next()).getValue() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
                try {
                    if (C0251.f1417) {
                        return;
                    }
                    boolean zEquals = C0251.m1338().equals("android");
                    String str = this.f1414;
                    if (zEquals && !str.equals("android")) {
                        return;
                    }
                    C3686 c3686 = C3686.f11581;
                    if (c3686 == null) {
                        c3686 = new C3686();
                        C3686.f11581 = c3686;
                    }
                    c3686.m5347(application, str);
                    C0251.f1417 = true;
                } catch (Throwable unused) {
                }
                c2585 = application;
            }
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        Throwable thM4594 = C2586.m4594(c2585);
        if (thM4594 != null) {
            c1676.m3407(thM4594);
        }
    }
}
