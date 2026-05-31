package p000;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᤝᲈᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1570 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5458;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ XC_MethodHook.Unhook f5459;

    public /* synthetic */ C1570(XC_MethodHook.Unhook unhook, int i) {
        this.f5458 = i;
        this.f5459 = unhook;
    }

    @Override // p000.InterfaceC1422
    public final Object invoke() {
        switch (this.f5458) {
            case 0:
                return this.f5459.getHookedMethod();
            default:
                this.f5459.unhook();
                return C3554.UNIT;
        }
    }
}
