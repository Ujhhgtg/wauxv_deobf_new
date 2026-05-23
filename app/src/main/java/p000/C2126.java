package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2126 implements Parcelable {
    public static final Parcelable.Creator<C2126> CREATOR = new C0134(5);

    public int f7055;

    public C2329 f7056;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7055);
        parcel.writeParcelable(this.f7056, 0);
    }
}
