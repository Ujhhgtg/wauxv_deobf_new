package p000;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1558 implements InterfaceC1414 {

    public final /* synthetic */ int f5427;

    public final /* synthetic */ XC_MethodHook.Unhook f5428;

    public /* synthetic */ C1558(XC_MethodHook.Unhook unhook, int i) {
        this.f5427 = i;
        this.f5428 = unhook;
    }

    @Override // p000.InterfaceC1414
    public final Object invoke() {
        switch (this.f5427) {
            case 0:
                return this.f5428.getHookedMethod();
            default:
                this.f5428.unhook();
                return Unit.INSTANCE;
        }
    }
}
