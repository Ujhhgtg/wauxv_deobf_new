package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0058 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1049;

    public /* synthetic */ C0058(int i) {
        this.f1049 = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f1049) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0059.f1050;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C0429(parcel, classLoader);
            case 2:
                return new C0676(parcel, classLoader);
            case 3:
                return new C0865(parcel, classLoader);
            case 4:
                return new C1933(parcel, classLoader);
            case 5:
                return new C2164(parcel, classLoader);
            case 6:
                return new C2369(parcel, classLoader);
            case 7:
                return new C2556(parcel, classLoader);
            case 8:
                return new C2765(parcel, classLoader);
            case 9:
                return new C2970(parcel, classLoader);
            default:
                return new C3475(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f1049) {
            case 0:
                return new AbstractC0059[i];
            case 1:
                return new C0429[i];
            case 2:
                return new C0676[i];
            case 3:
                return new C0865[i];
            case 4:
                return new C1933[i];
            case 5:
                return new C2164[i];
            case 6:
                return new C2369[i];
            case 7:
                return new C2556[i];
            case 8:
                return new C2765[i];
            case 9:
                return new C2970[i];
            default:
                return new C3475[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1049) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0059.f1050;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C0429(parcel, null);
            case 2:
                return new C0676(parcel, null);
            case 3:
                return new C0865(parcel, null);
            case 4:
                return new C1933(parcel, null);
            case 5:
                return new C2164(parcel, null);
            case 6:
                return new C2369(parcel, null);
            case 7:
                return new C2556(parcel, null);
            case 8:
                return new C2765(parcel, null);
            case 9:
                return new C2970(parcel, null);
            default:
                return new C3475(parcel, null);
        }
    }
}
