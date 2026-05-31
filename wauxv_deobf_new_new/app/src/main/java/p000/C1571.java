package p000;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᤝᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1571 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5460;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ XC_MethodHook.MethodHookParam f5461;

    public /* synthetic */ C1571(XC_MethodHook.MethodHookParam methodHookParam, int i) {
        this.f5460 = i;
        this.f5461 = methodHookParam;
    }

    @Override // p000.InterfaceC1422
    public final Object invoke() {
        switch (this.f5460) {
            case 0:
                return this.f5461.method;
            case 1:
                return this.f5461.thisObject;
            default:
                return this.f5461.args;
        }
    }
}
