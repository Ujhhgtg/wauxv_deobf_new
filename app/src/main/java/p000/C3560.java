package p000;

import android.content.Context;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3560 implements InterfaceC1414 {

    public final /* synthetic */ C0398 f11165;

    public final /* synthetic */ boolean f11166;

    public final /* synthetic */ C3559 f11167;

    public /* synthetic */ C3560(C0398 c0398, boolean z, C3559 c3559) {
        this.f11165 = c0398;
        this.f11166 = z;
        this.f11167 = c3559;
    }

    @Override // p000.InterfaceC1414
    public final Object invoke() {
        String[] strArr = AbstractC1574.f5469;
        AbstractC2867 abstractC2867 = this.f11165.f1895;
        String str = abstractC2867.f9185;
        C0542 c0542 = AbstractC1458.f5192;
        if (c0542 == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        SharedPreferencesC1269 sharedPreferencesC1269M1891 = c0542.m1891();
        boolean z = this.f11166;
        sharedPreferencesC1269M1891.putBoolean(str, z);
        if (z && !abstractC2867.f5426) {
            abstractC2867.mo3261();
        }
        if (abstractC2867.mo1131()) {
            Context context = ((LinearLayout) ((C2103) this.f11167.f11164).f6935).getContext();
            StringBuilder sb = new StringBuilder();
            sb.append("重启 ");
            
            sb.append((String) C1565.f5447.m1086(C1565.f5441[5]));
            sb.append(" 生效");
            AbstractC3681.m5338(context, 6, sb.toString());
        }
        return Unit.INSTANCE;
    }
}
