package p000;

import de.robv.android.xposed.XposedBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᲁᤝᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0258 extends AbstractC1698 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f1485;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1486;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0258(int i, int i2) {
        super(i);
        this.f1486 = i2;
        this.f1485 = i;
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo1479(C1927 c1927) {
        ((C1572) c1927.f6347).mo1342(m1481(c1927), Boolean.TRUE);
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int mo1480() {
        return this.f1485;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final Object m1481(C1927 c1927) {
        Object c2641;
        boolean zBooleanValue;
        Object c2642;
        switch (this.f1486) {
            case 0:
                int i = 0;
                int i2 = AbstractC3744.f11721[0];
                if (AbstractC1567.f5453[AbstractC2844.m4792(i2)] == 1) {
                    try {
                        XposedBridge.getXposedVersion();
                        c2641 = Boolean.TRUE;
                    } catch (Throwable th) {
                        c2641 = new C2641(th);
                    }
                    if (c2641 instanceof C2641) {
                        c2641 = null;
                    }
                    Boolean bool = (Boolean) c2641;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    break;
                } else {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    i2 = 2;
                }
                int iM4792 = AbstractC2844.m4792(i2);
                if (iM4792 != 0) {
                    if (iM4792 != 1) {
                        throw new C0758();
                    }
                    i = -1;
                }
                return Integer.valueOf(i);
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.TRUE;
            case 3:
                return AbstractC3528.m5097();
            case 4:
                return Integer.valueOf(AbstractC3528.m5095());
            default:
                boolean zBooleanValue2 = false;
                int i3 = AbstractC3744.f11721[0];
                if (AbstractC1567.f5453[AbstractC2844.m4792(i3)] == 1) {
                    try {
                        XposedBridge.getXposedVersion();
                        c2642 = Boolean.TRUE;
                    } catch (Throwable th2) {
                        c2642 = new C2641(th2);
                    }
                    if (c2642 instanceof C2641) {
                        c2642 = null;
                    }
                    Boolean bool2 = (Boolean) c2642;
                    if (bool2 != null) {
                        zBooleanValue2 = bool2.booleanValue();
                    }
                    break;
                }
                if (!zBooleanValue2) {
                    i3 = 2;
                }
                int iM4793 = AbstractC2844.m4792(i3);
                if (iM4793 == 0) {
                    return "unsupported";
                }
                if (iM4793 == 1) {
                    return "unknown";
                }
                throw new C0758();
        }
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo1478(C1927 c1927) {
    }
}
