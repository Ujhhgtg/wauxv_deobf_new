package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ要点脸ᛳᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0900feyxiexzfUjhhgtg implements InterfaceC3073Ujhhgtgfeyxiexzf, InterfaceC3077Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final RunnableC3096Ujhhgtgfeyxiexzf f3460Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C3087Ujhhgtgfeyxiexzf f3461Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f3462Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f3463Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public InterfaceC0156Ujhhgtgfeyxiexzf f3464Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public List f3465Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f3466Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public volatile C0286Ujhhgtgfeyxiexzf f3467Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public File f3468Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C0903feyxiexzfUjhhgtg f3469Ujhhgtgfeyxiexzf;

    public C0900feyxiexzfUjhhgtg(C3087Ujhhgtgfeyxiexzf c3087Ujhhgtgfeyxiexzf, RunnableC3096Ujhhgtgfeyxiexzf runnableC3096Ujhhgtgfeyxiexzf) {
        this.f3461Ujhhgtgfeyxiexzf = c3087Ujhhgtgfeyxiexzf;
        this.f3460Ujhhgtgfeyxiexzf = runnableC3096Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3073Ujhhgtgfeyxiexzf
    public final void cancel() {
        C0286Ujhhgtgfeyxiexzf c0286Ujhhgtgfeyxiexzf = this.f3467Ujhhgtgfeyxiexzf;
        if (c0286Ujhhgtgfeyxiexzf != null) {
            c0286Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf.cancel();
        }
    }

    @Override // p000.InterfaceC3073Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final boolean mo2377Ujhhgtgfeyxiexzf() {
        List list;
        ArrayList arrayListM1719Ujhhgtgfeyxiexzf;
        ArrayList arrayListM4574Ujhhgtgfeyxiexzf = this.f3461Ujhhgtgfeyxiexzf.m4574Ujhhgtgfeyxiexzf();
        boolean z = false;
        if (!arrayListM4574Ujhhgtgfeyxiexzf.isEmpty()) {
            C3087Ujhhgtgfeyxiexzf c3087Ujhhgtgfeyxiexzf = this.f3461Ujhhgtgfeyxiexzf;
            C0970feyxiexzfUjhhgtg c0970feyxiexzfUjhhgtgM5116Ujhhgtgfeyxiexzf = c3087Ujhhgtgfeyxiexzf.f9549Ujhhgtgfeyxiexzf.m5116Ujhhgtgfeyxiexzf();
            Class<?> cls = c3087Ujhhgtgfeyxiexzf.f9550Ujhhgtgfeyxiexzf.getClass();
            Class cls2 = c3087Ujhhgtgfeyxiexzf.f9553Ujhhgtgfeyxiexzf;
            Class cls3 = c3087Ujhhgtgfeyxiexzf.f9557Ujhhgtgfeyxiexzf;
            C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = c0970feyxiexzfUjhhgtgM5116Ujhhgtgfeyxiexzf.f3856Ujhhgtgfeyxiexzf;
            C0511Ujhhgtgfeyxiexzf c0511Ujhhgtgfeyxiexzf = (C0511Ujhhgtgfeyxiexzf) ((AtomicReference) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf).getAndSet(null);
            if (c0511Ujhhgtgfeyxiexzf == null) {
                c0511Ujhhgtgfeyxiexzf = new C0511Ujhhgtgfeyxiexzf(cls, cls2, cls3);
            } else {
                c0511Ujhhgtgfeyxiexzf.f2444Ujhhgtgfeyxiexzf = cls;
                c0511Ujhhgtgfeyxiexzf.f2445Ujhhgtgfeyxiexzf = cls2;
                c0511Ujhhgtgfeyxiexzf.f2446Ujhhgtgfeyxiexzf = cls3;
            }
            synchronized (((C2412Ujhhgtgfeyxiexzf) c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf)) {
                list = (List) ((C2412Ujhhgtgfeyxiexzf) c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf).get(c0511Ujhhgtgfeyxiexzf);
            }
            ((AtomicReference) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf).set(c0511Ujhhgtgfeyxiexzf);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf2 = c0970feyxiexzfUjhhgtgM5116Ujhhgtgfeyxiexzf.f3849Ujhhgtgfeyxiexzf;
                synchronized (c2629Ujhhgtgfeyxiexzf2) {
                    arrayListM1719Ujhhgtgfeyxiexzf = ((C0416Ujhhgtgfeyxiexzf) c2629Ujhhgtgfeyxiexzf2.f8461Ujhhgtgfeyxiexzf).m1719Ujhhgtgfeyxiexzf(cls);
                }
                Iterator it = arrayListM1719Ujhhgtgfeyxiexzf.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : c0970feyxiexzfUjhhgtgM5116Ujhhgtgfeyxiexzf.f3851Ujhhgtgfeyxiexzf.m3943Ujhhgtgfeyxiexzf((Class) it.next(), cls2)) {
                        if (!c0970feyxiexzfUjhhgtgM5116Ujhhgtgfeyxiexzf.f3854Ujhhgtgfeyxiexzf.m4816Ujhhgtgfeyxiexzf(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf3 = c0970feyxiexzfUjhhgtgM5116Ujhhgtgfeyxiexzf.f3856Ujhhgtgfeyxiexzf;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((C2412Ujhhgtgfeyxiexzf) c2629Ujhhgtgfeyxiexzf3.f8462Ujhhgtgfeyxiexzf)) {
                    ((C2412Ujhhgtgfeyxiexzf) c2629Ujhhgtgfeyxiexzf3.f8462Ujhhgtgfeyxiexzf).put(new C0511Ujhhgtgfeyxiexzf(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f3465Ujhhgtgfeyxiexzf;
                    if (list3 != null && this.f3466Ujhhgtgfeyxiexzf < list3.size()) {
                        this.f3467Ujhhgtgfeyxiexzf = null;
                        while (!z && this.f3466Ujhhgtgfeyxiexzf < this.f3465Ujhhgtgfeyxiexzf.size()) {
                            List list4 = this.f3465Ujhhgtgfeyxiexzf;
                            int i = this.f3466Ujhhgtgfeyxiexzf;
                            this.f3466Ujhhgtgfeyxiexzf = i + 1;
                            InterfaceC0285Ujhhgtgfeyxiexzf interfaceC0285Ujhhgtgfeyxiexzf = (InterfaceC0285Ujhhgtgfeyxiexzf) list4.get(i);
                            File file = this.f3468Ujhhgtgfeyxiexzf;
                            C3087Ujhhgtgfeyxiexzf c3087Ujhhgtgfeyxiexzf2 = this.f3461Ujhhgtgfeyxiexzf;
                            this.f3467Ujhhgtgfeyxiexzf = interfaceC0285Ujhhgtgfeyxiexzf.mo1304Ujhhgtgfeyxiexzf(file, c3087Ujhhgtgfeyxiexzf2.f9551Ujhhgtgfeyxiexzf, c3087Ujhhgtgfeyxiexzf2.f9552Ujhhgtgfeyxiexzf, c3087Ujhhgtgfeyxiexzf2.f9555Ujhhgtgfeyxiexzf);
                            if (this.f3467Ujhhgtgfeyxiexzf != null && this.f3461Ujhhgtgfeyxiexzf.m4576Ujhhgtgfeyxiexzf(this.f3467Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf.mo1381Ujhhgtgfeyxiexzf()) != null) {
                                this.f3467Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf.mo1383Ujhhgtgfeyxiexzf(this.f3461Ujhhgtgfeyxiexzf.f9561Ujhhgtgfeyxiexzf, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.f3463Ujhhgtgfeyxiexzf + 1;
                    this.f3463Ujhhgtgfeyxiexzf = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.f3462Ujhhgtgfeyxiexzf + 1;
                        this.f3462Ujhhgtgfeyxiexzf = i3;
                        if (i3 >= arrayListM4574Ujhhgtgfeyxiexzf.size()) {
                            break;
                        }
                        this.f3463Ujhhgtgfeyxiexzf = 0;
                    }
                    InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf = (InterfaceC0156Ujhhgtgfeyxiexzf) arrayListM4574Ujhhgtgfeyxiexzf.get(this.f3462Ujhhgtgfeyxiexzf);
                    Class cls5 = (Class) list2.get(this.f3463Ujhhgtgfeyxiexzf);
                    InterfaceC1765feyxiexzfUjhhgtg interfaceC1765feyxiexzfUjhhgtgM4578Ujhhgtgfeyxiexzf = this.f3461Ujhhgtgfeyxiexzf.m4578Ujhhgtgfeyxiexzf(cls5);
                    C3087Ujhhgtgfeyxiexzf c3087Ujhhgtgfeyxiexzf3 = this.f3461Ujhhgtgfeyxiexzf;
                    this.f3469Ujhhgtgfeyxiexzf = new C0903feyxiexzfUjhhgtg(c3087Ujhhgtgfeyxiexzf3.f9549Ujhhgtgfeyxiexzf.f11160Ujhhgtgfeyxiexzf, interfaceC0156Ujhhgtgfeyxiexzf, c3087Ujhhgtgfeyxiexzf3.f9560Ujhhgtgfeyxiexzf, c3087Ujhhgtgfeyxiexzf3.f9551Ujhhgtgfeyxiexzf, c3087Ujhhgtgfeyxiexzf3.f9552Ujhhgtgfeyxiexzf, interfaceC1765feyxiexzfUjhhgtgM4578Ujhhgtgfeyxiexzf, cls5, c3087Ujhhgtgfeyxiexzf3.f9555Ujhhgtgfeyxiexzf);
                    File fileMo3704Ujhhgtgfeyxiexzf = c3087Ujhhgtgfeyxiexzf3.f9554Ujhhgtgfeyxiexzf.m4818Ujhhgtgfeyxiexzf().mo3704Ujhhgtgfeyxiexzf(this.f3469Ujhhgtgfeyxiexzf);
                    this.f3468Ujhhgtgfeyxiexzf = fileMo3704Ujhhgtgfeyxiexzf;
                    if (fileMo3704Ujhhgtgfeyxiexzf != null) {
                        this.f3464Ujhhgtgfeyxiexzf = interfaceC0156Ujhhgtgfeyxiexzf;
                        this.f3465Ujhhgtgfeyxiexzf = this.f3461Ujhhgtgfeyxiexzf.f9549Ujhhgtgfeyxiexzf.m5116Ujhhgtgfeyxiexzf().m2471Ujhhgtgfeyxiexzf(fileMo3704Ujhhgtgfeyxiexzf);
                        this.f3466Ujhhgtgfeyxiexzf = 0;
                    }
                }
            } else if (!File.class.equals(this.f3461Ujhhgtgfeyxiexzf.f9557Ujhhgtgfeyxiexzf)) {
                throw new IllegalStateException("Failed to find any load path from " + this.f3461Ujhhgtgfeyxiexzf.f9550Ujhhgtgfeyxiexzf.getClass() + " to " + this.f3461Ujhhgtgfeyxiexzf.f9557Ujhhgtgfeyxiexzf);
            }
        }
        return false;
    }

    @Override // p000.InterfaceC3077Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1799Ujhhgtgfeyxiexzf(Exception exc) {
        this.f3460Ujhhgtgfeyxiexzf.mo2717Ujhhgtgfeyxiexzf(this.f3469Ujhhgtgfeyxiexzf, exc, this.f3467Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf, 4);
    }

    @Override // p000.InterfaceC3077Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo1801Ujhhgtgfeyxiexzf(Object obj) {
        this.f3460Ujhhgtgfeyxiexzf.mo2716Ujhhgtgfeyxiexzf(this.f3464Ujhhgtgfeyxiexzf, obj, this.f3467Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf, 4, this.f3469Ujhhgtgfeyxiexzf);
    }
}
