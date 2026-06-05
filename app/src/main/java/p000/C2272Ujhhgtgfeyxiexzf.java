package p000;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛲ要点脸ᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2272Ujhhgtgfeyxiexzf extends C2271feyxiexzfUjhhgtg {
    public C2272Ujhhgtgfeyxiexzf(C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg, WindowInsets windowInsets) {
        super(c2256feyxiexzfUjhhgtg, windowInsets);
    }

    @Override // p000.AbstractC2270feyxiexzfUjhhgtg, p000.C2252Ujhhgtgfeyxiexzf
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2272Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C2272Ujhhgtgfeyxiexzf c2272Ujhhgtgfeyxiexzf = (C2272Ujhhgtgfeyxiexzf) obj;
        return Objects.equals(this.f7440Ujhhgtgfeyxiexzf, c2272Ujhhgtgfeyxiexzf.f7440Ujhhgtgfeyxiexzf) && Objects.equals(this.f7444Ujhhgtgfeyxiexzf, c2272Ujhhgtgfeyxiexzf.f7444Ujhhgtgfeyxiexzf) && AbstractC2270feyxiexzfUjhhgtg.m3468feyxiexzfUjhhgtg(this.f7445Ujhhgtgfeyxiexzf, c2272Ujhhgtgfeyxiexzf.f7445Ujhhgtgfeyxiexzf);
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    public int hashCode() {
        return this.f7440Ujhhgtgfeyxiexzf.hashCode();
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public C2256feyxiexzfUjhhgtg mo3426Ujhhgtgfeyxiexzf() {
        return C2256feyxiexzfUjhhgtg.m3450Ujhhgtgfeyxiexzf(null, this.f7440Ujhhgtgfeyxiexzf.consumeDisplayCutout());
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public C3224feyxiexzfUjhhgtg mo3432Ujhhgtgfeyxiexzf() {
        DisplayCutout displayCutout = this.f7440Ujhhgtgfeyxiexzf.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C3224feyxiexzfUjhhgtg(displayCutout);
    }
}
