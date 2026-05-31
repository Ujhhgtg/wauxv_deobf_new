package p000;

import android.view.MenuItem;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲈᤝᤞᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0630 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2486;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f2487;

    public /* synthetic */ C0630(Object obj, int i) {
        this.f2486 = i;
        this.f2487 = obj;
    }

    @Override // p000.InterfaceC1422
    public final Object invoke() {
        int i = this.f2486;
        Object obj = this.f2487;
        switch (i) {
            case 0:
                int i2 = AbstractC1768.f5906;
                C2004 c2004M3560 = AbstractC2727.m4713(obj).m3560();
                c2004M3560.f6648 = AbstractC2574.m4549(MenuItem.class);
                Class cls = Integer.TYPE;
                return (C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(cls), AbstractC2574.m4549(cls), AbstractC2574.m4549(cls), AbstractC2574.m4549(CharSequence.class), AbstractC2574.m4549(cls)}, 5, c2004M3560);
            case 1:
                int i3 = AbstractC1768.f5906;
                C1300 c1300M3558 = AbstractC2727.m4713(obj).m3558();
                C0212.f1356.getClass();
                C0211 c0211 = C0211.f1355;
                c1300M3558.f4724 = AbstractC0972.m2610(c0211).getDeclaringClass();
                Object objM3126 = ((C1316) AbstractC0739.m2290(c1300M3558.m3117())).m3126();
                C0671.f2557.getClass();
                C1300 c1300M3559 = AbstractC2727.m4713(AbstractC0972.m2610(c0211).invoke(objM3126, (Class) AbstractC0280.m1531(AbstractC0972.m2608(C0670.f2556).getInterfaces()))).m3558();
                c1300M3559.f4724 = C0588.f2397.m2123();
                return (FrameLayout) ((C1316) AbstractC0739.m2290(c1300M3559.m3117())).m3127();
            default:
                return obj;
        }
    }
}
