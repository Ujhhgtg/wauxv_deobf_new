package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import p000.AbstractC0985;
import p000.AbstractC1095;
import p000.AbstractC2844;
import p000.AbstractC3744;
import p000.C0481;
import p000.C0516;
import p000.C1677;
import p000.C3459;
import p000.InterfaceC0485;
import p000.InterfaceC2846;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Http2Reader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final InterfaceC0485 source;

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0985 abstractC0985) {
            this();
        }

        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException(AbstractC2844.m4779(i3, "PROTOCOL_ERROR padding ", " > remaining length ", i));
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface Handler {
        void ackSettings();

        void alternateService(int i, String str, C0516 c0516, String str2, int i2, long j);

        void data(boolean z, int i, InterfaceC0485 interfaceC0485, int i2);

        void goAway(int i, ErrorCode errorCode, C0516 c0516);

        void headers(boolean z, int i, int i2, List<Header> list);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List<Header> list);

        void rstStream(int i, ErrorCode errorCode);

        void settings(boolean z, Settings settings);

        void windowUpdate(int i, long j);
    }

    public Http2Reader(InterfaceC0485 interfaceC0485, boolean z) {
        this.source = interfaceC0485;
        this.client = z;
        ContinuationSource continuationSource = new ContinuationSource(interfaceC0485);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    private final void readData(Handler handler, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iAnd = (i2 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.data(z, i3, this.source, Companion.lengthWithoutPadding(i, i2, iAnd));
        this.source.skip(iAnd);
    }

    private final void readGoAway(Handler handler, int i, int i2, int i3) throws IOException {
        if (i < 8) {
            throw new IOException(AbstractC1095.m2794(i, "TYPE_GOAWAY length < 8: "));
        }
        if (i3 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i4 = this.source.readInt();
        int i5 = this.source.readInt();
        int i6 = i - 8;
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(i5);
        if (errorCodeFromHttp2 == null) {
            throw new IOException(AbstractC1095.m2794(i5, "TYPE_GOAWAY unexpected error code: "));
        }
        handler.goAway(i4, errorCodeFromHttp2, i6 > 0 ? this.source.mo1856(i6) : C0516.f2200);
    }

    private final List<Header> readHeaderBlock(int i, int i2, int i3, int i4) throws IOException {
        this.continuation.setLeft(i);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(i2);
        this.continuation.setFlags(i3);
        this.continuation.setStreamId(i4);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = (i2 & 1) != 0;
        int iAnd = (i2 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        if ((i2 & 32) != 0) {
            readPriority(handler, i3);
            i -= 5;
        }
        handler.headers(z, i3, -1, readHeaderBlock(Companion.lengthWithoutPadding(i, i2, iAnd), iAnd, i2, i3));
    }

    private final void readPing(Handler handler, int i, int i2, int i3) throws IOException {
        if (i != 8) {
            throw new IOException(AbstractC1095.m2794(i, "TYPE_PING length != 8: "));
        }
        if (i3 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.ping((i2 & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private final void readPriority(Handler handler, int i, int i2, int i3) throws IOException {
        if (i != 5) {
            throw new IOException(AbstractC1095.m2795(i, "TYPE_PRIORITY length: ", " != 5"));
        }
        if (i3 == 0) {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        readPriority(handler, i3);
    }

    private final void readPushPromise(Handler handler, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iAnd = (i2 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.pushPromise(i3, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(Companion.lengthWithoutPadding(i - 4, i2, iAnd), iAnd, i2, i3));
    }

    private final void readRstStream(Handler handler, int i, int i2, int i3) throws IOException {
        if (i != 4) {
            throw new IOException(AbstractC1095.m2795(i, "TYPE_RST_STREAM length: ", " != 4"));
        }
        if (i3 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i4 = this.source.readInt();
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(i4);
        if (errorCodeFromHttp2 == null) {
            throw new IOException(AbstractC1095.m2794(i4, "TYPE_RST_STREAM unexpected error code: "));
        }
        handler.rstStream(i3, errorCodeFromHttp2);
    }

    private final void readSettings(Handler handler, int i, int i2, int i3) throws IOException {
        if (i3 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i2 & 1) != 0) {
            if (i != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.ackSettings();
            return;
        }
        if (i % 6 != 0) {
            throw new IOException(AbstractC1095.m2794(i, "TYPE_SETTINGS length % 6 != 0: "));
        }
        Settings settings = new Settings();
        C1677 c1677M5347 = AbstractC3744.m5347(AbstractC3744.m5348(0, i), 6);
        int i4 = c1677M5347.f5650;
        int i5 = c1677M5347.f5651;
        int i6 = c1677M5347.f5652;
        if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
            while (true) {
                int iAnd = Util.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                int i7 = this.source.readInt();
                if (iAnd != 2) {
                    if (iAnd == 3) {
                        iAnd = 4;
                    } else if (iAnd != 4) {
                        if (iAnd == 5 && (i7 < 16384 || i7 > 16777215)) {
                            throw new IOException(AbstractC1095.m2794(i7, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                        }
                    } else {
                        if (i7 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iAnd = 7;
                    }
                } else if (i7 != 0 && i7 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings.set(iAnd, i7);
                if (i4 != i5) {
                    i4 += i6;
                }
            }
        }
        handler.settings(false, settings);
    }

    private final void readWindowUpdate(Handler handler, int i, int i2, int i3) throws IOException {
        if (i != 4) {
            throw new IOException(AbstractC1095.m2794(i, "TYPE_WINDOW_UPDATE length !=4: "));
        }
        long jAnd = Util.and(this.source.readInt(), 2147483647L);
        if (jAnd == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.windowUpdate(i3, jAnd);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public final boolean nextFrame(boolean z, Handler handler) throws IOException {
        try {
            this.source.mo1884(9L);
            int medium = Util.readMedium(this.source);
            if (medium > 16384) {
                throw new IOException(AbstractC1095.m2794(medium, "FRAME_SIZE_ERROR: "));
            }
            int iAnd = Util.and(this.source.readByte(), 255);
            int iAnd2 = Util.and(this.source.readByte(), 255);
            int i = this.source.readInt() & Integer.MAX_VALUE;
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Http2.INSTANCE.frameLog(true, i, medium, iAnd, iAnd2));
            }
            if (z && iAnd != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + Http2.INSTANCE.formattedType$okhttp(iAnd));
            }
            switch (iAnd) {
                case 0:
                    readData(handler, medium, iAnd2, i);
                    return true;
                case 1:
                    readHeaders(handler, medium, iAnd2, i);
                    return true;
                case 2:
                    readPriority(handler, medium, iAnd2, i);
                    return true;
                case 3:
                    readRstStream(handler, medium, iAnd2, i);
                    return true;
                case 4:
                    readSettings(handler, medium, iAnd2, i);
                    return true;
                case 5:
                    readPushPromise(handler, medium, iAnd2, i);
                    return true;
                case 6:
                    readPing(handler, medium, iAnd2, i);
                    return true;
                case 7:
                    readGoAway(handler, medium, iAnd2, i);
                    return true;
                case 8:
                    readWindowUpdate(handler, medium, iAnd2, i);
                    return true;
                default:
                    this.source.skip(medium);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(Handler handler) throws IOException {
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        InterfaceC0485 interfaceC0485 = this.source;
        C0516 c0516 = Http2.CONNECTION_PREFACE;
        C0516 c0516Mo1856 = interfaceC0485.mo1856(c0516.mo1964());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format("<< CONNECTION " + c0516Mo1856.mo1965(), new Object[0]));
        }
        if (!c0516.equals(c0516Mo1856)) {
            throw new IOException("Expected a connection header but was ".concat(c0516Mo1856.m1971()));
        }
    }

    private final void readPriority(Handler handler, int i) {
        int i2 = this.source.readInt();
        handler.priority(i, i2 & Integer.MAX_VALUE, Util.and(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & i2) != 0);
    }

    /* JADX INFO: compiled from: obf */
    public static final class ContinuationSource implements InterfaceC2846 {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final InterfaceC0485 source;
        private int streamId;

        public ContinuationSource(InterfaceC0485 interfaceC0485) {
            this.source = interfaceC0485;
        }

        private final void readContinuationHeader() throws IOException {
            int i = this.streamId;
            int medium = Util.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            int iAnd = Util.and(this.source.readByte(), 255);
            this.flags = Util.and(this.source.readByte(), 255);
            Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, iAnd, this.flags));
            }
            int i2 = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = i2;
            if (iAnd == 9) {
                if (i2 != i) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iAnd + " != TYPE_CONTINUATION");
            }
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // p000.InterfaceC2846
        public long read(C0481 c0481, long j) throws IOException {
            while (true) {
                int i = this.left;
                if (i != 0) {
                    long j2 = this.source.read(c0481, Math.min(j, i));
                    if (j2 == -1) {
                        return -1L;
                    }
                    this.left -= (int) j2;
                    return j2;
                }
                this.source.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
        }

        public final void setFlags(int i) {
            this.flags = i;
        }

        public final void setLeft(int i) {
            this.left = i;
        }

        public final void setLength(int i) {
            this.length = i;
        }

        public final void setPadding(int i) {
            this.padding = i;
        }

        public final void setStreamId(int i) {
            this.streamId = i;
        }

        @Override // p000.InterfaceC2846
        public C3459 timeout() {
            return this.source.timeout();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
