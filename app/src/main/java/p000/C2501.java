package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲁᛸᲈᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2501 extends AbstractC0052 {
    public static final Parcelable.Creator<C2501> CREATOR = new C0051(7);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Parcelable f7976;

    public C2501(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7976 = parcel.readParcelable(classLoader == null ? AbstractC2491.class.getClassLoader() : classLoader);
    }

    @Override // p000.AbstractC0052, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f7976, 0);
    }
}
