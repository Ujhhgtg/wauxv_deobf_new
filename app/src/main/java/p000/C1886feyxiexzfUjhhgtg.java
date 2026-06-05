package p000;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛱfeyxiexzfᛱ要点脸ᛳᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1886feyxiexzfUjhhgtg extends AbstractC1887feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final SparseIntArray f6310Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Parcel f6311Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int f6312Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int f6313Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final String f6314Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f6315Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f6316Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f6317Ujhhgtgfeyxiexzf;

    public C1886feyxiexzfUjhhgtg(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2412Ujhhgtgfeyxiexzf(0), new C2412Ujhhgtgfeyxiexzf(0), new C2412Ujhhgtgfeyxiexzf(0));
    }

    @Override // p000.AbstractC1887feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C1886feyxiexzfUjhhgtg mo3208Ujhhgtgfeyxiexzf() {
        Parcel parcel = this.f6311Ujhhgtgfeyxiexzf;
        int iDataPosition = parcel.dataPosition();
        int i = this.f6316Ujhhgtgfeyxiexzf;
        if (i == this.f6312Ujhhgtgfeyxiexzf) {
            i = this.f6313Ujhhgtgfeyxiexzf;
        }
        return new C1886feyxiexzfUjhhgtg(parcel, iDataPosition, i, AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder(), this.f6314Ujhhgtgfeyxiexzf, "  "), this.f6318Ujhhgtgfeyxiexzf, this.f6319Ujhhgtgfeyxiexzf, this.f6320Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC1887feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final boolean mo3209Ujhhgtgfeyxiexzf(int i) {
        while (this.f6316Ujhhgtgfeyxiexzf < this.f6313Ujhhgtgfeyxiexzf) {
            int i2 = this.f6317Ujhhgtgfeyxiexzf;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f6316Ujhhgtgfeyxiexzf;
            Parcel parcel = this.f6311Ujhhgtgfeyxiexzf;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.f6317Ujhhgtgfeyxiexzf = parcel.readInt();
            this.f6316Ujhhgtgfeyxiexzf += i4;
        }
        return this.f6317Ujhhgtgfeyxiexzf == i;
    }

    @Override // p000.AbstractC1887feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void mo3210Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f6315Ujhhgtgfeyxiexzf;
        SparseIntArray sparseIntArray = this.f6310Ujhhgtgfeyxiexzf;
        Parcel parcel = this.f6311Ujhhgtgfeyxiexzf;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f6315Ujhhgtgfeyxiexzf = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public C1886feyxiexzfUjhhgtg(Parcel parcel, int i, int i2, String str, C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf, C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf2, C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf3) {
        super(c2412Ujhhgtgfeyxiexzf, c2412Ujhhgtgfeyxiexzf2, c2412Ujhhgtgfeyxiexzf3);
        this.f6310Ujhhgtgfeyxiexzf = new SparseIntArray();
        this.f6315Ujhhgtgfeyxiexzf = -1;
        this.f6317Ujhhgtgfeyxiexzf = -1;
        this.f6311Ujhhgtgfeyxiexzf = parcel;
        this.f6312Ujhhgtgfeyxiexzf = i;
        this.f6313Ujhhgtgfeyxiexzf = i2;
        this.f6316Ujhhgtgfeyxiexzf = i;
        this.f6314Ujhhgtgfeyxiexzf = str;
    }
}
