package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1789 implements Parcelable {
    public static final Parcelable.Creator<C1789> CREATOR = new C0134(3);

    public int f5949;

    public int f5950;

    public boolean f5951;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5949);
        parcel.writeInt(this.f5950);
        parcel.writeInt(this.f5951 ? 1 : 0);
    }
}
