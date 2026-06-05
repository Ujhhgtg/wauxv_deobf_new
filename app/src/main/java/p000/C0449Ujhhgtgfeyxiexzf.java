package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛲ要点脸能不能ᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0449Ujhhgtgfeyxiexzf extends AbstractC2922Ujhhgtgfeyxiexzf {
    public static final Parcelable.Creator<C0449Ujhhgtgfeyxiexzf> CREATOR = new C2921Ujhhgtgfeyxiexzf(5);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Bundle f2348Ujhhgtgfeyxiexzf;

    public C0449Ujhhgtgfeyxiexzf(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2348Ujhhgtgfeyxiexzf = parcel.readBundle(classLoader == null ? C0449Ujhhgtgfeyxiexzf.class.getClassLoader() : classLoader);
    }

    @Override // p000.AbstractC2922Ujhhgtgfeyxiexzf, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.f2348Ujhhgtgfeyxiexzf);
    }
}
