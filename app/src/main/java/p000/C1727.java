package p000;

import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1727 implements InterfaceC2654 {

    public static final C1727 f5821 = new C1727();

    public static final String f5822 = "kotlinx.serialization.json.JsonObject";

    public final /* synthetic */ C1798 f5823;

    public C1727() {
        C2839 c2839 = C2839.f9108;
        this.f5823 = new C1798(C2839.f9109, C1717.f5811.mo1363());
    }

    @Override // p000.InterfaceC2654
    public final List getAnnotations() {
        
        return C1189.f4329;
    }

    @Override // p000.InterfaceC2654
    public final String mo1342() {
        return "kotlinx.serialization.json.JsonObject";
    }

    @Override // p000.InterfaceC2654
    public final boolean mo3470() {
        
        return false;
    }

    @Override // p000.InterfaceC2654
    public final int mo3471(String str) {
        return this.f5823.mo3471(str);
    }

    @Override // p000.InterfaceC2654
    public final AbstractC1460 mo3472() {
        
        return C2851.f9113;
    }

    @Override // p000.InterfaceC2654
    public final int mo3473() {
        
        return 2;
    }

    @Override // p000.InterfaceC2654
    public final String mo3474(int i) {
        
        return String.valueOf(i);
    }

    @Override // p000.InterfaceC2654
    public final boolean mo3358() {
        
        return false;
    }

    @Override // p000.InterfaceC2654
    public final List mo3475(int i) {
        this.f5823.mo3475(i);
        return C1189.f4329;
    }

    @Override // p000.InterfaceC2654
    public final InterfaceC2654 mo3476(int i) {
        return this.f5823.mo3476(i);
    }

    @Override // p000.InterfaceC2654
    public final boolean mo3477(int i) {
        this.f5823.mo3477(i);
        return false;
    }
}
