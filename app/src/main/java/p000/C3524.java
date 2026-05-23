package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3524 extends C3523 {
    public C3524(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    @Override // p000.C3523
    public final C1229 mo4644(String str, InterfaceC2225 interfaceC2225, C0550 c0550) {
        String string;
        if (str == null) {
            string = getMessage();
        } else {
            StringBuilder sbM2788 = AbstractC1194.m2788(str, ": ");
            sbM2788.append(getMessage());
            string = sbM2788.toString();
        }
        return new C2895(string, getCause(), interfaceC2225, c0550, false);
    }
}
