package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛳᛴᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3728Ujhhgtgfeyxiexzf extends AbstractC2922Ujhhgtgfeyxiexzf {
    public static final Parcelable.Creator<C3728Ujhhgtgfeyxiexzf> CREATOR = new C2921Ujhhgtgfeyxiexzf(3);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public SparseArray f11791Ujhhgtgfeyxiexzf;

    public C3728Ujhhgtgfeyxiexzf(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f11791Ujhhgtgfeyxiexzf = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f11791Ujhhgtgfeyxiexzf.append(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // p000.AbstractC2922Ujhhgtgfeyxiexzf, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f11791Ujhhgtgfeyxiexzf;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f11791Ujhhgtgfeyxiexzf.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f11791Ujhhgtgfeyxiexzf.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
