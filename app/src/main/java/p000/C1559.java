package p000;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1559 implements InterfaceC1414 {

    public final /* synthetic */ int f5429;

    public final /* synthetic */ XC_MethodHook.MethodHookParam f5430;

    public /* synthetic */ C1559(XC_MethodHook.MethodHookParam methodHookParam, int i) {
        this.f5429 = i;
        this.f5430 = methodHookParam;
    }

    @Override // p000.InterfaceC1414
    public final Object invoke() {
        switch (this.f5429) {
            case 0:
                return this.f5430.method;
            case 1:
                return this.f5430.thisObject;
            default:
                return this.f5430.args;
        }
    }
}
