package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤞᲈᲇᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0454 extends AbstractC0052 {
    public static final Parcelable.Creator<C0454> CREATOR = new C0051(1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f2025;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int f2026;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean f2027;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean f2028;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean f2029;

    public C0454(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2025 = parcel.readInt();
        this.f2026 = parcel.readInt();
        this.f2027 = parcel.readInt() == 1;
        this.f2028 = parcel.readInt() == 1;
        this.f2029 = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC0052, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2025);
        parcel.writeInt(this.f2026);
        parcel.writeInt(this.f2027 ? 1 : 0);
        parcel.writeInt(this.f2028 ? 1 : 0);
        parcel.writeInt(this.f2029 ? 1 : 0);
    }

    public C0454(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f2025 = bottomSheetBehavior.f609;
        this.f2026 = bottomSheetBehavior.f576;
        this.f2027 = bottomSheetBehavior.f573;
        this.f2028 = bottomSheetBehavior.f606;
        this.f2029 = bottomSheetBehavior.f607;
    }
}
