package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ要点脸ᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2513feyxiexzfUjhhgtg implements InterfaceC0891feyxiexzfUjhhgtg, InterfaceC0288Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8202Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Resources f8203Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2513feyxiexzfUjhhgtg(Resources resources, int i) {
        this.f8202Ujhhgtgfeyxiexzf = i;
        this.f8203Ujhhgtgfeyxiexzf = resources;
    }

    @Override // p000.InterfaceC0891feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public InterfaceC0901feyxiexzfUjhhgtg mo2369Ujhhgtgfeyxiexzf(InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtg, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        if (interfaceC0901feyxiexzfUjhhgtg == null) {
            return null;
        }
        return new C2511feyxiexzfUjhhgtg(this.f8203Ujhhgtgfeyxiexzf, interfaceC0901feyxiexzfUjhhgtg);
    }

    @Override // p000.InterfaceC0288Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ */
    public InterfaceC0285Ujhhgtgfeyxiexzf mo1497Ujhhgtgfeyxiexzf(C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf) {
        switch (this.f8202Ujhhgtgfeyxiexzf) {
            case 1:
                return new C2395Ujhhgtgfeyxiexzf(this.f8203Ujhhgtgfeyxiexzf, c0416Ujhhgtgfeyxiexzf.m1713Ujhhgtgfeyxiexzf(Uri.class, AssetFileDescriptor.class));
            case 2:
                return new C2395Ujhhgtgfeyxiexzf(this.f8203Ujhhgtgfeyxiexzf, c0416Ujhhgtgfeyxiexzf.m1713Ujhhgtgfeyxiexzf(Uri.class, InputStream.class));
            default:
                return new C2395Ujhhgtgfeyxiexzf(this.f8203Ujhhgtgfeyxiexzf, C1939Ujhhgtgfeyxiexzf.f6413Ujhhgtgfeyxiexzf);
        }
    }
}
