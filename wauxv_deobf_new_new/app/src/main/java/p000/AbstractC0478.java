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
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᲇᲈᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0478 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final byte[] f2116 = {66, 83, JSONB.Constants.BC_INT32, 83};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final SecureRandom f2117 = new SecureRandom();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static boolean m1849(Class cls) {
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            while (componentType != null && componentType.isArray()) {
                componentType = componentType.getComponentType();
            }
            if (componentType != null) {
                return componentType.isPrimitive() || m1849(componentType);
            }
            return false;
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls) || cls == String.class || cls == Boolean.class || cls == Character.class || Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls) || cls == Enum.class || Enum.class.isAssignableFrom(cls) || cls.getName().startsWith("java.lang.invoke.") || cls.getName().startsWith("java.lang.constant.")) {
            return true;
        }
        return cls.getName().startsWith("bsh.");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m1850(BshSnapshot bshSnapshot, FileOutputStream fileOutputStream, SecretKeySpec secretKeySpec) throws IOException {
        byte[] bArr = new byte[12];
        f2117.nextBytes(bArr);
        fileOutputStream.write(f2116);
        fileOutputStream.write(1);
        fileOutputStream.write(12);
        fileOutputStream.write(bArr);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeySpec, new GCMParameterSpec(128, bArr));
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
