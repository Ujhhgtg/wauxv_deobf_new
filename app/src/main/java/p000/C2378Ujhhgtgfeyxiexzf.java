package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2378Ujhhgtgfeyxiexzf extends AbstractC3473Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C2866feyxiexzfUjhhgtg f7737Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final ArrayList f7738Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final AbstractC3638Ujhhgtgfeyxiexzf f7739Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int f7740Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f7741Ujhhgtgfeyxiexzf;

    public C2378Ujhhgtgfeyxiexzf(C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg, C2866feyxiexzfUjhhgtg c2866feyxiexzfUjhhgtg, ArrayList arrayList, AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf) {
        super(c1234feyxiexzfUjhhgtg, C0960feyxiexzfUjhhgtg.f3827Ujhhgtgfeyxiexzf);
        if (c2866feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("user == null");
        }
        if (arrayList == null) {
            throw new NullPointerException("values == null");
        }
        if (arrayList.size() <= 0) {
            throw new IllegalArgumentException("Illegal number of init values");
        }
        this.f7739Ujhhgtgfeyxiexzf = abstractC3638Ujhhgtgfeyxiexzf;
        if (abstractC3638Ujhhgtgfeyxiexzf == C3057Ujhhgtgfeyxiexzf.f9464Ujhhgtgfeyxiexzf || abstractC3638Ujhhgtgfeyxiexzf == C3057Ujhhgtgfeyxiexzf.f9463Ujhhgtgfeyxiexzf) {
            this.f7740Ujhhgtgfeyxiexzf = 1;
        } else if (abstractC3638Ujhhgtgfeyxiexzf == C3057Ujhhgtgfeyxiexzf.f9470Ujhhgtgfeyxiexzf || abstractC3638Ujhhgtgfeyxiexzf == C3057Ujhhgtgfeyxiexzf.f9465Ujhhgtgfeyxiexzf) {
            this.f7740Ujhhgtgfeyxiexzf = 2;
        } else if (abstractC3638Ujhhgtgfeyxiexzf == C3057Ujhhgtgfeyxiexzf.f9469Ujhhgtgfeyxiexzf || abstractC3638Ujhhgtgfeyxiexzf == C3057Ujhhgtgfeyxiexzf.f9467Ujhhgtgfeyxiexzf) {
            this.f7740Ujhhgtgfeyxiexzf = 4;
        } else {
            if (abstractC3638Ujhhgtgfeyxiexzf != C3057Ujhhgtgfeyxiexzf.f9468Ujhhgtgfeyxiexzf && abstractC3638Ujhhgtgfeyxiexzf != C3057Ujhhgtgfeyxiexzf.f9466Ujhhgtgfeyxiexzf) {
                throw new IllegalArgumentException("Unexpected constant type");
            }
            this.f7740Ujhhgtgfeyxiexzf = 8;
        }
        this.f7737Ujhhgtgfeyxiexzf = c2866feyxiexzfUjhhgtg;
        this.f7738Ujhhgtgfeyxiexzf = arrayList;
        this.f7741Ujhhgtgfeyxiexzf = arrayList.size();
    }

    @Override // p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1802Ujhhgtgfeyxiexzf() {
        StringBuilder sb = new StringBuilder(100);
        ArrayList arrayList = this.f7738Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append("\n    ");
            sb.append(i);
            sb.append(": ");
            sb.append(((AbstractC3638Ujhhgtgfeyxiexzf) arrayList.get(i)).mo1392Ujhhgtgfeyxiexzf());
        }
        return sb.toString();
    }

    @Override // p000.AbstractC3473Ujhhgtgfeyxiexzf, p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final int mo1865Ujhhgtgfeyxiexzf() {
        return (((this.f7741Ujhhgtgfeyxiexzf * this.f7740Ujhhgtgfeyxiexzf) + 1) / 2) + 4;
    }

    @Override // p000.AbstractC3473Ujhhgtgfeyxiexzf, p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final String mo1866Ujhhgtgfeyxiexzf() {
        int iM4544Ujhhgtgfeyxiexzf = this.f7737Ujhhgtgfeyxiexzf.m4544Ujhhgtgfeyxiexzf();
        StringBuilder sb = new StringBuilder(100);
        ArrayList arrayList = this.f7738Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        sb.append("fill-array-data-payload // for fill-array-data @ ");
        sb.append(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(iM4544Ujhhgtgfeyxiexzf));
        for (int i = 0; i < size; i++) {
            sb.append("\n  ");
            sb.append(i);
            sb.append(": ");
            sb.append(((AbstractC3638Ujhhgtgfeyxiexzf) arrayList.get(i)).mo1392Ujhhgtgfeyxiexzf());
        }
        return sb.toString();
    }

    @Override // p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final AbstractC3068Ujhhgtgfeyxiexzf mo1806Ujhhgtgfeyxiexzf(C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg) {
        return new C2378Ujhhgtgfeyxiexzf(this.f9499Ujhhgtgfeyxiexzf, this.f7737Ujhhgtgfeyxiexzf, this.f7738Ujhhgtgfeyxiexzf, this.f7739Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC3473Ujhhgtgfeyxiexzf, p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final void mo1867Ujhhgtgfeyxiexzf(C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        ArrayList arrayList = this.f7738Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        c2608Ujhhgtgfeyxiexzf.m3895Ujhhgtgfeyxiexzf(768);
        int i = this.f7740Ujhhgtgfeyxiexzf;
        c2608Ujhhgtgfeyxiexzf.m3895Ujhhgtgfeyxiexzf(i);
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(this.f7741Ujhhgtgfeyxiexzf);
        char c = 2;
        if (i == 1) {
            for (int i2 = 0; i2 < size; i2++) {
                c2608Ujhhgtgfeyxiexzf.m3893Ujhhgtgfeyxiexzf((byte) ((AbstractC3148Ujhhgtgfeyxiexzf) ((AbstractC3638Ujhhgtgfeyxiexzf) arrayList.get(i2))).f9756Ujhhgtgfeyxiexzf);
            }
        } else if (i == 2) {
            for (int i3 = 0; i3 < size; i3++) {
                c2608Ujhhgtgfeyxiexzf.m3895Ujhhgtgfeyxiexzf((short) ((AbstractC3148Ujhhgtgfeyxiexzf) ((AbstractC3638Ujhhgtgfeyxiexzf) arrayList.get(i3))).f9756Ujhhgtgfeyxiexzf);
            }
        } else if (i == 4) {
            for (int i4 = 0; i4 < size; i4++) {
                c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(((AbstractC3148Ujhhgtgfeyxiexzf) ((AbstractC3638Ujhhgtgfeyxiexzf) arrayList.get(i4))).f9756Ujhhgtgfeyxiexzf);
            }
        } else if (i == 8) {
            int i5 = 0;
            while (i5 < size) {
                long j = ((AbstractC3149Ujhhgtgfeyxiexzf) ((AbstractC3638Ujhhgtgfeyxiexzf) arrayList.get(i5))).f9757Ujhhgtgfeyxiexzf;
                int i6 = c2608Ujhhgtgfeyxiexzf.f8413Ujhhgtgfeyxiexzf;
                int i7 = i6 + 8;
                if (c2608Ujhhgtgfeyxiexzf.f8411Ujhhgtgfeyxiexzf) {
                    c2608Ujhhgtgfeyxiexzf.m3890Ujhhgtgfeyxiexzf(i7);
                } else if (i7 > c2608Ujhhgtgfeyxiexzf.f8412Ujhhgtgfeyxiexzf.length) {
                    C2608Ujhhgtgfeyxiexzf.m3884Ujhhgtgfeyxiexzf();
                    throw null;
                }
                int i8 = (int) j;
                byte[] bArr = c2608Ujhhgtgfeyxiexzf.f8412Ujhhgtgfeyxiexzf;
                bArr[i6] = (byte) i8;
                char c2 = c;
                bArr[i6 + 1] = (byte) (i8 >> 8);
                bArr[i6 + 2] = (byte) (i8 >> 16);
                bArr[i6 + 3] = (byte) (i8 >> 24);
                int i9 = (int) (j >> 32);
                bArr[i6 + 4] = (byte) i9;
                bArr[i6 + 5] = (byte) (i9 >> 8);
                bArr[i6 + 6] = (byte) (i9 >> 16);
                bArr[i6 + 7] = (byte) (i9 >> 24);
                c2608Ujhhgtgfeyxiexzf.f8413Ujhhgtgfeyxiexzf = i7;
                i5++;
                c = c2;
            }
        }
        if (i != 1 || size % 2 == 0) {
            return;
        }
        c2608Ujhhgtgfeyxiexzf.m3893Ujhhgtgfeyxiexzf(0);
    }
}
