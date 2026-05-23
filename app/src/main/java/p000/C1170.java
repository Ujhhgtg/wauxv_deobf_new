package p000;

import android.content.Context;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᤞᲈᛸᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1170 extends AbstractC1823 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C1170 f4301 = new C1170();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static String m2762(String str) {
        int i = AbstractC1745.f5844;
        C1150.f4257.getClass();
        C1973 c1973M3492 = AbstractC0968.m2484(C1150.m2760()).m3492();
        c1973M3492.f6543 = AbstractC2519.m4527(String.class);
        return (String) ((C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(Context.class), AbstractC2519.m4527(String.class)}, 2, c1973M3492)).m3832(null, str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static void m2763(C1170 c1170, String str, Object obj) {
        c1170.getClass();
        int i = AbstractC1745.f5844;
        C1150.f4257.getClass();
        C1973 c1973M3492 = AbstractC0968.m2484(C1150.m2760()).m3492();
        c1973M3492.f6543 = Void.TYPE;
        c1973M3492.f4482 = new C1148(19);
        C1982 c1982 = (C1982) AbstractC0744.m2191(c1973M3492.m3799());
        int parameterCount = c1982.f6566.getParameterCount();
        if (parameterCount == 4) {
            c1982.m3831(str, obj, null, null);
        } else if (parameterCount != 5) {
            c1982.m3831(str, obj, null);
        } else {
            c1982.m3831(str, obj, null, null, 0);
        }
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.m3295(C1169.f4300, dexKitBridge, new C1148(20));
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
