package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1729Ujhhgtgfeyxiexzf extends AbstractC2922Ujhhgtgfeyxiexzf {
    public static final Parcelable.Creator<C1729Ujhhgtgfeyxiexzf> CREATOR = new C2921Ujhhgtgfeyxiexzf(10);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f5802Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f5803Ujhhgtgfeyxiexzf;

    public C1729Ujhhgtgfeyxiexzf(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5802Ujhhgtgfeyxiexzf = parcel.readInt();
        this.f5803Ujhhgtgfeyxiexzf = parcel.readInt() != 0;
    }

    @Override // p000.AbstractC2922Ujhhgtgfeyxiexzf, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f5802Ujhhgtgfeyxiexzf);
        parcel.writeInt(this.f5803Ujhhgtgfeyxiexzf ? 1 : 0);
    }
}
