package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2921Ujhhgtgfeyxiexzf implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9208Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2921Ujhhgtgfeyxiexzf(int i) {
        this.f9208Ujhhgtgfeyxiexzf = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f9208Ujhhgtgfeyxiexzf) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC2922Ujhhgtgfeyxiexzf.f9209Ujhhgtgfeyxiexzf;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C2669Ujhhgtgfeyxiexzf(parcel, classLoader);
            case 2:
                return new C2914feyxiexzfUjhhgtg(parcel, classLoader);
            case 3:
                return new C3728Ujhhgtgfeyxiexzf(parcel, classLoader);
            case 4:
                return new C0189Ujhhgtgfeyxiexzf(parcel, classLoader);
            case 5:
                return new C0449Ujhhgtgfeyxiexzf(parcel, classLoader);
            case 6:
                return new C1377feyxiexzfUjhhgtg(parcel, classLoader);
            case 7:
                return new C0812feyxiexzfUjhhgtg(parcel, classLoader);
            case 8:
                return new C1049feyxiexzfUjhhgtg(parcel, classLoader);
            case 9:
                return new C1974Ujhhgtgfeyxiexzf(parcel, classLoader);
            default:
                return new C1729Ujhhgtgfeyxiexzf(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f9208Ujhhgtgfeyxiexzf) {
            case 0:
                return new AbstractC2922Ujhhgtgfeyxiexzf[i];
            case 1:
                return new C2669Ujhhgtgfeyxiexzf[i];
            case 2:
                return new C2914feyxiexzfUjhhgtg[i];
            case 3:
                return new C3728Ujhhgtgfeyxiexzf[i];
            case 4:
                return new C0189Ujhhgtgfeyxiexzf[i];
            case 5:
                return new C0449Ujhhgtgfeyxiexzf[i];
            case 6:
                return new C1377feyxiexzfUjhhgtg[i];
            case 7:
                return new C0812feyxiexzfUjhhgtg[i];
            case 8:
                return new C1049feyxiexzfUjhhgtg[i];
            case 9:
                return new C1974Ujhhgtgfeyxiexzf[i];
            default:
                return new C1729Ujhhgtgfeyxiexzf[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f9208Ujhhgtgfeyxiexzf) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC2922Ujhhgtgfeyxiexzf.f9209Ujhhgtgfeyxiexzf;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C2669Ujhhgtgfeyxiexzf(parcel, null);
            case 2:
                return new C2914feyxiexzfUjhhgtg(parcel, null);
            case 3:
                return new C3728Ujhhgtgfeyxiexzf(parcel, null);
            case 4:
                return new C0189Ujhhgtgfeyxiexzf(parcel, null);
            case 5:
                return new C0449Ujhhgtgfeyxiexzf(parcel, null);
            case 6:
                return new C1377feyxiexzfUjhhgtg(parcel, null);
            case 7:
                return new C0812feyxiexzfUjhhgtg(parcel, null);
            case 8:
                return new C1049feyxiexzfUjhhgtg(parcel, null);
            case 9:
                return new C1974Ujhhgtgfeyxiexzf(parcel, null);
            default:
                return new C1729Ujhhgtgfeyxiexzf(parcel, null);
        }
    }
}
