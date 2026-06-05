package p000;

import bsh.snapshot.BshSnapshot;
import com.alibaba.fastjson2.JSONB;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱfeyxiexzfᛱᛳᛴ要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2590feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final byte[] f8385Ujhhgtgfeyxiexzf = {66, 83, JSONB.Constants.BC_INT32, 83};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final SecureRandom f8386Ujhhgtgfeyxiexzf = new SecureRandom();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static boolean m3847Ujhhgtgfeyxiexzf(Class cls) {
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            while (componentType != null && componentType.isArray()) {
                componentType = componentType.getComponentType();
            }
            if (componentType != null) {
                return componentType.isPrimitive() || m3847Ujhhgtgfeyxiexzf(componentType);
            }
            return false;
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls) || cls == String.class || cls == Boolean.class || cls == Character.class || Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls) || cls == Enum.class || Enum.class.isAssignableFrom(cls) || cls.getName().startsWith("java.lang.invoke.") || cls.getName().startsWith("java.lang.constant.")) {
            return true;
        }
        return cls.getName().startsWith("bsh.");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m3848Ujhhgtgfeyxiexzf(BshSnapshot bshSnapshot, FileOutputStream fileOutputStream, SecretKey secretKey) throws IOException {
        byte[] bArr = new byte[12];
        f8386Ujhhgtgfeyxiexzf.nextBytes(bArr);
        fileOutputStream.write(f8385Ujhhgtgfeyxiexzf);
        fileOutputStream.write(1);
        fileOutputStream.write(12);
        fileOutputStream.write(bArr);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKey, new GCMParameterSpec(128, bArr));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new CipherOutputStream(fileOutputStream, cipher));
            try {
                objectOutputStream.writeObject(bshSnapshot);
                objectOutputStream.close();
            } catch (Throwable th) {
                try {
                    objectOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (GeneralSecurityException e) {
            throw new IOException("BeanShell snapshot encrypt failed", e);
        }
    }
}
