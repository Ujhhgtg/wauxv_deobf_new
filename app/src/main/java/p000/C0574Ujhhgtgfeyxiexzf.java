package p000;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛳᛱfeyxiexzfᛱᛴ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0574Ujhhgtgfeyxiexzf implements InterfaceC3545feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f2591Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ XC_MethodHook.Unhook f2592Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0574Ujhhgtgfeyxiexzf(XC_MethodHook.Unhook unhook, int i) {
        this.f2591Ujhhgtgfeyxiexzf = i;
        this.f2592Ujhhgtgfeyxiexzf = unhook;
    }

    @Override // p000.InterfaceC3545feyxiexzfUjhhgtg
    public final Object invoke() {
        switch (this.f2591Ujhhgtgfeyxiexzf) {
            case 0:
                return this.f2592Ujhhgtgfeyxiexzf.getHookedMethod();
            default:
                this.f2592Ujhhgtgfeyxiexzf.unhook();
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        }
    }
}
