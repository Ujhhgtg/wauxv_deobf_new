package p000;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱ能不能要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0214Ujhhgtgfeyxiexzf implements InterfaceC0285Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1476Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Context f1477Ujhhgtgfeyxiexzf;

    public C0214Ujhhgtgfeyxiexzf(Context context, int i) {
        this.f1476Ujhhgtgfeyxiexzf = i;
        switch (i) {
            case 1:
                this.f1477Ujhhgtgfeyxiexzf = context.getApplicationContext();
                break;
            case 2:
                this.f1477Ujhhgtgfeyxiexzf = context.getApplicationContext();
                break;
            default:
                this.f1477Ujhhgtgfeyxiexzf = context;
                break;
        }
    }

    @Override // p000.InterfaceC0285Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final boolean mo1303Ujhhgtgfeyxiexzf(Object obj) {
        switch (this.f1476Ujhhgtgfeyxiexzf) {
            case 0:
                return AbstractC3593Ujhhgtgfeyxiexzf.m5161feyxiexzfUjhhgtg((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return AbstractC3593Ujhhgtgfeyxiexzf.m5161feyxiexzfUjhhgtg(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return AbstractC3593Ujhhgtgfeyxiexzf.m5161feyxiexzfUjhhgtg(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // p000.InterfaceC0285Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C0286Ujhhgtgfeyxiexzf mo1304Ujhhgtgfeyxiexzf(Object obj, int i, int i2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        Long l;
        switch (this.f1476Ujhhgtgfeyxiexzf) {
            case 0:
                Uri uri = (Uri) obj;
                return new C0286Ujhhgtgfeyxiexzf(new C1308feyxiexzfUjhhgtg(uri), new C0231Ujhhgtgfeyxiexzf(this.f1477Ujhhgtgfeyxiexzf, 0, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                C1308feyxiexzfUjhhgtg c1308feyxiexzfUjhhgtg = new C1308feyxiexzfUjhhgtg(uri2);
                Context context = this.f1477Ujhhgtgfeyxiexzf;
                return new C0286Ujhhgtgfeyxiexzf(c1308feyxiexzfUjhhgtg, C3108Ujhhgtgfeyxiexzf.m4633Ujhhgtgfeyxiexzf(context, uri2, new C1989feyxiexzfUjhhgtg(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(C1875feyxiexzfUjhhgtg.f6252Ujhhgtgfeyxiexzf)) == null || l.longValue() != -1) {
                    return null;
                }
                C1308feyxiexzfUjhhgtg c1308feyxiexzfUjhhgtg2 = new C1308feyxiexzfUjhhgtg(uri3);
                Context context2 = this.f1477Ujhhgtgfeyxiexzf;
                return new C0286Ujhhgtgfeyxiexzf(c1308feyxiexzfUjhhgtg2, C3108Ujhhgtgfeyxiexzf.m4633Ujhhgtgfeyxiexzf(context2, uri3, new C1989feyxiexzfUjhhgtg(context2.getContentResolver(), 1)));
        }
    }
}
