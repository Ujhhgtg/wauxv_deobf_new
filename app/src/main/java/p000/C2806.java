package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2806 implements Parcelable {
    public static final Parcelable.Creator<C2806> CREATOR = new C0134(9);

    public int f8949;

    public int f8950;

    public int f8951;

    public int[] f8952;

    public int f8953;

    public int[] f8954;

    public ArrayList f8955;

    public boolean f8956;

    public boolean f8957;

    public boolean f8958;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8949);
        parcel.writeInt(this.f8950);
        parcel.writeInt(this.f8951);
        if (this.f8951 > 0) {
            parcel.writeIntArray(this.f8952);
        }
        parcel.writeInt(this.f8953);
        if (this.f8953 > 0) {
            parcel.writeIntArray(this.f8954);
        }
        parcel.writeInt(this.f8956 ? 1 : 0);
        parcel.writeInt(this.f8957 ? 1 : 0);
        parcel.writeInt(this.f8958 ? 1 : 0);
        parcel.writeList(this.f8955);
    }
}
