package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.umeng.analytics.pro.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: obf */
    public static class C0035a implements a {
        @Override // com.umeng.analytics.pro.a
        public String a(String str) {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.umeng.analytics.pro.a
        public String b() {
            return null;
        }

        @Override // com.umeng.analytics.pro.a
        public boolean a() {
            return false;
        }
    }

    String a(String str);

    boolean a();

    String b();

    /* JADX INFO: compiled from: obf */
    public static abstract class b extends Binder implements a {
        static final int a = 1;
        static final int b = 2;
        static final int c = 3;
        private static final String d = "com.android.creator.IdsSupplier";

        public b() {
            attachInterface(this, d);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(d);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0036a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        public static a c() {
            return C0036a.a;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(d);
                boolean zA = a();
                parcel2.writeNoException();
                parcel2.writeInt(zA ? 1 : 0);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(d);
                String strA = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(d);
                return true;
            }
            parcel.enforceInterface(d);
            String strB = b();
            parcel2.writeNoException();
            parcel2.writeString(strB);
            return true;
        }

        public static boolean a(a aVar) {
            if (C0036a.a != null || aVar == null) {
                return false;
            }
            C0036a.a = aVar;
            return true;
        }

        /* JADX INFO: renamed from: com.umeng.analytics.pro.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: obf */
        public static class C0036a implements a {
            public static a a;
            private IBinder b;

            public C0036a(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override // com.umeng.analytics.pro.a
            public boolean a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.d);
                    if (!this.b.transact(1, parcelObtain, parcelObtain2, 0) && b.c() != null) {
                        return b.c().a();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.b;
            }

            @Override // com.umeng.analytics.pro.a
            public String b() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.d);
                    if (this.b.transact(3, parcelObtain, parcelObtain2, 0) || b.c() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = b.c().b();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String c() {
                return b.d;
            }

            @Override // com.umeng.analytics.pro.a
            public String a(String str) {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.d);
                    parcelObtain.writeString(str);
                    if (!this.b.transact(2, parcelObtain, parcelObtain2, 0) && b.c() != null) {
                        string = b.c().a(str);
                    } else {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
