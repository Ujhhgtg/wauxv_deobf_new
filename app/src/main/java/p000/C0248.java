package p000;

import de.robv.android.xposed.XposedBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᲀᲁᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0248 extends AbstractC0567 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f1411;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1412;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0248(int i, int i2) {
        super(i);
        this.f1412 = i2;
        this.f1411 = i;
    }

    @Override // p000.AbstractC0567
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo1333(C1676 c1676) {
        ((C1560) c1676.f5659).mo1196(m1335(c1676), Boolean.TRUE);
    }

    @Override // p000.AbstractC0567
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int mo1334() {
        return this.f1411;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Object m1335(C1676 c1676) {
        Object c2585;
        boolean zBooleanValue;
        Object c2586;
        switch (this.f1412) {
            case 0:
                int i = 0;
                int i2 = AbstractC0743.f2838[0];
                if (AbstractC1555.f5422[AbstractC2784.m4759(i2)] == 1) {
                    try {
                        XposedBridge.getXposedVersion();
                        c2585 = Boolean.TRUE;
                    } catch (Throwable th) {
                        c2585 = new C2585(th);
                    }
                    if (c2585 instanceof C2585) {
                        c2585 = null;
                    }
                    Boolean bool = (Boolean) c2585;
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
                int iM4759 = AbstractC2784.m4759(i2);
                if (iM4759 != 0) {
                    if (iM4759 != 1) {
                        throw new C0761();
                    }
                    i = -1;
                }
                return Integer.valueOf(i);
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.TRUE;
            case 3:
                return AbstractC2665.m4665();
            case 4:
                return Integer.valueOf(AbstractC2665.m4664());
            default:
                boolean zBooleanValue2 = false;
                int i3 = AbstractC0743.f2838[0];
                if (AbstractC1555.f5422[AbstractC2784.m4759(i3)] == 1) {
                    try {
                        XposedBridge.getXposedVersion();
                        c2586 = Boolean.TRUE;
                    } catch (Throwable th2) {
                        c2586 = new C2585(th2);
                    }
                    if (c2586 instanceof C2585) {
                        c2586 = null;
                    }
                    Boolean bool2 = (Boolean) c2586;
                    if (bool2 != null) {
                        zBooleanValue2 = bool2.booleanValue();
                    }
                    break;
                }
                if (!zBooleanValue2) {
                    i3 = 2;
                }
                int iM47510 = AbstractC2784.m4759(i3);
                if (iM47510 == 0) {
                    return "unsupported";
                }
                if (iM47510 == 1) {
                    return "unknown";
                }
                throw new C0761();
        }
    }

    @Override // p000.AbstractC0567
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo1332(C1676 c1676) {
    }
}
