package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import okhttp3.internal.Util;
import p000.AbstractC0599;
import p000.AbstractC0981;
import p000.C0504;
import p000.C0539;
import p000.C3400;
import p000.InterfaceC2786;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Relay {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final C0539 PREFIX_CLEAN;
    public static final C0539 PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final C0504 buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final C0539 metadata;
    private int sourceCount;
    private InterfaceC2786 upstream;
    private final C0504 upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0981 abstractC0981) {
            this();
        }

        public final Relay edit(File file, InterfaceC2786 interfaceC2786, C0539 c0539, long j) throws IOException {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, interfaceC2786, 0L, c0539, j, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
            C0504 c0504 = new C0504();
            fileOperator.read(0L, c0504, 32L);
            C0539 c0539 = Relay.PREFIX_CLEAN;
            if (!c0504.mo1762(c0539.mo1870()).equals(c0539)) {
                throw new IOException("unreadable cache file");
            }
            long j = c0504.readLong();
            long j2 = c0504.readLong();
            C0504 c0505 = new C0504();
            fileOperator.read(32 + j, c0505, j2);
            return new Relay(randomAccessFile, null, j, c0505.mo1762(c0505.f2172), 0L, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: obf */
    public final class RelaySource implements InterfaceC2786 {
        private FileOperator fileOperator;
        private long sourcePos;
        private final C3400 timeout = new C3400();

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

        @Override // p000.InterfaceC2786
        public long read(C0504 c0504, long j) throws IOException {
            char c;
            if (this.fileOperator == null) {
                throw new IllegalStateException("Check failed.");
            }
            Relay relay = Relay.this;
            synchronized (relay) {
                while (true) {
                    try {
                        if (this.sourcePos != relay.getUpstreamPos()) {
                            long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().f2172;
                            if (this.sourcePos < upstreamPos) {
                                c = 2;
                                break;
                            }
                            long jMin = Math.min(j, relay.getUpstreamPos() - this.sourcePos);
                            relay.getBuffer().m1768(this.sourcePos - upstreamPos, c0504, jMin);
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
                    this.fileOperator.read(this.sourcePos + 32, c0504, jMin2);
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
                    Relay.this.getUpstreamBuffer().m1768(0L, c0504, jMin3);
                    this.sourcePos += jMin3;
                    this.fileOperator.write(Relay.this.getUpstreamPos() + 32, Relay.this.getUpstreamBuffer().clone(), j2);
                    Relay relay4 = Relay.this;
                    synchronized (relay4) {
                        try {
                            relay4.getBuffer().write(relay4.getUpstreamBuffer(), j2);
                            if (relay4.getBuffer().f2172 > relay4.getBufferMaxSize()) {
                                relay4.getBuffer().skip(relay4.getBuffer().f2172 - relay4.getBufferMaxSize());
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

        @Override // p000.InterfaceC2786
        public C3400 timeout() {
            return this.timeout;
        }
    }

    static {
        C0539 c0539 = new C0539("OkHttp cache v1\n".getBytes(AbstractC0599.f2413));
        c0539.f2247 = "OkHttp cache v1\n";
        PREFIX_CLEAN = c0539;
        C0539 c05310 = new C0539("OkHttp DIRTY :(\n".getBytes(AbstractC0599.f2413));
        c05310.f2247 = "OkHttp DIRTY :(\n";
        PREFIX_DIRTY = c05310;
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, InterfaceC2786 interfaceC2786, long j, C0539 c0539, long j2, AbstractC0981 abstractC0981) {
        this(randomAccessFile, interfaceC2786, j, c0539, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(C0539 c0539, long j, long j2) throws IOException {
        C0504 c0504 = new C0504();
        c0504.m1795(c0539);
        c0504.m1800(j);
        c0504.m1800(j2);
        if (c0504.f2172 != 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        new FileOperator(this.file.getChannel()).write(0L, c0504, 32L);
    }

    private final void writeMetadata(long j) throws IOException {
        C0504 c0504 = new C0504();
        c0504.m1795(this.metadata);
        new FileOperator(this.file.getChannel()).write(32 + j, c0504, this.metadata.mo1870());
    }

    public final void commit(long j) throws IOException {
        writeMetadata(j);
        this.file.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, this.metadata.mo1870());
        this.file.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        InterfaceC2786 interfaceC2786 = this.upstream;
        if (interfaceC2786 != null) {
            Util.closeQuietly(interfaceC2786);
        }
        this.upstream = null;
    }

    public final C0504 getBuffer() {
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

    public final InterfaceC2786 getUpstream() {
        return this.upstream;
    }

    public final C0504 getUpstreamBuffer() {
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

    public final C0539 metadata() {
        return this.metadata;
    }

    public final InterfaceC2786 newSource() {
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

    public final void setUpstream(InterfaceC2786 interfaceC2786) {
        this.upstream = interfaceC2786;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    private Relay(RandomAccessFile randomAccessFile, InterfaceC2786 interfaceC2786, long j, C0539 c0539, long j2) {
        this.file = randomAccessFile;
        this.upstream = interfaceC2786;
        this.upstreamPos = j;
        this.metadata = c0539;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new C0504();
        this.complete = interfaceC2786 == null;
        this.buffer = new C0504();
    }
}
