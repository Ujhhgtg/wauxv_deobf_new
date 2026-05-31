package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᲇᲀᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0429 extends AbstractC0059 {
    public static final Parcelable.Creator<C0429> CREATOR = new C0058(1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f1997;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f1998;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean f1999;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean f2000;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean f2001;

    public C0429(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1997 = parcel.readInt();
        this.f1998 = parcel.readInt();
        this.f1999 = parcel.readInt() == 1;
        this.f2000 = parcel.readInt() == 1;
        this.f2001 = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC0059, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1997);
        parcel.writeInt(this.f1998);
        parcel.writeInt(this.f1999 ? 1 : 0);
        parcel.writeInt(this.f2000 ? 1 : 0);
        parcel.writeInt(this.f2001 ? 1 : 0);
    }

    public C0429(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f1997 = bottomSheetBehavior.f661;
        this.f1998 = bottomSheetBehavior.f628;
        this.f1999 = bottomSheetBehavior.f625;
        this.f2000 = bottomSheetBehavior.f658;
        this.f2001 = bottomSheetBehavior.f659;
    }
}
