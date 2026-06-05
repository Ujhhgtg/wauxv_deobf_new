package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲ能不能要点脸ᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0778feyxiexzfUjhhgtg implements InterfaceC0285Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Context f3077Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final InterfaceC0285Ujhhgtgfeyxiexzf f3078Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final InterfaceC0285Ujhhgtgfeyxiexzf f3079Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Class f3080Ujhhgtgfeyxiexzf;

    public C0778feyxiexzfUjhhgtg(Context context, InterfaceC0285Ujhhgtgfeyxiexzf interfaceC0285Ujhhgtgfeyxiexzf, InterfaceC0285Ujhhgtgfeyxiexzf interfaceC0285Ujhhgtgfeyxiexzf2, Class cls) {
        this.f3077Ujhhgtgfeyxiexzf = context.getApplicationContext();
        this.f3078Ujhhgtgfeyxiexzf = interfaceC0285Ujhhgtgfeyxiexzf;
        this.f3079Ujhhgtgfeyxiexzf = interfaceC0285Ujhhgtgfeyxiexzf2;
        this.f3080Ujhhgtgfeyxiexzf = cls;
    }

    @Override // p000.InterfaceC0285Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final boolean mo1303Ujhhgtgfeyxiexzf(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC3593Ujhhgtgfeyxiexzf.m5161feyxiexzfUjhhgtg((Uri) obj);
    }

    @Override // p000.InterfaceC0285Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final C0286Ujhhgtgfeyxiexzf mo1304Ujhhgtgfeyxiexzf(Object obj, int i, int i2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        Uri uri = (Uri) obj;
        return new C0286Ujhhgtgfeyxiexzf(new C1308feyxiexzfUjhhgtg(uri), new C0872feyxiexzfUjhhgtg(this.f3077Ujhhgtgfeyxiexzf, this.f3078Ujhhgtgfeyxiexzf, this.f3079Ujhhgtgfeyxiexzf, uri, i, i2, c1471feyxiexzfUjhhgtg, this.f3080Ujhhgtgfeyxiexzf));
    }
}
