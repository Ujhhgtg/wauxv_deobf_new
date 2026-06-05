package p000;

import android.util.TypedValue;
import java.util.Random;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳ能不能ᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3511Ujhhgtgfeyxiexzf extends ThreadLocal {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10925Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3511Ujhhgtgfeyxiexzf(int i) {
        this.f10925Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f10925Ujhhgtgfeyxiexzf) {
            case 0:
                return new Random();
            case 1:
                return new C0965feyxiexzfUjhhgtg();
            default:
                return new TypedValue();
        }
    }
}
