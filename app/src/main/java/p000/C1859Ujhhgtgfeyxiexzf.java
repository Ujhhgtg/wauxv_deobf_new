package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛱUjhhgtgᛱ能不能要点脸ᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1859Ujhhgtgfeyxiexzf implements InterfaceC0285Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final Set f6237Ujhhgtgfeyxiexzf = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Object f6238Ujhhgtgfeyxiexzf;

    public C1859Ujhhgtgfeyxiexzf(C1858Ujhhgtgfeyxiexzf c1858Ujhhgtgfeyxiexzf) {
        this.f6238Ujhhgtgfeyxiexzf = c1858Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0285Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final boolean mo1303Ujhhgtgfeyxiexzf(Object obj) {
        return f6237Ujhhgtgfeyxiexzf.contains(((Uri) obj).getScheme());
    }

    @Override // p000.InterfaceC0285Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final C0286Ujhhgtgfeyxiexzf mo1304Ujhhgtgfeyxiexzf(Object obj, int i, int i2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        InterfaceC3078Ujhhgtgfeyxiexzf c2400Ujhhgtgfeyxiexzf;
        Uri uri = (Uri) obj;
        C1308feyxiexzfUjhhgtg c1308feyxiexzfUjhhgtg = new C1308feyxiexzfUjhhgtg(uri);
        C1858Ujhhgtgfeyxiexzf c1858Ujhhgtgfeyxiexzf = (C1858Ujhhgtgfeyxiexzf) this.f6238Ujhhgtgfeyxiexzf;
        switch (c1858Ujhhgtgfeyxiexzf.f6234Ujhhgtgfeyxiexzf) {
            case 0:
                c2400Ujhhgtgfeyxiexzf = new C2400Ujhhgtgfeyxiexzf(c1858Ujhhgtgfeyxiexzf.f6235Ujhhgtgfeyxiexzf, uri, c1858Ujhhgtgfeyxiexzf.f6236Ujhhgtgfeyxiexzf, 0);
                break;
            case 1:
                c2400Ujhhgtgfeyxiexzf = new C2400Ujhhgtgfeyxiexzf(c1858Ujhhgtgfeyxiexzf.f6235Ujhhgtgfeyxiexzf, uri, c1858Ujhhgtgfeyxiexzf.f6236Ujhhgtgfeyxiexzf, 1);
                break;
            default:
                c2400Ujhhgtgfeyxiexzf = new C1165feyxiexzfUjhhgtg(c1858Ujhhgtgfeyxiexzf.f6235Ujhhgtgfeyxiexzf, uri, c1858Ujhhgtgfeyxiexzf.f6236Ujhhgtgfeyxiexzf);
                break;
        }
        return new C0286Ujhhgtgfeyxiexzf(c1308feyxiexzfUjhhgtg, c2400Ujhhgtgfeyxiexzf);
    }
}
