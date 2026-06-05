package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲ能不能ᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0812feyxiexzfUjhhgtg extends AbstractC2922Ujhhgtgfeyxiexzf {
    public static final Parcelable.Creator<C0812feyxiexzfUjhhgtg> CREATOR = new C2921Ujhhgtgfeyxiexzf(7);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Parcelable f3219Ujhhgtgfeyxiexzf;

    public C0812feyxiexzfUjhhgtg(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3219Ujhhgtgfeyxiexzf = parcel.readParcelable(classLoader == null ? AbstractC0822feyxiexzfUjhhgtg.class.getClassLoader() : classLoader);
    }

    @Override // p000.AbstractC2922Ujhhgtgfeyxiexzf, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f3219Ujhhgtgfeyxiexzf, 0);
    }
}
