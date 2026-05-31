package p000;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲀᤝᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1572 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5462;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ XC_MethodHook.MethodHookParam f5463;

    public /* synthetic */ C1572(XC_MethodHook.MethodHookParam methodHookParam, int i) {
        this.f5462 = i;
        this.f5463 = methodHookParam;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) {
        switch (this.f5462) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                XC_MethodHook.MethodHookParam methodHookParam = this.f5463;
                if (zBooleanValue) {
                    methodHookParam.setResult(obj);
                }
                return methodHookParam.getResult();
            default:
                Throwable th = (Throwable) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                XC_MethodHook.MethodHookParam methodHookParam2 = this.f5463;
                if (zBooleanValue2) {
                    methodHookParam2.setThrowable(th);
                }
                return methodHookParam2.getThrowable();
        }
    }
}
