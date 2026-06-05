package p000;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳ能不能ᛲᛱUjhhgtgᛱᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1080feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final InterfaceC1081feyxiexzfUjhhgtg f4157Ujhhgtgfeyxiexzf;

    public C1080feyxiexzfUjhhgtg(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f4157Ujhhgtgfeyxiexzf = new C1085feyxiexzfUjhhgtg(nestedScrollView);
        } else {
            this.f4157Ujhhgtgfeyxiexzf = new C0420Ujhhgtgfeyxiexzf(13);
        }
    }
}
