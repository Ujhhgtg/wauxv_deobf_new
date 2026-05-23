package p000;

import bsh.C0007;
import bsh.Primitive;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᤞᲈᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0345 extends AbstractC2707 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public String f1636;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C0352 f1637;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public C0340 f1638;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public C0333 f1639;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f1640;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public C2000 f1641;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public Class f1642;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public int f1643;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public boolean f1644;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public boolean f1645;

    @Override // p000.AbstractC2707
    public final String toString() {
        return super.toString() + ": " + this.f1636;
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) {
        m1458();
        C0352 c0352 = this.f1637;
        this.f1642 = c0352 != null ? c0352.f1662 ? Void.TYPE : ((C0356) c0352.f8721[0]).m1467(c0550, runnableC1668) : null;
        m1458();
        for (int i = this.f1640; i < this.f1643 + this.f1640; i++) {
            ((C0326) this.f8721[i]).m1432(c0550);
        }
        this.f1638.mo306(c0550, runnableC1668);
        
        C0007 c0007M1929 = c0550.m1929();
        C2000 c2000 = this.f1641;
        boolean z = this.f1645;
        String str = this.f1636;
        Class cls = this.f1642;
        C0340 c0340 = this.f1638;
        c0340.m1453();
        String[] strArr = c0340.f1617;
        C0340 c0341 = this.f1638;
        Class[] clsArr = c0341.f1620;
        c0341.m1453();
        C0501 c0501 = new C0501(str, cls, strArr, clsArr, c0341.f1618, this.f1639, c0007M1929, c2000, this.f1644);
        c0501.f2160 = z;
        boolean z2 = c0007M1929.f507;
        if (!z2 && !c0007M1929.f508) {
            runnableC1668.f5634.m346().mo296(c0501);
        } else if (z2 && !this.f1638.f1619) {
            runnableC1668.f5634.m346().mo296(this.f1638);
            this.f1638.f1619 = true;
        }
        c0007M1929.mo313(c0501);
        return Primitive.VOID;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final synchronized void m1458() {
        try {
            if (this.f1638 != null) {
                return;
            }
            InterfaceC2225[] interfaceC2225Arr = this.f8721;
            InterfaceC2225 interfaceC2225 = interfaceC2225Arr[0];
            this.f1640 = 1;
            if (interfaceC2225 instanceof C0352) {
                this.f1637 = (C0352) interfaceC2225;
                this.f1638 = (C0340) interfaceC2225Arr[1];
                int length = m4710().length;
                int i = this.f1643 + 2;
                if (length > i) {
                    this.f1639 = (C0333) this.f8721[i];
                }
                this.f1640++;
            } else {
                this.f1638 = (C0340) interfaceC2225;
                this.f1639 = (C0333) interfaceC2225Arr[this.f1643 + 1];
            }
            C0333 c0333 = this.f1639;
            if (c0333 != null && c0333.m4710().length > 0) {
                C0333 c0334 = this.f1639;
                InterfaceC2225 interfaceC2226 = c0334.f8721[c0334.m4710().length - 1];
                if (interfaceC2226 instanceof C0351) {
                    while (true) {
                        AbstractC2707 abstractC2707 = (AbstractC2707) interfaceC2226;
                        if (!abstractC2707.hasNext()) {
                            break;
                        }
                        interfaceC2226 = (InterfaceC2225) abstractC2707.next();
                        if (interfaceC2226 instanceof C0326) {
                            this.f1645 = ((C0326) interfaceC2226).f1577.startsWith("this");
                        }
                    }
                }
            }
            this.f1638.m1453();
            this.f1644 = this.f1638.f1623;
        } catch (Throwable th) {
            throw th;
        }
    }
}
