package p000;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0134 implements Parcelable.Creator {

    public final /* synthetic */ int f1103;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1103) {
            case 0:
                C0135 c0135 = new C0135();
                c0135.f1104 = parcel.readInt();
                return c0135;
            case 1:
                C0364 c0364 = new C0364();
                c0364.f1707 = 255;
                c0364.f1709 = -2;
                c0364.f1710 = -2;
                c0364.f1711 = -2;
                c0364.f1718 = Boolean.TRUE;
                c0364.f1699 = parcel.readInt();
                c0364.f1700 = (Integer) parcel.readSerializable();
                c0364.f1701 = (Integer) parcel.readSerializable();
                c0364.f1702 = (Integer) parcel.readSerializable();
                c0364.f1703 = (Integer) parcel.readSerializable();
                c0364.f1704 = (Integer) parcel.readSerializable();
                c0364.f1705 = (Integer) parcel.readSerializable();
                c0364.f1706 = (Integer) parcel.readSerializable();
                c0364.f1707 = parcel.readInt();
                c0364.f1708 = parcel.readString();
                c0364.f1709 = parcel.readInt();
                c0364.f1710 = parcel.readInt();
                c0364.f1711 = parcel.readInt();
                c0364.f1713 = parcel.readString();
                c0364.f1714 = parcel.readString();
                c0364.f1715 = parcel.readInt();
                c0364.f1717 = (Integer) parcel.readSerializable();
                c0364.f1719 = (Integer) parcel.readSerializable();
                c0364.f1720 = (Integer) parcel.readSerializable();
                c0364.f1721 = (Integer) parcel.readSerializable();
                c0364.f1722 = (Integer) parcel.readSerializable();
                c0364.f1723 = (Integer) parcel.readSerializable();
                c0364.f1724 = (Integer) parcel.readSerializable();
                c0364.f1727 = (Integer) parcel.readSerializable();
                c0364.f1725 = (Integer) parcel.readSerializable();
                c0364.f1726 = (Integer) parcel.readSerializable();
                c0364.f1718 = (Boolean) parcel.readSerializable();
                c0364.f1712 = (Locale) parcel.readSerializable();
                c0364.f1728 = (Boolean) parcel.readSerializable();
                return c0364;
            case 2:
                C0388 c0388 = new C0388(parcel);
                c0388.f1794 = parcel.readFloat();
                c0388.f1795 = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                c0388.f1796 = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                c0388.f1797 = parcel.readFloat();
                c0388.f1798 = parcel.createBooleanArray()[0];
                return c0388;
            case 3:
                C1789 c1789 = new C1789();
                c1789.f5949 = parcel.readInt();
                c1789.f5950 = parcel.readInt();
                c1789.f5951 = parcel.readInt() == 1;
                return c1789;
            case 4:
                C1913 c1913 = new C1913(parcel);
                c1913.f6311 = ((Integer) parcel.readValue(C1913.class.getClassLoader())).intValue();
                return c1913;
            case 5:
                C2126 c2126 = new C2126();
                c2126.f7055 = parcel.readInt();
                c2126.f7056 = (C2329) parcel.readParcelable(C2126.class.getClassLoader());
                return c2126;
            case 6:
                C2135 c2135 = new C2135(parcel);
                c2135.f7070 = parcel.readInt();
                return c2135;
            case 7:
                return new ParcelImpl(parcel);
            case 8:
                C2805 c2805 = new C2805();
                c2805.f8945 = parcel.readInt();
                c2805.f8946 = parcel.readInt();
                c2805.f8948 = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    c2805.f8947 = iArr;
                    parcel.readIntArray(iArr);
                }
                return c2805;
            default:
                C2806 c2806 = new C2806();
                c2806.f8949 = parcel.readInt();
                c2806.f8950 = parcel.readInt();
                int i2 = parcel.readInt();
                c2806.f8951 = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    c2806.f8952 = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i3 = parcel.readInt();
                c2806.f8953 = i3;
                if (i3 > 0) {
                    int[] iArr3 = new int[i3];
                    c2806.f8954 = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c2806.f8956 = parcel.readInt() == 1;
                c2806.f8957 = parcel.readInt() == 1;
                c2806.f8958 = parcel.readInt() == 1;
                c2806.f8955 = parcel.readArrayList(C2805.class.getClassLoader());
                return c2806;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f1103) {
            case 0:
                return new C0135[i];
            case 1:
                return new C0364[i];
            case 2:
                return new C0388[i];
            case 3:
                return new C1789[i];
            case 4:
                return new C1913[i];
            case 5:
                return new C2126[i];
            case 6:
                return new C2135[i];
            case 7:
                return new ParcelImpl[i];
            case 8:
                return new C2805[i];
            default:
                return new C2806[i];
        }
    }
}
