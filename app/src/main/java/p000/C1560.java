package p000;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᤝᲀᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1560 implements InterfaceC1429 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5431;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ XC_MethodHook.MethodHookParam f5432;

    public /* synthetic */ C1560(XC_MethodHook.MethodHookParam methodHookParam, int i) {
        this.f5431 = i;
        this.f5432 = methodHookParam;
    }

    @Override // p000.InterfaceC1429
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1196(Object obj, Object obj2) {
        switch (this.f5431) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                XC_MethodHook.MethodHookParam methodHookParam = this.f5432;
                if (zBooleanValue) {
                    methodHookParam.setResult(obj);
                }
                return methodHookParam.getResult();
            default:
                Throwable th = (Throwable) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                XC_MethodHook.MethodHookParam methodHookParam2 = this.f5432;
                if (zBooleanValue2) {
                    methodHookParam2.setThrowable(th);
                }
                return methodHookParam2.getThrowable();
        }
    }
}
