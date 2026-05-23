package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᤞᲇᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0464 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2050;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f2051;

    public /* synthetic */ C0464(int i, Object obj) {
        this.f2050 = i;
        this.f2051 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᤞᛸᲈᤝ] */
    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        int i = this.f2050;
        ?? r1 = this.f2051;
        Integer num = (Integer) obj;
        switch (i) {
            case 0:
                num.getClass();
                int i2 = AbstractC1745.f5844;
                C1973 c1973M3492 = AbstractC0968.m2484(r1).m3492();
                c1973M3492.f6370 = "onTabClick";
                ((C1982) AbstractC0744.m2191(c1973M3492.m3799())).m3831(num);
                return C3497.f10997;
            default:
                int iIntValue = num.intValue();
                return r1.mo3474(iIntValue) + ": " + r1.mo3476(iIntValue).mo1342();
        }
    }
}
