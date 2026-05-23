package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2805 implements Parcelable {
    public static final Parcelable.Creator<C2805> CREATOR = new C0134(8);

    public int f8945;

    public int f8946;

    public int[] f8947;

    public boolean f8948;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f8945 + ", mGapDir=" + this.f8946 + ", mHasUnwantedGapAfter=" + this.f8948 + ", mGapPerSpan=" + Arrays.toString(this.f8947) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8945);
        parcel.writeInt(this.f8946);
        parcel.writeInt(this.f8948 ? 1 : 0);
        int[] iArr = this.f8947;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f8947);
        }
    }
}
