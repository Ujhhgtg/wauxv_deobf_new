package p000;

import java.util.HashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1272 extends C2620 {

    public final HashMap f4650 = new HashMap();

    @Override // p000.C2620
    public final C2617 mo3001(Object obj) {
        return (C2617) this.f4650.get(obj);
    }

    @Override // p000.C2620
    public final Object mo3002(Object obj) {
        Object objMo3002 = super.mo3002(obj);
        this.f4650.remove(obj);
        return objMo3002;
    }
}
