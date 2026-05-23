package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0051 implements Parcelable.ClassLoaderCreator {

    public final /* synthetic */ int f984;

    public /* synthetic */ C0051(int i) {
        this.f984 = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f984) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0052.f985;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C0454(parcel, classLoader);
            case 2:
                return new C0685(parcel, classLoader);
            case 3:
                return new C0866(parcel, classLoader);
            case 4:
                return new C1906(parcel, classLoader);
            case 5:
                return new C2130(parcel, classLoader);
            case 6:
                return new C2329(parcel, classLoader);
            case 7:
                return new C2501(parcel, classLoader);
            case 8:
                return new C2703(parcel, classLoader);
            case 9:
                return new C2911(parcel, classLoader);
            default:
                return new C3417(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f984) {
            case 0:
                return new AbstractC0052[i];
            case 1:
                return new C0454[i];
            case 2:
                return new C0685[i];
            case 3:
                return new C0866[i];
            case 4:
                return new C1906[i];
            case 5:
                return new C2130[i];
            case 6:
                return new C2329[i];
            case 7:
                return new C2501[i];
            case 8:
                return new C2703[i];
            case 9:
                return new C2911[i];
            default:
                return new C3417[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f984) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0052.f985;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C0454(parcel, null);
            case 2:
                return new C0685(parcel, null);
            case 3:
                return new C0866(parcel, null);
            case 4:
                return new C1906(parcel, null);
            case 5:
                return new C2130(parcel, null);
            case 6:
                return new C2329(parcel, null);
            case 7:
                return new C2501(parcel, null);
            case 8:
                return new C2703(parcel, null);
            case 9:
                return new C2911(parcel, null);
            default:
                return new C3417(parcel, null);
        }
    }
}
