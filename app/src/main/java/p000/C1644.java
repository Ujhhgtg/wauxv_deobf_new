package p000;

import java.io.InputStream;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1644 implements InterfaceC0961 {

    public final C1867 f5578;

    public C1644(C1867 c1867) {
        this.f5578 = c1867;
    }

    @Override // p000.InterfaceC0961
    public final Class mo1861() {
        return InputStream.class;
    }

    @Override // p000.InterfaceC0961
    public final InterfaceC0962 mo1862(Object obj) {
        return new C0094((InputStream) obj, this.f5578);
    }
}
