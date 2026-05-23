package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1924 implements InterfaceC0955 {

    public static final String[] f6358 = {"_data"};

    public final /* synthetic */ int f6359;

    public final Object f6360;

    public final Object f6361;

    public /* synthetic */ C1924(Object obj, int i, Object obj2) {
        this.f6359 = i;
        this.f6360 = obj;
        this.f6361 = obj2;
    }

    @Override // p000.InterfaceC0955
    public final void cancel() {
        int i = this.f6359;
    }

    @Override // p000.InterfaceC0955
    public final Class mo1391() {
        switch (this.f6359) {
            case 0:
                return File.class;
            default:
                switch (((C0373) this.f6361).f1756) {
                    case 6:
                        return ByteBuffer.class;
                    default:
                        return InputStream.class;
                }
        }
    }

    @Override // p000.InterfaceC0955
    public final void mo1855() {
        int i = this.f6359;
    }

    @Override // p000.InterfaceC0955
    public final void mo1856(EnumC2401 enumC2401, InterfaceC0954 interfaceC0954) {
        Object objWrap;
        switch (this.f6359) {
            case 0:
                Cursor cursorQuery = ((Context) this.f6360).getContentResolver().query((Uri) this.f6361, f6358, null, null, null);
                String string = null;
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                    break;
                }
                if (!TextUtils.isEmpty(string)) {
                    interfaceC0954.mo1883(new File(string));
                    return;
                }
                interfaceC0954.mo1882(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f6361)));
                return;
            default:
                C0373 c0373 = (C0373) this.f6361;
                byte[] bArr = (byte[]) this.f6360;
                switch (c0373.f1756) {
                    case 6:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                interfaceC0954.mo1883(objWrap);
                return;
        }
    }

    @Override // p000.InterfaceC0955
    public final int mo1857() {
        switch (this.f6359) {
        }
        return 1;
    }

    private final void m3728() {
    }

    private final void m3729() {
    }

    private final void m3730() {
    }

    private final void m3731() {
    }
}
