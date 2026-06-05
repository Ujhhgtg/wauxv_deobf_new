package p000;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛳᛲ要点脸ᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0581Ujhhgtgfeyxiexzf implements InterfaceC3553feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f2612Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ XC_MethodHook.MethodHookParam f2613Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0581Ujhhgtgfeyxiexzf(XC_MethodHook.MethodHookParam methodHookParam, int i) {
        this.f2612Ujhhgtgfeyxiexzf = i;
        this.f2613Ujhhgtgfeyxiexzf = methodHookParam;
    }

    @Override // p000.InterfaceC3553feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final Object mo1179Ujhhgtgfeyxiexzf(Object obj, Object obj2) {
        switch (this.f2612Ujhhgtgfeyxiexzf) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                XC_MethodHook.MethodHookParam methodHookParam = this.f2613Ujhhgtgfeyxiexzf;
                if (zBooleanValue) {
                    methodHookParam.setResult(obj);
                }
                return methodHookParam.getResult();
            default:
                Throwable th = (Throwable) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                XC_MethodHook.MethodHookParam methodHookParam2 = this.f2613Ujhhgtgfeyxiexzf;
                if (zBooleanValue2) {
                    methodHookParam2.setThrowable(th);
                }
                return methodHookParam2.getThrowable();
        }
    }
}
