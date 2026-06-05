package p000;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱfeyxiexzfᛱ要点脸ᛳᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2602feyxiexzfUjhhgtg extends AbstractC2601feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f8406Ujhhgtgfeyxiexzf;

    public String toString() {
        switch (this.f8406Ujhhgtgfeyxiexzf) {
            case 0:
                return "Dir: " + this.f8405Ujhhgtgfeyxiexzf;
            case 1:
            default:
                return super.toString();
            case 2:
                return "Jrt: " + this.f8405Ujhhgtgfeyxiexzf;
        }
    }

    @Override // p000.AbstractC2601feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final byte[] mo3879Ujhhgtgfeyxiexzf(String str) {
        switch (this.f8406Ujhhgtgfeyxiexzf) {
            case 0:
                File file = new File((File) this.f8405Ujhhgtgfeyxiexzf, str.replace('.', File.separatorChar) + ".class");
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
                return (byte[]) this.f8405Ujhhgtgfeyxiexzf;
            default:
                try {
                    DataInputStream dataInputStream2 = new DataInputStream((InputStream) new URL(this.f8405Ujhhgtgfeyxiexzf + ("/" + str.replace('.', '/') + ".class")).getContent());
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
