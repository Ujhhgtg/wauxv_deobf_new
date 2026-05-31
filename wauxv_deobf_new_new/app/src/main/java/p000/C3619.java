package p000;

import android.content.Context;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲀᤝᲇᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3619 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ C0373 f11314;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ boolean f11315;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C3618 f11316;

    public /* synthetic */ C3619(C0373 c0373, boolean z, C3618 c3618) {
        this.f11314 = c0373;
        this.f11315 = z;
        this.f11316 = c3618;
    }

    @Override // p000.InterfaceC1422
    public final Object invoke() {
        String[] strArr = AbstractC1471.f5234;
        AbstractC2927 abstractC2927 = this.f11314.f1866;
        String str = abstractC2927.f9355;
        C0519 c0519 = AbstractC2902.f9278;
        if (c0519 == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        SharedPreferencesC1271 sharedPreferencesC1271M1985 = c0519.m1985();
        boolean z = this.f11315;
        sharedPreferencesC1271M1985.putBoolean(str, z);
        if (z && !abstractC2927.f5457) {
            abstractC2927.mo3442();
        }
        if (abstractC2927.mo1277()) {
            Context context = ((C1694) this.f11316.f11313).f5700.getContext();
            StringBuilder sb = new StringBuilder();
            sb.append("重启 ");
            C1576.f5470.getClass();
            sb.append((String) C1576.f5477.m1232(C1576.f5471[5]));
            sb.append(" 生效");
            AbstractC1467.m3288(context, 6, sb.toString());
        }
        return C3554.UNIT;
    }
}
