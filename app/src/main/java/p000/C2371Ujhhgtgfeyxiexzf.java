package p000;

import android.app.Application;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2371Ujhhgtgfeyxiexzf extends AbstractC0699Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ String f7721Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2371Ujhhgtgfeyxiexzf(C2374Ujhhgtgfeyxiexzf c2374Ujhhgtgfeyxiexzf, String str) {
        super(1);
        this.f7721Ujhhgtgfeyxiexzf = str;
    }

    @Override // p000.AbstractC0699Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1984Ujhhgtgfeyxiexzf(C0210Ujhhgtgfeyxiexzf c0210Ujhhgtgfeyxiexzf) {
        Object c0919feyxiexzfUjhhgtg;
        try {
            Object[] objArrM1292Ujhhgtgfeyxiexzf = c0210Ujhhgtgfeyxiexzf.m1292Ujhhgtgfeyxiexzf();
            c0919feyxiexzfUjhhgtg = null;
            Object obj = objArrM1292Ujhhgtgfeyxiexzf != null ? objArrM1292Ujhhgtgfeyxiexzf[0] : null;
            Application application = obj instanceof Application ? (Application) obj : null;
            if (application != null) {
                Iterator it = C2374Ujhhgtgfeyxiexzf.f7728Ujhhgtgfeyxiexzf.entrySet().iterator();
                if (it.hasNext()) {
                    if (((Map.Entry) it.next()).getValue() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
                try {
                    if (C2374Ujhhgtgfeyxiexzf.f7727Ujhhgtgfeyxiexzf) {
                        return;
                    }
                    boolean zEquals = C2374Ujhhgtgfeyxiexzf.m3617Ujhhgtgfeyxiexzf().equals("android");
                    String str = this.f7721Ujhhgtgfeyxiexzf;
                    if (zEquals && !str.equals("android")) {
                        return;
                    }
                    C2277Ujhhgtgfeyxiexzf c2277Ujhhgtgfeyxiexzf = C2277Ujhhgtgfeyxiexzf.f7465Ujhhgtgfeyxiexzf;
                    if (c2277Ujhhgtgfeyxiexzf == null) {
                        c2277Ujhhgtgfeyxiexzf = new C2277Ujhhgtgfeyxiexzf();
                        C2277Ujhhgtgfeyxiexzf.f7465Ujhhgtgfeyxiexzf = c2277Ujhhgtgfeyxiexzf;
                    }
                    c2277Ujhhgtgfeyxiexzf.m3476Ujhhgtgfeyxiexzf(application, str);
                    C2374Ujhhgtgfeyxiexzf.f7727Ujhhgtgfeyxiexzf = true;
                } catch (Throwable unused) {
                }
                c0919feyxiexzfUjhhgtg = application;
            }
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        Throwable thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg);
        if (thM2409Ujhhgtgfeyxiexzf != null) {
            c0210Ujhhgtgfeyxiexzf.m1293Ujhhgtgfeyxiexzf(thM2409Ujhhgtgfeyxiexzf);
        }
    }
}
