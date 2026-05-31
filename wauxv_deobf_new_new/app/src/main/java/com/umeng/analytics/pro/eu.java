package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface eu extends IInterface {

    /* JADX INFO: compiled from: obf */
    public static class a implements eu {
        @Override // com.umeng.analytics.pro.eu
        public String a() {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    String a();

    /* JADX INFO: compiled from: obf */
    public static abstract class b extends Binder implements eu {
        static final int a = 1;
        private static final String b = "com.zui.deviceidservice.IDeviceidInterface";

        /* JADX INFO: compiled from: obf */
        public static class a implements eu {
            public static eu a;
            private IBinder b;

            public a(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override // com.umeng.analytics.pro.eu
            public String a() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.b);
                    if (this.b.transact(1, parcelObtain, parcelObtain2, 0) || b.b() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = b.b().a();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.b;
            }

            public String b() {
                return b.b;
            }
        }

        public b() {
            attachInterface(this, b);
        }

        public static eu a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof eu)) ? new a(iBinder) : (eu) iInterfaceQueryLocalInterface;
        }

        public static eu b() {
            return a.a;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(b);
                return true;
            }
            parcel.enforceInterface(b);
            String strA = a();
            parcel2.writeNoException();
            parcel2.writeString(strA);
            return true;
        }

        public static boolean a(eu euVar) {
            if (a.a != null || euVar == null) {
                return false;
            }
            a.a = euVar;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
