package p000;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import java.util.function.Function;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛳᛲᛱUjhhgtgᛱᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1416feyxiexzfUjhhgtg extends XC_MethodReplacement {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ Function f4978Ujhhgtgfeyxiexzf;

    public C1416feyxiexzfUjhhgtg(Function function) {
        this.f4978Ujhhgtgfeyxiexzf = function;
    }

    public final Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        return this.f4978Ujhhgtgfeyxiexzf.apply(methodHookParam);
    }
}
