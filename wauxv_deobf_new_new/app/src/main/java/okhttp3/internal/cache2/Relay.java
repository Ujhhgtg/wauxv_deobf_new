package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import okhttp3.internal.Util;
import p000.AbstractC0580;
import p000.AbstractC0985;
import p000.C0481;
import p000.C0516;
import p000.C3459;
import p000.InterfaceC2846;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Relay {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final C0516 PREFIX_CLEAN;
    public static final C0516 PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final C0481 buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final C0516 metadata;
    private int sourceCount;
    private InterfaceC2846 upstream;
    private final C0481 upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0985 abstractC0985) {
            this();
        }

        public final Relay edit(File file, InterfaceC2846 interfaceC2846, C0516 c0516, long j) throws IOException {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, interfaceC2846, 0L, c0516, j, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
            C0481 c0481 = new C0481();
            fileOperator.read(0L, c0481, 32L);
            C0516 c0516 = Relay.PREFIX_CLEAN;
            if (!c0481.mo1856(c0516.mo1964()).equals(c0516)) {
                throw new IOException("unreadable cache file");
            }
            long j = c0481.readLong();
            long j2 = c0481.readLong();
            C0481 c0482 = new C0481();
            fileOperator.read(32 + j, c0482, j2);
            return new Relay(randomAccessFile, null, j, c0482.mo1856(c0482.f2128), 0L, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: obf */
    public final class RelaySource implements InterfaceC2846 {
        private FileOperator fileOperator;
        private long sourcePos;
        private final C3459 timeout = new C3459();

        public RelaySource() {
            this.fileOperator = new FileOperator(Relay.this.getFile().getChannel());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            Relay relay = Relay.this;
            synchronized (relay) {
                relay.setSourceCount(relay.getSourceCount() - 1);
                if (relay.getSourceCount() == 0) {
                    RandomAccessFile file = relay.getFile();
                    relay.setFile(null);
                    randomAccessFile = file;
                }
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        @Override // p000.InterfaceC2846
        public long read(C0481 c0481, long j) throws IOException {
            char c;
            if (this.fileOperator == null) {
                throw new IllegalStateException("Check failed.");
            }
            Relay relay = Relay.this;
            synchronized (relay) {
                while (true) {
                    try {
                        if (this.sourcePos != relay.getUpstreamPos()) {
                            long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().f2128;
                            if (this.sourcePos < upstreamPos) {
                                c = 2;
                                break;
                            }
                            long jMin = Math.min(j, relay.getUpstreamPos() - this.sourcePos);
                            relay.getBuffer().m1862(this.sourcePos - upstreamPos, c0481, jMin);
                            this.sourcePos += jMin;
                            return jMin;
                        }
                        if (!relay.getComplete()) {
                            if (relay.getUpstreamReader() == null) {
                                relay.setUpstreamReader(Thread.currentThread());
                                c = 1;
                                break;
                            }
                            this.timeout.waitUntilNotified(relay);
                        } else {
                            return -1L;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (c == 2) {
                    long jMin2 = Math.min(j, Relay.this.getUpstreamPos() - this.sourcePos);
                    this.fileOperator.read(this.sourcePos + 32, c0481, jMin2);
                    this.sourcePos += jMin2;
                    return jMin2;
                }
                try {
                    long j2 = Relay.this.getUpstream().read(Relay.this.getUpstreamBuffer(), Relay.this.getBufferMaxSize());
                    if (j2 == -1) {
                        Relay relay2 = Relay.this;
                        relay2.commit(relay2.getUpstreamPos());
                        Relay relay3 = Relay.this;
                        synchronized (relay3) {
                            relay3.setUpstreamReader(null);
                            relay3.notifyAll();
                        }
                        return -1L;
                    }
                    long jMin3 = Math.min(j2, j);
                    Relay.this.getUpstreamBuffer().m1862(0L, c0481, jMin3);
                    this.sourcePos += jMin3;
                    this.fileOperator.write(Relay.this.getUpstreamPos() + 32, Relay.this.getUpstreamBuffer().clone(), j2);
                    Relay relay4 = Relay.this;
                    synchronized (relay4) {
                        try {
                            relay4.getBuffer().write(relay4.getUpstreamBuffer(), j2);
                            if (relay4.getBuffer().f2128 > relay4.getBufferMaxSize()) {
                                relay4.getBuffer().skip(relay4.getBuffer().f2128 - relay4.getBufferMaxSize());
                            }
                            relay4.setUpstreamPos(relay4.getUpstreamPos() + j2);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    Relay relay5 = Relay.this;
                    synchronized (relay5) {
                        relay5.setUpstreamReader(null);
                        relay5.notifyAll();
                    }
                    return jMin3;
                } catch (Throwable th3) {
                    Relay relay6 = Relay.this;
                    synchronized (relay6) {
                        relay6.setUpstreamReader(null);
                        relay6.notifyAll();
                        throw th3;
                    }
                }
            }
        }

        @Override // p000.InterfaceC2846
        public C3459 timeout() {
            return this.timeout;
        }
    }

    static {
        C0516 c0516 = new C0516("OkHttp cache v1\n".getBytes(AbstractC0580.UTF_8));
        c0516.f2203 = "OkHttp cache v1\n";
        PREFIX_CLEAN = c0516;
        C0516 c0517 = new C0516("OkHttp DIRTY :(\n".getBytes(AbstractC0580.UTF_8));
        c0517.f2203 = "OkHttp DIRTY :(\n";
        PREFIX_DIRTY = c0517;
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, InterfaceC2846 interfaceC2846, long j, C0516 c0516, long j2, AbstractC0985 abstractC0985) {
        this(randomAccessFile, interfaceC2846, j, c0516, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(C0516 c0516, long j, long j2) throws IOException {
        C0481 c0481 = new C0481();
        c0481.m1889(c0516);
        c0481.m1894(j);
        c0481.m1894(j2);
        if (c0481.f2128 != 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        new FileOperator(this.file.getChannel()).write(0L, c0481, 32L);
    }

    private final void writeMetadata(long j) throws IOException {
        C0481 c0481 = new C0481();
        c0481.m1889(this.metadata);
        new FileOperator(this.file.getChannel()).write(32 + j, c0481, this.metadata.mo1964());
    }

    public final void commit(long j) throws IOException {
        writeMetadata(j);
        this.file.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, this.metadata.mo1964());
        this.file.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        InterfaceC2846 interfaceC2846 = this.upstream;
        if (interfaceC2846 != null) {
            Util.closeQuietly(interfaceC2846);
        }
        this.upstream = null;
    }

    public final C0481 getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final InterfaceC2846 getUpstream() {
        return this.upstream;
    }

    public final C0481 getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    public final C0516 metadata() {
        return this.metadata;
    }

    public final InterfaceC2846 newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final void setUpstream(InterfaceC2846 interfaceC2846) {
        this.upstream = interfaceC2846;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    private Relay(RandomAccessFile randomAccessFile, InterfaceC2846 interfaceC2846, long j, C0516 c0516, long j2) {
        this.file = randomAccessFile;
        this.upstream = interfaceC2846;
        this.upstreamPos = j;
        this.metadata = c0516;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new C0481();
        this.complete = interfaceC2846 == null;
        this.buffer = new C0481();
    }
}
