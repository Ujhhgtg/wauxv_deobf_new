package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ要点脸ᛳ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1143feyxiexzfUjhhgtg implements Parcelable {
    public static final Parcelable.Creator<C1143feyxiexzfUjhhgtg> CREATOR = new C3005Ujhhgtgfeyxiexzf(8);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f4326Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f4327Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int[] f4328Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f4329Ujhhgtgfeyxiexzf;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f4326Ujhhgtgfeyxiexzf + ", mGapDir=" + this.f4327Ujhhgtgfeyxiexzf + ", mHasUnwantedGapAfter=" + this.f4329Ujhhgtgfeyxiexzf + ", mGapPerSpan=" + Arrays.toString(this.f4328Ujhhgtgfeyxiexzf) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4326Ujhhgtgfeyxiexzf);
        parcel.writeInt(this.f4327Ujhhgtgfeyxiexzf);
        parcel.writeInt(this.f4329Ujhhgtgfeyxiexzf ? 1 : 0);
        int[] iArr = this.f4328Ujhhgtgfeyxiexzf;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f4328Ujhhgtgfeyxiexzf);
        }
    }
}
