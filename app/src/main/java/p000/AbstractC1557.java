package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1557 extends AbstractC3680 {

    public boolean f5426;

    @Override // p000.AbstractC3680
    public final void mo3261() {
        String[] strArr = AbstractC1574.f5469;
        if (this.f5426) {
            return;
        }
        try {
            mo1126();
        } catch (Exception e) {
            ArrayList arrayList = C3678.f11549;
            StringBuilder sb = new StringBuilder();
            sb.append("initOnce ");
            sb.append(this instanceof AbstractC2867 ? ((AbstractC2867) this).mo1128() : "LoadHook");
            AbstractC1194.m2792(sb, " Failed", e, 12);
        }
        this.f5426 = true;
    }

    public final void m3262(C3689 c3689, InterfaceC1425 interfaceC1425) {
        c3689.m5350(new C1556(interfaceC1425, this, 0));
    }

    public final void hookBefore(C3689 c3689, InterfaceC1425 interfaceC1425) {
        c3689.m5351(new C1556(interfaceC1425, this, 1));
    }

    public abstract String[] mo1238();

    public abstract void mo1126();

    public abstract boolean mo3264();
}
