package p000;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1561 extends XC_MethodHook {

    public final /* synthetic */ AbstractC0567 f5433;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1561(AbstractC0567 abstractC0567, int i) {
        super(i);
        this.f5433 = abstractC0567;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (methodHookParam == null) {
            return;
        }
        this.f5433.mo1332(C1133.m2704(methodHookParam));
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (methodHookParam == null) {
            return;
        }
        C1676 c1676M2704 = C1133.m2704(methodHookParam);
        AbstractC0567 abstractC0567 = this.f5433;
        if (!(abstractC0567 instanceof C0248)) {
            abstractC0567.mo1333(c1676M2704);
        } else {
            ((C1560) c1676M2704.f5659).mo1196(((C0248) abstractC0567).m1335(c1676M2704), Boolean.TRUE);
        }
    }
}
