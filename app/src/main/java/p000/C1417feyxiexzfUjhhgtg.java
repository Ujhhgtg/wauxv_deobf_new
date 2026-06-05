package p000;

import de.robv.android.xposed.XC_MethodHook;
import java.util.function.Consumer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛳᛲᛱUjhhgtgᛱ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1417feyxiexzfUjhhgtg extends XC_MethodHook {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4979Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f4980Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1417feyxiexzfUjhhgtg(Consumer consumer, int i) {
        this.f4979Ujhhgtgfeyxiexzf = i;
        this.f4980Ujhhgtgfeyxiexzf = consumer;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f4979Ujhhgtgfeyxiexzf) {
            case 0:
                ((Consumer) this.f4980Ujhhgtgfeyxiexzf).accept(methodHookParam);
                break;
            case 1:
            default:
                super.afterHookedMethod(methodHookParam);
                break;
            case 2:
                if (methodHookParam != null) {
                    ((AbstractC0699Ujhhgtgfeyxiexzf) this.f4980Ujhhgtgfeyxiexzf).mo1984Ujhhgtgfeyxiexzf(C3382feyxiexzfUjhhgtg.m4885Ujhhgtgfeyxiexzf(methodHookParam));
                    break;
                }
                break;
        }
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f4979Ujhhgtgfeyxiexzf) {
            case 1:
                ((Consumer) this.f4980Ujhhgtgfeyxiexzf).accept(methodHookParam);
                break;
            case 2:
                if (methodHookParam != null) {
                    AbstractC0699Ujhhgtgfeyxiexzf abstractC0699Ujhhgtgfeyxiexzf = (AbstractC0699Ujhhgtgfeyxiexzf) this.f4980Ujhhgtgfeyxiexzf;
                    C0210Ujhhgtgfeyxiexzf c0210UjhhgtgfeyxiexzfM4885Ujhhgtgfeyxiexzf = C3382feyxiexzfUjhhgtg.m4885Ujhhgtgfeyxiexzf(methodHookParam);
                    if (!(abstractC0699Ujhhgtgfeyxiexzf instanceof C2376Ujhhgtgfeyxiexzf)) {
                        abstractC0699Ujhhgtgfeyxiexzf.mo1985Ujhhgtgfeyxiexzf(c0210UjhhgtgfeyxiexzfM4885Ujhhgtgfeyxiexzf);
                    } else {
                        ((C0581Ujhhgtgfeyxiexzf) c0210UjhhgtgfeyxiexzfM4885Ujhhgtgfeyxiexzf.f1473Ujhhgtgfeyxiexzf).mo1179Ujhhgtgfeyxiexzf(((C2376Ujhhgtgfeyxiexzf) abstractC0699Ujhhgtgfeyxiexzf).m3620Ujhhgtgfeyxiexzf(c0210UjhhgtgfeyxiexzfM4885Ujhhgtgfeyxiexzf), Boolean.TRUE);
                    }
                    break;
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417feyxiexzfUjhhgtg(AbstractC0699Ujhhgtgfeyxiexzf abstractC0699Ujhhgtgfeyxiexzf, int i) {
        super(i);
        this.f4979Ujhhgtgfeyxiexzf = 2;
        this.f4980Ujhhgtgfeyxiexzf = abstractC0699Ujhhgtgfeyxiexzf;
    }
}
