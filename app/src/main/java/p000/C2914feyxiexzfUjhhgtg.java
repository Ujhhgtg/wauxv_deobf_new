package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴ要点脸ᛳᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2914feyxiexzfUjhhgtg extends AbstractC2922Ujhhgtgfeyxiexzf {
    public static final Parcelable.Creator<C2914feyxiexzfUjhhgtg> CREATOR = new C2921Ujhhgtgfeyxiexzf(2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f9198Ujhhgtgfeyxiexzf;

    public C2914feyxiexzfUjhhgtg(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f9198Ujhhgtgfeyxiexzf = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC2922Ujhhgtgfeyxiexzf, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f9198Ujhhgtgfeyxiexzf ? 1 : 0);
    }
}
