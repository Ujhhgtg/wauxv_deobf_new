package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2922Ujhhgtgfeyxiexzf implements Parcelable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Parcelable f9210Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final C2920Ujhhgtgfeyxiexzf f9209Ujhhgtgfeyxiexzf = new C2920Ujhhgtgfeyxiexzf();
    public static final Parcelable.Creator<AbstractC2922Ujhhgtgfeyxiexzf> CREATOR = new C2921Ujhhgtgfeyxiexzf(0);

    public AbstractC2922Ujhhgtgfeyxiexzf() {
        this.f9210Ujhhgtgfeyxiexzf = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f9210Ujhhgtgfeyxiexzf, i);
    }

    public AbstractC2922Ujhhgtgfeyxiexzf(Parcelable parcelable) {
        if (parcelable != null) {
            this.f9210Ujhhgtgfeyxiexzf = parcelable == f9209Ujhhgtgfeyxiexzf ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC2922Ujhhgtgfeyxiexzf(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f9210Ujhhgtgfeyxiexzf = parcelable == null ? f9209Ujhhgtgfeyxiexzf : parcelable;
    }
}
