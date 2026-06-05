package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1854Ujhhgtgfeyxiexzf implements InterfaceC0285Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final Set f6226Ujhhgtgfeyxiexzf = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final InterfaceC0285Ujhhgtgfeyxiexzf f6227Ujhhgtgfeyxiexzf;

    public C1854Ujhhgtgfeyxiexzf(InterfaceC0285Ujhhgtgfeyxiexzf interfaceC0285Ujhhgtgfeyxiexzf) {
        this.f6227Ujhhgtgfeyxiexzf = interfaceC0285Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0285Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final boolean mo1303Ujhhgtgfeyxiexzf(Object obj) {
        return f6226Ujhhgtgfeyxiexzf.contains(((Uri) obj).getScheme());
    }

    @Override // p000.InterfaceC0285Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final C0286Ujhhgtgfeyxiexzf mo1304Ujhhgtgfeyxiexzf(Object obj, int i, int i2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        return this.f6227Ujhhgtgfeyxiexzf.mo1304Ujhhgtgfeyxiexzf(new C3598feyxiexzfUjhhgtg(((Uri) obj).toString()), i, i2, c1471feyxiexzfUjhhgtg);
    }
}
