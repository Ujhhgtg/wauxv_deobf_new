package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛴ要点脸ᛳᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2532feyxiexzfUjhhgtg implements InterfaceC0902feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8249Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object f8250Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object f8251Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2532feyxiexzfUjhhgtg(Object obj, int i, Object obj2) {
        this.f8249Ujhhgtgfeyxiexzf = i;
        this.f8250Ujhhgtgfeyxiexzf = obj;
        this.f8251Ujhhgtgfeyxiexzf = obj2;
    }

    @Override // p000.InterfaceC0902feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final boolean mo2362Ujhhgtgfeyxiexzf(Object obj, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        switch (this.f8249Ujhhgtgfeyxiexzf) {
            case 0:
                return ((InterfaceC0902feyxiexzfUjhhgtg) this.f8250Ujhhgtgfeyxiexzf).mo2362Ujhhgtgfeyxiexzf(obj, c1471feyxiexzfUjhhgtg);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                return true;
        }
    }

    @Override // p000.InterfaceC0902feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final InterfaceC0901feyxiexzfUjhhgtg mo2363Ujhhgtgfeyxiexzf(Object obj, int i, int i2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        boolean z;
        C0790feyxiexzfUjhhgtg c0790feyxiexzfUjhhgtg;
        C3356feyxiexzfUjhhgtg c3356feyxiexzfUjhhgtg;
        switch (this.f8249Ujhhgtgfeyxiexzf) {
            case 0:
                InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtgMo2363Ujhhgtgfeyxiexzf = ((InterfaceC0902feyxiexzfUjhhgtg) this.f8250Ujhhgtgfeyxiexzf).mo2363Ujhhgtgfeyxiexzf(obj, i, i2, c1471feyxiexzfUjhhgtg);
                Resources resources = (Resources) this.f8251Ujhhgtgfeyxiexzf;
                if (interfaceC0901feyxiexzfUjhhgtgMo2363Ujhhgtgfeyxiexzf == null) {
                    return null;
                }
                return new C2511feyxiexzfUjhhgtg(resources, interfaceC0901feyxiexzfUjhhgtgMo2363Ujhhgtgfeyxiexzf);
            case 1:
                InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtgM2364Ujhhgtgfeyxiexzf = ((C0884feyxiexzfUjhhgtg) this.f8250Ujhhgtgfeyxiexzf).m2364Ujhhgtgfeyxiexzf((Uri) obj, c1471feyxiexzfUjhhgtg);
                if (interfaceC0901feyxiexzfUjhhgtgM2364Ujhhgtgfeyxiexzf == null) {
                    return null;
                }
                return AbstractC1265feyxiexzfUjhhgtg.m2822Ujhhgtgfeyxiexzf((InterfaceC2512feyxiexzfUjhhgtg) this.f8251Ujhhgtgfeyxiexzf, (Drawable) ((C3574feyxiexzfUjhhgtg) interfaceC0901feyxiexzfUjhhgtgM2364Ujhhgtgfeyxiexzf).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof C0790feyxiexzfUjhhgtg) {
                    c0790feyxiexzfUjhhgtg = (C0790feyxiexzfUjhhgtg) inputStream;
                    z = false;
                } else {
                    z = true;
                    c0790feyxiexzfUjhhgtg = new C0790feyxiexzfUjhhgtg(inputStream, (C0271Ujhhgtgfeyxiexzf) this.f8251Ujhhgtgfeyxiexzf);
                }
                ArrayDeque arrayDeque = C3356feyxiexzfUjhhgtg.f10473Ujhhgtgfeyxiexzf;
                synchronized (arrayDeque) {
                    c3356feyxiexzfUjhhgtg = (C3356feyxiexzfUjhhgtg) arrayDeque.poll();
                    break;
                }
                if (c3356feyxiexzfUjhhgtg == null) {
                    c3356feyxiexzfUjhhgtg = new C3356feyxiexzfUjhhgtg();
                }
                C3356feyxiexzfUjhhgtg c3356feyxiexzfUjhhgtg2 = c3356feyxiexzfUjhhgtg;
                c3356feyxiexzfUjhhgtg2.f10474Ujhhgtgfeyxiexzf = c0790feyxiexzfUjhhgtg;
                C0201Ujhhgtgfeyxiexzf c0201Ujhhgtgfeyxiexzf = new C0201Ujhhgtgfeyxiexzf(c3356feyxiexzfUjhhgtg2);
                C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(c0790feyxiexzfUjhhgtg, 29, c3356feyxiexzfUjhhgtg2);
                try {
                    C3220feyxiexzfUjhhgtg c3220feyxiexzfUjhhgtg = (C3220feyxiexzfUjhhgtg) this.f8250Ujhhgtgfeyxiexzf;
                    C2511feyxiexzfUjhhgtg c2511feyxiexzfUjhhgtgM4719Ujhhgtgfeyxiexzf = c3220feyxiexzfUjhhgtg.m4719Ujhhgtgfeyxiexzf(new C2366Ujhhgtgfeyxiexzf(c0201Ujhhgtgfeyxiexzf, c3220feyxiexzfUjhhgtg.f10121Ujhhgtgfeyxiexzf, c3220feyxiexzfUjhhgtg.f10120Ujhhgtgfeyxiexzf), i, i2, c1471feyxiexzfUjhhgtg, c2629Ujhhgtgfeyxiexzf);
                    c3356feyxiexzfUjhhgtg2.f10475Ujhhgtgfeyxiexzf = null;
                    c3356feyxiexzfUjhhgtg2.f10474Ujhhgtgfeyxiexzf = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(c3356feyxiexzfUjhhgtg2);
                        break;
                    }
                    return c2511feyxiexzfUjhhgtgM4719Ujhhgtgfeyxiexzf;
                } finally {
                    c3356feyxiexzfUjhhgtg2.f10475Ujhhgtgfeyxiexzf = null;
                    c3356feyxiexzfUjhhgtg2.f10474Ujhhgtgfeyxiexzf = null;
                    ArrayDeque arrayDeque2 = C3356feyxiexzfUjhhgtg.f10473Ujhhgtgfeyxiexzf;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(c3356feyxiexzfUjhhgtg2);
                        if (z) {
                            c0790feyxiexzfUjhhgtg.m2123Ujhhgtgfeyxiexzf();
                        }
                    }
                }
        }
    }

    public C2532feyxiexzfUjhhgtg(Resources resources, InterfaceC0902feyxiexzfUjhhgtg interfaceC0902feyxiexzfUjhhgtg) {
        this.f8249Ujhhgtgfeyxiexzf = 0;
        this.f8251Ujhhgtgfeyxiexzf = resources;
        this.f8250Ujhhgtgfeyxiexzf = interfaceC0902feyxiexzfUjhhgtg;
    }
}
