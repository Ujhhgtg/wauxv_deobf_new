package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴ要点脸ᛳᛲᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0513Ujhhgtgfeyxiexzf implements InterfaceC3078Ujhhgtgfeyxiexzf, InterfaceC3077Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ArrayList f2449Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final InterfaceC1445feyxiexzfUjhhgtg f2450Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f2451Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public EnumC0836feyxiexzfUjhhgtg f2452Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public InterfaceC3077Ujhhgtgfeyxiexzf f2453Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public List f2454Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f2455Ujhhgtgfeyxiexzf;

    public C0513Ujhhgtgfeyxiexzf(ArrayList arrayList, InterfaceC1445feyxiexzfUjhhgtg interfaceC1445feyxiexzfUjhhgtg) {
        this.f2450Ujhhgtgfeyxiexzf = interfaceC1445feyxiexzfUjhhgtg;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f2449Ujhhgtgfeyxiexzf = arrayList;
        this.f2451Ujhhgtgfeyxiexzf = 0;
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    public final void cancel() {
        this.f2455Ujhhgtgfeyxiexzf = true;
        Iterator it = this.f2449Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            ((InterfaceC3078Ujhhgtgfeyxiexzf) it.next()).cancel();
        }
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final Class mo1381Ujhhgtgfeyxiexzf() {
        return ((InterfaceC3078Ujhhgtgfeyxiexzf) this.f2449Ujhhgtgfeyxiexzf.get(0)).mo1381Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1382Ujhhgtgfeyxiexzf() {
        List list = this.f2454Ujhhgtgfeyxiexzf;
        if (list != null) {
            this.f2450Ujhhgtgfeyxiexzf.mo2932Ujhhgtgfeyxiexzf(list);
        }
        this.f2454Ujhhgtgfeyxiexzf = null;
        Iterator it = this.f2449Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            ((InterfaceC3078Ujhhgtgfeyxiexzf) it.next()).mo1382Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1383Ujhhgtgfeyxiexzf(EnumC0836feyxiexzfUjhhgtg enumC0836feyxiexzfUjhhgtg, InterfaceC3077Ujhhgtgfeyxiexzf interfaceC3077Ujhhgtgfeyxiexzf) {
        this.f2452Ujhhgtgfeyxiexzf = enumC0836feyxiexzfUjhhgtg;
        this.f2453Ujhhgtgfeyxiexzf = interfaceC3077Ujhhgtgfeyxiexzf;
        this.f2454Ujhhgtgfeyxiexzf = (List) this.f2450Ujhhgtgfeyxiexzf.mo2933Ujhhgtgfeyxiexzf();
        ((InterfaceC3078Ujhhgtgfeyxiexzf) this.f2449Ujhhgtgfeyxiexzf.get(this.f2451Ujhhgtgfeyxiexzf)).mo1383Ujhhgtgfeyxiexzf(enumC0836feyxiexzfUjhhgtg, this);
        if (this.f2455Ujhhgtgfeyxiexzf) {
            cancel();
        }
    }

    @Override // p000.InterfaceC3077Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void mo1799Ujhhgtgfeyxiexzf(Exception exc) {
        List list = this.f2454Ujhhgtgfeyxiexzf;
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(list, "Argument must not be null");
        list.add(exc);
        m1800Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final int mo1384Ujhhgtgfeyxiexzf() {
        return ((InterfaceC3078Ujhhgtgfeyxiexzf) this.f2449Ujhhgtgfeyxiexzf.get(0)).mo1384Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m1800Ujhhgtgfeyxiexzf() {
        if (this.f2455Ujhhgtgfeyxiexzf) {
            return;
        }
        if (this.f2451Ujhhgtgfeyxiexzf < this.f2449Ujhhgtgfeyxiexzf.size() - 1) {
            this.f2451Ujhhgtgfeyxiexzf++;
            mo1383Ujhhgtgfeyxiexzf(this.f2452Ujhhgtgfeyxiexzf, this.f2453Ujhhgtgfeyxiexzf);
        } else {
            AbstractC3593Ujhhgtgfeyxiexzf.m5150Ujhhgtgfeyxiexzf(this.f2454Ujhhgtgfeyxiexzf);
            this.f2453Ujhhgtgfeyxiexzf.mo1799Ujhhgtgfeyxiexzf(new C3591Ujhhgtgfeyxiexzf("Fetch failed", new ArrayList(this.f2454Ujhhgtgfeyxiexzf)));
        }
    }

    @Override // p000.InterfaceC3077Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void mo1801Ujhhgtgfeyxiexzf(Object obj) {
        if (obj != null) {
            this.f2453Ujhhgtgfeyxiexzf.mo1801Ujhhgtgfeyxiexzf(obj);
        } else {
            m1800Ujhhgtgfeyxiexzf();
        }
    }
}
