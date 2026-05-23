package p000;

import android.view.MenuItem;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲈᲀᤞᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0637 implements InterfaceC1414 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2480;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f2481;

    public /* synthetic */ C0637(int i, Object obj) {
        this.f2480 = i;
        this.f2481 = obj;
    }

    @Override // p000.InterfaceC1414
    public final Object invoke() {
        int i = this.f2480;
        Object obj = this.f2481;
        switch (i) {
            case 0:
                int i2 = AbstractC1745.f5844;
                C1973 c1973M3492 = AbstractC0968.m2484(obj).m3492();
                c1973M3492.f6543 = AbstractC2519.m4527(MenuItem.class);
                Class cls = Integer.TYPE;
                return (C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(cls), AbstractC2519.m4527(cls), AbstractC2519.m4527(cls), AbstractC2519.m4527(CharSequence.class), AbstractC2519.m4527(cls)}, 5, c1973M3492);
            case 1:
                int i3 = AbstractC1745.f5844;
                C1299 c1299M3490 = AbstractC0968.m2484(obj).m3490();
                C0204.f1288.getClass();
                C0203 c0203 = C0203.f1287;
                c1299M3490.f4725 = AbstractC1574.m3315(c0203).getDeclaringClass();
                Object objM3023 = ((C1315) AbstractC0744.m2191(c1299M3490.m3014())).m3023();
                C0681.f2564.getClass();
                C1299 c1299M3491 = AbstractC0968.m2484(AbstractC1574.m3315(c0203).invoke(objM3023, (Class) AbstractC0270.m1385(AbstractC1574.m3313(C0680.f2563).getInterfaces()))).m3490();
                c1299M3491.f4725 = C0607.f2431.m2028();
                return (FrameLayout) ((C1315) AbstractC0744.m2191(c1299M3491.m3014())).m3024();
            default:
                return obj;
        }
    }
}
