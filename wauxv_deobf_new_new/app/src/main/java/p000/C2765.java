package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᲈᤝᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2765 extends AbstractC0059 {
    public static final Parcelable.Creator<C2765> CREATOR = new C0058(8);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f8884;

    public C2765(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8884 = parcel.readInt();
    }

    @Override // p000.AbstractC0059, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f8884);
    }

    public C2765(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f8884 = sideSheetBehavior.f830;
    }
}
