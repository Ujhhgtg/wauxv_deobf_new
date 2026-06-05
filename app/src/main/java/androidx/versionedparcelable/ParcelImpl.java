package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p000.C1886feyxiexzfUjhhgtg;
import p000.C3005Ujhhgtgfeyxiexzf;
import p000.InterfaceC1869feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C3005Ujhhgtgfeyxiexzf(7);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final InterfaceC1869feyxiexzfUjhhgtg f458Ujhhgtgfeyxiexzf;

    public ParcelImpl(Parcel parcel) {
        this.f458Ujhhgtgfeyxiexzf = new C1886feyxiexzfUjhhgtg(parcel).m3215Ujhhgtgfeyxiexzf();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C1886feyxiexzfUjhhgtg(parcel).m3216Ujhhgtgfeyxiexzf(this.f458Ujhhgtgfeyxiexzf);
    }
}
