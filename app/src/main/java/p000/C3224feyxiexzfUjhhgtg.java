package p000;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛳ能不能ᛱUjhhgtgᛱᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3224feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final DisplayCutout f10125Ujhhgtgfeyxiexzf;

    public C3224feyxiexzfUjhhgtg(DisplayCutout displayCutout) {
        this.f10125Ujhhgtgfeyxiexzf = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3224feyxiexzfUjhhgtg.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f10125Ujhhgtgfeyxiexzf, ((C3224feyxiexzfUjhhgtg) obj).f10125Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f10125Ujhhgtgfeyxiexzf.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f10125Ujhhgtgfeyxiexzf + "}";
    }
}
