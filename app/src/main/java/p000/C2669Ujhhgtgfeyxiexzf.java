package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲ要点脸ᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2669Ujhhgtgfeyxiexzf extends AbstractC2922Ujhhgtgfeyxiexzf {
    public static final Parcelable.Creator<C2669Ujhhgtgfeyxiexzf> CREATOR = new C2921Ujhhgtgfeyxiexzf(1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f8537Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int f8538Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final boolean f8539Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final boolean f8540Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean f8541Ujhhgtgfeyxiexzf;

    public C2669Ujhhgtgfeyxiexzf(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8537Ujhhgtgfeyxiexzf = parcel.readInt();
        this.f8538Ujhhgtgfeyxiexzf = parcel.readInt();
        this.f8539Ujhhgtgfeyxiexzf = parcel.readInt() == 1;
        this.f8540Ujhhgtgfeyxiexzf = parcel.readInt() == 1;
        this.f8541Ujhhgtgfeyxiexzf = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC2922Ujhhgtgfeyxiexzf, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f8537Ujhhgtgfeyxiexzf);
        parcel.writeInt(this.f8538Ujhhgtgfeyxiexzf);
        parcel.writeInt(this.f8539Ujhhgtgfeyxiexzf ? 1 : 0);
        parcel.writeInt(this.f8540Ujhhgtgfeyxiexzf ? 1 : 0);
        parcel.writeInt(this.f8541Ujhhgtgfeyxiexzf ? 1 : 0);
    }

    public C2669Ujhhgtgfeyxiexzf(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f8537Ujhhgtgfeyxiexzf = bottomSheetBehavior.f675feyxiexzfUjhhgtg;
        this.f8538Ujhhgtgfeyxiexzf = bottomSheetBehavior.f642Ujhhgtgfeyxiexzf;
        this.f8539Ujhhgtgfeyxiexzf = bottomSheetBehavior.f639Ujhhgtgfeyxiexzf;
        this.f8540Ujhhgtgfeyxiexzf = bottomSheetBehavior.f672feyxiexzfUjhhgtg;
        this.f8541Ujhhgtgfeyxiexzf = bottomSheetBehavior.f673feyxiexzfUjhhgtg;
    }
}
