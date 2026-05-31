package p000;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᤝᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0466 extends AbstractC0464 {
    public C0466(URL url) {
        this.f2079 = url;
    }

    public final String toString() {
        return "Jar: " + this.f2079;
    }

    @Override // p000.AbstractC0464
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final byte[] mo1831(String str) {
        String str2 = "/" + str.replace('.', '/') + ".class";
        try {
            URLClassLoader uRLClassLoader = new URLClassLoader(new URL[]{(URL) this.f2079});
            try {
                DataInputStream dataInputStream = new DataInputStream(uRLClassLoader.loadClass(str).getResourceAsStream(str2));
                try {
                    byte[] bArr = new byte[dataInputStream.available()];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    uRLClassLoader.close();
                    return bArr;
                } catch (Throwable th) {
                    try {
                        dataInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    uRLClassLoader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException | ClassNotFoundException unused) {
            return new byte[0];
        }
    }
}
