package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴ能不能ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC3627feyxiexzfUjhhgtg implements Callable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f11336Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ String f11337Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ Context f11338Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f11339Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f11340Ujhhgtgfeyxiexzf;

    public /* synthetic */ CallableC3627feyxiexzfUjhhgtg(String str, Context context, Object obj, int i, int i2) {
        this.f11336Ujhhgtgfeyxiexzf = i2;
        this.f11337Ujhhgtgfeyxiexzf = str;
        this.f11338Ujhhgtgfeyxiexzf = context;
        this.f11340Ujhhgtgfeyxiexzf = obj;
        this.f11339Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f11336Ujhhgtgfeyxiexzf) {
            case 0:
                Object[] objArr = {(C3624feyxiexzfUjhhgtg) this.f11340Ujhhgtgfeyxiexzf};
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(objArr[0]);
                return AbstractC3630feyxiexzfUjhhgtg.m5270Ujhhgtgfeyxiexzf(this.f11337Ujhhgtgfeyxiexzf, this.f11338Ujhhgtgfeyxiexzf, Collections.unmodifiableList(arrayList), this.f11339Ujhhgtgfeyxiexzf);
            default:
                try {
                    return AbstractC3630feyxiexzfUjhhgtg.m5270Ujhhgtgfeyxiexzf(this.f11337Ujhhgtgfeyxiexzf, this.f11338Ujhhgtgfeyxiexzf, (ArrayList) this.f11340Ujhhgtgfeyxiexzf, this.f11339Ujhhgtgfeyxiexzf);
                } catch (Throwable unused) {
                    return new C3629Ujhhgtgfeyxiexzf(-3);
                }
        }
    }
}
