package p000;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛳᛱfeyxiexzfᛱᛴᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0573Ujhhgtgfeyxiexzf implements InterfaceC3545feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f2589Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ XC_MethodHook.MethodHookParam f2590Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0573Ujhhgtgfeyxiexzf(XC_MethodHook.MethodHookParam methodHookParam, int i) {
        this.f2589Ujhhgtgfeyxiexzf = i;
        this.f2590Ujhhgtgfeyxiexzf = methodHookParam;
    }

    @Override // p000.InterfaceC3545feyxiexzfUjhhgtg
    public final Object invoke() {
        switch (this.f2589Ujhhgtgfeyxiexzf) {
            case 0:
                return this.f2590Ujhhgtgfeyxiexzf.method;
            case 1:
                return this.f2590Ujhhgtgfeyxiexzf.thisObject;
            default:
                return this.f2590Ujhhgtgfeyxiexzf.args;
        }
    }
}
