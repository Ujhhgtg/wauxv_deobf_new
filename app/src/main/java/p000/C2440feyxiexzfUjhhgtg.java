package p000;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2440feyxiexzfUjhhgtg extends AbstractC1747feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public int f7892feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public ArrayList f7890feyxiexzfUjhhgtg = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public boolean f7891feyxiexzfUjhhgtg = true;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public boolean f7893feyxiexzfUjhhgtg = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public int f7894feyxiexzfUjhhgtg = 0;

    public C2440feyxiexzfUjhhgtg() {
        m3680feyxiexzfUjhhgtg(1);
        m3677feyxiexzfUjhhgtg(new C3510feyxiexzfUjhhgtg(2));
        m3677feyxiexzfUjhhgtg(new C2677Ujhhgtgfeyxiexzf());
        m3677feyxiexzfUjhhgtg(new C3510feyxiexzfUjhhgtg(1));
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    public final void cancel() {
        super.cancel();
        int size = this.f7890feyxiexzfUjhhgtg.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(i)).cancel();
        }
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo3015Ujhhgtgfeyxiexzf(C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg) {
        View view = c1787feyxiexzfUjhhgtg.f6029Ujhhgtgfeyxiexzf;
        if (m3031Ujhhgtgfeyxiexzf(view)) {
            for (AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg : this.f7890feyxiexzfUjhhgtg) {
                if (abstractC1747feyxiexzfUjhhgtg.m3031Ujhhgtgfeyxiexzf(view)) {
                    abstractC1747feyxiexzfUjhhgtg.mo3015Ujhhgtgfeyxiexzf(c1787feyxiexzfUjhhgtg);
                    c1787feyxiexzfUjhhgtg.f6030Ujhhgtgfeyxiexzf.add(abstractC1747feyxiexzfUjhhgtg);
                }
            }
        }
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo3017Ujhhgtgfeyxiexzf(C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg) {
        int size = this.f7890feyxiexzfUjhhgtg.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(i)).mo3017Ujhhgtgfeyxiexzf(c1787feyxiexzfUjhhgtg);
        }
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo3018Ujhhgtgfeyxiexzf(C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg) {
        View view = c1787feyxiexzfUjhhgtg.f6029Ujhhgtgfeyxiexzf;
        if (m3031Ujhhgtgfeyxiexzf(view)) {
            for (AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg : this.f7890feyxiexzfUjhhgtg) {
                if (abstractC1747feyxiexzfUjhhgtg.m3031Ujhhgtgfeyxiexzf(view)) {
                    abstractC1747feyxiexzfUjhhgtg.mo3018Ujhhgtgfeyxiexzf(c1787feyxiexzfUjhhgtg);
                    c1787feyxiexzfUjhhgtg.f6030Ujhhgtgfeyxiexzf.add(abstractC1747feyxiexzfUjhhgtg);
                }
            }
        }
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final AbstractC1747feyxiexzfUjhhgtg clone() {
        C2440feyxiexzfUjhhgtg c2440feyxiexzfUjhhgtg = (C2440feyxiexzfUjhhgtg) super.clone();
        c2440feyxiexzfUjhhgtg.f7890feyxiexzfUjhhgtg = new ArrayList();
        int size = this.f7890feyxiexzfUjhhgtg.size();
        for (int i = 0; i < size; i++) {
            AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtgClone = ((AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(i)).clone();
            c2440feyxiexzfUjhhgtg.f7890feyxiexzfUjhhgtg.add(abstractC1747feyxiexzfUjhhgtgClone);
            abstractC1747feyxiexzfUjhhgtgClone.f5867Ujhhgtgfeyxiexzf = c2440feyxiexzfUjhhgtg;
        }
        return c2440feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo3023Ujhhgtgfeyxiexzf(ViewGroup viewGroup, C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf, C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f5860Ujhhgtgfeyxiexzf;
        int size = this.f7890feyxiexzfUjhhgtg.size();
        for (int i = 0; i < size; i++) {
            AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg = (AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(i);
            if (j > 0 && (this.f7891feyxiexzfUjhhgtg || i == 0)) {
                long j2 = abstractC1747feyxiexzfUjhhgtg.f5860Ujhhgtgfeyxiexzf;
                if (j2 > 0) {
                    abstractC1747feyxiexzfUjhhgtg.mo3044feyxiexzfUjhhgtg(j2 + j);
                } else {
                    abstractC1747feyxiexzfUjhhgtg.mo3044feyxiexzfUjhhgtg(j);
                }
            }
            abstractC1747feyxiexzfUjhhgtg.mo3023Ujhhgtgfeyxiexzf(viewGroup, c0416Ujhhgtgfeyxiexzf, c0416Ujhhgtgfeyxiexzf2, arrayList, arrayList2);
        }
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public final boolean mo3029Ujhhgtgfeyxiexzf() {
        for (int i = 0; i < this.f7890feyxiexzfUjhhgtg.size(); i++) {
            if (((AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(i)).mo3029Ujhhgtgfeyxiexzf()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ */
    public final void mo3033Ujhhgtgfeyxiexzf(View view) {
        super.mo3033Ujhhgtgfeyxiexzf(view);
        int size = this.f7890feyxiexzfUjhhgtg.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(i)).mo3033Ujhhgtgfeyxiexzf(view);
        }
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ */
    public final void mo3034Ujhhgtgfeyxiexzf() {
        this.f5881feyxiexzfUjhhgtg = 0L;
        int i = 0;
        C1752feyxiexzfUjhhgtg c1752feyxiexzfUjhhgtg = new C1752feyxiexzfUjhhgtg(this, i);
        while (i < this.f7890feyxiexzfUjhhgtg.size()) {
            AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg = (AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(i);
            abstractC1747feyxiexzfUjhhgtg.m3014Ujhhgtgfeyxiexzf(c1752feyxiexzfUjhhgtg);
            abstractC1747feyxiexzfUjhhgtg.mo3034Ujhhgtgfeyxiexzf();
            long j = abstractC1747feyxiexzfUjhhgtg.f5881feyxiexzfUjhhgtg;
            if (this.f7891feyxiexzfUjhhgtg) {
                this.f5881feyxiexzfUjhhgtg = Math.max(this.f5881feyxiexzfUjhhgtg, j);
            } else {
                long j2 = this.f5881feyxiexzfUjhhgtg;
                abstractC1747feyxiexzfUjhhgtg.f5882feyxiexzfUjhhgtg = j2;
                this.f5881feyxiexzfUjhhgtg = j2 + j;
            }
            i++;
        }
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ */
    public final AbstractC1747feyxiexzfUjhhgtg mo3035feyxiexzfUjhhgtg(InterfaceC1746feyxiexzfUjhhgtg interfaceC1746feyxiexzfUjhhgtg) {
        super.mo3035feyxiexzfUjhhgtg(interfaceC1746feyxiexzfUjhhgtg);
        return this;
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ */
    public final void mo3036feyxiexzfUjhhgtg(View view) {
        super.mo3036feyxiexzfUjhhgtg(view);
        int size = this.f7890feyxiexzfUjhhgtg.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(i)).mo3036feyxiexzfUjhhgtg(view);
        }
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ */
    public final void mo3037feyxiexzfUjhhgtg() {
        if (this.f7890feyxiexzfUjhhgtg.isEmpty()) {
            m3045feyxiexzfUjhhgtg();
            m3024Ujhhgtgfeyxiexzf();
            return;
        }
        C1752feyxiexzfUjhhgtg c1752feyxiexzfUjhhgtg = new C1752feyxiexzfUjhhgtg();
        c1752feyxiexzfUjhhgtg.f5894Ujhhgtgfeyxiexzf = this;
        Iterator it = this.f7890feyxiexzfUjhhgtg.iterator();
        while (it.hasNext()) {
            ((AbstractC1747feyxiexzfUjhhgtg) it.next()).m3014Ujhhgtgfeyxiexzf(c1752feyxiexzfUjhhgtg);
        }
        this.f7892feyxiexzfUjhhgtg = this.f7890feyxiexzfUjhhgtg.size();
        if (this.f7891feyxiexzfUjhhgtg) {
            Iterator it2 = this.f7890feyxiexzfUjhhgtg.iterator();
            while (it2.hasNext()) {
                ((AbstractC1747feyxiexzfUjhhgtg) it2.next()).mo3037feyxiexzfUjhhgtg();
            }
            return;
        }
        for (int i = 1; i < this.f7890feyxiexzfUjhhgtg.size(); i++) {
            ((AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(i - 1)).m3014Ujhhgtgfeyxiexzf(new C1752feyxiexzfUjhhgtg((AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(i), 2));
        }
        AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg = (AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(0);
        if (abstractC1747feyxiexzfUjhhgtg != null) {
            abstractC1747feyxiexzfUjhhgtg.mo3037feyxiexzfUjhhgtg();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ */
    public final void mo3038feyxiexzfUjhhgtg(long j, long j2) {
        long j3;
        long j4 = this.f5881feyxiexzfUjhhgtg;
        long j5 = 0;
        if (this.f5867Ujhhgtgfeyxiexzf != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.f5876Ujhhgtgfeyxiexzf = false;
            m3032Ujhhgtgfeyxiexzf(this, C1439feyxiexzfUjhhgtg.f5037Ujhhgtgfeyxiexzf, z);
        }
        if (!this.f7891feyxiexzfUjhhgtg) {
            int size = 1;
            while (true) {
                if (size >= this.f7890feyxiexzfUjhhgtg.size()) {
                    size = this.f7890feyxiexzfUjhhgtg.size();
                    break;
                } else if (((AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(size)).f5882feyxiexzfUjhhgtg > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i < this.f7890feyxiexzfUjhhgtg.size()) {
                        AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg = (AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(i);
                        long j6 = abstractC1747feyxiexzfUjhhgtg.f5882feyxiexzfUjhhgtg;
                        j3 = j5;
                        long j7 = j - j6;
                        if (j7 < j3) {
                            break;
                        }
                        abstractC1747feyxiexzfUjhhgtg.mo3038feyxiexzfUjhhgtg(j7, j2 - j6);
                        i++;
                        j5 = j3;
                    }
                }
            } else {
                j3 = 0;
                while (i >= 0) {
                    AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg2 = (AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(i);
                    long j8 = abstractC1747feyxiexzfUjhhgtg2.f5882feyxiexzfUjhhgtg;
                    long j9 = j - j8;
                    abstractC1747feyxiexzfUjhhgtg2.mo3038feyxiexzfUjhhgtg(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            if (this.f5867Ujhhgtgfeyxiexzf != null) {
                if ((j > j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > j4) {
                    this.f5876Ujhhgtgfeyxiexzf = true;
                }
                m3032Ujhhgtgfeyxiexzf(this, C1439feyxiexzfUjhhgtg.f5038Ujhhgtgfeyxiexzf, z);
            }
        }
        for (int i2 = 0; i2 < this.f7890feyxiexzfUjhhgtg.size(); i2++) {
            ((AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(i2)).mo3038feyxiexzfUjhhgtg(j, j2);
        }
        j3 = j5;
        if (this.f5867Ujhhgtgfeyxiexzf != null) {
            if (j > j4) {
                return;
            } else {
                return;
            }
            if (j > j4) {
                this.f5876Ujhhgtgfeyxiexzf = true;
            }
            m3032Ujhhgtgfeyxiexzf(this, C1439feyxiexzfUjhhgtg.f5038Ujhhgtgfeyxiexzf, z);
        }
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ */
    public final void mo3040feyxiexzfUjhhgtg(AbstractC1791feyxiexzfUjhhgtg abstractC1791feyxiexzfUjhhgtg) {
        this.f7894feyxiexzfUjhhgtg |= 8;
        int size = this.f7890feyxiexzfUjhhgtg.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(i)).mo3040feyxiexzfUjhhgtg(abstractC1791feyxiexzfUjhhgtg);
        }
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ */
    public final void mo3042feyxiexzfUjhhgtg(C0420Ujhhgtgfeyxiexzf c0420Ujhhgtgfeyxiexzf) {
        super.mo3042feyxiexzfUjhhgtg(c0420Ujhhgtgfeyxiexzf);
        this.f7894feyxiexzfUjhhgtg |= 4;
        if (this.f7890feyxiexzfUjhhgtg != null) {
            for (int i = 0; i < this.f7890feyxiexzfUjhhgtg.size(); i++) {
                ((AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(i)).mo3042feyxiexzfUjhhgtg(c0420Ujhhgtgfeyxiexzf);
            }
        }
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final void mo3043feyxiexzfUjhhgtg() {
        this.f7894feyxiexzfUjhhgtg |= 2;
        int size = this.f7890feyxiexzfUjhhgtg.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(i)).mo3043feyxiexzfUjhhgtg();
        }
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final void mo3044feyxiexzfUjhhgtg(long j) {
        this.f5860Ujhhgtgfeyxiexzf = j;
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ */
    public final String mo3046feyxiexzfUjhhgtg(String str) {
        String strMo3046feyxiexzfUjhhgtg = super.mo3046feyxiexzfUjhhgtg(str);
        for (int i = 0; i < this.f7890feyxiexzfUjhhgtg.size(); i++) {
            StringBuilder sbM4805Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(strMo3046feyxiexzfUjhhgtg, "\n");
            sbM4805Ujhhgtgfeyxiexzf.append(((AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(i)).mo3046feyxiexzfUjhhgtg(str + "  "));
            strMo3046feyxiexzfUjhhgtg = sbM4805Ujhhgtgfeyxiexzf.toString();
        }
        return strMo3046feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public final void m3677feyxiexzfUjhhgtg(AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg) {
        this.f7890feyxiexzfUjhhgtg.add(abstractC1747feyxiexzfUjhhgtg);
        abstractC1747feyxiexzfUjhhgtg.f5867Ujhhgtgfeyxiexzf = this;
        long j = this.f5861Ujhhgtgfeyxiexzf;
        if (j >= 0) {
            abstractC1747feyxiexzfUjhhgtg.mo3039feyxiexzfUjhhgtg(j);
        }
        if ((this.f7894feyxiexzfUjhhgtg & 1) != 0) {
            abstractC1747feyxiexzfUjhhgtg.mo3041feyxiexzfUjhhgtg(this.f5862Ujhhgtgfeyxiexzf);
        }
        if ((this.f7894feyxiexzfUjhhgtg & 2) != 0) {
            abstractC1747feyxiexzfUjhhgtg.mo3043feyxiexzfUjhhgtg();
        }
        if ((this.f7894feyxiexzfUjhhgtg & 4) != 0) {
            abstractC1747feyxiexzfUjhhgtg.mo3042feyxiexzfUjhhgtg(this.f5880Ujhhgtgfeyxiexzf);
        }
        if ((this.f7894feyxiexzfUjhhgtg & 8) != 0) {
            abstractC1747feyxiexzfUjhhgtg.mo3040feyxiexzfUjhhgtg(null);
        }
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo3039feyxiexzfUjhhgtg(long j) {
        ArrayList arrayList;
        this.f5861Ujhhgtgfeyxiexzf = j;
        if (j < 0 || (arrayList = this.f7890feyxiexzfUjhhgtg) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(i)).mo3039feyxiexzfUjhhgtg(j);
        }
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo3041feyxiexzfUjhhgtg(TimeInterpolator timeInterpolator) {
        this.f7894feyxiexzfUjhhgtg |= 1;
        ArrayList arrayList = this.f7890feyxiexzfUjhhgtg;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC1747feyxiexzfUjhhgtg) this.f7890feyxiexzfUjhhgtg.get(i)).mo3041feyxiexzfUjhhgtg(timeInterpolator);
            }
        }
        this.f5862Ujhhgtgfeyxiexzf = timeInterpolator;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m3680feyxiexzfUjhhgtg(int i) {
        if (i == 0) {
            this.f7891feyxiexzfUjhhgtg = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f7891feyxiexzfUjhhgtg = false;
        }
    }
}
