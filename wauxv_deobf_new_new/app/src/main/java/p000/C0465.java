package p000;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᤝᲇᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0465 extends AbstractC0464 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2080;

    public String toString() {
        switch (this.f2080) {
            case 0:
                return "Dir: " + this.f2079;
            case 1:
            default:
                return super.toString();
            case 2:
                return "Jrt: " + this.f2079;
        }
    }

    @Override // p000.AbstractC0464
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final byte[] mo1831(String str) {
        switch (this.f2080) {
            case 0:
                File file = new File((File) this.f2079, str.replace('.', File.separatorChar) + ".class");
                if (!file.exists()) {
                    return null;
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                        try {
                            byte[] bArr = new byte[(int) file.length()];
                            dataInputStream.readFully(bArr);
                            dataInputStream.close();
                            dataInputStream.close();
                            fileInputStream.close();
                            return bArr;
                        } catch (Throwable th) {
                            try {
                                dataInputStream.close();
                                break;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileInputStream.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (IOException e) {
                    throw new RuntimeException("Couldn't load file: " + file, e);
                }
            case 1:
                return (byte[]) this.f2079;
            default:
                try {
                    DataInputStream dataInputStream2 = new DataInputStream((InputStream) new URL(this.f2079 + ("/" + str.replace('.', '/') + ".class")).getContent());
                    try {
                        byte[] bArr2 = new byte[dataInputStream2.available()];
                        dataInputStream2.readFully(bArr2);
                        dataInputStream2.close();
                        return bArr2;
                    } catch (Throwable th5) {
                        try {
                            dataInputStream2.close();
                            break;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (IOException unused) {
                    return new byte[0];
                }
        }
    }
}
