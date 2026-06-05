package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1147feyxiexzfUjhhgtg implements InterfaceC0285Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4337Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final InterfaceC0285Ujhhgtgfeyxiexzf f4338Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1147feyxiexzfUjhhgtg(InterfaceC0285Ujhhgtgfeyxiexzf interfaceC0285Ujhhgtgfeyxiexzf, int i) {
        this.f4337Ujhhgtgfeyxiexzf = i;
        this.f4338Ujhhgtgfeyxiexzf = interfaceC0285Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0285Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final /* bridge */ /* synthetic */ boolean mo1303Ujhhgtgfeyxiexzf(Object obj) {
        switch (this.f4337Ujhhgtgfeyxiexzf) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p000.InterfaceC0285Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final C0286Ujhhgtgfeyxiexzf mo1304Ujhhgtgfeyxiexzf(Object obj, int i, int i2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        Uri uriFromFile;
        switch (this.f4337Ujhhgtgfeyxiexzf) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null) {
                    return null;
                }
                InterfaceC0285Ujhhgtgfeyxiexzf interfaceC0285Ujhhgtgfeyxiexzf = this.f4338Ujhhgtgfeyxiexzf;
                if (interfaceC0285Ujhhgtgfeyxiexzf.mo1303Ujhhgtgfeyxiexzf(uriFromFile)) {
                    return interfaceC0285Ujhhgtgfeyxiexzf.mo1304Ujhhgtgfeyxiexzf(uriFromFile, i, i2, c1471feyxiexzfUjhhgtg);
                }
                return null;
            default:
                return this.f4338Ujhhgtgfeyxiexzf.mo1304Ujhhgtgfeyxiexzf(new C3598feyxiexzfUjhhgtg((URL) obj), i, i2, c1471feyxiexzfUjhhgtg);
        }
    }
}
