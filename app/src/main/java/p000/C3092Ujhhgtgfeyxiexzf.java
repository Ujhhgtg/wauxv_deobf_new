package p000;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3092Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Class f9587Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final List f9588Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final InterfaceC0891feyxiexzfUjhhgtg f9589Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final InterfaceC1445feyxiexzfUjhhgtg f9590Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final String f9591Ujhhgtgfeyxiexzf;

    public C3092Ujhhgtgfeyxiexzf(Class cls, Class cls2, Class cls3, List list, InterfaceC0891feyxiexzfUjhhgtg interfaceC0891feyxiexzfUjhhgtg, InterfaceC1445feyxiexzfUjhhgtg interfaceC1445feyxiexzfUjhhgtg) {
        this.f9587Ujhhgtgfeyxiexzf = cls;
        this.f9588Ujhhgtgfeyxiexzf = list;
        this.f9589Ujhhgtgfeyxiexzf = interfaceC0891feyxiexzfUjhhgtg;
        this.f9590Ujhhgtgfeyxiexzf = interfaceC1445feyxiexzfUjhhgtg;
        this.f9591Ujhhgtgfeyxiexzf = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f9587Ujhhgtgfeyxiexzf + ", decoders=" + this.f9588Ujhhgtgfeyxiexzf + ", transcoder=" + this.f9589Ujhhgtgfeyxiexzf + '}';
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final InterfaceC0901feyxiexzfUjhhgtg m4590Ujhhgtgfeyxiexzf(int i, int i2, C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg, InterfaceC3106Ujhhgtgfeyxiexzf interfaceC3106Ujhhgtgfeyxiexzf, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtgMo3060Ujhhgtgfeyxiexzf;
        InterfaceC1765feyxiexzfUjhhgtg interfaceC1765feyxiexzfUjhhgtg;
        int iMo2365Ujhhgtgfeyxiexzf;
        boolean z;
        boolean z2;
        boolean z3;
        Object c3069Ujhhgtgfeyxiexzf;
        String str;
        InterfaceC1445feyxiexzfUjhhgtg interfaceC1445feyxiexzfUjhhgtg = this.f9590Ujhhgtgfeyxiexzf;
        List list = (List) interfaceC1445feyxiexzfUjhhgtg.mo2933Ujhhgtgfeyxiexzf();
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(list, "Argument must not be null");
        try {
            InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtgM4591Ujhhgtgfeyxiexzf = m4591Ujhhgtgfeyxiexzf(interfaceC3106Ujhhgtgfeyxiexzf, i, i2, c1471feyxiexzfUjhhgtg, list);
            interfaceC1445feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(list);
            RunnableC3096Ujhhgtgfeyxiexzf runnableC3096Ujhhgtgfeyxiexzf = (RunnableC3096Ujhhgtgfeyxiexzf) c2501feyxiexzfUjhhgtg.f8171Ujhhgtgfeyxiexzf;
            int i3 = c2501feyxiexzfUjhhgtg.f8170Ujhhgtgfeyxiexzf;
            C3087Ujhhgtgfeyxiexzf c3087Ujhhgtgfeyxiexzf = runnableC3096Ujhhgtgfeyxiexzf.f9598Ujhhgtgfeyxiexzf;
            Class<?> cls = interfaceC0901feyxiexzfUjhhgtgM4591Ujhhgtgfeyxiexzf.get().getClass();
            InterfaceC0887feyxiexzfUjhhgtg interfaceC0887feyxiexzfUjhhgtgM4814Ujhhgtgfeyxiexzf = null;
            if (i3 != 4) {
                InterfaceC1765feyxiexzfUjhhgtg interfaceC1765feyxiexzfUjhhgtgM4578Ujhhgtgfeyxiexzf = c3087Ujhhgtgfeyxiexzf.m4578Ujhhgtgfeyxiexzf(cls);
                interfaceC1765feyxiexzfUjhhgtg = interfaceC1765feyxiexzfUjhhgtgM4578Ujhhgtgfeyxiexzf;
                interfaceC0901feyxiexzfUjhhgtgMo3060Ujhhgtgfeyxiexzf = interfaceC1765feyxiexzfUjhhgtgM4578Ujhhgtgfeyxiexzf.mo3060Ujhhgtgfeyxiexzf(runnableC3096Ujhhgtgfeyxiexzf.f9605Ujhhgtgfeyxiexzf, interfaceC0901feyxiexzfUjhhgtgM4591Ujhhgtgfeyxiexzf, runnableC3096Ujhhgtgfeyxiexzf.f9609Ujhhgtgfeyxiexzf, runnableC3096Ujhhgtgfeyxiexzf.f9610Ujhhgtgfeyxiexzf);
            } else {
                interfaceC0901feyxiexzfUjhhgtgMo3060Ujhhgtgfeyxiexzf = interfaceC0901feyxiexzfUjhhgtgM4591Ujhhgtgfeyxiexzf;
                interfaceC1765feyxiexzfUjhhgtg = null;
            }
            if (!interfaceC0901feyxiexzfUjhhgtgM4591Ujhhgtgfeyxiexzf.equals(interfaceC0901feyxiexzfUjhhgtgMo3060Ujhhgtgfeyxiexzf)) {
                interfaceC0901feyxiexzfUjhhgtgM4591Ujhhgtgfeyxiexzf.mo1444Ujhhgtgfeyxiexzf();
            }
            if (c3087Ujhhgtgfeyxiexzf.f9549Ujhhgtgfeyxiexzf.m5116Ujhhgtgfeyxiexzf().f3852Ujhhgtgfeyxiexzf.m4814Ujhhgtgfeyxiexzf(interfaceC0901feyxiexzfUjhhgtgMo3060Ujhhgtgfeyxiexzf.mo1446Ujhhgtgfeyxiexzf()) != null) {
                interfaceC0887feyxiexzfUjhhgtgM4814Ujhhgtgfeyxiexzf = c3087Ujhhgtgfeyxiexzf.f9549Ujhhgtgfeyxiexzf.m5116Ujhhgtgfeyxiexzf().f3852Ujhhgtgfeyxiexzf.m4814Ujhhgtgfeyxiexzf(interfaceC0901feyxiexzfUjhhgtgMo3060Ujhhgtgfeyxiexzf.mo1446Ujhhgtgfeyxiexzf());
                if (interfaceC0887feyxiexzfUjhhgtgM4814Ujhhgtgfeyxiexzf == null) {
                    throw new C0962feyxiexzfUjhhgtg(interfaceC0901feyxiexzfUjhhgtgMo3060Ujhhgtgfeyxiexzf.mo1446Ujhhgtgfeyxiexzf());
                }
                iMo2365Ujhhgtgfeyxiexzf = interfaceC0887feyxiexzfUjhhgtgM4814Ujhhgtgfeyxiexzf.mo2365Ujhhgtgfeyxiexzf(runnableC3096Ujhhgtgfeyxiexzf.f9612Ujhhgtgfeyxiexzf);
            } else {
                iMo2365Ujhhgtgfeyxiexzf = 3;
            }
            InterfaceC0887feyxiexzfUjhhgtg interfaceC0887feyxiexzfUjhhgtg = interfaceC0887feyxiexzfUjhhgtgM4814Ujhhgtgfeyxiexzf;
            InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf = runnableC3096Ujhhgtgfeyxiexzf.f9620feyxiexzfUjhhgtg;
            ArrayList arrayListM4575Ujhhgtgfeyxiexzf = c3087Ujhhgtgfeyxiexzf.m4575Ujhhgtgfeyxiexzf();
            int size = arrayListM4575Ujhhgtgfeyxiexzf.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                if (((C0286Ujhhgtgfeyxiexzf) arrayListM4575Ujhhgtgfeyxiexzf.get(i4)).f1717Ujhhgtgfeyxiexzf.equals(interfaceC0156Ujhhgtgfeyxiexzf)) {
                    z = true;
                    break;
                }
                i4++;
            }
            switch (runnableC3096Ujhhgtgfeyxiexzf.f9611Ujhhgtgfeyxiexzf.f9834Ujhhgtgfeyxiexzf) {
                default:
                    z2 = true;
                    if (((z || i3 != 3) && i3 != 1) || iMo2365Ujhhgtgfeyxiexzf != 2) {
                    }
                case 0:
                case 1:
                    z2 = false;
                    break;
            }
            if (z2) {
                if (interfaceC0887feyxiexzfUjhhgtg == null) {
                    throw new C0962feyxiexzfUjhhgtg(interfaceC0901feyxiexzfUjhhgtgMo3060Ujhhgtgfeyxiexzf.get().getClass());
                }
                int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(iMo2365Ujhhgtgfeyxiexzf);
                if (iM2713feyxiexzfUjhhgtg == 0) {
                    z3 = true;
                    c3069Ujhhgtgfeyxiexzf = new C3069Ujhhgtgfeyxiexzf(runnableC3096Ujhhgtgfeyxiexzf.f9620feyxiexzfUjhhgtg, runnableC3096Ujhhgtgfeyxiexzf.f9606Ujhhgtgfeyxiexzf);
                } else {
                    if (iM2713feyxiexzfUjhhgtg != 1) {
                        if (iMo2365Ujhhgtgfeyxiexzf == 1) {
                            str = "SOURCE";
                        } else if (iMo2365Ujhhgtgfeyxiexzf != 2) {
                            str = iMo2365Ujhhgtgfeyxiexzf != 3 ? "null" : "NONE";
                        } else {
                            str = "TRANSFORMED";
                        }
                        throw new IllegalArgumentException("Unknown strategy: ".concat(str));
                    }
                    z3 = true;
                    c3069Ujhhgtgfeyxiexzf = new C0903feyxiexzfUjhhgtg(c3087Ujhhgtgfeyxiexzf.f9549Ujhhgtgfeyxiexzf.f11160Ujhhgtgfeyxiexzf, runnableC3096Ujhhgtgfeyxiexzf.f9620feyxiexzfUjhhgtg, runnableC3096Ujhhgtgfeyxiexzf.f9606Ujhhgtgfeyxiexzf, runnableC3096Ujhhgtgfeyxiexzf.f9609Ujhhgtgfeyxiexzf, runnableC3096Ujhhgtgfeyxiexzf.f9610Ujhhgtgfeyxiexzf, interfaceC1765feyxiexzfUjhhgtg, cls, runnableC3096Ujhhgtgfeyxiexzf.f9612Ujhhgtgfeyxiexzf);
                }
                C0263Ujhhgtgfeyxiexzf c0263Ujhhgtgfeyxiexzf = (C0263Ujhhgtgfeyxiexzf) C0263Ujhhgtgfeyxiexzf.f1644Ujhhgtgfeyxiexzf.mo2933Ujhhgtgfeyxiexzf();
                c0263Ujhhgtgfeyxiexzf.f1648Ujhhgtgfeyxiexzf = 0;
                c0263Ujhhgtgfeyxiexzf.f1647Ujhhgtgfeyxiexzf = z3;
                c0263Ujhhgtgfeyxiexzf.f1646Ujhhgtgfeyxiexzf = interfaceC0901feyxiexzfUjhhgtgMo3060Ujhhgtgfeyxiexzf;
                C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = runnableC3096Ujhhgtgfeyxiexzf.f9603Ujhhgtgfeyxiexzf;
                c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf = c3069Ujhhgtgfeyxiexzf;
                c2366Ujhhgtgfeyxiexzf.f7715Ujhhgtgfeyxiexzf = interfaceC0887feyxiexzfUjhhgtg;
                c2366Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf = c0263Ujhhgtgfeyxiexzf;
                interfaceC0901feyxiexzfUjhhgtgMo3060Ujhhgtgfeyxiexzf = c0263Ujhhgtgfeyxiexzf;
            }
            return this.f9589Ujhhgtgfeyxiexzf.mo2369Ujhhgtgfeyxiexzf(interfaceC0901feyxiexzfUjhhgtgMo3060Ujhhgtgfeyxiexzf, c1471feyxiexzfUjhhgtg);
        } catch (Throwable th) {
            interfaceC1445feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(list);
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final InterfaceC0901feyxiexzfUjhhgtg m4591Ujhhgtgfeyxiexzf(InterfaceC3106Ujhhgtgfeyxiexzf interfaceC3106Ujhhgtgfeyxiexzf, int i, int i2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg, List list) throws C3591Ujhhgtgfeyxiexzf {
        List list2 = this.f9588Ujhhgtgfeyxiexzf;
        int size = list2.size();
        InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtgMo2363Ujhhgtgfeyxiexzf = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC0902feyxiexzfUjhhgtg interfaceC0902feyxiexzfUjhhgtg = (InterfaceC0902feyxiexzfUjhhgtg) list2.get(i3);
            try {
                if (interfaceC0902feyxiexzfUjhhgtg.mo2362Ujhhgtgfeyxiexzf(interfaceC3106Ujhhgtgfeyxiexzf.mo753Ujhhgtgfeyxiexzf(), c1471feyxiexzfUjhhgtg)) {
                    interfaceC0901feyxiexzfUjhhgtgMo2363Ujhhgtgfeyxiexzf = interfaceC0902feyxiexzfUjhhgtg.mo2363Ujhhgtgfeyxiexzf(interfaceC3106Ujhhgtgfeyxiexzf.mo753Ujhhgtgfeyxiexzf(), i, i2, c1471feyxiexzfUjhhgtg);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC0902feyxiexzfUjhhgtg, e);
                }
                list.add(e);
            }
            if (interfaceC0901feyxiexzfUjhhgtgMo2363Ujhhgtgfeyxiexzf != null) {
                break;
            }
        }
        if (interfaceC0901feyxiexzfUjhhgtgMo2363Ujhhgtgfeyxiexzf != null) {
            return interfaceC0901feyxiexzfUjhhgtgMo2363Ujhhgtgfeyxiexzf;
        }
        throw new C3591Ujhhgtgfeyxiexzf(this.f9591Ujhhgtgfeyxiexzf, new ArrayList(list));
    }
}
