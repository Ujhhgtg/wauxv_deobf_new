package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱ能不能ᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0189Ujhhgtgfeyxiexzf extends AbstractC2922Ujhhgtgfeyxiexzf {
    public static final Parcelable.Creator<C0189Ujhhgtgfeyxiexzf> CREATOR = new C2921Ujhhgtgfeyxiexzf(4);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f1397Ujhhgtgfeyxiexzf;

    public C0189Ujhhgtgfeyxiexzf(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C0189Ujhhgtgfeyxiexzf.class.getClassLoader();
        }
        this.f1397Ujhhgtgfeyxiexzf = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC2922Ujhhgtgfeyxiexzf, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1397Ujhhgtgfeyxiexzf ? 1 : 0);
    }
}
