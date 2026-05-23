package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0052 implements Parcelable {

    public final Parcelable f986;

    public static final C0050 f985 = new C0050();
    public static final Parcelable.Creator<AbstractC0052> CREATOR = new C0051(0);

    public AbstractC0052() {
        this.f986 = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f986, i);
    }

    public AbstractC0052(Parcelable parcelable) {
        if (parcelable != null) {
            this.f986 = parcelable == f985 ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC0052(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f986 = parcelable == null ? f985 : parcelable;
    }
}
