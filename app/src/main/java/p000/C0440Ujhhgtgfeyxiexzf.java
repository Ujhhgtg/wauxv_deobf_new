package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛲ能不能ᛱfeyxiexzfᛱ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0440Ujhhgtgfeyxiexzf implements Parcelable {
    public static final Parcelable.Creator<C0440Ujhhgtgfeyxiexzf> CREATOR = new C3005Ujhhgtgfeyxiexzf(5);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f2306Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public C1377feyxiexzfUjhhgtg f2307Ujhhgtgfeyxiexzf;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2306Ujhhgtgfeyxiexzf);
        parcel.writeParcelable(this.f2307Ujhhgtgfeyxiexzf, 0);
    }
}
