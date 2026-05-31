package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤞᤝᲈᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3475 extends AbstractC0059 {
    public static final Parcelable.Creator<C3475> CREATOR = new C0058(10);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f10922;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f10923;

    public C3475(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10922 = parcel.readInt();
        this.f10923 = parcel.readInt() != 0;
    }

    @Override // p000.AbstractC0059, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f10922);
        parcel.writeInt(this.f10923 ? 1 : 0);
    }
}
