package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛳ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1910feyxiexzfUjhhgtg implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public C2256feyxiexzfUjhhgtg f6373Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ View f6374Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1319feyxiexzfUjhhgtg f6375Ujhhgtgfeyxiexzf;

    public ViewOnApplyWindowInsetsListenerC1910feyxiexzfUjhhgtg(View view, InterfaceC1319feyxiexzfUjhhgtg interfaceC1319feyxiexzfUjhhgtg) {
        this.f6374Ujhhgtgfeyxiexzf = view;
        this.f6375Ujhhgtgfeyxiexzf = interfaceC1319feyxiexzfUjhhgtg;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf = C2256feyxiexzfUjhhgtg.m3450Ujhhgtgfeyxiexzf(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC1319feyxiexzfUjhhgtg interfaceC1319feyxiexzfUjhhgtg = this.f6375Ujhhgtgfeyxiexzf;
        if (i < 30) {
            AbstractC1893Ujhhgtgfeyxiexzf.m3225Ujhhgtgfeyxiexzf(windowInsets, this.f6374Ujhhgtgfeyxiexzf);
            if (c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf.equals(this.f6373Ujhhgtgfeyxiexzf)) {
                return interfaceC1319feyxiexzfUjhhgtg.mo2853Ujhhgtgfeyxiexzf(view, c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf).m3453Ujhhgtgfeyxiexzf();
            }
        }
        this.f6373Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf;
        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtgMo2853Ujhhgtgfeyxiexzf = interfaceC1319feyxiexzfUjhhgtg.mo2853Ujhhgtgfeyxiexzf(view, c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf);
        if (i >= 30) {
            return c2256feyxiexzfUjhhgtgMo2853Ujhhgtgfeyxiexzf.m3453Ujhhgtgfeyxiexzf();
        }
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        view.requestApplyInsets();
        return c2256feyxiexzfUjhhgtgMo2853Ujhhgtgfeyxiexzf.m3453Ujhhgtgfeyxiexzf();
    }
}
