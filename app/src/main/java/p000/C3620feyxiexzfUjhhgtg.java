package p000;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3620feyxiexzfUjhhgtg implements Comparator {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Rect f11311Ujhhgtgfeyxiexzf = new Rect();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Rect f11312Ujhhgtgfeyxiexzf = new Rect();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final boolean f11313Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C3339feyxiexzfUjhhgtg f11314Ujhhgtgfeyxiexzf;

    public C3620feyxiexzfUjhhgtg(boolean z, C3339feyxiexzfUjhhgtg c3339feyxiexzfUjhhgtg) {
        this.f11313Ujhhgtgfeyxiexzf = z;
        this.f11314Ujhhgtgfeyxiexzf = c3339feyxiexzfUjhhgtg;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f11314Ujhhgtgfeyxiexzf.getClass();
        Rect rect = this.f11311Ujhhgtgfeyxiexzf;
        ((C2963feyxiexzfUjhhgtg) obj).m4436Ujhhgtgfeyxiexzf(rect);
        Rect rect2 = this.f11312Ujhhgtgfeyxiexzf;
        ((C2963feyxiexzfUjhhgtg) obj2).m4436Ujhhgtgfeyxiexzf(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.f11313Ujhhgtgfeyxiexzf;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
