package okhttp3.internal;

import com.alibaba.fastjson2.JSONWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import p000.AbstractC0580;
import p000.AbstractC0740;
import p000.AbstractC0741;
import p000.AbstractC1272;
import p000.AbstractC1469;
import p000.AbstractC2844;
import p000.AbstractC2901;
import p000.AbstractC2902;
import p000.AbstractC3528;
import p000.AbstractC3744;
import p000.C0067;
import p000.C0348;
import p000.C0441;
import p000.C0481;
import p000.C1191;
import p000.C1192;
import p000.C1678;
import p000.C1679;
import p000.C2335;
import p000.C2579;
import p000.InterfaceC0484;
import p000.InterfaceC0485;
import p000.InterfaceC1422;
import p000.InterfaceC1433;
import p000.InterfaceC2774;
import p000.InterfaceC2846;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.12.0";
    public static final Headers EMPTY_HEADERS = Headers.Companion.of(new String[0]);
    private static final C2335 UNICODE_BOMS = AbstractC1469.m3340(C0348.m1602("efbbbf"), C0348.m1602("feff"), C0348.m1602("fffe"), C0348.m1602("0000ffff"), C0348.m1602("ffff0000"));
    public static final TimeZone UTC = TimeZone.getTimeZone("GMT");
    private static final C2579 VERIFY_AS_IP_ADDRESS = new C2579("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    public static final boolean assertionsEnabled = false;

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        String name = OkHttpClient.class.getName();
        if (name.startsWith("okhttp3.")) {
            name = name.substring("okhttp3.".length());
        }
        if (name.endsWith("Client")) {
            name = AbstractC2844.m4778(6, 0, name);
        }
        okHttpName = name;
    }

    public static final <E> void addIfAbsent(List<E> list, E e) {
        if (list.contains(e)) {
            return;
        }
        list.add(e);
    }

    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final EventListener.Factory asFactory(EventListener eventListener) {
        return new C0441(eventListener);
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + obj);
        }
    }

    public static final void assertThreadHoldsLock(Object obj) {
        if (!assertionsEnabled || Thread.holdsLock(obj)) {
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + obj);
    }

    public static final boolean canParseAsIpAddress(String str) {
        return VERIFY_AS_IP_ADDRESS.f8199.matcher(str).matches();
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        return AbstractC1469.m3322(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && AbstractC1469.m3322(httpUrl.scheme(), httpUrl2.scheme());
    }

    public static final int checkDuration(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalStateException(str.concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(str.concat(" too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(str.concat(" too small.").toString());
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String str) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    public static final int delimiterOffset(String str, String str2, int i, int i2) {
        while (i < i2) {
            if (AbstractC2901.m4862(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final boolean discard(InterfaceC2846 interfaceC2846, int i, TimeUnit timeUnit) {
        try {
            return skipAll(interfaceC2846, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, InterfaceC1433 interfaceC1433) {
        ArrayList arrayList = C1191.f4326;
        for (T t : iterable) {
            if (((Boolean) interfaceC1433.invoke(t)).booleanValue()) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                AbstractC2902.m4885(arrayList).add(t);
            }
        }
        return arrayList;
    }

    public static final String format(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                C0067 c0067 = new C0067(strArr2, 1);
                while (c0067.hasNext()) {
                    if (comparator.compare(str, (String) c0067.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response response) {
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final void ignoreIoExceptions(InterfaceC1422 interfaceC1422) {
        try {
            interfaceC1422.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        Object[] objArr = (Object[]) tArr.clone();
        return Collections.unmodifiableList(AbstractC0740.m2311(Arrays.copyOf(objArr, objArr.length)));
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (AbstractC1469.m3327(cCharAt, 31) <= 0 || AbstractC1469.m3327(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i, int i2) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 != i) {
                    i3--;
                }
            }
        }
        return i;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfNonWhitespace(String str, int i) {
        int length = str.length();
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean isCivilized(FileSystem fileSystem, File file) {
        InterfaceC2774 interfaceC2774Sink = fileSystem.sink(file);
        try {
            fileSystem.delete(file);
            AbstractC3528.m5090(interfaceC2774Sink, null);
            return true;
        } catch (IOException unused) {
            AbstractC3528.m5090(interfaceC2774Sink, null);
            fileSystem.delete(file);
            return false;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3528.m5090(interfaceC2774Sink, th);
                throw th2;
            }
        }
    }

    public static final boolean isHealthy(Socket socket, InterfaceC0485 interfaceC0485) {
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !interfaceC0485.mo1860();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean isSensitiveHeader(String str) {
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final void notify(Object obj) {
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final String peerName(Socket socket) {
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        return remoteSocketAddress instanceof InetSocketAddress ? ((InetSocketAddress) remoteSocketAddress).getHostName() : remoteSocketAddress.toString();
    }

    public static final Charset readBomAsCharset(InterfaceC0485 interfaceC0485, Charset charset) {
        int iMo1861 = interfaceC0485.mo1861(UNICODE_BOMS);
        if (iMo1861 == -1) {
            return charset;
        }
        if (iMo1861 == 0) {
            return StandardCharsets.UTF_8;
        }
        if (iMo1861 == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (iMo1861 == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (iMo1861 == 3) {
            Charset charset2 = AbstractC0580.UTF_8;
            Charset charset3 = AbstractC0580.f2381;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            AbstractC0580.f2381 = charsetForName;
            return charsetForName;
        }
        if (iMo1861 != 4) {
            throw new AssertionError();
        }
        Charset charset4 = AbstractC0580.UTF_8;
        Charset charset5 = AbstractC0580.f2380;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        AbstractC0580.f2380 = charsetForName2;
        return charsetForName2;
    }

    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) throws IllegalAccessException {
        Object fieldOrNull;
        Class<?> superclass = obj.getClass();
        while (true) {
            T tCast = null;
            if (superclass.equals(Object.class)) {
                if (str.equals("delegate") || (fieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(fieldOrNull, cls, str);
            }
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (cls.isInstance(obj2)) {
                    tCast = cls.cast(obj2);
                }
                return tCast;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
            }
        }
    }

    public static final int readMedium(InterfaceC0485 interfaceC0485) {
        return and(interfaceC0485.readByte(), 255) | (and(interfaceC0485.readByte(), 255) << 16) | (and(interfaceC0485.readByte(), 255) << 8);
    }

    public static final boolean skipAll(InterfaceC2846 interfaceC2846, int i, TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = interfaceC2846.timeout().hasDeadline() ? interfaceC2846.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        interfaceC2846.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C0481 c0481 = new C0481();
            while (interfaceC2846.read(c0481, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) != -1) {
                c0481.m1855();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                interfaceC2846.timeout().clearDeadline();
                return true;
            }
            interfaceC2846.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                interfaceC2846.timeout().clearDeadline();
                return false;
            }
            interfaceC2846.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                interfaceC2846.timeout().clearDeadline();
            } else {
                interfaceC2846.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    public static final ThreadFactory threadFactory(final String str, final boolean z) {
        return new ThreadFactory() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᲀᲇᤞᛸ
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Util.threadFactory$lambda$1(str, z, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread threadFactory$lambda$1(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static final void threadName(String str, InterfaceC1422 interfaceC1422) {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            interfaceC1422.invoke();
        } finally {
            threadCurrentThread.setName(name);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        C1679 c1679M5348 = AbstractC3744.m5348(0, headers.size());
        ArrayList arrayList = new ArrayList(AbstractC0741.m2313(c1679M5348, 10));
        Iterator it = c1679M5348.iterator();
        while (it.hasNext()) {
            int iNextInt = ((C1678) it).nextInt();
            arrayList.add(new Header(headers.name(iNextInt), headers.value(iNextInt)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.component1().m1971(), header.component2().m1971());
        }
        return builder.build();
    }

    public static final String toHexString(long j) {
        return Long.toHexString(j);
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z) {
        String strHost;
        if (AbstractC2901.m4861(httpUrl.host(), ":", false)) {
            strHost = "[" + httpUrl.host() + ']';
        } else {
            strHost = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return strHost;
        }
        return strHost + ':' + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        return map.isEmpty() ? C1192.f4327 : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static final long toLongOrDefault(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(String str, int i) {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final String trimSubstring(String str, int i, int i2) {
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        return str.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, iIndexOfFirstNonAsciiWhitespace, i2));
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final void wait(Object obj) throws InterruptedException {
        obj.wait();
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) {
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            AbstractC1272.m3094(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(InterfaceC0484 interfaceC0484, int i) {
        interfaceC0484.writeByte((i >>> 16) & 255);
        interfaceC0484.writeByte((i >>> 8) & 255);
        interfaceC0484.writeByte(i & 255);
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final int delimiterOffset(String str, char c, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    public static final String toHexString(int i) {
        return Integer.toHexString(i);
    }

    public static final long and(int i, long j) {
        return ((long) i) & j;
    }

    public static final void closeQuietly(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!AbstractC1469.m3322(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(C0481 c0481, byte b) throws EOFException {
        int i = 0;
        while (!c0481.mo1860() && c0481.m1866(0L) == b) {
            i++;
            c0481.readByte();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventListener asFactory$lambda$8(EventListener eventListener, Call call) {
        return eventListener;
    }
}
