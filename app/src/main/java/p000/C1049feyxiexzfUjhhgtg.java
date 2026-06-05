package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛲ要点脸能不能ᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1049feyxiexzfUjhhgtg extends AbstractC2922Ujhhgtgfeyxiexzf {
    public static final Parcelable.Creator<C1049feyxiexzfUjhhgtg> CREATOR = new C2921Ujhhgtgfeyxiexzf(8);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f4100Ujhhgtgfeyxiexzf;

    public C1049feyxiexzfUjhhgtg(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4100Ujhhgtgfeyxiexzf = parcel.readInt();
    }

    @Override // p000.AbstractC2922Ujhhgtgfeyxiexzf, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4100Ujhhgtgfeyxiexzf);
    }

    public C1049feyxiexzfUjhhgtg(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f4100Ujhhgtgfeyxiexzf = sideSheetBehavior.f844Ujhhgtgfeyxiexzf;
    }
}
