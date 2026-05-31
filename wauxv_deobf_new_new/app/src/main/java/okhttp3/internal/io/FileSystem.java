package okhttp3.internal.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;
import p000.AbstractC1467;
import p000.AbstractC2305;
import p000.C0288;
import p000.C0289;
import p000.C3459;
import p000.InterfaceC2774;
import p000.InterfaceC2846;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface FileSystem {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: obf */
        public static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            public InterfaceC2774 appendingSink(File file) {
                int i = 1;
                try {
                    Logger logger = AbstractC2305.f7492;
                    return new C0288(new FileOutputStream(file, true), i, new C3459());
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    Logger logger2 = AbstractC2305.f7492;
                    return new C0288(new FileOutputStream(file, true), i, new C3459());
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(File file) throws IOException {
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(File file) throws IOException {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + file);
                }
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(File file) {
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(File file, File file2) throws IOException {
                delete(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            @Override // okhttp3.internal.io.FileSystem
            public InterfaceC2774 sink(File file) {
                try {
                    return AbstractC1467.m3290(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return AbstractC1467.m3290(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(File file) {
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            public InterfaceC2846 source(File file) {
                Logger logger = AbstractC2305.f7492;
                return new C0289(new FileInputStream(file), 1, C3459.NONE);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    InterfaceC2774 appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    InterfaceC2774 sink(File file);

    long size(File file);

    InterfaceC2846 source(File file);
}
