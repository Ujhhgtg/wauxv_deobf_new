package p000;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴ要点脸能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0893feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Resources f3439Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Resources.Theme f3440Ujhhgtgfeyxiexzf;

    public C0893feyxiexzfUjhhgtg(Resources resources, Resources.Theme theme) {
        this.f3439Ujhhgtgfeyxiexzf = resources;
        this.f3440Ujhhgtgfeyxiexzf = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0893feyxiexzfUjhhgtg.class == obj.getClass()) {
            C0893feyxiexzfUjhhgtg c0893feyxiexzfUjhhgtg = (C0893feyxiexzfUjhhgtg) obj;
            if (this.f3439Ujhhgtgfeyxiexzf.equals(c0893feyxiexzfUjhhgtg.f3439Ujhhgtgfeyxiexzf) && Objects.equals(this.f3440Ujhhgtgfeyxiexzf, c0893feyxiexzfUjhhgtg.f3440Ujhhgtgfeyxiexzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3439Ujhhgtgfeyxiexzf, this.f3440Ujhhgtgfeyxiexzf);
    }
}
