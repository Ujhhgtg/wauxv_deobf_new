package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import okhttp3.internal.Util;
import p000.AbstractC2689Ujhhgtgfeyxiexzf;
import p000.AbstractC3100Ujhhgtgfeyxiexzf;
import p000.C1744Ujhhgtgfeyxiexzf;
import p000.C2598feyxiexzfUjhhgtg;
import p000.C2633Ujhhgtgfeyxiexzf;
import p000.InterfaceC1227feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Relay {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final C2633Ujhhgtgfeyxiexzf PREFIX_CLEAN;
    public static final C2633Ujhhgtgfeyxiexzf PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final C2598feyxiexzfUjhhgtg buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final C2633Ujhhgtgfeyxiexzf metadata;
    private int sourceCount;
    private InterfaceC1227feyxiexzfUjhhgtg upstream;
    private final C2598feyxiexzfUjhhgtg upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
            this();
        }

        public final Relay edit(File file, InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg, C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf, long j) throws IOException {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, interfaceC1227feyxiexzfUjhhgtg, 0L, c2633Ujhhgtgfeyxiexzf, j, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
            C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
            fileOperator.read(0L, c2598feyxiexzfUjhhgtg, 32L);
            C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf = Relay.PREFIX_CLEAN;
            if (!c2598feyxiexzfUjhhgtg.mo2106Ujhhgtgfeyxiexzf(c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf()).equals(c2633Ujhhgtgfeyxiexzf)) {
                throw new IOException("unreadable cache file");
            }
            long j = c2598feyxiexzfUjhhgtg.readLong();
            long j2 = c2598feyxiexzfUjhhgtg.readLong();
            C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg2 = new C2598feyxiexzfUjhhgtg();
            fileOperator.read(32 + j, c2598feyxiexzfUjhhgtg2, j2);
            return new Relay(randomAccessFile, null, j, c2598feyxiexzfUjhhgtg2.mo2106Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg2.f8401Ujhhgtgfeyxiexzf), 0L, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: obf */
    public final class RelaySource implements InterfaceC1227feyxiexzfUjhhgtg {
        private FileOperator fileOperator;
        private long sourcePos;
        private final C1744Ujhhgtgfeyxiexzf timeout = new C1744Ujhhgtgfeyxiexzf();

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

        @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
        public long read(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) throws IOException {
            char c;
            if (this.fileOperator == null) {
                throw new IllegalStateException("Check failed.");
            }
            Relay relay = Relay.this;
            synchronized (relay) {
                while (true) {
                    try {
                        if (this.sourcePos != relay.getUpstreamPos()) {
                            long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().f8401Ujhhgtgfeyxiexzf;
                            if (this.sourcePos < upstreamPos) {
                                c = 2;
                                break;
                            }
                            long jMin = Math.min(j, relay.getUpstreamPos() - this.sourcePos);
                            relay.getBuffer().m3858Ujhhgtgfeyxiexzf(this.sourcePos - upstreamPos, c2598feyxiexzfUjhhgtg, jMin);
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
                    this.fileOperator.read(this.sourcePos + 32, c2598feyxiexzfUjhhgtg, jMin2);
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
                    Relay.this.getUpstreamBuffer().m3858Ujhhgtgfeyxiexzf(0L, c2598feyxiexzfUjhhgtg, jMin3);
                    this.sourcePos += jMin3;
                    this.fileOperator.write(Relay.this.getUpstreamPos() + 32, Relay.this.getUpstreamBuffer().clone(), j2);
                    Relay relay4 = Relay.this;
                    synchronized (relay4) {
                        try {
                            relay4.getBuffer().write(relay4.getUpstreamBuffer(), j2);
                            if (relay4.getBuffer().f8401Ujhhgtgfeyxiexzf > relay4.getBufferMaxSize()) {
                                relay4.getBuffer().skip(relay4.getBuffer().f8401Ujhhgtgfeyxiexzf - relay4.getBufferMaxSize());
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

        @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
        public C1744Ujhhgtgfeyxiexzf timeout() {
            return this.timeout;
        }
    }

    static {
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf = new C2633Ujhhgtgfeyxiexzf("OkHttp cache v1\n".getBytes(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf));
        c2633Ujhhgtgfeyxiexzf.f8469Ujhhgtgfeyxiexzf = "OkHttp cache v1\n";
        PREFIX_CLEAN = c2633Ujhhgtgfeyxiexzf;
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf2 = new C2633Ujhhgtgfeyxiexzf("OkHttp DIRTY :(\n".getBytes(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf));
        c2633Ujhhgtgfeyxiexzf2.f8469Ujhhgtgfeyxiexzf = "OkHttp DIRTY :(\n";
        PREFIX_DIRTY = c2633Ujhhgtgfeyxiexzf2;
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg, long j, C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf, long j2, AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
        this(randomAccessFile, interfaceC1227feyxiexzfUjhhgtg, j, c2633Ujhhgtgfeyxiexzf, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf, long j, long j2) throws IOException {
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
        c2598feyxiexzfUjhhgtg.m3868feyxiexzfUjhhgtg(c2633Ujhhgtgfeyxiexzf);
        c2598feyxiexzfUjhhgtg.m3873feyxiexzfUjhhgtg(j);
        c2598feyxiexzfUjhhgtg.m3873feyxiexzfUjhhgtg(j2);
        if (c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf != 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        new FileOperator(this.file.getChannel()).write(0L, c2598feyxiexzfUjhhgtg, 32L);
    }

    private final void writeMetadata(long j) throws IOException {
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
        c2598feyxiexzfUjhhgtg.m3868feyxiexzfUjhhgtg(this.metadata);
        new FileOperator(this.file.getChannel()).write(32 + j, c2598feyxiexzfUjhhgtg, this.metadata.mo2578Ujhhgtgfeyxiexzf());
    }

    public final void commit(long j) throws IOException {
        writeMetadata(j);
        this.file.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, this.metadata.mo2578Ujhhgtgfeyxiexzf());
        this.file.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg = this.upstream;
        if (interfaceC1227feyxiexzfUjhhgtg != null) {
            Util.closeQuietly(interfaceC1227feyxiexzfUjhhgtg);
        }
        this.upstream = null;
    }

    public final C2598feyxiexzfUjhhgtg getBuffer() {
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

    public final InterfaceC1227feyxiexzfUjhhgtg getUpstream() {
        return this.upstream;
    }

    public final C2598feyxiexzfUjhhgtg getUpstreamBuffer() {
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

    public final C2633Ujhhgtgfeyxiexzf metadata() {
        return this.metadata;
    }

    public final InterfaceC1227feyxiexzfUjhhgtg newSource() {
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

    public final void setUpstream(InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg) {
        this.upstream = interfaceC1227feyxiexzfUjhhgtg;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    private Relay(RandomAccessFile randomAccessFile, InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg, long j, C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf, long j2) {
        this.file = randomAccessFile;
        this.upstream = interfaceC1227feyxiexzfUjhhgtg;
        this.upstreamPos = j;
        this.metadata = c2633Ujhhgtgfeyxiexzf;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new C2598feyxiexzfUjhhgtg();
        this.complete = interfaceC1227feyxiexzfUjhhgtg == null;
        this.buffer = new C2598feyxiexzfUjhhgtg();
    }
}
