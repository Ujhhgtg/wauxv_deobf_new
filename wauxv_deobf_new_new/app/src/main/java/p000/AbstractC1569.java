package p000;

import java.util.ArrayList;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᤝᲁᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1569 extends AbstractC3743 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f5457;

    @Override // p000.AbstractC3743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final void mo3442() {
        String[] strArr = AbstractC1471.f5234;
        if (this.f5457) {
            return;
        }
        try {
            mo1272();
        } catch (Exception e) {
            ArrayList arrayList = C3741.f11709;
            StringBuilder sb = new StringBuilder();
            sb.append("initOnce ");
            sb.append(this instanceof AbstractC2927 ? ((AbstractC2927) this).mo1274() : "LoadHook");
            AbstractC1095.m2808(sb, " Failed", e, 12);
        }
        this.f5457 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final void m3443(C3752 c3752, InterfaceC1433 interfaceC1433) {
        c3752.m5358(new C1568(interfaceC1433, this, 0));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final void m3444(C3752 c3752, InterfaceC1433 interfaceC1433) {
        c3752.m5359(new C1568(interfaceC1433, this, 1));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ */
    public abstract String[] mo1384();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public abstract void mo1272();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public abstract boolean mo3445();
}
